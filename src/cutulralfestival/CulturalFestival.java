package cutulralfestival;

import personage.Personage;

public class CulturalFestival {
	private static int ID=0;
	private int id;
	private String name;
	private String date;
	private String address;
	private String description;
	
	public CulturalFestival(String name, String date, String address, String description) {
		this.id = ++ID;
		this.name = name;
		this.date = date;
		this.address = address;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CulturalFestival [id=" + id + ", name=" + name + ", date=" + date + ", address=" + address
				+ ", description=" + description + "]";
	}
	
	
	
}
