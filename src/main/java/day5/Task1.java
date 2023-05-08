package day5;
// вJOBывай и вJAVAвай
public class Task1 {
    //Создать класс Автомобиль (англ. Car)
    // с полями “Модель”, “Цвет”, “Год выпуска”.
    // Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
    // Задать значение для каждого поля, используя set методы. Вывести в консоль значение каждого из полей, используя get методы.
    // Созданный вами класс должен отвечать принципам инкапсуляции.
    public static void main(String[] args) {
        Car newBibika = new Car();
        newBibika.setModel("Moscowich");
        newBibika.setColor("SerBurMalinovii");
        newBibika.setYearMade(1973);
        newBibika.PrintCarInfo();
    }

    static class Car{
    private String model;
    private String color;
    private int yearMade;
    public void setModel(String modelType){
        model = modelType;
    }
    public void setColor(String colorAuto){
        color = colorAuto;
    }
    public void setYearMade(int yearAuto){
        yearMade = yearAuto;
    }
    public String getModel(String modelType){
        return model;
    }
    public String getColor(String colorAuto) {
        return color;
    }
    public int getYearMade(int yearAuto){
        return yearMade;
    }
        private void PrintCarInfo(){
            System.out.println("Car model: "+ model);
            System.out.println("Car color: "+ color);
            System.out.println("Car develop year: " + yearMade);
        }
    }
}
