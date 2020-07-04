package _05Students;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;

    public double getGrade() {
        return this.grade;
    }

    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f",
                this.firstName, this.lastName, this.grade);
    }
}
