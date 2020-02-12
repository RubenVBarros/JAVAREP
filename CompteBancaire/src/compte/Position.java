package compte;

import java.util.Date;

public class Position {
	public double solde;
	private Date derniereOperation;
	private String id;
	
	public Position(String id,double solde) {
		this.solde = solde;
		this.derniereOperation = new Date();
		this.id = id;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDerniereOperation() {
		return derniereOperation;
	}

	public void setDerniereOperation(Date derniereOperation) {
		this.derniereOperation = derniereOperation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Position [solde=" + solde + ", derniereOperation=" + derniereOperation + ", id=" + id + "]";
	}
	
	
	
}
