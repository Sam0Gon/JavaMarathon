package day4;
// вJOBывай и вJAVAвай
public class Task4 {
// Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
// Найти максимум среди сумм трех соседних элементов.
// Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
    public static void main(String[] args) {
        int [] massiv = new int[100];
        for (int i=0;i < 100; i++) massiv[i] = (int) (Math.random() * 10000); // заполнение массива случайными числами
        int maxTrips = SumTrips(0,massiv);
        int indexTrips = 0;
        for (int i=1; i<massiv.length-3;i++){
            if (maxTrips < SumTrips(i,massiv)){
                maxTrips = SumTrips(i,massiv);
                indexTrips = i;
            }
        }
        System.out.println("максимальная сумма трех чисел" + maxTrips);
        System.out.println("индекс первого члена максимальной суммы трех чисел" + indexTrips);
    }
    public static int SumTrips(int index, int [] mass){
        return mass[index]+mass[index+1]+mass[index+2];
    }
}
