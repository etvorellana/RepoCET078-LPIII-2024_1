import java.util.Random;
import java.util.Scanner;

public class Main_07 {
    
    public static void main(String[] args) {
        System.out.println("Implementando funções em Java");
        System.out.println("Simulando 10 lançamentos de um dado:");
        // 0 indica que a semente será a semente padrão do sistema
        jogaOsDados(1, 6, 10, 0); // chamada da função
        System.out.println("Todas as vezes que rodar este exemplo vai gerar o mesmo resultado!"); // Será? 
        long semente;
        System.out.println("Entre com a semente para gerar uma nova sequencia: ");
        Scanner sc = new Scanner(System.in);
        semente = sc.nextLong();
        // O valor positivo indica que a semente será escolhida pelo usuário
        jogaOsDados(1, 6, 10, semente); // chamada da função
        System.out.println("Sementes diferentes irão gerar resultados diferentes!\n");
        System.out.println("A mesma semente gera o mesmo resultado!\n");
        System.out.println("Escolhendo a semente de forma automática\n");
        // O valor negativo indica que a semente será escolhida automaticamente
        jogaOsDados(1, 6, 10, -1); // chamada da função
        System.out.println("Todas as vezes que rodar este exemplo gera diferentes resultados!\n");
        sc.close();
    }


    public static void jogaOsDados(int min, int tam, int qtVezes, long semente)
    {
        Random rand;
        if (semente > 0)
            rand = new Random(semente);
        else if (semente < 0)
            rand = new Random(System.currentTimeMillis());
        else
            rand = new Random(); 

        
        System.out.print("( ");
        int dado;
        for (int i = 1; i <= qtVezes; i++)
        {
            dado = min + rand.nextInt(tam);
            System.out.print(dado);
            if (i < qtVezes)
                System.out.print(", ");
            else
                System.out.println(")");
        }
    }
}



