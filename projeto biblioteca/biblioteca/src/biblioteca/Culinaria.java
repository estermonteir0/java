package biblioteca;

public class Culinaria extends Livro {

	private static final long serialVersionUID = 1L;
	private String tipo;

	public Culinaria(String titulo, String autor, int isbn, String tipo, String resenha) {
		super(titulo, autor, isbn, resenha);
		this.categoria = "Culinária";
		this.setTipo(tipo);
	}
	
	@Override
	public String selfMsg() {
		return  "Tipo de comida: " + this.getTipo() + "\n"
			+	"Recebe como brinde uma luva térmica!\n";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}