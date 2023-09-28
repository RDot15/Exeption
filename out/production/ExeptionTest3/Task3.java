

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            // 3 элемент массива лишний
             abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
// данное исключение имеет наивысший порядок. если его оставить первым, то остальные исключения выполняться не будут
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }



        public static void printSum (Integer a, Integer b) /*throws FileNotFoundException*/
        {
            // в исключениии нет смысла. оно не используется. будет только ошибка
            System.out.println(a + b);
        }

    }
