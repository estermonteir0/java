package biblioteca;

public class Guia extends Livro {

	private static final long serialVersionUID = 1L;
	private String local;

	public Guia(String titulo,  String local, String autor, int isbn, String resenha) {
		super(titulo, autor, isbn, resenha);
		this.categoria = "Guia de viagem";
		this.setLocal(local);
	}
	
	@Override
	public String selfMsg() {
		return  "Local: " + this.getLocal() + "\n"
			+   "Recebe como brinde um chaveiro de globo!";
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
}