package test.jaxrs.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyObject {
	private String description;
	private Date when;

	public MyObject()
	{}

	public MyObject(String description, Date when) {
		super();
		this.description = description;
		this.when = when;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}
}
