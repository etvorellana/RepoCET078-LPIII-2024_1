public class Main_03 {
    public static void main(String[] args) {
        System.out.println("Testando a classe JogoDados_01\n");
        JogoDados_03 jogo = new JogoDados_03();
        System.out.println("Simulando 10 lançamentos de um dado:\n");
        //jogo.inicializaJogo(10, 1, 6, 0);
        jogo.jogaODado();
        jogo.printJogo();
        //for(int i = 0; i < jogo.nJogos; i++)
        for(int i = 0; i < jogo.getnJogos(); i++)
        {
            System.out.println(jogo.getJogo(i));
        }
        //jogo.nJogos = 11;
        jogo.setnJogos(11);
        jogo.printJogo();
        
    }
}
