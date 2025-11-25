class Student{
    int id;
    String name;
    int age;
    String branch;
    String college;

    void displayDetails(){
        System.out.println("Student id: "+id);
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Student branch: "+branch);
        System.out.println("Student college: "+college);
    }
    public static void main(String[] args) {
        Student std = new Student();
        std.id = 1;
        std.name = "Ajay";
        std.age = 22;
        std.branch = "CSE";
        std.college = "Parul University";
        std.displayDetails();
    }
}