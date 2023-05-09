public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno (String nome, int numeroMatricula) {
        throw new NullPointerException("Nome não pode ser nulo");
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }
    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
    }
    @Override
    public boolean equals(Object obj) {
        Aluno outroAluno = (Aluno) obj;
        return this.nome.equals(outroAluno.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
