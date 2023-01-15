package historicalsites;

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

public class ListSites {
	private ArrayList<HistoricalSites> historicSites;

	public ListSites(ArrayList<HistoricalSites> historicSites) {
		this.historicSites = historicSites;
	}
	
	public ListSites() {
		this.historicSites = new ArrayList<HistoricalSites>();
	}
	
	private void readFile() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		try (FileReader reader = new FileReader("diadanh1.json")) {
            // Read JSON file
            Object obj = jsonParser.parse(reader);
            
            JSONArray userList = (JSONArray) obj;
//            System.out.println(userList);
            for (Object object : userList) {
//				parseUserObject((JSONObject)object);
            	JSONObject jo = (JSONObject)object;
            	HistoricalSites e1 = parse(jo);
            	historicSites.add(e1);
			}
            // Iterate over employee array
//            for (Object object : historicSites) {
//				System.out.println(object);
//			}

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}
	private HistoricalSites parse(JSONObject jo) {
		ArrayList<String>relatePerson = new ArrayList<String>();
		ArrayList<String>relateSite = new ArrayList<String>();
		JSONObject jr = (JSONObject)jo.get("Relate");
		String name = (String)jo.get("name");
		String description = (String)jo.get("description");
		Map person = ((Map)jr.get("Nhan vat"));
		Iterator<Map.Entry> itr1 = person.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            relatePerson.add((String)pair.getValue());
        }
        
        Map site = ((Map)jr.get("Dia danh"));
		Iterator<Map.Entry> itr2 = site.entrySet().iterator();
        while (itr2.hasNext()) {
            Map.Entry pair = itr2.next();
            relateSite.add((String)pair.getValue());
        }
        HistoricalSites e1 = new HistoricalSites(name, description, relatePerson, relateSite);
		return e1;
	}
	
	public void show() throws IOException, ParseException {
		readFile();
		for (HistoricalSites historicalSites : historicSites) {
			System.out.println(historicalSites);
		}
	}
	
	public void searchSite(String name) throws IOException, ParseException {
		readFile();
		for (HistoricalSites historicalSites : historicSites) {
			if(historicalSites.getName().toLowerCase().indexOf(name.toLowerCase())>=0){
				System.out.println(historicalSites);
			}
		}
	}
	
}
