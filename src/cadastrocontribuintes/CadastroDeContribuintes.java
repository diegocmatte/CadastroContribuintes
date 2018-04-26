/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrocontribuintes;

import cadastrocontribuintes.negocio.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author 08104810
 */
public class CadastroDeContribuintes {
    
    private ArrayList<Pessoa> lista;

    public CadastroDeContribuintes() {
        lista = new ArrayList<>();
    }
    
    public void adiciona(Pessoa p){
        lista.add(p);
    }
    
}
