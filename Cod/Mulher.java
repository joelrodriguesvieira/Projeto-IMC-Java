package questao02;

public class Mulher extends PessoaIMC{

	public Mulher(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento, peso, altura);
	}
	
	public String resultIMC() {
		double imc = this.getPeso()/(this.getAltura()*this.getAltura());
		if (imc < 19) {
			return "Você está abaixo do peso ideal";
		} else if ((19 < imc) && (imc < 25.8f)) {
			return "Você está no peso ideal";
		} else {
			return "Você está acima do peso ideal";
		}
	}
	
}
