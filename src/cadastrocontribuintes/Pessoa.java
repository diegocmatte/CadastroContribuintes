/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrocontribuintes;

/**
 *
 * @author 08104810
 */
public class Pessoa {
    private String nome, cpf;
    private int idade, numeroDependentes;
    private double contribuicao, totalRendimentos;
    
    public Pessoa(String nome, String cpf, int idade, int numeroDependentes, double contribuicao, double totalRendimentos){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.numeroDependentes = numeroDependentes;
        this.contribuicao = contribuicao;
        this.totalRendimentos = totalRendimentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public double getContribuicao() {
        return contribuicao;
    }

    public void setContribuicao(double contribuicao) {
        this.contribuicao = contribuicao;
    }

    public double getTotalRendimentos() {
        return totalRendimentos;
    }

    public void setTotalRendimentos(double totalRendimentos) {
        this.totalRendimentos = totalRendimentos;
    }
    
}
