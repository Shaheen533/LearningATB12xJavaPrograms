package ex_01_Java_Basics;

public class Lab020_printf {
    public static void main(String[] args) {
        int a = 10;
      //  System.out.println(a);
       // System.out.printf("Your variable is %d", a);

        int b = 20;
        System.out.printf("%d + %d",a,b);
        System.out.println();
        System.out.printf("a value is %d, b value is %d",a,b);
        System.out.println();
        System.out.printf("Your value is: %d, b value is: %d",a,b);
        System.out.println();
        System.out.printf("a=%d, b=%d",a,b);
        System.out.println();
        System.out.println("a="+a+",b="+b);

    }
}
