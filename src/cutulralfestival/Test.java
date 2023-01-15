package cutulralfestival;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class Test {
	public static void main(String[] args) throws IOException, ParseException {
		CulturalList cr = new CulturalList();
		cr.searchCultural("lim");
	}
}
