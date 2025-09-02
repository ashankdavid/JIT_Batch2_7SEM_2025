package OOPs;

public class Student {
    String name; // Instance Variable (object)
    int usn; // Instance Variable (object)
    static String college; // class Variable (Student class)

    Student(String name, int usn){
        this.name = name;
        this.usn = usn;
        college = "JIT";
    }

    void printDetails(){
        System.out.println("Student name: " + this.name);
        System.out.println("Student usn: " + this.usn);
        System.out.println("Student College: " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ashank", 123);
        Student s2 = new Student("Abhishek", 345);
        s1.printDetails();
        s2.printDetails();
    }
}
