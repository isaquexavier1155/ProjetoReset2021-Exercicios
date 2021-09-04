package MarioBrosEstamina;
//classe Mario
public class MarioCaracteristicas {
	
    //classe principal
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
		
		//Instanciamentos:
		MarioBros carac2 = new MarioBros("Super Mario Bros", 29, 120, 1.9f);//novo instanciamento
		carac2.caracteristicasMarioAgora();
		carac2.poderesMario();

		//Teste:
		System.out.println("Reducao Progressiva de Estamina:");
        MarioBros mariotemestamina = new MarioBros();
        mariotemestamina.caracteristicasMarioAgora();
        mariotemestamina.reduzEstamina();
        mariotemestamina.reduzEstamina();
        mariotemestamina.reduzEstamina();
        mariotemestamina.caracteristicasMarioAgora();
        mariotemestamina.reduzEstamina();
        mariotemestamina.reduzEstamina();
        mario4.caracteristicasMarioAgora();

		}

}
