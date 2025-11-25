class Employee{
    String eid;
    String ename;
    int eage;
    float esalary;
    String edepar;

    void displayDetails(){
        System.out.println("Employee id: "+eid);
        System.out.println("Employee name: "+ename);
        System.out.println("Employee age: "+eage);
        System.out.println("Employee salary: "+esalary);
        System.out.println("Employee Department: "+edepar);
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.eid = "1";
        emp.ename = "Ajay";
        emp.eage = 22;
        emp.esalary = 40000.00f;
        emp.edepar = "Developer";
        emp.displayDetails();
    }
}