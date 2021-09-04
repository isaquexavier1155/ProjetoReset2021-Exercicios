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
		
		
		MarioBros carac2 = new MarioBros("Super Mario Bros", 29, 120, 1.9f);//novo instanciamento
		carac2.caracteristicasMarioAgora();
		carac2.poderesMario();
		
		System.out.println("Teste para ver se o mario mantém a estamina em 0 após o desconto até um valor menor que zero");
        MarioBros mario4 = new MarioBros();
        mario4.caracteristicasMarioAgora();
        mario4.reduzEstamina(); // desconta 10
        mario4.reduzEstamina(); // desconta 10
        mario4.caracteristicasMarioAgora();
        mario4.reduzEstamina(); // desconta 10
        mario4.reduzEstamina(); // desconta 10
        mario4.reduzEstamina(); // desconta 10
        mario4.caracteristicasMarioAgora();
        mario4.reduzEstamina(); // desconta 10
        mario4.reduzEstamina(); // desconta 10
        mario4.reduzEstamina(); // desconta 10
        mario4.caracteristicasMarioAgora();
        mario4.reduzEstamina(); // desconta 10
        mario4.reduzEstamina(); // desconta 10
        mario4.caracteristicasMarioAgora();
        mario4.reduzEstamina(); // desconta 10
        mario4.reduzEstamina(); // desconta 10
        mario4.caracteristicasMarioAgora();
        System.out.println("---");
		
		//MarioBros carac3 = new MarioBros("Mariozinho Bros", 99, 20, 2.2f); 
		//carac3.CaracteristicasMarioAgora();
		//carac3.PoderesMario();
	

		}

}
