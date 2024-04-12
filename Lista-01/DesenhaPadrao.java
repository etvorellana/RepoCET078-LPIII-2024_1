public class DesenhaPadrao {

    private int tipo;  // tipo 0 para quadrado e 1 para triangulo
    public DesenhaPadrao(int tipo){
        this.tipo = tipo;
    }

    public void desenha(int tamanho)
    {

    }

    private void desenhaQuadrado(int tamanho)
    {
        
    }


    private void desenhaTriangulo(int tamanho)
    {
        
    }

    public mudaTipo(int tipo)
    {
        this.tipo = tipo;
    }

    public String qualTipo()
    {
        if (tipo == 0)
            return "Quadrado";
        else
            return "Triangulo";
    }
}
