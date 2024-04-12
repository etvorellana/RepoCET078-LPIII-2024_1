
import java.util.Random;

public class Lampada {
    private boolean ligada;
    private boolean queimada;
    private int vidaUtil;
    private int vezesLigada;
    private Random rand;

    public Lampada(int vidaUtil) {
        this.ligada = false;
        queimada = false;
        this.vidaUtil = vidaUtil;
        this.vezesLigada = 0;
        rand = new Random();
    }

    public boolean estaLigada() {
        return ligada;
    }

    public boolean estaQueimada() {
        return queimada;
    }

    private void verificaVidaUtil() {
        if (vidaUtil ==  vezesLigada) {
            queimada = true;
        }
        double taxa = (double) vezesLigada / vidaUtil;
        if (taxa > 0.8) {
            int queimou = rand.nextInt(10);
            if (queimou > 7) 
                queimada = true;
        }
    }

    public boolean liga(int lum){
        return true;
    }

    public boolean liga() {

        if((!queimada) && (!ligada)) {
            verificaVidaUtil();
        if ((!queimada) && (!ligada)) {
            ligada = true;
            vezesLigada++;
            return true;
        }else{
            return false;
        }
    }

    public boolean desliga() {
        if (!queimada && ligada) {
            ligada = false;
            return true;
        } else {
            return false;
        }
    }

    public int getVidaUtil() {
        return vidaUtil - vezesLigada;
    }

}
