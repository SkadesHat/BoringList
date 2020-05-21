package temps;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;

public class ClassReader {
	static final String address = "D:\\Work\\Boringlist\\Apr_14\\class5.csv";
	static final String resaddress = "D:\\Work\\Boringlist\\Apr_14\\res.csv";
	PApplet app;
	ArrayList<Student> students;
	// ArrayList<Student> resstudents;
	Table table;

	public ClassReader(PApplet app) {
		this.app = app;
		table = app.loadTable(address, "newlines,csv");
		setStundents();
	}

	public void setStundents() {
		students = new ArrayList<>();
		for (int i = 0; i < table.getRowCount(); i++) {
			Student s = new Student(table.getString(i, 1), table.getString(i, 0));
			students.add(s);
		}
	}

	public void infoPrint() {
		for (Student s : students) {
			s.print();
		}
	}

	public void resPrint() {
//		for (Student s : resstudents) {
//			s.print();
//		}
	}

	public void setCompare(ArrayList<String> contains) {
		for (Student s : students) {
			for (String contain : contains) {
				if (contain.indexOf(s.name) >= 0/* ||contain.indexOf(s.code) >= 0 */)
					s.check();
			}
		}
	}

	public void save() {
		Table restable = new Table();
		restable.setRowCount(students.size());
		restable.setColumnCount(3);
		//
		for (int i = 0; i < restable.getRowCount(); i++) {
			restable.setString(i, 0, students.get(i).name);
			restable.setString(i, 1, students.get(i).code);
			if (students.get(i).ischeck)
				restable.setString(i, 2, "Y");
			else
				restable.setString(i, 2, "N");
		}
		app.saveTable(restable, resaddress);
	}
}
