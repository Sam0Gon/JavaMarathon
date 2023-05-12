package day7;

// вJOBывай и вJAVAвай
public class Airplane {
    // Создать класс Самолет (Airplane) с полями:// ВО ВСЕ ПОЛЯ ДОБАВЛЕН модификатор private
    private String manufacturer;            // manufacturer (изготовитель)
    private int year;                       // year (год выпуска)
    private int length;                  // length (длина)
    private int weight;                  // weight (вес)
    private int fuel;                    // fuel (количество топлива в баке)

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    // Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса
    // (значение поля “количество топлива в баке” установить равным 0).
    // В конструкторе для передачи полям значений использовать ключевое слово this.
    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.length = length;
        this.year = year;
        this.weight = weight;
        this.fuel = 0;
    }

    public void fillUp(int refueling) {
        fuel = fuel + refueling;                //ИСПРАВЛЕНО: Возвращать этот метод ничего не должен, просто изменить переменную,
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public static void compareAirplanes(Airplane flugzeug1, Airplane flugzeug2) {
        if (flugzeug1.length > flugzeug2.length)
            System.out.println("Первый самолет длиннее");
        else if (flugzeug1.length < flugzeug2.length)           // ИСПРАВЛЕНО
            System.out.println("Второй самолет длиннее");
        else System.out.println("Длины самолетов равны");
    }
}

