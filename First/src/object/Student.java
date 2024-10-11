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

    // equls 메서드 재정의, 단순 주소값이 아닌 학생의 id가 같으면 같다고 판별.
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            if (this.studentId == std.studentId)
                return true;
            else
                return false;
        }
        return false;
    }

    // hashCode 메서드 재정의, 코드 값으로 학번을 반환하도록 변경
    @Override
    public int hashCode() {
        return studentId;
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