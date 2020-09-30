package items;

import library.Items;

public class Maps extends Items {
private int yearCreated;
private boolean isFictional;

public Maps(){
	super();
	setYearCreated(-9999);
	setIsFictional(null);
}

public Maps(int iD, String description, int yearCreated, boolean fictional) {
	super(iD, description);
	setYearCreated(yearCreated);
	setIsFictional(fictional);
}

private void setYearCreated(int year) {
	this.yearCreated = year;
	
}

private int getYearCreated(){
	return this.yearCreated;
}

private void setIsFictional(Boolean fictional) {
	this.isFictional = fictional;
}

private Boolean getIsFictional() {
	return this.isFictional;
}













}
