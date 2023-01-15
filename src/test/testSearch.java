package test;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

import cutulralfestival.CulturalList;
import historicalsites.ListSites;
import historicevent.*;
import period.*;
import personage.*;
public class testSearch {
	public static void main(String[] args) throws IOException, ParseException {
		Scanner sc = new Scanner(System.in);
		PeriodLists pl = new PeriodLists();
		list_personage per = new list_personage();
		ListEvents le = new ListEvents();
		ListSites ls = new ListSites();
		CulturalList cl = new CulturalList();
		String search;
		search = sc.nextLine();
		pl.searchPeriod(search);
		per.searchPerson(search);
		le.searchEvent(search);
		ls.searchSite(search);
		cl.searchCultural(search);
				
	}
}
