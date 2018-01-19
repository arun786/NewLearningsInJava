package ValueAndReferences;

public class FinalKeyWord {
    public static void main(String[] args) {

        /**
         * Here reference cannot be changed
         */
        final Student student = new Student("arun");
        //student = new Student("adwiti"); //this will be give a compiler error.
        /**
         * this will work as Student object will be pointing to
         * adwiti from arun and arun will be gc
         */
        student.setName("adwiti");
        System.out.println(student.getName());

        changeNameofFinal(student);
        System.out.println(student.getName());

        Student s = new Student();
        System.out.println(s.getName());
    }

    static void changeNameofFinal(Student s) {
        s.setName("Adi");
    }
}

class Student {
    public Student() {
    }

    private String name = "sachin";

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
