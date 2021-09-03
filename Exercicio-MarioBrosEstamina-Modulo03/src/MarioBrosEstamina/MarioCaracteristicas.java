package MarioBrosEstamina;
//classe Mario
public class MarioCaracteristicas {
	
    //classe principal
	public static void main(String[] args) {
		MarioBros carac = new MarioBros(); //instanciamento do obejeto MarioBros
		carac.CaracteristicasMarioAgora();
		carac.PoderesMario();
		
		MarioBros carac2 = new MarioBros("Super Mario Bros", 29, 122, 1.9f);//novo instanciamento
		carac2.CaracteristicasMarioAgora();
		carac2.PoderesMario();
		
		MarioBros carac3 = new MarioBros("Mariozinho Bros", 99, 20, 2.2f); 
		carac3.CaracteristicasMarioAgora();
		carac3.PoderesMario();
	

		}

}
