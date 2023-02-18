import java.util.ArrayList;
public class Vendedor {
	
	private String nome;
	private String cpf;
	private Endereco endereco;
	private ArrayList<Venda>listaVenda = new ArrayList<Venda>();
	
	public Vendedor(String nome,String cpf,Endereco endereco) {
		this.nome=nome;
		this.cpf=cpf;
		this.endereco=endereco;
	}
	public Vendedor(ArrayList<Venda>listaVenda) {
		this.listaVenda=listaVenda;
	}
	
	public ArrayList<Venda> getListaVenda() {
		return listaVenda;
	}
	public void setListaVenda(ArrayList<Venda> listaVenda) {
		this.listaVenda = listaVenda;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void adicionarVendas(Venda listaVendas) {
		this.listaVenda.add(listaVendas);
	}
	public void valorTotalVendas() {
		double valorTotal =0;
        for (int x = 0 ; x < listaVenda.size();x++) {
            valorTotal =valorTotal+listaVenda.get(x).getValor();
        }
        System.out.println(valorTotal);
    }
}
