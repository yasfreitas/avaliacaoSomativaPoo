package desafio5;

public class Principal {

	public static void main(String[] args) {
		Produto prod = new Produto("Cinderela em busca da perfeição");
		Livro livro = new Livro("O Príncipe Cruel", "Holly Black", 300);
		
		System.out.println(prod.getNome());
		System.out.println("----------------");
		
		System.out.println(livro.getNome());
		System.out.println(livro.getAutor());
		System.out.println(livro.getPaginas());

	}

}
