import java.util.ArrayList;
import java.util.Scanner;

private Scanner ByteEats = new Scanner(System.in);

private ArrayList<Pedido> pedidos = new ArrayList<>();
private ArrayList<Produto> produtos = new ArrayList<>();

void main() {

            int opcao;

            do {


                System.out.println("\n=== sistema lanchonete ===");

                System.out.println("(1) - cadastrar produto");

                System.out.println("(2) - area do cliente");

                System.out.println("(3) - faca seu pedido");

                System.out.println("(0) - sair");

                System.out.println("escolha uma opcao:");

                opcao = ByteEats.nextInt();

                ByteEats.nextLine();

                switch (opcao) {

                    case 1 -> cadastrarProduto();

                    case 2 -> AreaCliente();

                    case 3 -> Criarpedido();

                    case 0 -> System.out.println("encerrando...");

                    default -> System.out.println("opcao invalida!");
                }
            } while (opcao != 0);
        }

        public void cadastrarProduto() {


            System.out.println("deseja cadastrar qual produto?");
            System.out.println("(1) - lanche");
            System.out.println("(2) - bebida");
            System.out.println("(3) - sobremesa");

            int opcao = ByteEats.nextInt();
            ByteEats.nextLine();

            switch (opcao) {

                case 1: {
                    Lanche lanche = new Lanche();
                    lanche.CadastrarLanche();
                    break;
                }


                case 2: {
                    bebida bebida = new bebida();
                    bebida.Cadastrarbebida();
                    break;

                }


                case 3: {
                    sobremesa sobremesa = new sobremesa();
                    sobremesa.Cadastrarsobremesa();
                    break;
                }

                default:
                    System.out.println("opcao invalida!");
            }
        }

        public void AreaCliente() {

            System.out.println("digite seu nome e sobrenome");
            String nomeSobrenome = ByteEats.nextLine();

            System.out.println("digite cfp: (apenas 14 caracteres)");
            String cpf = ByteEats.nextLine();

            System.out.println("digite seu endereco");
            String endereco = ByteEats.nextLine();

            System.out.println("digite telefone de contato");
            String telefone = ByteEats.nextLine();

            Cliente cliente = new Cliente(nomeSobrenome, endereco);

            System.out.println("cliente cadastrado: " + cliente.getNome());

        }

        public void Criarpedido() {

        }
