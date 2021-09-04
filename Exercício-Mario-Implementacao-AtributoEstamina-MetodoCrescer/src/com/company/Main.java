package com.company;

public class Main {

    public static void main(String[] args) {
        MarioBros carac = new MarioBros(); //instanciamento do obejeto MarioBros
        //carac.aumentaEstamina();//aumenta +5
        carac.reduzEstamina();//reduz -10
        carac.comeuCogumelos();//comeu um cogumelo, dobrou a altura 1.5*2=3m
        carac.crescer();
        carac.comeuCogumelos();//comeu um cogumelo novamente sua altura dobrou denovo, 3*2=6m
        carac.crescer();
        carac.caracteristicasMarioAgora();
        carac.poderesMario();


        MarioBros carac2 = new MarioBros("Super Mario Bros", 29, 120, 1.9f);//novo instanciamento
        carac2.caracteristicasMarioAgora();
        carac2.poderesMario();

        System.out.println("Testando Metodo Reduçao de Estamina:");
        MarioBros marioAtual = new MarioBros();
        marioAtual.caracteristicasMarioAgora();//mostra estamina atual
        marioAtual.reduzEstamina();//estamina-10
        marioAtual.reduzEstamina(); //estamina-10
        marioAtual.caracteristicasMarioAgora();//mostra estamina -20
        marioAtual.reduzEstamina();//estamina-10
        marioAtual.reduzEstamina();//estamina-10
        marioAtual.caracteristicasMarioAgora();//mostra estamina -20


    }
}
