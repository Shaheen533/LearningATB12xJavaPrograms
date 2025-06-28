package Tasks;

public class Task1_Table_print_using_printf {
    public static void main(String[] args){
        int n = 5;
        for (int i=1 ; i<=10 ;i++){
           System.out.printf("%d\tx\t%d\t = %d\n", n,i, n*i);
           // System.out.printf("%d * %d = %d\n", n,i,n*i);
        }

    }
}
