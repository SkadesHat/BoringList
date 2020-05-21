package temps;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;

public class ListReader {
	static final String address = "D:\\Work\\Boringlist\\Apr_14\\list.csv";
	PApplet app;
	ArrayList<String> contains;
	Table table;

	public ListReader(PApplet app) {
		this.app = app;
		table = app.loadTable(address, "newlines,csv");
		setContains();
	}

	public void setContains() {
		contains = new ArrayList<>();
		for (int i = 0; i < table.getRowCount(); i++) {
			contains.add(table.getString(i, 0));
		}
	}

	public void infoPrint() {
		for (String s : contains) {
			System.out.println(s);
		}
	}
}
