package ex_04_Operators;

public class Lab035_Operators_Modulus {
    public static void main(String[] args){
        int a =20;
        int b =10;
        System.out.println(a%b);//-> Mod ->Remainder

        // 10 /20 /2 -quotient
        //    /20/
        // -----------
        //      0 -Remainder
        // ----------
        System.out.println(13%7);
      /*  11%2 ->1, 13%2 ->1
                10%2->0, 12%2-> 0
                Number % 2 ->Remainder ->1->odd  Number divided by 2 yeilding 1 is odd while 0 is even
                               0 ->even */
    }
}
