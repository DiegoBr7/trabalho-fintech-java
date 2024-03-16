package Usuario;

import java.util.Date;

public class Banco extends Usuario{

	private byte nroBanco ;
	
	private String nomeBanco ;
	
	private String agencia ;
	
	private String conta ;
	
	
	public void IncluirBanco (String nomeBanco , String agencia , String conta, byte nroBanco  ) {

		this.nroBanco = nroBanco;
		this.nomeBanco = nomeBanco;
		this.agencia = agencia;
		this.conta = conta;
		
	}
	
	
	public void consultaBanco(byte NroBanco) {
		if(this.nroBanco == NroBanco) {
			System.out.println("Qual o numero do Banco ?");
			System.out.println("Numero do Banco " + this.nroBanco);
			System.out.println("Nome do Banco " + this.nomeBanco);
			System.out.println("Agencia " + this.agencia );
			System.out.println("Conta " + this.conta);
			
		}else {
			System.out.println("Numero não encontrado ! ");
		}
	}
	

	public byte getNroBanco() {
		return nroBanco;
	}

	public void setNroBanco(byte nroBanco) {
		this.nroBanco = nroBanco;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	} 
	
	

	
	
	
}
