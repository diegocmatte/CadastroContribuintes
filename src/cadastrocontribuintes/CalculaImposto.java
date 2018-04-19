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
public class CalculaImposto {
    
    private Pessoa pessoa;
    
    public CalculaImposto(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public Double calculaImpostoSimples() {
        if (pessoa.getTotalRendimentos() <= 12000) {
            return 0.0;
        } else if (pessoa.getTotalRendimentos() > 12000 && pessoa.getTotalRendimentos() < 24000) {
            return pessoa.getTotalRendimentos() - 12000 * 0.15;
        } else if (pessoa.getTotalRendimentos() >= 24000) {
            return ((pessoa.getTotalRendimentos() - 12000) * 0.15)
                    + ((pessoa.getTotalRendimentos() - 24000) * 0.275);
        }
        return 0.0;
    }
    
    public double calculaImpostoCompleto() {
        if(pessoa.getIdade() < 65){
            if(pessoa.getNumeroDependentes() <= 2){
                return calculaImpostoSimples() - (calculaImpostoSimples()*0.02);
            } else if (pessoa.getNumeroDependentes() >= 3 && pessoa.getNumeroDependentes() <=5){
                return calculaImpostoSimples() - (calculaImpostoSimples()*0.035);
            } else if (pessoa.getNumeroDependentes() > 5){
                return calculaImpostoSimples() - (calculaImpostoSimples()*0.05);
            }
        } else {
            if(pessoa.getNumeroDependentes() <= 2){
                return calculaImpostoSimples() - (calculaImpostoSimples()*0.03);
            } else if (pessoa.getNumeroDependentes() >= 3 && pessoa.getNumeroDependentes() <=5){
                return calculaImpostoSimples() - (calculaImpostoSimples()*0.045);
            } else if (pessoa.getNumeroDependentes() > 5){
                return calculaImpostoSimples() - (calculaImpostoSimples()*0.06);
            }
        }
        return 0.0;
    }
    
}
