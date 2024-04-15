import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele pertence ou não a sequencia de fibonacci");
        String resposta = fibonacci(sc.nextInt());
        System.out.println(resposta);
        sc.close();
        
    }

    public static String fibonacci(int value){
        int n1 = 0;
        int n2 = 1;

        while (value >= n2){
            int n3 = n1;
            n1 = n2;
            n2 = n1 + n3;
            if (n2 == value){
                return "O número: " + value + " pertence a sequência de fibonacci";
            }
        }
        return "O número: " + value + " não pertence a sequência de fibonacci";
    }
}
