package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student schuler = new Student("Sam", "ПТ-4-89");
        Teacher blagonadejin = new Teacher("Иван Ильич", "Сопромат");
        System.out.println(schuler.getGroupName());
        System.out.println(blagonadejin.getsubjectName());
        schuler.printInfo();
        blagonadejin.printInfo();

    }
}

