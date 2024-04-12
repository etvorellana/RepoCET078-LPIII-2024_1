import java.util.Random;

/** 
 * JogoDados_01
 * Implementação utilizando atributos e métodos públicos
 */
public class JogoDados_03 {
    private int jogos[]; // array para armazenar uma determinada quantidade de lançamento de dados
    private int nJogos;  // quantidade de lançamentos de dados
    private int nFaces;  // quantidade de faces do dado
    private int vMin;    // valor mínimo do dado
    private Random rand; // objeto para gerar números aleatórios

    /**
     * Método para inicializar o jogo
     * @param qtVezes
     * @param min
     * @param tam
     * @param semente
    */
    public void inicializaJogo(int qtVezes, int min, int tam, long semente)
    {
        nJogos = qtVezes;
        nFaces = tam;
        vMin = min;
        jogos = new int[nJogos];
        if (semente > 0)
            rand = new Random(semente);
        else if (semente < 0)
            rand = new Random(System.currentTimeMillis());
        else
            rand = new Random(); 
    }

    public void jogaODado()
    { 
        for (int i = 0; i < nJogos; i++)
        {
            jogos[i] = vMin + rand.nextInt(nFaces);
        }
    }

    public int testaDado()
    {
        return vMin + rand.nextInt(nFaces);
    }

    public void printJogo()
    {
        System.out.print("( ");
        for (int i = 0; i < nJogos; i++)
        {
            System.out.print(jogos[i]);
            if (i < nJogos-1)
                System.out.print(", ");
            else
                System.out.println(")");
        }
    }

    public int quantasVezes(int valor)
    {
        int qtVezes = 0;
        for (int i = 0; i < nJogos; i++)
        {
            if (jogos[i] == valor)
                qtVezes++;
        }
        return qtVezes;
    }

    public int[] histograma()
    {
        int hist[] = new int[nFaces];
        for (int i = 0; i < nJogos; i++)
        {
            hist[jogos[i] - vMin]++;
        }
        return hist;
    }

    public int getMin()
    {
        return vMin;
    }


    public int getMax()
    {
        return vMin + nFaces - 1;
    }

    public int getTam()
    {
        return nFaces;
    }

    public int getnJogos()
    {
        return nJogos;
    }
    
    public int getJogo(int i)
    {
        if(i >= 0 && i < nJogos)
            return jogos[i];
        else
            return -1;
    }

    public void setnJogos(int n)
    {
        if(n > 0 && n <= jogos.length)
            nJogos = n;
    }   

    public static int gerador()
    {
        Random rand = new Random();
        return rand.nextInt();
    }


}
