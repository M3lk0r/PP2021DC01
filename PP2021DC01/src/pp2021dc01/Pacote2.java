/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2021dc01;

/**
 *
 * @author eduar
 */
public class Pacote2 extends AssinaturaDecorator {

    public Pacote2(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Adicionado pacote 2 de R$9.99");
    }
}
