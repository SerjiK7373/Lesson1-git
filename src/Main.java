public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{100, 50, 10, 5});

        int max = salesManager.max();
        System.out.println(max);
    }
}
