class Student {

    String name;
    int age;
    String course;

    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Student s1 = new Student("Akshat", 22, "BSc CS");
        Student s2 = new Student("Vaishnavi", 21, "BTech CS");
        Student s3 = new Student("Aryan", 22, "MBBS");

        Student[] students = {s1, s2, s3};

        for (Student s : students) {
            s.displayDetails();
        }
    }
}