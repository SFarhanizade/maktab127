public class Main {
    public static void main(String[] args) {
        var obj1 = method(1, 2, 4, 5, 6);
        var obj2 = new Object();

        Test.register("");
    }

    private static Object method(Object... objects) {
        System.out.println("some changes");
        return null;
    }
}
