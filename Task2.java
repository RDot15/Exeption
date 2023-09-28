
public class Main {

    public static void main(String[] args) {

        // массив intArray не инициализирован. исправляем это
        int [] intArray={1,2,3,4,5,6,7,8};



        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // ArrayIndexOutOfBoundsException возникал выход за пределы массива // дабавил Исключение
            System.out.println("Catching exception: " + e);
        }






    }
}
