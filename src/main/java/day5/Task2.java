package day5;
// вJOBывай и вJAVAвай

public class Task2 {
// Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”.
// Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
// Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
// Вывести в консоль значение каждого из полей, используя get методы.
    public static void main(String[] args) {
        Motorbike myMoto = new Motorbike("Jawa","red",1980);
        System.out.println("Moto model: " + myMoto.getModel());
        System.out.println("Moto color: " + myMoto.getColor());
        System.out.println("Moto model: " + myMoto.getYearMade());
    }
    public static class Motorbike{
        private String model;
        private String color;
        private int yearMade;
        public Motorbike(String model, String color, int yearMade){
            this.model = model;
            this.color = color;
            this.yearMade = yearMade;
        }
        public String getModel(){
            return model;
        }
        public String getColor() {
            return color;
        }
        public int getYearMade(){
            return yearMade;
        }
        private void PrintCarInfo(){
            System.out.println("Moto model: "+ model);
            System.out.println("Moto color: "+ color);
            System.out.println("Moto develop year: " + yearMade);
        }
    }
}
