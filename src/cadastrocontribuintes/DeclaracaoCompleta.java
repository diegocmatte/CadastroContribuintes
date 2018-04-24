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
public class DeclaracaoCompleta {
    
    private Pessoa pessoa;
    
    
    public DeclaracaoCompleta(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public Double calculaImpostoCompleto() {
        double imposto = 0.0;
        if (pessoa.getTotalRendimentos() <= 12000) {
            imposto = 0.0;
        } else if (pessoa.getTotalRendimentos() > 12000 && pessoa.getTotalRendimentos() < 24000) {
            imposto = pessoa.getTotalRendimentos() - 12000 * 0.15;
        } else if (pessoa.getTotalRendimentos() >= 24000) {
            imposto = ((pessoa.getTotalRendimentos() - 12000) * 0.15)
                    + ((pessoa.getTotalRendimentos() - 24000) * 0.275);
        }
        
        return imposto;
    }
    
}
