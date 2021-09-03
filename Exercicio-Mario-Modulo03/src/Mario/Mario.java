package Mario;
public class Mario {
	//Atributos Mario
	float altura;
	String corCabelo;
	String corOlhos;
	String corSapatos;
	boolean velocidade;
	boolean visao;
	boolean tamanho;
	
	//Metodo mostrar atributos Mario
	
	void caracteristicas() {
		
		System.out.print("\nAltura mario: "+ this.altura);
		System.out.print("\nCor Cabelo: "+ this.corCabelo);
		System.out.print("\nCor Olhos: "+ this.corOlhos);
		System.out.print("\nCor Sapatos: "+ this.corSapatos);
	}
	
	//Metodos Super Poderes Mario
	
	void superVelocidade() {
		this.velocidade=true;
	    System.out.print("\nSuper Velocidade Ativada");
	   
	}
	
	void velocidadeNormal(){
		this.velocidade=true;
		System.out.print("\nVelocidade Normal");
	}
	
	void superVisao() {
	   this.visao=true;	
	   System.out.print("\nSuper visao Ativada");	
		
	}
	
	void visaoNormal() {
		this.visao=true;
		System.out.print("\nVisao Normal");
		
	}
	
	void superTamanho() {
		this.tamanho=true;
		System.out.print("\nSuper Tamanho Ativado");
		
	}
	
	void tamanhoNormal() {
		this.tamanho=true;
		System.out.print("\nTamanho Normal");
		
	}

}
