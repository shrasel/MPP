package lab2.prob2a;

class Student {
	private String name;
	GradeReport gReport;

	public Student(String name) {
		this.name = name;
		gReport = new GradeReport(this, "A");
	}

	@Override
	public String toString() {
		return "Name of Student = " + this.name + " and Grade : " + gReport.getGrade();
	}
}
