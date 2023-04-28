package questao02;

public class Homem extends PessoaIMC{

	public Homem(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento, peso, altura);
	}
	
	public String resultIMC() {
		double imc = this.getPeso()/(this.getAltura()*this.getAltura());
		if (imc < 20.7f) {
			return "Você está abaixo do peso ideal";
		} else if (imc > 20.7f && 26.4f > imc) {
			return "Você está no peso ideal";
		} else {
			return "Você está acima do peso ideal";
		}
	}
}
