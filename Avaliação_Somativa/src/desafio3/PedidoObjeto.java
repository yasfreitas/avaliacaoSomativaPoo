package desafio3;

public class PedidoObjeto {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		Pedido pedido2 = new Pedido(1, "telefone", 23);
		
		System.out.println(pedido.getId());
		System.out.println(pedido.getProduto());
		System.out.println(pedido.getQuantidade());
		
		System.out.println(pedido2.getId());
		System.out.println(pedido2.getProduto());
		System.out.println(pedido2.getQuantidade());
	}

}
