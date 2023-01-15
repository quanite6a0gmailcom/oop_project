package cutulralfestival;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CulturalList {
	private ArrayList<CulturalFestival> cuturalList;

	public CulturalList(ArrayList<CulturalFestival> cuturalList) {
		this.cuturalList = cuturalList;
	}
	
	public CulturalList() {
		this.cuturalList = new ArrayList<CulturalFestival>();
		
	}
	
	private void readFile() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("lehoi1.json");
		Object obj = jsonParser.parse(reader);
		JSONArray culturList = (JSONArray)obj;
		for (Object object : culturList) {
			JSONObject jo = (JSONObject)object;
			CulturalFestival e1 = parse(jo);
			cuturalList.add(e1);
		}
//		for (Object object : cuturalList) {
//			System.out.println(object);
//		}
	}
	
	private CulturalFestival parse(JSONObject jo) {
		String name = (String)jo.get("name");
		String date = (String)jo.get("date");
		String address = (String)jo.get("address");
		String descripton = (String)jo.get("description");
		CulturalFestival e1 = new CulturalFestival(name, date, address, descripton);
		return e1;
		
	}
	
	public void show() throws IOException, ParseException {
		readFile();
		for (CulturalFestival culturalFestival : cuturalList) {
			System.out.println(culturalFestival);
		}
	}
	
	public void searchCultural(String name) throws IOException, ParseException {
		readFile();
		for (CulturalFestival culturalFestival : cuturalList) {
			if(culturalFestival.getName().toLowerCase().indexOf(name)>=0) {
				System.out.println(culturalFestival);
			}
		}
	}
	
	
}
