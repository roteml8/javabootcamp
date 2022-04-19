package javabootcamp.oopexam.kid;

import java.time.LocalDate;

public class Kid {
	
	protected String name;
	protected LocalDate birthDate;
	
	public Kid(String name, LocalDate birthDate) {
		setName(name);
		setBirthDate(birthDate);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	private void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	
	@Override
	public String toString() {
		return "Kid [name=" + name + ", birthDate=" + birthDate + "]";
	}

}
