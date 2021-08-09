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
public class Main {

    public static void main(String[] args) {
        //Assinatura assinaturaBase = new AssinaturaBase();
        //assinaturaBase.assinar();

       // Assinatura assinaturaPacote1 = new Pacote1(new AssinaturaBase());
     //   assinaturaPacote1.assinar();
        //Assinatura assinaturaPacote1E2 = new Pacote2(new Pacote1(new AssinaturaBase()));
        //assinaturaPacote1E2.assinar();
        Assinatura assinaturaTodosPacotes = new Pacote4(new Pacote3(new Pacote2(new Pacote1(new AssinaturaBase()))));
        assinaturaTodosPacotes.assinar();
    }

}
