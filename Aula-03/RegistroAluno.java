import java.time.LocalDate;

/**
 * RegistroAluno
 * Classe para registrar os dados de um aluno
 */
public class RegistroAluno {
    private long matricula;
    private String nome;
    private String email;
    // sequencial de matrícula por semestre desde o ano 2000
    static private int[] seqIndex = new int[50]; // 25 anos cada um com dois semestres 

    /**
     * Cria o registro de um aluno com a matrícula gerada pela data e o semestre fornecido
     * @param nome Nome do aluno
     * @param ano Se for menor que 2000 ou maior que o ano atual, será considerado o ano atual
     * @param semI true para semestre ímpar e false para semestre par
     */
    public RegistroAluno(String nome, short ano, boolean semI) {
        setNome(nome);
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        if ((ano < 2000) || (ano > anoAtual)) {
            System.err.println("Ano inválido");
            ano = (short) anoAtual;
        }
        setMatricula(ano, semI);
        setEmail();
    }

    /**
     * Cria o registro de um aluno com a matrícula e email gerados automaticamente 
     * @param nome Nome do aluno
     */
    public RegistroAluno(String nome) {
        setNome(nome);
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        int mes = dataAtual.getMonthValue();
        boolean semI = mes < 7;
        short ano = (short) anoAtual;
        setMatricula(ano, semI);
        setEmail();
    }

    public long getMatricula() {
        return this.matricula;
    }

    /**
     * 
     * @param ano tem que ser maior ou igual a 2000 e menor que o ano atual
     * @param semI true para semestre ímpar e false para semestre par
     * @return verdadeiro se conseguiu gerar a matrícula e falso caso contrário
     */
    private boolean setMatricula(short ano, boolean semI) {
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        if ((ano < 2000) || (ano > anoAtual)) {
            return false;
        }else{
            int sem = semI ? 1 : 2;
            int index = (ano - 2000)*2;
            if (sem == 2) {
                index++;
            }
            seqIndex[index]++; // incrementa o sequencial
            matricula = ano * 100000 + sem * 10000 + seqIndex[index];
            return true;
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
        return this.email;
    }

    private boolean setEmail() {
        String[] nomeSplit = nome.split(" ");
        String email = nomeSplit[0].toLowerCase() + "_";
        for (int i = 1; i < nomeSplit.length; i++) {
            String sNome = nomeSplit[i].toLowerCase();
            email += sNome.charAt(0);
        }
        this.email = email + "_cic@uesc.br";
        return true;
    }
}



