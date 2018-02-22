package General.ConceptOfAbstract;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsAndHashCode {

    public static void main(String[] args) {

        Student s1 = new Student("arun", "scottsdale");
        Student s2 = new Student("arun", "scottsdale");
        Student s3 = new Student("arun", "scottsdale");
        Student s4 = new Student("arun", "scottsdale");

        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
    }
}


class Student {
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
