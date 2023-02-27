package listavetormatriz;
public class q6ObjetoAluno {

    public q6ObjetoAluno(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public q6ObjetoAluno() {
    }
    
    

    private String nome;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", altura: " + altura;
    }
    
    
}
