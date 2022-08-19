public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        //First exercise
        int sum = 0;
        for (int element : arr) {   // 2 й вариант
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum);
        // Second exercise
        int maxSpendInTheMonth = -1;
        int minSpendInTheDay = 1_000_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpendInTheMonth) {
                maxSpendInTheMonth = arr[i];

            }
            if (arr[i] < minSpendInTheDay) {
                minSpendInTheDay = arr[i];

            }

        }
        System.out.println("Максимальная сумма трат за день " + maxSpendInTheMonth);
        System.out.println("Минимальная сумма трат за день " + minSpendInTheDay);
        /////

        //Third exercise
        double arrageSpend = sum * 1.0 / arr.length;
        System.out.println("«Средняя сумма трат за месяц составила" + arrageSpend + " рублей».");


        // four exercise
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }

    }


}