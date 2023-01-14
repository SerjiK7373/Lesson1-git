public class Main {
    public static void main(String[] args) {
        long price[] = {100, 50, 10, 5};
        SalesManager SalesManager = new SalesManager(price);

        System.out.println("Sale max = " + (SalesManager.max()));

        System.out.println("Sale min = " + (SalesManager.min()));

        System.out.println("Sale stat = " + (SalesManager.stat()));

    }
}