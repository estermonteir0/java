package biblioteca;

public class Infantil extends Livro {

	private static final long serialVersionUID = 1L;
	private String faixa;

	public Infantil(String titulo, String autor, int isbn, String faixa, String resenha) {
		super(titulo, autor, isbn, resenha);
		this.categoria = "Infantil";
		this.setFaixa(faixa);
	}
	
	@Override
	public String selfMsg() {
		return  "Faixa etária: " + this.getFaixa() + "\n"
			+   "Recebe como brinde lápis de colorir, giz de cera ou chaveiro ursinho!\n";
	}

	public String getFaixa() {
		return faixa;
	}

	public void setFaixa(String faixa) {
		this.faixa = faixa;
	}
}