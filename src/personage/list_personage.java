package personage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class list_personage {
	private ArrayList<Personage> personageList;

	
	public ArrayList<Personage> getPersonageList() throws IOException, ParseException {
		readFile();
		return personageList;
	}

	public list_personage(ArrayList<Personage> personageList) {
		this.personageList = personageList;
	}
	
	public list_personage() {
		this.personageList = new ArrayList<Personage>();
	}
	
	private void readFile() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("nhanvat3.json");
		Object obj = jsonParser.parse(reader);
		JSONArray personlist = (JSONArray) obj;
		for (Object object : personlist) {
			JSONObject jo = (JSONObject)object;
			Personage e1 = parse(jo);
			personageList.add(e1);
		}
//		for (Object object : personageList) {
//			System.out.println(object);
//		}
		
	}
	
	private Personage parse(JSONObject obj) {
		Personage e1;
		String name =(String) obj.get("name");
		String date = (String)obj.get("date");
		String description = (String)obj.get("description");
		String imageUrl = (String)obj.get("imageUrl");
		e1=new Personage(name, date, imageUrl, description);
		return e1;
		
	}
	
	public void show() throws IOException, ParseException {
		readFile();
		for (Personage personage : personageList) {
			System.out.println(personage);
		}
		
	}
	
	public void searchPerson(String name) throws IOException, ParseException {
		readFile();
		for (Personage personage : personageList) {
			if(personage.getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
				System.out.println(personage);
			}
		}
	}
	
	public void searchID(int id) throws IOException, ParseException {
		readFile();
		for (Personage personage : personageList) {
			if(personage.getId()==id) {
				System.out.println(personage);
			}
		}
	}
	
}
