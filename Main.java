public class Main {
    public static void main(String[] args) {
        Student student_1 = new Student("Jan Kowalski");
        Student student_2 = new Student("Piotr Gago");
        Student student_3 = new Student("Piotr Kovalev");
        Student student_4 = new Student("Yahor Liubczyk");
        Student student_5 = new Student("Vlad Shulha");
        student_1.addGrade(3.5);
        student_5.addGrade(4.5);
        student_2.addGrade(5.0);
        student_4.addGrade(4.0);
        student_2.addGrade(2.5);
        student_3.addGrade(3.0);
        student_1.addGrade(3.5);
        student_4.addGrade(5.0);
        student_3.addGrade(2.0);
        student_5.addGrade(4.5);
        System.out.println("Srednia ocena " + student_1.getName() + " jest " +student_1.calculateAverageGrade());
        System.out.println("Srednia ocena " + student_2.getName() + " jest " +student_2.calculateAverageGrade());
        System.out.println("Srednia ocena " + student_3.getName() + " jest " +student_3.calculateAverageGrade());
        System.out.println("Srednia ocena " + student_4.getName() + " jest " +student_4.calculateAverageGrade());
        System.out.println("Srednia ocena " + student_5.getName() + " jest " +student_5.calculateAverageGrade());

        StudentGroup group_1 = new StudentGroup("C_12");
        group_1.addStudent(student_1);
        group_1.addStudent(student_2);
        group_1.addStudent(student_3);
        group_1.addStudent(student_4);
        group_1.addStudent(student_5);

        System.out.println();
    }
}
