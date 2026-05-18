public class Student implements EducationalUnit {
    private String name;
    private String studentID;
    private double tuitionFee;

    public Student(String name, String studentID, double tuitionFee) {
        this.name = name;
        this.studentID = studentID;
        this.tuitionFee = tuitionFee;
    }

    public void displayDetails(String indent) {
        System.out.println(indent + "Student: " + name + " (ID: " + studentID + ")");
    }

    public int getStudentCount() { return 1; }
    public double getBudget() { return -tuitionFee; } // 
}