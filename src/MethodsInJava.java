public class MethodsInJava {
    static void main() {
        System.out.println("Hi..");
//        printTable();
//        printSum(3,5);
//        printMultiplication(3,5);
//        printSum();
//        int total = addNum(12,15);
//        System.out.println("Result is :" +total);
        int num = 5;
        System.out.println("In the main fun :" +num);
        solve(5);
        System.out.println("In the main fun :" +num);


    }

//    static void printTable() {
//        for (int i = 1; i <= 10; i++) {
//            int ans = 2 * i;
//            System.out.println(ans);
//        }
//    }

    //Parameters vs no parameter
    static void printSum(int x, int y){
        System.out.println("Sum is : " + (x+y));
    }

    static  void printMultiplication(int x, int y){
        int result = x*y;
        System.out.println("Result is: " +result);
    }

    static void printSum(){
        int a =3;
        int b = 6;
        System.out.println(a+b);
    }

    //Void vs no void return type:
    static int addNum(int p, int q){
        int sum = p+q;
        return sum;
    }

    //Call by value :
    static void solve(int num){
        System.out.println("Insiade solve fun :" + num);
        num= num*10;
        System.out.println("Inside solve fun :" + num);
    }


















}


