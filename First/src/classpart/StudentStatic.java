package classpart;

public class StudentStatic {
    public static int serialNum = 100;
    int studentId;
    String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static void main(String[] args) {
        StudentStatic s1 = new StudentStatic();
        StudentStatic s2 = new StudentStatic();

        s1.serialNum++;

        System.out.println(s1.serialNum); // 101
        System.out.println(s2.serialNum); // 101
        // s1의 serialNum만 올렸어도 static은 공유하는 값이므로 s2도 101이 출력된다.
        // 또한 한 클래스에서 공유하는 값이기 때문에 클래스의 직접 참조를 하는것이 좋다.
        System.out.println(StudentStatic.serialNum);
    }
}
