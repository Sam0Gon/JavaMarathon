package day8;
// вJOBывай и вJAVAвай
public class Task2 {
    // Скопируйте класс Самолет из задания дня 6.
    //Внесите изменения в класс таким образом, чтобы следующий код выводил
    // информацию о самолете, аналогично вызову метода info().
    public static void main(String[] args) {
        Airplane airplane = new Airplane ("Boeing", 2000, 150, 10000);
        //airplane.toString();                      ИСПРАВЛЕНО - ДОБАВИЛ В КОММЕНТАРИЙ
        System.out.println(airplane);

    }
}
