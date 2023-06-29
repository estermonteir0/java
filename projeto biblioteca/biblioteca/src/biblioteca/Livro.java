package biblioteca;

import java.io.Serializable;

public abstract class Livro implements Serializable {

		private static final long serialVersionUID = 1L;
		private   String titulo;
		private   String autor;
		private   int isbn;
		private String resenha;
		protected String categoria;
		
		
		public Livro(String titulo, String autor, int isbn, String resenha) {
			this.titulo = titulo;
			this.autor = autor;
			this.isbn = isbn;
			this.resenha = resenha;
		}
		public String toString() {
			String retorno = "";
			retorno += "| Livro |\n";
			retorno += "Título: "    + this.titulo   + "\n";
			retorno += "Autor: "    + this.autor     + "\n";
			retorno += "ISBN: "     + this.isbn      + "\n";
			retorno += "Resenha: "  + this.resenha   + "\n";
			retorno += "Categoria: " + this.categoria+ "\n";
			retorno += selfMsg() + "\n";
			return retorno;
		}
		public abstract String selfMsg();
	}

