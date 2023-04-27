package at.fhv.lab2.eventbus.events;

import java.time.LocalDate;

public class CustomerCreated extends Event {

	private String name;
	private String address;
	private LocalDate dateOfBirth;

	public CustomerCreated(String name, String address, LocalDate dateOfBirth) {
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
}
