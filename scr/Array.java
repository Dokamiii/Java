package scr;

public class Array {

    public static void main(String[] args) {
        String[] cars = { "BMW", "VOLVO", "FORD" };

        for (String i : cars) {
            System.out.println(i);
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        int ages[] = { 20, 23, 24, 32, 30, 54, 68, 82 };

        float avg, sum = 0;

        int length = ages.length;

        for (int age : ages) {
            sum += age;
        }

        avg = sum / length;

        System.out.println("A media de ideade é :" + avg);
    }

}
