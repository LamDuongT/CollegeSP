/**
 *  Prereq class was made as a container class that contains what prerequisites each course has
 */

/**
 * @author Huan Nguyen
 * @author Lam Duong
 */

public class Prereq {
	private int prereqID;
	private int courseID;
	private int prereqCourseID;
	
	
	public Prereq() {
		// Constructor method to create empty object
		setValue(-1, -1, -1);		
	}
	
	public Prereq(int prereqID, int courseID, int prereqCourseID) {
		setValue(prereqID, courseID, prereqCourseID);		
	}
	
	public void setValue(int prereqID, int courseID, int prereqCourseID) {
		this.prereqID = prereqID;
		this.courseID = courseID;
		this.prereqCourseID = prereqCourseID;
	}
	
	
	public void setPrereqID (int prereqID) {
		this.prereqID = prereqID;
	}
	public void setCourseID (int courseID) {
		this.courseID = courseID;
	}
	
	public void setPrereqCourseID (int prereqCourseID) {
		this.prereqCourseID = prereqCourseID;
	}
	
	public int getPrereqID() {
		return this.prereqID;
	}
	
	public int getCourseID() {
		return this.courseID;
	}
	
	public int getPrereqCourseID() {
		return this.prereqCourseID;
	}
}
