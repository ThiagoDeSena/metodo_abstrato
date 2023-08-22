package entities;

public class PessoaFisica extends Pessoa{

	private double gastoComSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, double rendaAnual, double gastoComSaude) {
		super(name, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	public PessoaFisica(double gastoComSaude) {
		super();
		this.gastoComSaude = gastoComSaude;
	}

	public double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}
	
	@Override
	public double imposto(double rendaAnual) {
		
		double imposto=0;
		
		if((rendaAnual<20000) && (gastoComSaude==0)) {
			imposto = rendaAnual*0.15;
			
		}else if((rendaAnual>=20000) && (gastoComSaude>0)) {
			imposto = (rendaAnual*0.25) - (gastoComSaude*0.5) ;
			
		}else {
			imposto = rendaAnual*0.25;
			
		}
		return imposto;
		
	}
	
	
	
	
}
