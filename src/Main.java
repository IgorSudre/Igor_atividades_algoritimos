import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   String nome;
   int idade;
   System.out.println("digite seu nome");
   nome = sc.nextLine();

        System.out.println("digite sua idade ");
        idade = sc.nextInt();

        pessoa pessoa1 = new pessoa();
        pessoa1.nome2 = nome;
        pessoa1.idade2 = idade;

        pessoa1.apresentar();
        pessoa1.fazendoaniversario();
        pessoa1.apresentar(); // idade +1
    }
}