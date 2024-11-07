public class Student {
    private String name;
    private int course;
    private String studentID;

    public Student(String name, int course, String studentID) {
        this.name = name;
        this.course = course;
        this.studentID = studentID;
    }

    public void changeInfo(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }
    public void chengeCours(int course) {
        this.course = course;
    }
    public void toStr() {
        System.out.println("Студент: " + name + ", " + course + ", " + studentID);
    }
}
