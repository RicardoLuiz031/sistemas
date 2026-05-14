import java.util.Scanner;
import java.util.ArrayList;

public class sobremesa {

    private final Scanner ByteEats = new Scanner(System.in);
    private ArrayList<sobremesa> sobremesas = new ArrayList<>();

    private String nome;
    private String sabor;
    private double valor;


    private sobremesa(String nome, String sabor, double preco) {
      this.nome = nome;
      this.sabor = sabor;
      this.valor = valor;


   }
        public sobremesa (){

   }

             public void Cadastrarsobremesa() {

                  System.out.println("qual nome da sobremesa:");
                  String nome = ByteEats.nextLine();

                   System.out.println("qual sera o sabor da sobremesa:");
                   String sabor = ByteEats.nextLine();

                   System.out.println("digite o valor da sobremesa:");
                   double preco = ByteEats.nextDouble();

                   ByteEats.nextLine();

                   sobremesa sobremesa = new sobremesa(nome, sabor, valor);

                   sobremesas.add(sobremesa);

                   System.out.println("sobremesa cadastrada com sucesso!!!");
   }

           }