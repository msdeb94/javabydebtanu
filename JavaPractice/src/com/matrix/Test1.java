package com.matrix;

public enum Test1 {
	Self(0, "Self"), Spouse(1, "Spouse"), Mother(2, "Mother"), Father(3, "Father"), Daughter(4, "Daughter"), Son(5,
			"Son"), MotherInLaw(6, "MotherInLaw"), FatherInLaw(7, "FatherInLaw"), Sibling(8,
					"Sibling"), GrandMother(9, "GrandMother"), GrandFather(10, "GrandFather");

	private int mValue;
	private String message;

	Test1(int value, String msg) {
		mValue = value;
		message = msg;
	}

	public int getmValue() {
		return mValue;
	}

	public void setmValue(int mValue) {
		this.mValue = mValue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
