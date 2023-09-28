import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите вещественное число: ");

        Scanner scanner = new Scanner(System.in);

        boolean flag = false;

while (flag!=true){
    try {
        float digit=scanner.nextFloat();
        System.out.println("Вы ввели: " + digit);
        flag=true;
    } catch (InputMismatchException e){
        scanner.next();
        System.out.println("Неверный формат числа. Попробуйте еще:");
    }

}


    }
}