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
public class AssinaturaDecorator implements Assinatura {

    public Assinatura assinatura;

    public AssinaturaDecorator(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public void assinar() {
        this.assinatura.assinar();
    }
}
