package temps;

public class Student {
	String name;
	// byte[] namebytes;
	String code;
	boolean ischeck = false;

	public Student(String name) {
		this.name = name;
		code = "180XX";
	}

	public Student(String name, String code) {
		this.name = name;
		if (code == null)
			code = "0X";
		this.code = code;
	}

	public void check() {
		ischeck = true;
	}

	public boolean ischeck() {
		return ischeck;
	}

	public void print() {
		if (ischeck)
			System.out.println("Code: " + code + ", Name: " + name + " O");
		else
			System.out.println("Code: " + code + ", Name: " + name + " X");
	}
}
