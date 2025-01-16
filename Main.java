public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("James", "Gosling", "0987654");
        Student std2 = new Student("Dennis", "Richie", "1234567");

        std1.setGrade(18);
        std2.setGrade(17.5);

        std1.printStudentInfo();
        std2.printStudentInfo();

        Lab lab = new Lab("Mr.Smith", "Monday", 30);
        lab.enrollStudent(std1);
        lab.enrollStudent(std2);

        lab.printLabInfo();
    }
}
