class HomeWorkApp {
    public static void main(String[] arges) {
        compareNumbers();
        printThreeWords();
        checkSumSign();
        printColor();

    }
    public static void compareNumbers(){
        int a = 5;
        int b = 1;
        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Apple");
        System.out.println("Banana");
    }

    public static void checkSumSign() {
        int a = 1;
        int b = 5;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 34;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }

    }
}
