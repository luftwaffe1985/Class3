//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0].
//С помощью цикла и условия заменить 0 на 1, 1 на 0.
//2. Задать пустой целочисленный массив длинной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ...100.
//3. Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1], пройти по нему циклом и числа, меньшие 6, умножить на 2.
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и спомощью цикла(-ов)
//заполнить его диагональные элементы единицами (можно только одну из диагонаалей, если обе сложно).
//Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть
//[0][0], [1][1], [2][2], ..., [n][n].
//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
//длиной len, каждая ячейка которого равна initialValue.
//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы.
//

public class ThreeClass {

    public static void main(String[] args) {

//               task 1
//        int[] arrOneZero = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        for (int i = 0; i < arrOneZero.length; i++)        {
//            if (arrOneZero[i] == 1) {
//                arrOneZero[i] = 0;
//            } else arrOneZero[i] = 1;
//            System.out.print(i + "-" + arrOneZero[i] + " ");
//        }
//
//              task 2
//        int[] array = new int[100];
//        int j = 1;
//        for(int i = 0; i < array.length; i++, j = j+1)
//        {array[i] = j;
//        }
//        for(int i = 0; i < array.length; i++)
//        {
//            System.out.print (i + "-" + array[i]+" ");
//        }
//
//               task 3
//        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 6) {
//                arr[i] *= 2;
//                    System.out.print(i + "-" + arr[i] + " ");
//                }
//            }
//
//               task 4
//            int[][] arr = new int[4][4];
//            for (int i = 0; i < 4; i++) {
//                for (int j = 0; j < 4; j++) {
//                    arr[i][j] = (i == j || j == (4 - i - 1))? 1 : (int)(Math.random()*100);
//                    System.out.printf("%4d", arr[i][j]);
//                }
//                System.out.println();
//            }

//        retArr(5, 1);
//                  task 6
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -1};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Min is " + min);

        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Max is " + max);
    }




//               task 5
//    public static int[] retArr(int len, int initialValue){
//        int arr[] = new int[len];
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = initialValue;
//        }
//        return arr;
//    }
//
//
//
    }














