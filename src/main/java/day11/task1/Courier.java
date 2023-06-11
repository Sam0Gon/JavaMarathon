package day11.task1;

import static java.lang.String.valueOf;

// вJOBывай и вJAVAвай
public class Courier implements Worker {
    private int salary;                 // поле: заработная плата
    private boolean isPayed;                // поле: факт выплаты бонуса
    private Warehouse sklad;            // поле: принадлежность к складу
    public Courier (int salary,boolean isPayed, Warehouse sklad){      //конструктор
        this.salary = salary;
        this.isPayed = isPayed;
        this.sklad = sklad;
    }

    public Courier(Warehouse w) {
        this.sklad = w;
    }

    public int getSalary() {
        return salary;
    }
    public boolean getisPayed(){
        return isPayed;
    }
    //    public void PrintSklad(){
//        System.out.println("количество заказов  "+ sklad.getCountPickedOrders());
//        System.out.println("зарплата "+ salary);
//    }
    public String toString() {                   // для получения информации о значениях полей
        StringBuffer returnString = new StringBuffer("Зарплата: " + salary);
        if (isPayed) {
            returnString.append("\nбонус не выплачен ");
        } else {
            returnString.append("\nбонус выплачен");
        }
        return valueOf(returnString);
    }
    @Override
    public void doWork() {
        sklad.setCountDeliveredOrders(sklad.getCountDeliveredOrders()+1);
        salary=salary+100;
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else {
            if (sklad.getCountDeliveredOrders() < 10000) {
                System.out.println("Бонус пока не доступен");
            } else {
                salary = salary + 50000;
                isPayed = false;
            }
        }
    }
}