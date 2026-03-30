class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}
class Student extends Person {
    Student(String name) {
        super(name);
    }
    void study() {
        System.out.println(name + " is studying.");
    }
}
class Administrator extends Person {
    Administrator(String name) {
        super(name);
    }
    void manage() {
        System.out.println(name + " is administraring.");
    }
}
class Cleaning_Manager extends Person {
    Cleaning_Manager(String name) {
        super(name);
    }
    void clean() {
        System.out.println(name + " is cleaning.");
    }
}
class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }
    void teach() {
        System.out.println(name + " is teaching.");
    }
}
public class variant5 {
    public static void main(String[] args) {
        Student stud = new Student("Kaysar");
        Administrator admin = new Administrator("Kaysar Starshiy");
        Cleaning_Manager clean = new Cleaning_Manager("Kaysar Mladshiy");
        Teacher teach = new Teacher("Kaysar Sensei");

        stud.study();
        admin.manage();
        clean.clean();
        teach.teach();
    }

}
