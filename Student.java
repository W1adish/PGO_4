import java.util.ArrayList;
import java.util.List;

public class Student {
        private String fname;
        private String lname;
        private String indexNumber;
        private String email;
        private String address;
        private List<Double> grades;
        public Student(String fname,String lname,String indexNumber,String email,String address) {
            this.fname = fname;
            this.lname = lname;
            this.indexNumber = indexNumber;
            this.email = email;
            this.address = address;
            this.grades = new ArrayList<>();
        }
        public String getName() {
            return fname;

        }
        public void addGrade(double grade) {
            if (grades.size() >= 20) {
                throw new IllegalStateException("Student może mieć maksymalnie 20 ocen.");
            }
            grades.add(grade);
        }
        public double calculateAverageGrade() {
            if (grades.isEmpty()) {
                throw new IllegalArgumentException("Student nie ma żadnych ocen.");
            }
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            double average = sum / grades.size();
            return roundToNearestHalf(average);
        }
        private double roundToNearestHalf(double value) {
            return Math.round(value * 2) / 2.0;
        }
}
