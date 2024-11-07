public class Main {
    public static void main(String[] args){
        Student student = new Student("Иван Иванов", 3, "f93ho2");
        DiplomStudent diplomStudent = new DiplomStudent("Александр Александров", 4, "h234", "Информационная безопасть");

        student.toStr();
        diplomStudent.DiplomtToStr();

        student.chengeCours(2);
        student.changeInfo("Иван Сидоров", "42hj54");

        diplomStudent.chengeDiplomTheme("Машинное строение");

        System.out.println(" ");
        
        student.toStr();
        diplomStudent.DiplomtToStr();
    }
}
//создать класс 'книга' с полями автор, год выпуска, цена.
//создать класс 'библиотека', в котором необходимо преудусмотреть методы добавления книги,
//удаление книги по названию, удалением списка книг, заданного автора, получением списком книг с заданым диапазоном цен
//вычисление средней стоимости ?? заданного автора и сортировка в обратном алфавитном порядке
