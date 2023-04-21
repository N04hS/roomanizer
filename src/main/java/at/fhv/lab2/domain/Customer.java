package at.fhv.lab2.domain;

import java.time.LocalDate;

/* audacious one - 21.04.2023 */
public class Customer {

	private String name;
	private String address;
	private LocalDate dateOfBirth;

	public Customer(String name, String address, LocalDate dateOfBirth) {
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
