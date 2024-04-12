public class RegistroAluno {
    private long matricula;
    private String nome;
    private String email;
    // sequencial de matrícula por semestre desde o ano 2000
    static private int[] seqIndex = new int[50]; // 25 anos cada um com dois semestres 

    public long getMatricula() {
        return matricula;
    }
    public boolean setMatricula(short ano, boolean semI) {
        if (ano >= 2000){
            int sem = semI ? 1 : 2;
            int index = ano - 2000;
            seqIndex[index]++; // incrementa o sequencial
            matricula = ano * 100000 + sem * 10000 + seqIndex[index];
            return true;
        } else {
            return false;
        }
    }
    public String getNome() {
        return nome;
    }
    public boolean setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
            return true;
        } else {
            return false;
        }
    }
    public String getEmail() {
        return email;
    }
    public boolean setEmail(String email) {
        // O que fazer: Temos uma regra para criar o email 
        // a partir do nome do aluno. O email deve ser composto
        // pelo primeiro nome e as inciais do sobrenome
        return true;
    }
}



