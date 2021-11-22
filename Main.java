/*Пользователь вводит с клавиатуры целое
*положительное число n. Вывести на экран n первых
*чисел последовательности 0, -5,-10,-15..
*/

import java.util.Scanner;

public class Main{
  public static void main (String[]args){
    Scanner in = new Scanner (System.in);

    System.out.print("Введите значение n: ");
    int n = in.nextInt ();
    int k = 0;
    int x = 0;

    if (n > 0){

	while (k != n){
	    System.out.println(x);
	    x -= 5;
	    k++;
        }
    }
    else{
        
        System.out.println("Данные введены некорректно");
      }
    }
}
