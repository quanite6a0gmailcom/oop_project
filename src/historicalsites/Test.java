package historicalsites;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class Test {
	public static void main(String[] args) throws IOException, ParseException  {
		ListSites le = new ListSites();
		le.searchSite("quang");
	}
}
