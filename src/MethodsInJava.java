public class MethodsInJava {
    static void main() {
        System.out.println("Hi..");
        printTable();
        System.out.println("Java..");
    }

    static void printTable() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println(ans);
        }
    }
}


