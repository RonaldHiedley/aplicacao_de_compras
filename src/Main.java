import br.com.aplicacao.compras.modelos.Compras;
import br.com.aplicacao.compras.modelos.Credito;

import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor inicial:");
        Credito credito = new Credito(input.nextDouble());
        input.nextLine(); //limpar buffer

        ArrayList<Compras> listaCompras = new ArrayList<>();

        int opcao = 0;

        while(opcao != 4){
            System.out.println("""
                    \n===== MENU =====
                    1 - Adicionar compra
                    2 - Listar compras
                    3 - Ver limite
                    4 - Sair""");

            opcao = input.nextInt();
            input.nextLine();

            switch (opcao){
                case 1:
                    Compras compras = new Compras();

                    System.out.println("Digite o item do compra:");
                    compras.setDescricao(input.nextLine());

                    System.out.println("Digite o valor do compra:");
                    compras.setValor(input.nextDouble());
                    input.nextLine();

                    if (credito.getLimite() >= compras.getValor()){
                        credito.setLimite(credito.getLimite() - compras.getValor());
                        listaCompras.add(compras);
                        System.out.println("Compra realizada com sucesso!");
                } else {
                        System.out.println("Limite insuficiente!");
                    }
                    break;
                    case 2:
                        System.out.println("Compras:");
                        for (Compras c : listaCompras){
                            System.out.println(c.getDescricao() + " - " + c.getValor());
                        }
                        break;
                        case 3:
                            System.out.println("Limite disponível: R$" + credito.getLimite());
                            break;

                            case 4:
                                System.out.println("Encerrando...");
                                break;

                default:
                    System.out.println("Opção inválida!");


            }
        }



//        Credito credito = new Credito();
//        System.out.println("Insira o limite do cartão de credito:");
//        credito.setLimite(input.nextDouble());
//        input.nextLine();
//        System.out.println("Credito Disponivel:" + credito.getLimite());
//
//        ArrayList<Credito> listaCredito = new ArrayList<>();
//        listaCredito.add(credito);
//
//        Compras compras = new Compras();
//        System.out.println("Digite a descrição da compra:");
//        compras.setDescricao(input.nextLine());
//        System.out.println(compras.getDescricao());
//        System.out.println("Digite o valor da compra:");
//        compras.setValor(input.nextDouble());
//        System.out.println(compras.getValor());



    }
}