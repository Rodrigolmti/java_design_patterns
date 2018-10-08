package model;

public class User {
	
	private final String name;
	private final Long id;
	
	public User(String name, Long id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + "]";
	}
}
