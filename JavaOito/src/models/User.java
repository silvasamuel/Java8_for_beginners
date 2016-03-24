package models;

/**
 * @author samuel.silva
 */
public class User {
	private String name;
	private int age;
	private Boolean moderator;

	public User(String nome, int age) {
		this.name = nome;
		this.age = age;
		this.moderator = false;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	// Gets and Sets

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setModerator(Boolean status) {
		moderator = status;
	}
	
	public Boolean isModerator() {
		return moderator;
	}
}
