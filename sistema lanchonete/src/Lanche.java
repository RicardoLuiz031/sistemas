import java.util.Scanner;
import java.util.ArrayList;

public class Lanche {

    private final Scanner ByteEats = new Scanner(System.in);
    private ArrayList<Lanche> lanches = new ArrayList<>();

    private String nome;
    private double preco;
    private String ingredientes;
    private String tamanho;
    private String pao;



    private Lanche(String nome, double preco, String ingredientes, String tamanho, String pao) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = ingredientes;
        this.tamanho = tamanho;
        this.pao = pao;
    }
    public Lanche (){

    }

    public void CadastrarLanche() {

        System.out.println("qual nome do lanche escolhido:");
        String nome = ByteEats.nextLine();

        System.out.println("quais ingredientes tera nesse lanche:");
        String ingredientes = ByteEats.nextLine();

        System.out.println("qual sera tamanho do lanche:");
        String tamanho = ByteEats.nextLine();

        System.out.println("qual tipo de pao gostaria para seu lanche:");
        String pao = ByteEats.nextLine();

        System.out.println("qual valor do lanche:");
        double preco = ByteEats.nextDouble();

        ByteEats.nextLine();

        Lanche lanche = new Lanche(nome, preco, ingredientes, tamanho, pao);

       lanches.add(lanche);

        System.out.println("lanche cadastrado com sucesso!!!");
    }
}
