package compte;

import java.util.Date;

public class Position {
	public double solde;
	public Date derniereOperation;
	public Position(double solde) {
		this.solde = solde;
		this.derniereOperation = new Date();
	}
}
