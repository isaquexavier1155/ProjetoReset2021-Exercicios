package MarioBrosEstamina;

public class MarioBros {
	private String nome;
	private int idade;
	private double estamina;
	private float altura;
	
	
	//Metodo Construtor padrao abaixo:
	public MarioBros() {
        this.nome = "Mario Bros";
        this.altura = 1.50f;
        this.idade = 40;
        this.estamina = 100;
    }
	
	
	//Metodo Construtor que recebe valor para os atributos:
	 MarioBros(String nom, int ida, double est, float alt) {
		this.nome=nom;
		this.idade=ida;
		this.estamina= est;
		this.altura= alt;
				
	}
	 //Metodo define poderes Mario abaixo:
	 
	 public void PoderesMario() {
		 
		 System.out.println(nome+ " tem os poderes: Super visao, super pulo e super tamanho");
	 }
	 
	 
	//Metodos geter`s e seter`s abaixo
	public String getNome() {
	return this.nome;
		
	}
	
	void setNome(String nom) {
		this.nome=nom;
		
	}
	
	public int getIdade() {
		return this.idade;
		
	}
	void setIdade(int ida) {
		this.idade=ida;
		
	}
	
	public double getEstamina() {
		return this.estamina;
		
	}
	
	void setEstamina(double est) {
		this.estamina=est;
		
	}
	
	public float getAltura() {
		return this.altura;
		
	}
	
	void setAltura(float alt) {
		this.altura=alt;
		
	}
	
	//Metodo mostra caracteristicas atualizadas, conforme chamado 
	
	public void CaracteristicasMarioAgora() {
	System.out.println("Nome: "+ nome);
	System.out.println("Idade "+nome+": "+ idade+" anos");
	System.out.println("Estamina "+nome+": "+  estamina);
	System.out.println("Altura "+nome+": "+altura+"m");
		
	}
	
	

}
