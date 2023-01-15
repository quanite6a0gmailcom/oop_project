package test;

import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

import cutulralfestival.CulturalList;
import historicalsites.ListSites;
import historicevent.*;
import period.*;
import personage.*;

public class testShow {
	public static void main(String[] args) throws IOException, ParseException {
		Scanner sc = new Scanner(System.in);
		PeriodLists pl = new PeriodLists();
		list_personage per = new list_personage();
		ListEvents le = new ListEvents();
		ListSites ls = new ListSites();
		CulturalList cl = new CulturalList();
		int luaChon=1;
		
		do {
			System.out.println("MENU CHUC NANG");
			System.out.println("1.Hien thi cac thoi ki trong lich su Viet Nam");
			System.out.println("2.Hien thi cac nhan vat lich su Viet Nam");
			System.out.println("3.Hien thi cac dia danh lich su");
			System.out.println("4.Hien thi cac le hoi");
			System.out.println("5.Hien thi cac su kien lich su");
			
			
			if (luaChon==1) {
				System.out.println("Cac thoi ki :");
				pl.show();
				
			}
			else if(luaChon ==2) {
				System.out.println("Cac nhan vat:");
				per.show();
			}
			else if(luaChon == 3) {
				System.out.println("Cac dia danh:");
				ls.show();
			}
			else if(luaChon == 4) {
				System.out.println("Cac le hoi:");
				cl.show();
			}
			else if (luaChon == 5) {
				System.out.println("Cac su kien:");
				le.show();
			}
			System.out.println("Nhap lua chon cua ban");
			luaChon = sc.nextInt();
		}while(luaChon!=0);
	}
}
