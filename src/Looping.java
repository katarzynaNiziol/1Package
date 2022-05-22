public class Looping {
    public static void main(String[] args) {
        int i = 2;
        for (; i <= 10; i += 2) {
            System.out.println(i + " ");
        }

        System.out.println("*************");
        int counter = 3;
        while (counter > 0) {
            System.out.println("Counter value is: " + counter);
            counter--;
        }
        System.out.println("*************");
        for (int k = 0; k < 5; k++) {
            System.out.println("k: " + k);
            for (int z = 0; z < 9; z++) {
                System.out.println(z);
            }
            System.out.println("*************");
            int[] array = {3, 5, 6, 7, 9};
            for (int a : array) {
                System.out.println(a);

            }
        }
    }
}
