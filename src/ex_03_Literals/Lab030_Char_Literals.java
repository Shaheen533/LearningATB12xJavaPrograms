package ex_03_Literals;

public class Lab030_Char_Literals {
    public static void main(String []args){
        char c1 = 'A';//A to Z, a-z, !@#$%^&*()_+
       // char c ="A";// "" == String = Bunch of Characters
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 =' '; //blank space

        //  Escape character
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("ShaheenSoudagar");
        System.out.println("Shaheen"+new_line+"Soudagar");//adds new line to character
        System.out.println("Shaheen\nSoudagar");
        System.out.println("Shaheen"+tab_line+"Soudagar");//adds tab line
        System.out.println("Shaheen"+back_space+"Soudagar");// deleted one character at back
        System.out.println("Shaheen"+carriage_return+"Soudagar");// delete previous words
        System.out.println("----------");
        System.out.println("This is first line"+new_line+"This is second line\nThis is Third line");

        char c10 = 'A';
        //ASCII(limited characters)-A -> 65;
        char rupees = '₹';
        System.out.println("rupees");
        char my_laugh_smily = '\u1f60';
        System.out.println(my_laugh_smily);

        char c11 = '\u1f60';
        System.out.println(c11);
    }
}
