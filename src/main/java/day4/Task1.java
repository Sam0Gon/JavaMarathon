package day4;

import java.util.Arrays;
import java.util.Scanner;

// вJOBывай и вJAVAвай/
public class Task1 {
    // С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера
// и заполнить его случайными числами от 0 до 10 (включительно).
// Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль информацию о:
//а) Длине массива
//б) Количестве чисел больше 8
//в) Количестве чисел равных 1
//г) Количестве четных чисел
//д) Количестве нечетных чисел
//е) Сумме всех элементов массива
//
//Пример:
//Введено число 10. Сгенерирован следующий массив:
//[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
//
//Информация о массиве:
//Длина массива: 10
//Количество чисел больше 8: 1
//Количество чисел равных 1: 0
//Количество четных чисел: 6
//Количество нечетных чисел: 4
//Сумма всех элементов массива: 46
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int [] massiv1 = new int[x];
        for (int i=0;i < x; i++) massiv1[i] = (int) (Math.random() * 10); // заполнение массива случайными числами
        int countMore8 = 0;
        int countEquals1 =0;
        int countEven = 0;
        int countOdd = 0;
        int sumAllnum = 0;
        System.out.println("Введено число "+x+" Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(massiv1));
        for(int a : massiv1){
            if (a > 8) countMore8++;
            if (a == 1) countEquals1++;
            if (a%2 == 0) countEven++;
            else countOdd++;
            sumAllnum += a;
        }
        System.out.println();
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: "+ x);
        System.out.println("Количество чисел больше 8: "+ countMore8);
        System.out.println("Количество чисел равных 1: "+ countEquals1);
        System.out.println("Количество четных чисел: "+ countEven);
        System.out.println("Количество нечетных чисел: "+ countOdd);
        System.out.println("Сумма всех элементов массива: "+ sumAllnum);
    }
}
