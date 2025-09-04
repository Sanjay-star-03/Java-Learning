public class DoubleStrInt {
    static int PlusMethod(int x, int y, int z) {
        return x + y + z;
    }
    static int MinusMethod(int x , int y) {
        return x - y ;
    }

    public static void main(String[] args) {
        int DoubleStrInt = PlusMethod(25,25,25);
        int DoubleStrInt2 = MinusMethod(50,20);
        System.out.println("int :"+DoubleStrInt);
        System.out.println("int :"+DoubleStrInt2);
    }
}

