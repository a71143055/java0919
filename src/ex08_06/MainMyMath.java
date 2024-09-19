package ex08_06;

public class MainMyMath {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        System.out.printf("%d과 %d중에 더 큰 값 : %d\n",n1, n2, MyMath.max(n1, n2));
        System.out.printf("%d과 %d중에 더 작은 값 : %d\n",n1, n2, MyMath.min(n1, n2));
    }
}
