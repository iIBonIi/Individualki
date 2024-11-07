public class DiplomStudent extends Student {
    private String theme_of_diplom;

    public DiplomStudent(String name, int course, String studentID, String theme_of_diplom) {
        super(name, course, studentID);
        this.theme_of_diplom = theme_of_diplom;
    }

    public void DiplomtToStr() {
        toStr();
        System.out.println("Тема диплома: " + theme_of_diplom);
    }

    public void chengeDiplomTheme(String theme_of_diplom) {
        this.theme_of_diplom = theme_of_diplom;
    }
}
