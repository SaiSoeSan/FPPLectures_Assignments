package finalPractice.overrideHashCode.Lesson11.Prob1.src.prob1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	public boolean equals(Object obj){
		if(obj == null) return false;
		if(!(obj instanceof Key e)) return false;
		return e.firstName.equals(firstName) && e.lastName.equals(lastName);
	}

	public int hashCode(){
		return Objects.hash(firstName,lastName);
	}
}
