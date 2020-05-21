package temps;

import processing.core.PApplet;

public class Setup extends PApplet {
	ClassReader partyclass;
	ListReader thelist;

	@Override
	public void setup() {
		partyclass = new ClassReader(this);
		//partyclass.infoPrint();
		//
		thelist = new ListReader(this);
		partyclass.setCompare(thelist.contains);
		// thelist.infoPrint();
		//
		partyclass.infoPrint();
		partyclass.save();
	}
}
