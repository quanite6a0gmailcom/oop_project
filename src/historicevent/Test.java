package historicevent;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class Test {
	public static void main(String[] args) throws IOException, ParseException {
		ListEvents le = new ListEvents();
		le.searchEvent("soi");
	}
}
