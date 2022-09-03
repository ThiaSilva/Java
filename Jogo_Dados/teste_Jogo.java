import java.util.Scanner;

public class teste_Jogo {

        public static void main(String[] args) {
            // execucao da logica
            Scanner userInputScanner = new Scanner(System.in);
            Dado dado = new Dado();
            int count = 0;
            boolean acertou = false;

            System.out.println("----------------------------------------");
            System.out.println(" TESTE SUA SORTE EM UM JOGO DE DADOS");
            System.out.println("-----------------------------------------");

            String insert;
            //Execucao do jogo
            System.out.println("Teste sua sorte e descubra em quantas jogadas você conseguira  tirar o número 6");
            System.out.println("O jogo termina quando você Tirar o número seis ou atingir 10 tentativas");

            while(count < 10 && acertou == false){
                System.out.println("Tentativa de número: "+count);
                System.out.print("Escreva 'jogar' para tentar: ");
                insert = userInputScanner.nextLine();
                if("jogar".equalsIgnoreCase(insert)){
                    count++;
                    dado.JogarDado();
                    System.out.println("Você tirou: "+dado.getNumero());
                    if (dado.getNumero() == 6){
                        acertou = true;
                    }
                }
            }
            if (acertou == true){
                System.out.println("Parabens!!!! Você acertou em "+count+" jogadas");
            }else{
                System.out.println("Que pena!!!!! Tente novamente");
            }
        }
    }


