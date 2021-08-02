public class HomeWorkApp {
    public static void main(String[] args) {
        rintThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void rintThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a=5;
        int b=3;
        if (a+b>=0){
            System.out.println("Сумма пложительная");
        }else System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 47;
        if (value<=0) System.out.println("Красный");
        if (0<value&&value<=100) System.out.println("Желтый");
        if (100<value)System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a=38;
        int b = 33;
        if (a>=b) System.out.println("a>=b");
        else System.out.println("a<b");
    }

}
