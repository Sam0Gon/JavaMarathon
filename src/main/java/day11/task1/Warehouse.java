package day11.task1;

import static java.lang.String.valueOf;

// вJOBывай и вJAVAвай
public class Warehouse {                        // объект класса "склад"
    private int countPickedOrders;              // количество собранных заказов
    private int countDeliveredOrders;           // количество доставленных заказов
    public Warehouse(int cPO, int cDO) {
        this.countPickedOrders = cPO;
        this.countDeliveredOrders = cDO;
    }
    public Warehouse() {
        this.countPickedOrders = 0;
        this.countDeliveredOrders = 0;
    }
    public void setCountPickedOrders(int countOrders){
        countPickedOrders = countOrders;
    }
    public void setCountDeliveredOrders(int countOrders){
        countDeliveredOrders = countOrders;
    }
    public int getCountPickedOrders() {         // геттер
        return countPickedOrders;
    }
    public int getCountDeliveredOrders(){       // геттер
        return countDeliveredOrders;
    }

    public String toString(){                   // для получения информации о значениях полей склада.
        StringBuffer returnString = new StringBuffer("Количество собранных заказов: "+ countPickedOrders);
        // String  = valueOf();
        returnString.append("\nКоличество доставленных заказов: "+ countDeliveredOrders);
        return valueOf(returnString);
    }

}
