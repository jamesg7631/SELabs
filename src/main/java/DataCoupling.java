public class DataCoupling {
    int numberA = 1;
    int numberB = 2;
    int numberC = 3;
    boolean allNumbersSet = true;
    Printer printer = new Printer();
    Sum mySum = new Sum();

    public void firstCaller() {
        printer.print(numberA, numberB);
        printer.print(numberC, allNumbersSet);
    }

    public void secondCaller() {
        mySum.sum(numberA, numberB);
    }

    public static void main(String[] args) {
        DataCoupling myDataCoupling = new DataCoupling();
        myDataCoupling.firstCaller();
        myDataCoupling.secondCaller();
    }
}
