package historicevent;

import java.util.ArrayList;
import java.util.List;

import personage.Personage;

public class HistoricEvents {
	private static int ID=0;
	private int id;
	private String name;
	private String date;
	private ArrayList<String> personage;
	private String description;
	
	public HistoricEvents(String name, String date, ArrayList<String> personage, String description) {
		this.id = ++ID;
		this.name = name;
		this.date = date;
		this.personage = personage;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "HistoricEvents [id=" + id + ", name=" + name + ", date=" + date + ", personage=" + personage.toString()
				+ ", description=" + description + "]";
	}
	
	
	
	
	
	
	
}
