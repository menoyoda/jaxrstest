package test.jaxrs.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private String id;
	private String firstname;
	private String lastname;
	private Integer age;

	public User() {
		super();
	}

	public User(String id, String firstname, String lastname, Integer age) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
