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
public class Pacote1 extends AssinaturaDecorator {

    public Pacote1(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Adicionado pacote 1 de R$19.99");
    }
}
