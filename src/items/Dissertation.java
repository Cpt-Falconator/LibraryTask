package items;

import library.Items;

public class Dissertation extends Items {
	private String title;
	private String studentID;
	private String field;
	
	public Dissertation()
	{
		super();
		setTitle("");
		setStudentID("");
		setField("");
	}
	
	public Dissertation(int iD, String desc, String title, String studentID, String field) {
		super(iD, desc);
		setTitle(title);
		setStudentID(studentID);
		setField(field);
	}
	private void setTitle(String title) {
		this.title = title;
	}
	private String getTitle(){
		return this.title;
	}
	
	private void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	private String getStudentID(){
		return this.studentID;
	}
	
	private void setField(String field) {
		this.field = field;
	}
	private String getField(){
		return this.field;
	}

}
