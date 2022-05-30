import java.util.Scanner;

public class pedra_papel_tesoura
{ 
    public static void main(String args[]){
        int jogador;
        int computador;
        //declaração constante
        final int pedra = 0;
        final int papel = 1;
        final int tesoura = 2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---Jokenpo---");
        System.out.println("");
        System.out.println("0 = pedra");
        System.out.println("1 = papel");
        System.out.println("2 = tesoura");
        System.out.println("");
        System.out.println("Digite a opção de sua escolha: ");
        
        //jogador
        jogador = teclado.nextInt();
        switch (jogador){
        case pedra:
            System.out.println("Jogador escolheu pedra");
            break;
        case papel:
            System.out.println("Jogador escolheu papel");
            break;
        case tesoura:
            System.out.println("Jogador escolheu tesoura");
            break;
        default:
            System.out.println("Opção invalida, selecione uma opção válida");
            //Finaliza app
            System.exit(0);
        }
        //Computador
        computador = (int) (Math.random() * 2);
        System.out.println("");
        System.out.println("loading : " + " sorteando ");
        System.out.println("");
        System.out.println(computador);
        System.out.println("");
        //Fechar Scanner
        teclado.close();
        //escolha do computador
        switch (computador){
            case pedra:
                System.out.println("Computador escolheu pedra");
                break;
            case papel:
                System.out.println("Computador escolheu papel");
                break;
            case tesoura:
                System.out.println("Computador escolheu tesoura");
                break;
        }
        //logica de saidas
        System.out.println("");
        if (jogador == computador) {
            System.out.println("Houve um empate");
        } else {
            boolean jogadorGanhou = 
            (jogador == papel && computador == pedra)
            ||(jogador == tesoura && computador == papel)
            ||(jogador == pedra && computador == tesoura);
            if (jogadorGanhou){
                System.out.println("Jogador ganhou, parabéns");
            }else{
                System.out.println("computador ganhou");
            }
        }
    }
}
