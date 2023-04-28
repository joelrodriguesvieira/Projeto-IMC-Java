package questao02;

public abstract class PessoaIMC extends Pessoa{
	private double peso;
	private double altura;
	
	public PessoaIMC(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento);
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularIMC(double peso,double altura) {
		return peso/(altura*altura);
	}
	
	public abstract String resultIMC();
	
	public String toString() {
		return "Nome: " + this.getNome() + 
				"\nData Nascimento: " + this.getDataNascimento() +
				"Peso: " + peso + "\nAltura: " + altura;
	}
}
