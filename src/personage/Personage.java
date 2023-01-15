package personage;

import java.util.Map;

public class Personage  {
	private static int ID=0;
	private int id;
	private String name;
	private String date;
	private String urlImage;
	private String description;
	public Personage(String name, String date,  String urlImage, String description) {
		this.id = ++ID;
		this.name = name;
		this.date = date;
		this.urlImage = urlImage;
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
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Personage [id=" + id + ", name=" + name + ", date=" + date + ", urlImage=" + urlImage + ", description="
				+ description + "]";
	}
	
	
	
}
