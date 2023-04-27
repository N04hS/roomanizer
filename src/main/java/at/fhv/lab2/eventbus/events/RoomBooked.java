package at.fhv.lab2.eventbus.events;

import java.time.LocalDate;

public class RoomBooked extends Event {
	private int bookingNo;
	private String customerName;
	private int roomNo;
	private LocalDate startDate;
	private LocalDate endDate;

	public RoomBooked(int bookingNo, String customerName, int roomNo, LocalDate startDate, LocalDate endDate) {
		this.bookingNo = bookingNo;
		this.customerName = customerName;
		this.roomNo = roomNo;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getBookingNo() {
		return bookingNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
}
