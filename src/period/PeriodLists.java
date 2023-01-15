package period;

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

import historicalsites.HistoricalSites;

public class PeriodLists {
	private ArrayList<Period> periodLists;

	public PeriodLists(ArrayList<Period> periodLists) {
		this.periodLists = periodLists;
	}
	public PeriodLists() {
		this.periodLists = new ArrayList<Period>();
	}
	
	private void readFile() {
		JSONParser jsonParser = new JSONParser();
		try (FileReader reader = new FileReader("thoiki1.json")) {
            // Read JSON file
            Object obj = jsonParser.parse(reader);
            
            JSONArray userList = (JSONArray) obj;
//            System.out.println(userList);
            for (Object object : userList) {
//				parseUserObject((JSONObject)object);
            	JSONObject jo = (JSONObject)object;
            	Period e1 = parse(jo);
            	periodLists.add(e1);
			}
            // Iterate over employee array

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}
	
	
	private Period parse(JSONObject jo) {
		ArrayList<String> personageList= new ArrayList<String>();
		ArrayList<String> historicEvent = new ArrayList<String>();
		String name = (String)jo.get("date");
		String date = (String)jo.get("Thoi Ki");
		String description = (String)jo.get("description");
		JSONObject jr = (JSONObject)jo.get("Relate");
		
		Map person = ((Map)jr.get("Nhan vat"));
		Iterator<Map.Entry> itr1 = person.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            personageList.add((String)pair.getValue());
        }
        Map site = ((Map)jr.get("Dia danh"));
		Iterator<Map.Entry> itr2 = site.entrySet().iterator();
        while (itr2.hasNext()) {
            Map.Entry pair = itr2.next();
            historicEvent.add((String)pair.getValue());
        }
        Period e1 = new Period(name, date, description, personageList, historicEvent);
		
		return e1;
	}
	
	public void show() {
		readFile();
		for (Period period : periodLists) {
			System.out.println(period);
		}
	}
	
	public void searchPeriod(String name) {
		readFile();
		for (Period period : periodLists) {
			if(period.getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
				System.out.println(period);
			}
		}
	}
}
