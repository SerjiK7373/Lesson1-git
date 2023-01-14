public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long []{100, 50, 10, 5});

        long max = salesManager.max();
        System.out.println(max);
    }
}
