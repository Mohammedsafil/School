package School;

public class main {
    public static void main(String[] args){
        Person p = new Student("Kishor", 18, 25000);
        p.details();

        p = new Teacher("Geek Sam", 37, 150000);
        p.details();

        p = new Staff("Saradha", 35, 100000);
        p.details();
    }
}


class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void details(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person{
    private double fees;

    public Student(String name, int age, double fees){
        super(name, age);
        this.fees = fees;
    }

    public void details(){
        super.details();
        System.out.println("Fees: " + fees);
    }
}

class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

}

class Staff extends Person{
    private double payment;

    public Staff(String name, int age, double payment){
        super(name, age);
        this.payment = payment;
    }
}