public class Student{
	//Fill your code
	int	id;
	String	name;
	String	department;
	Integer	courseId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Student(int id, String name, String department, Integer courseId) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.courseId = courseId;
	}
	
	@Override
	public String toString() {
String newLine = System.getProperty("line.separator");
		
		return "Student :"
	            .concat(newLine)
	            .concat("Id:  " + getId())
	            .concat(newLine)
	            .concat("Name: " + getName())
	            .concat(newLine)
	            .concat("Department : " + getDepartment())
	            .concat(newLine)
	            .concat("Course Id: " + getCourseId());
	}
	
	
	

	
}
