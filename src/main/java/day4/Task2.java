package day4;
// вJOBывай и вJAVAвай
public class Task2 {
//Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Затем, используя цикл for each вывести в консоль:
//наибольший элемент массива
//наименьший элемент массива
//количество элементов массива, оканчивающихся на 0
//сумму элементов массива, оканчивающихся на 0
//
//Использовать сортировку запрещено.
    public static void main(String[] args) {
        int [] massiv = new int[100];
        for (int i=0;i < massiv.length; i++) massiv[i] = (int) (Math.random() * 10000); // заполнение массива случайными числами. Исправлено конечное значение.
        int max = massiv[0];
        int min = massiv[0];
        int countZero = 0;
        int sumCountZero = 0;
        for(int a : massiv){
            max = Math.max(max,a);
            min = Math.min(min,a);
            if(a%10 == 0){
                countZero++;
                sumCountZero = sumCountZero+a;
            }
        }
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива:" + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: "+ countZero);
        System.out.println("сумму элементов массива, оканчивающихся на 0: "+ sumCountZero);
    }
}
