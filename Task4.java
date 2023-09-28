import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



            System.out.println("Введите строку: ");
Scanner scanner = new Scanner(System.in);

            String str = scanner.nextLine();
            if (str.isEmpty()){
                System.out.println("Вы ввели пустую строку ");
            } else
                System.out.println(str);
    }
}
