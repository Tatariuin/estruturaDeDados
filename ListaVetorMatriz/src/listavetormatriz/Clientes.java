package listavetormatriz;
public class Clientes {
    
    private String nome;
    private int qtdDeAlocacoes;

    public Clientes(String nome, int qtdDeAlocacoes) {
        this.nome = nome;
        this.qtdDeAlocacoes = qtdDeAlocacoes;
    }

    public Clientes() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdDeAlocacoes() {
        return qtdDeAlocacoes;
    }

    public void setQtdDeAlocacoes(int qtdDeAlocacoes) {
        this.qtdDeAlocacoes = qtdDeAlocacoes;
    }
    public int quantidadeDeAlocacoesGratis(){
        return this.qtdDeAlocacoes/10;
    }
}
