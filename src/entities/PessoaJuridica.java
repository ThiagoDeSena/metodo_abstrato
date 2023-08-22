package entities;

public class PessoaJuridica extends Pessoa{
	
	private int numeroFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, double rendaAnual, int numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public double imposto(double rendaAnual){
		
		double imposto=0;
		if(numeroFuncionarios<=10) {
			imposto = rendaAnual*0.16;
		}else {
			imposto = rendaAnual*0.14;
		}
		return imposto;
		
	}
	
	

}
