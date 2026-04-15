import br.com.aplicacao.compras.modelos.Compras;
import br.com.aplicacao.compras.modelos.Credito;

import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Credito credito = new Credito();
        System.out.println("Insira o limite do cartão de credito:");
        credito.setLimite(input.nextDouble());
        input.nextLine();
        System.out.println("Credito Disponivel:" + credito.getLimite());

        ArrayList<Credito> listaCredito = new ArrayList<>();
        listaCredito.add(credito);

        Compras compras = new Compras();
        System.out.println("Digite a descrição da compra:");
        compras.setDescricao(input.nextLine());
        System.out.println(compras.getDescricao());
        System.out.println("Digite o valor da compra:");
        compras.setValor(input.nextDouble());
        System.out.println(compras.getValor());


    }
}