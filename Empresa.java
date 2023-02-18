import java.util.ArrayList;
public class Empresa {
	
	private String razaoSocial;
	private int anoDefundacao;
	private Endereco enderecoDaSede;
	private ArrayList<Vendedor>listaVendedor = new ArrayList<Vendedor>();
	
	public Empresa(String razaoSocial,int anoDeFundacao,Endereco enderecoDaSede) {
		this.razaoSocial = razaoSocial;
		this.anoDefundacao = anoDeFundacao;
		this.enderecoDaSede = enderecoDaSede;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public int getAnoDefundacao() {
		return anoDefundacao;
	}
	public void setAnoDefundacao(int anoDefundacao) {
		this.anoDefundacao = anoDefundacao;
	}
	public Endereco getEndereçoDaSede() {
		return enderecoDaSede;
	}
	public void setEndereçoDaSede(Endereco endereçoDaSede) {
		enderecoDaSede = endereçoDaSede;
	}
	public void adicionarVendedor(Vendedor listaVendedores) {
		listaVendedor.add(listaVendedores);
	}
	public void listaVendedoresEmpresa() {
			int totalVendedores = listaVendedor.size();
			System.out.println("TotalVenderores empresa:"+totalVendedores);
	}
}
