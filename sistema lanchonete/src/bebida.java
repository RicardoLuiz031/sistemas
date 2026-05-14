import java.util.Scanner;
import java.util.ArrayList;


     public class bebida {

       private final Scanner ByteEats = new Scanner(System.in);
       private ArrayList<bebida> bebidas = new ArrayList<>();

       private String nome;
       private String sabor;
       private String tamanho;
       private double preco;


       private bebida(String nome, String sabor, String tamanho, double preco){

       this.nome = nome;
       this.sabor = sabor;
       this.tamanho = tamanho;
       this.preco = preco;

}
     public bebida (){

}

     public void Cadastrarbebida() {

       System.out.println("qual nome da bebida escolhida:");
       String nome = ByteEats.nextLine();

       System.out.println("qual sera o sabor da bebida:");
       String sabor = ByteEats.nextLine();

       System.out.println("qual sera o tamanho da bebida(350ML,600ML,1Litro,2Litro. )");
       String tamanho = ByteEats.nextLine();

       System.out.println("digite o valor da bebida:");
       double preco = ByteEats.nextDouble();

       ByteEats.nextLine();

       bebida bebida = new bebida(nome, sabor,tamanho, preco);

       bebidas.add(bebida);

       System.out.println("bebida cadastrada com sucesso!!!");
   }
}