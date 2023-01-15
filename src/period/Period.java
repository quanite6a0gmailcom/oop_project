package period;

import java.util.ArrayList;

import historicevent.HistoricEvents;
import personage.Personage;

public class Period {
	private static int ID=0;
	private int id;
	private String name;
	private String date;
	private String description;
	private ArrayList<String> personageList;
	private ArrayList<String> historicEvents;
	
	public Period( String name, String date, String description, ArrayList<String> personageList,
			ArrayList<String> historicEvents) {
		this.id = ++ID;
		this.name = name;
		this.date = date;
		this.description = description;
		this.personageList = personageList;
		this.historicEvents = historicEvents;
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
		return "Period [id=" + id + ", name=" + name + ", date=" + date + ", description=" + description
				+ ", personageList=" + personageList.toString() + ", historicEvents=" + historicEvents.toString() + "]";
	}
	
	
	
	
	
}
