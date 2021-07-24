package lab2.prob2a;

class GradeReport {
	private String grade;
	private Student owner;

	public GradeReport(Student student, String grade) {
		this.grade = grade;
		owner = student;
	}

	public String getGrade() {
		return grade;
	}
}
