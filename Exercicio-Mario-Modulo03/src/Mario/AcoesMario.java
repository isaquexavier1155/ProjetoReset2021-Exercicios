package Mario;
public class AcoesMario {
   public static void main(String[] args) {
      Mario tem = new Mario();
		tem.altura=1.6f;
		tem.corCabelo="Castanho";
		tem.corOlhos="Azuis";
		tem.corSapatos="Marons";
		tem.velocidade= false;
		tem.visao= false;
		tem.tamanho= false;
		
		//chamada de metodo com dados
	    tem.caracteristicas();
	    
	    //chamada de metodo com super poderes
		tem.superVelocidade();
		tem.superVisao();
		tem.superTamanho();		

	}

}
