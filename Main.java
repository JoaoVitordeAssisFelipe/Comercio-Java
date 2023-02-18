public class Main {
	public static void main(String[] args) {
  
		Endereco endereco1 = new Endereco("Rua a",12,"José","Ituiutaba","MG");
		Endereco endereco2 = new Endereco("Rua b",12,"Alpha ville","São Paulo","SP");
		Endereco endereco3 = new Endereco("Rua c",12,"Borges Volk","Campos Jordao","MT");
		Endereco endereco4 = new Endereco("Rua d",12,"Noronha","Formosa","RJ");
		
		Empresa empresa1 = new Empresa("Americanas",2005,endereco4);
		
		Vendedor vendedor1 = new Vendedor("Paulo","123432-234-23",endereco1);
		Vendedor vendedor2 = new Vendedor("Ana","123432-234-23",endereco2);
		Vendedor vendedor3 = new Vendedor("Ana","123432-234-23",endereco3);
		
		Venda venda1 =  new Venda(12,132);
		Venda venda2 =  new Venda(04,148);
		Venda venda3 =  new Venda(01,182);
		
		Venda venda4 =  new Venda(02,144);
		Venda venda5 =  new Venda(03,167);
		Venda venda6 =  new Venda(11,134);
		
		Venda venda7 =  new Venda(02,123);
		Venda venda8 =  new Venda(03,234);
		Venda venda9 =  new Venda(11,837);
		
		empresa1.adicionarVendedor(vendedor1);
		empresa1.adicionarVendedor(vendedor2);
		empresa1.adicionarVendedor(vendedor3);
		
		vendedor1.adicionarVendas(venda1);
		vendedor1.adicionarVendas(venda2);
		vendedor1.adicionarVendas(venda3);
		
		vendedor2.adicionarVendas(venda4);
		vendedor2.adicionarVendas(venda5);
		vendedor2.adicionarVendas(venda6);
		
		vendedor2.adicionarVendas(venda7);
		vendedor2.adicionarVendas(venda8);
		vendedor2.adicionarVendas(venda9);
		
		empresa1.listaVendedoresEmpresa();
		
		vendedor1.valorTotalVendas();
		System.out.println("UF:"+empresa1.getEndereçoDaSede().getUf());
	}
}
