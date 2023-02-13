public class Main {
    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager(new long []{100, 50, 10, 5});

        long max = salesManager.max();
        System.out.println(max);

        long price[] = {100, 50, 10, 5};
        SalesManager SalesManager = new SalesManager(price);

        System.out.println("Sale max = " + (SalesManager.max()));

        System.out.println("Sale min = " + (SalesManager.min()));

        System.out.println("Sale stat = " + (SalesManager.stat()));


    }
}