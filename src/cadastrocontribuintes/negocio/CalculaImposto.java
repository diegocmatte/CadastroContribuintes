/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrocontribuintes.negocio;

import cadastrocontribuintes.negocio.Pessoa;

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
        double totalImposto = 0.0;
        if (pessoa.getTotalRendimentos() <= 12000) {
            return totalImposto;
        } else if (pessoa.getTotalRendimentos() > 12000 && pessoa.getTotalRendimentos() < 24000) {
            totalImposto = pessoa.getTotalRendimentos() - 12000 * 0.15;
        } else if (pessoa.getTotalRendimentos() >= 24000) {
            totalImposto = (((pessoa.getTotalRendimentos() - 12000) * 0.15)
                    + ((pessoa.getTotalRendimentos() - 24000) * 0.275));
        }
        return totalImposto;
    }

    public double calculaImpostoCompletoDesconto() {
        double totalImposto = 0.0;
        if (pessoa.getTotalRendimentos() <= 12000) {
            return totalImposto;
        } else if (pessoa.getTotalRendimentos() > 12000 && pessoa.getTotalRendimentos() < 24000) {
            if (pessoa.getNumeroDependentes() <= 2) {
                totalImposto = (pessoa.getTotalRendimentos() - 12000 * 0.15) * 0.02;
            } else if (pessoa.getNumeroDependentes() > 2 && pessoa.getNumeroDependentes() <= 5) {
                totalImposto = (pessoa.getTotalRendimentos() - 12000 * 0.15) * 0.035;
            } else if (pessoa.getNumeroDependentes() > 5) {
                totalImposto = (pessoa.getTotalRendimentos() - 12000 * 0.15) * 0.05;
            }
        } else if (pessoa.getTotalRendimentos() >= 24000) {
            if (pessoa.getNumeroDependentes() <= 2) {
                totalImposto = (pessoa.getTotalRendimentos() - 12000 * 0.15) * 0.03;
            } else if (pessoa.getNumeroDependentes() > 2 && pessoa.getNumeroDependentes() <= 5) {
                totalImposto = (pessoa.getTotalRendimentos() - 12000 * 0.15) * 0.045;
            } else if (pessoa.getNumeroDependentes() > 5) {
                totalImposto = (pessoa.getTotalRendimentos() - 12000 * 0.15) * 0.06;
            }
        }

        return totalImposto;
    }

}
