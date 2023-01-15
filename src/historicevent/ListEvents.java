package historicevent;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import cutulralfestival.CulturalFestival;

public class ListEvents {
	private ArrayList<HistoricEvents> historicEvent;
	
	public ListEvents(ArrayList<HistoricEvents> historicEvent) {
		this.historicEvent = historicEvent;
	}
	
	public ListEvents() {
		this.historicEvent = new ArrayList<HistoricEvents>();
	}


	private void readFile() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("sukien3.json");
		Object obj = jsonParser.parse(reader);
		JSONArray culturList = (JSONArray)obj;
		for (Object object : culturList) {
			JSONObject jo = (JSONObject)object;
			HistoricEvents e1 = parse(jo);
			historicEvent.add(e1);
		}
		
	}
	private HistoricEvents parse(JSONObject jo) {
		ArrayList<String> personage=new ArrayList<String>();
		String name = (String)jo.get("name");
		String date = (String)jo.get("date");
		String descripton = (String)jo.get("description");
		
		Map person = ((Map)jo.get("Lien quan"));
		Iterator<Map.Entry> itr1 = person.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            personage.add((String)pair.getValue());
        }
		HistoricEvents e1 = new HistoricEvents(name, date, personage, descripton) ;
		return e1;
		
	}
	
	public void show() throws IOException, ParseException {
		readFile();
		for (HistoricEvents historicEvents : historicEvent) {
			System.out.println(historicEvents);
		}
	}
	
	public void searchEvent(String name) throws IOException, ParseException {
		readFile();
		for (HistoricEvents historicEvents : historicEvent) {
			if(historicEvents.getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
				System.out.println(historicEvents);
			}
		}
	}
	
}
