package at.fhv.lab2.domain;

import java.time.LocalDate;

/* audacious one - 21.04.2023 */
public class Booking {

	private static int bookingCount = 0;

	private int bookingNo;
	private Customer customer;
	private Room room;
	private LocalDate startDate;
	private LocalDate endDate;

	public Booking(Customer customer, Room room, LocalDate startDate, LocalDate endDate) {
		this.bookingNo = bookingCount++;
		this.customer = customer;
		this.room = room;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}

	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getBookingNo() { return this.bookingNo; }
}
