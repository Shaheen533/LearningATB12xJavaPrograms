package ex_04_Operators;

public class Lab036_Relational_Operators {
    public static void main(String[] args) {
//              <Less than
//                < = -> Less than or equal to
//                > Greater
//                > = Greater or equal
//                == > Equal to(but checking)
//                != -> Not equal
        // All of them will result boolean output

        int a =10;
        int b=20;
        boolean c =a > b;
        System.out.println(c);

        int age_mamatha = 33;
        int age_abc =34;
        boolean result = age_abc >= age_mamatha;
        // age_abc > age_mamatha ; age_abc = age_mamatha
        System.out.println(result);
    }
    }
