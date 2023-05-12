package day4;

import java.util.Arrays;

// вJOBывай и вJAVAвай
public class Task3 {
// Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
// Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
// В консоль вывести индекс строки, сумма чисел в которой максимальна.
// Если таких строк несколько, вывести индекс последней из них.
// Пример сгенерированной матрицы (для простоты m=3, n=5):
//
// 3 2 1 5 7 	// сумма - 18
// 1 2 5 6 2 	// сумма - 16
// 3 4 9 6 4	// сумма - 26
//
// Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
    public static void main(String[] args) {
        int x = 12;     //количество строк
        int y = 8;      //количество столбцов
        int summLine = 0;
        int summNextLine =0;
        int indexMaxLine= 0;
        int [][] massiv = new int[x] [y];
        for (int i=0;i < x; i++){
            for (int k=0;k < y; k++) massiv[i][k] = (int) (Math.random() * 10000); // заполнение массива случайными числами
        }
        for (int i=0;i < x; i++) {
            for (int k = 0; k < y; k++) {
                summNextLine += massiv[i][k];      // ИСПРАВЛЕНО
            }
            if (summNextLine >= summLine){
                summLine = summNextLine;
                indexMaxLine = i;
            }
            summNextLine = 0;
        }
        System.out.println("index of line max summ: " + indexMaxLine + "   summ of line: " + summLine);
    }
}
