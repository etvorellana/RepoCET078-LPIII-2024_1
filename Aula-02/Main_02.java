public class Main_02 {
    public static void main(String[] args) {
        System.out.println("Testando a classe JogoDados_01\n");
        JogoDados_02 jogo = new JogoDados_02();
        System.out.println("Simulando 10 lançamentos de um dado:\n");
        jogo.inicializaJogo(10, 1, 6, 0);
        jogo.jogaODado();
        jogo.printJogo();
        for(int i = 0; i < jogo.nJogos; i++)
        {
            System.out.println(jogo.jogos[i]);
        }
        //jogo.nJogos = 11;
        jogo.setnJogos(11);
        jogo.printJogo();
        
    }
}
