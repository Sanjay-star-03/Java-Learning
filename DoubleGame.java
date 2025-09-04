public class DoubleGame {
    static int DoubleGame(int x){
        return x * 2;
    }
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            System.out.println("Double of "+ i + "is"+DoubleGame(i));
        }
    }
}
