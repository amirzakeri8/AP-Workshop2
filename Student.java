public class Student {
    private String firstName;

    private String lastName;

    // must be 7 digits
    private String id;

    private double grade;

    public Student(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        setId(id);

        this.grade = 0;
    }

    // this method sets student ID if it has 7 digits.
    public void setId(String newId) {
        if (newId.length() != 7) {
            System.out.println("ID format is invalid");
            this.id = null;
            return;
        }
        this.id = newId;
    }

    // set grade if its positive.
    public void setGrade(double grade) {
        if (grade < 0) {
            System.out.println("Invalid value for grade.");
            this.grade = 0;
            return;
        }
        this.grade = grade;
    }

    public double getGrade() {
        return this.grade;
    }

    // displays current student.
    public void printStudentInfo() {
        System.out.println("--------------");
        System.out.println(this.firstName + " " + this.lastName
        + "\nID: " + this.id + "\nGRADE: " + grade);
    }
}
