package at.fhv.lab2.commandclient;

import at.fhv.lab2.domain.Booking;
import at.fhv.lab2.domain.Customer;
import at.fhv.lab2.domain.Room;
import at.fhv.lab2.eventbus.EventRepository;
import at.fhv.lab2.eventbus.events.BookingCancelled;
import at.fhv.lab2.eventbus.events.CustomerCreated;
import at.fhv.lab2.eventbus.events.RoomBooked;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class CommandService {
	private Map<Integer, Room> roomStore = new HashMap<>();
	private Map<String, Customer> customerStore =  new HashMap<>();
	private List<Booking> bookingStore =  new ArrayList<>();

	@Autowired
	private EventRepository eventRepo;

	// TODO domäneneregeln

	public void addRoom(Room room) {
		roomStore.put(room.getRoomNo(), room);
	}

	public void BookRoom(LocalDate startDate, LocalDate endDate, int roomNo, String customerName) {
		Room r = roomStore.get(roomNo);
		Customer c = customerStore.get(customerName);

		// remove bookings with unrelated rooms
		var bookings = bookingStore;
		bookings.removeIf(entry -> (roomNo != entry.getRoom().getRoomNo()));

		for (Booking b : bookings) {
			if ((startDate.isAfter(b.getStartDate()) && startDate.isBefore(b.getEndDate())) ||
					(endDate.isAfter(b.getStartDate()) && endDate.isBefore(b.getEndDate()))) {
				// overlap in dates
				// TODO abort command
			}
		}

		Booking b = new Booking(c, r, startDate, endDate);
		bookingStore.add(b);

		var e = new RoomBooked(b.getBookingNo(), customerName, roomNo, startDate, endDate);
		eventRepo.processEvent(e);
	}

	public void CancelBooking(int bookingNo) {
		bookingStore.removeIf(entry -> (bookingNo == entry.getBookingNo()));

		var e = new BookingCancelled(bookingNo);
		eventRepo.processEvent(e);
	}

	public void CreateCustomer(String name, String address, LocalDate dateOfBirth) {
		customerStore.put(name, new Customer(name, address, dateOfBirth));

		var e = new CustomerCreated(name, address, dateOfBirth);
		eventRepo.processEvent(e);
	}
}
