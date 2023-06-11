package day11.task1;

import static java.lang.String.valueOf;

// вJOBывай и вJAVAвай
public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse sklad;
    public Picker (int salary,boolean isPayed, Warehouse sklad1){      //конструктор
        this.salary = salary;
        this.isPayed = isPayed;
        this.sklad = sklad1;
    }
    public Picker(Warehouse sklad1){
        this.sklad = sklad1;
    }
    public int getSalary() {
        return salary;
    }
    public boolean getisPayed(){
        return isPayed;
    }
    public String toString() {                   // для получения информации о значениях полей
        StringBuffer returnString = new StringBuffer("Зарплата: " + salary);
        if (isPayed) {
            returnString.append("\nбонус не выплачен ");
        } else {
            returnString.append("\nбонус выплачен");
        }
        return valueOf(returnString);
    }
//    public void PrintSklad(){
//        System.out.println("количество заказов   "+ sklad.getCountPickedOrders());
//        System.out.println("зарплата   "+ salary);
//    }

    @Override
    public void doWork() {
        sklad.setCountPickedOrders(sklad.getCountPickedOrders()+1);
        salary=salary+80;
    }
    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else {
            if (sklad.getCountPickedOrders() < 10000) {
                System.out.println("Бонус пока не доступен");
            } else {
                salary = salary + 70000;
                isPayed = false;
            }
        }
    }
}