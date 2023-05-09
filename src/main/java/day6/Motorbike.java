package day6;

public class Motorbike {
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
    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int inputYear){
        return Math.abs(inputYear-yearMade);
    }
}
