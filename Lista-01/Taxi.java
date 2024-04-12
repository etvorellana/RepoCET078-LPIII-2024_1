public class Taxi {

    private boolean mapa[][]; // mapa de cruzamentos da cidade
    private int posX, posY; // posição do taxi no mapa
    private int percurso;
    private int meuId;
    private static int id = 0;
 
    public Taxi(int nRuasH, int nRuasV, int posX, int posY) 
    {
        mapa = new boolean[nRuasH][nRuasV];
        for(int i = 0; i < nRuasH; i++)
            for(int j = 0; j < nRuasV; j++)
                mapa[i][j] = true;

        this.posX = posX;
        this.posY = posY;
        id++;
        meuId = id;
    }

    public boolean fechaCruzamento(int l, int c)
    {
        if (!cruzamentosOk(l, c))
            return false;
        else 
            mapa[c][l] = false;
        return true;
    }

    public Taxi(int nRuas) {
        this(nRuas, nRuas, 0, 0);
    }

    public Taxi(int posX, int posY) {
        this(10, 10, posX, posY);
    }

    public Taxi(Taxi outroTaxi){
        this(outroTaxi.mapa.length, outroTaxi.mapa[0].length, outroTaxi.posX, outroTaxi.posY);
    }

    public Taxi() {
        this(10, 10, 0, 0);
    }

    public boolean right() {
        if (posX < mapa[0].length - 1) {
            posX++;
            percurso++;
            return true;
        } else {
            return false;
        }
    }

    public boolean left() {
        if (posX > 0) {
            posX--;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean up() {
        if (posY > 0) {
            posY--;
            return true;
        } else {
            return false;
        }
    }

    public boolean down() {
        if (posY < mapa.length - 1) {
            posY++;
            return true;
        } else {
            return false;
        }
    }

    public int qualMeuId()
    {
        return meuId;
    }

    private boolean cruzamentosOk(int l, int c)
    {
        if (l >= 0 && l < mapa.length && c >= 0 && c < mapa[0].length)
            return true;
        else
            return false;
    }
    
    public String fromAToB(int l1, int c1, int l2, int c2){
        String rota = "";
        if (!cruzamentosOk(l1, c1) || !cruzamentosOk(l2, c2))
            return rota;

        if (l1 < l2) {
            for (int i = l1; i < l2; i++) {
                rota += "down ";
            }
        } else {
            for (int i = l1; i > l2; i--) {
                rota += "up ";
            }
        }
        if (c1 < c2) {
            for (int i = c1; i < c2; i++) {
                rota += "right ";
            }
        } else {
            for (int i = c1; i > c2; i--) {
                rota += "left ";
            }
        }
        return rota;
    }
    
    public boolean moveToB(int l, int c){
        if (!cruzamentosOk(l, c))
            return false;
        String rota = fromAToB(posX, posY, l, c);
        if (rota.equals(""))
            return false;
        String[] movimentos = rota.split(" ");
        for (String movimento : movimentos) {
            if (movimento.equals("up")) {
                up();
            } else if (movimento.equals("down")) {
                down();
            } else if (movimento.equals("left")) {
                left();
            } else if (movimento.equals("right")) {
                right();
            }
        }
        return true;
    }

    public int percursoTotal(){
        return percurso;
    }
}
