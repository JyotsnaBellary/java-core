class StudentRating extends Student{
    //Fill your code
	int	id;
	String	review;
	int	stars;
	Student	student;
	public StudentRating(int id, String name, String department, Integer courseId, String review, int stars, int ratingId) {
		super(id, name, department, courseId);
		id = ratingId;
		this.review = review;
		this.stars = stars;
//		this.student = new Student(id, name, department, courseId);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = new Student(super.getId(), super.getName(), super.getDepartment(), super.getCourseId());
	}
	@Override
	public String toString() {
String newLine = System.getProperty("line.separator");
		
		return "" + super.toString()
	            .concat(newLine)
	            .concat("Rating ID:  " + getId())
	            .concat(newLine)
	            .concat("Review:  " + getReview())
	            .concat(newLine)
	            .concat("Rating Stars:  " + getStars());}
	
	
	
	
	
}
