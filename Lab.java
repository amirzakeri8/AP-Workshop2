import java.util.Arrays;

public class Lab {
    private Student[] students;
    private String teacherName;
    // the day in which this lab is held.
    private String dayOfWeek;
    private int maxSize;
    private int currentSize = 0;
    private double avgGrade;

    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        // create a list of students with size = maxSize.
        this.students = new Student[maxSize];
    }

    // calculates average of created lab;
    public void calAvg() {
        double sum = 0;
        for (Student student : this.students) {
            sum += student.getGrade();
        }
        this.avgGrade = sum / this.currentSize;
    }

    // enrolls student to lab.
    public void enrollStudent(Student student) {
        // checking if it can add student
        if (this.currentSize < this.maxSize) {
            this.students[this.currentSize] = student;
            // when added, increase number of currentSize by one.
            this.currentSize++;
            System.out.println("Student enrolled successfully!");
        } else {
            System.out.println("Lab is full!");
        }
    }

    public double getAvgGrade() {
        return this.avgGrade;
    }

    public void setAvgGrade(double newAvgGrade) {
        // checking if newAvgGrade is not negative then set it.
        if (newAvgGrade >= 0) {
            this.avgGrade = newAvgGrade;
        } else {
            System.out.println("Invalid value!");
        }
    }

    public int getCurrentSize() {
        return this.currentSize;
    }

    public void setCurrentSize(int newCurrentSize) {
        // checking if newCurrentSize is not negative and lesser than current size.
        if ((newCurrentSize >= 0) && (newCurrentSize <= this.maxSize)) {
            this.currentSize = newCurrentSize;
        } else if (newCurrentSize > this.maxSize) {
            System.out.println("You cannot set current size to this value");
            System.out.println("MaxSize is " + this.maxSize);
        } else {
            System.out.println("Invalid value for current size");
        }
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public void setMaxSize(int newMaxSize) {
        // checking if newMaxSize is not negative and greater than current size.
        if ((newMaxSize >= 0) && (newMaxSize > this.currentSize)) {
            this.maxSize = newMaxSize;
        } else if (newMaxSize <= this.currentSize) {
            System.out.println("You cannot set max size to this value");
            System.out.println("Current size is " + this.currentSize);
        } else {
            System.out.println("Invalid value for max size");
        }
    }

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    public void setDayOfWeek(String newDayOfWeek) {
        this.dayOfWeek = newDayOfWeek;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String newTeacherName) {
        this.teacherName = newTeacherName;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void setStudents(Student[] newStudents) {
        int size = 0;

        // finding non-null elements in given student array to find size of it.
        for (Student student : newStudents) {
            if (student != null) {
                size++;
            }
        }

        // checking if size is not greater than maxSize
        if (size <= this.maxSize) {
            this.students = newStudents;
            this.currentSize = size;
        } else {
            System.out.println("Cannot set new students, size exceeds maxSize");
        }
    }

    public void printLabInfo() {
        // displaying lab information.
        System.out.println("<---LAB INFO--->");
        System.out.println("Lab teacher -> " + this.teacherName);
        System.out.println("Day of the week -> " + this.dayOfWeek);
        System.out.println("Max Size -> " + this.maxSize);
        System.out.println("Current Size -> " + this.currentSize);

        System.out.println("----Students in this lab----");
        // using printStudentInfo method for each student in students array.
        for (int i = 0; i < currentSize; i++) {
            this.students[i].printStudentInfo();
        }
    }
}
