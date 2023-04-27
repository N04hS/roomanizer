package at.fhv.lab2.eventbus.events;

public class BookingCancelled extends Event {
	private int bookingNo;

	public BookingCancelled(int bookingNo) {
		this.bookingNo = bookingNo;
	}

	public int getBookingNo() { return this.bookingNo; }
}
