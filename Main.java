import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i,k,n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Üssü alınacak Sayıyı Giriiz: ");
        n=scanner.nextInt();
        System.out.print("Üs Olacak Sayıyı Giriiz: ");
        k=scanner.nextInt();
int total=1;
        for(i=1; i<=k; i++){
            total=total*n;
        }
System.out.println("Cevap: "+total);
    }
}