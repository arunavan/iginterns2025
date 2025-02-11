package com.insight.day3.utility;
import java.util.Arrays;
import java.util.List;
class Course {
	private int courseId;
	private String courseName;
	private Integer duration;
	Course(){}
	
	public Course(int courseId, String courseName, Integer duration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + "]";
	}
	
	
}

public class ObjectArrayDemo {

	public static void main(String[] args) {
		
		Course[] courses=new Course[5];
		Course c=new Course();
		c.setCourseId(10);
		c.setCourseName("java");
		c.setDuration(5);
		courses[0]=c;
		for(Course cc:courses)
			System.out.println(cc);
		List<Course> courses1=Arrays.asList(new Course(1,"java",3),new Course(2,"python",2));
		for(Course c2:courses1)
			System.out.println(c2);
		List<Integer> list=Arrays.asList(3,2,4,1,5,6,7,8,9);
		int x[]= {3,4,2,5,6,7,8,1,9};
		Arrays.binarySearch(x, 8);
		Arrays.sort(x);
		
		int matrix[][]= {{3,4,5},{2,3,1,4,5,6,7},{7,8}};
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(" "+matrix[i][j]);
				}
			System.out.println();
			
		}
		
		
	}

}
