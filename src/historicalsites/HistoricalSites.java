package historicalsites;

import java.util.ArrayList;

import historicevent.HistoricEvents;
import personage.Personage;

public class HistoricalSites {
	private static int ID=0;
	private int id;
	private String name;
	private String description;
	private ArrayList<String>relatePerson;
	private ArrayList<String>relateSite;
	
	public HistoricalSites(String name, String description,ArrayList<String> relatePerson, ArrayList<String> relateSite) {
		this.id = ++ID;
		this.name = name;
		this.description = description;
		this.relatePerson = relatePerson;
		this.relateSite = relateSite;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "HistoricalSites [id=" + id + ", name=" + name + ", description=" + description + ", relatePerson="
				+ relatePerson.toString() + ", relateSite=" + relateSite.toString() + "]";
	}
	
	
	
	
}
