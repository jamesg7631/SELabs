public class Printer {
    public void print(int numberA, int numberB, int numberC, boolean allNumbersSet) {
        System.out.println("Number A: " + numberA);
        System.out.println("Number B: " + numberB);
        System.out.println("Number C: " + numberC);
        System.out.println("All numbers set? " + allNumbersSet);
    }

    public void print(Number1 number, boolean allNumberSet) {
        System.out.println("Number A: " + number.getNumberA());
        System.out.println("Number B: " + number.getNumberB());
        System.out.println("Number C: " + number.getNumberC());
        System.out.println("All numbers set? " + allNumberSet);
    }
}
