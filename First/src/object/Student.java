package object;

public class Student {
    int studentId;
    private String studentName;
    int grade;
    String address;

    // toString 메서드 재정의해서 학생의 이름과 학번이 출력되도록 변경
    @Override
    public String toString() {
        return studentName + ", " + studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public static void main(String[] args) {
        Student studentAhn = new Student();
        studentAhn.setStudentName("Asdasd");
        studentAhn.studentId = 1111111111;

        System.out.println(studentAhn.toString());
    }
}