package cs_19_1_5;

public class Osternest {

	int kapazitaet;
	int eier;
	
		public Osternest(int kapazitaet, int eier) {
		super();
		this.kapazitaet = kapazitaet;
		this.eier = eier;
	}


	void hinzufuegen(Osternest n) throws PlatzMangelException{
		
		if ((n.eier + this.eier)< this.kapazitaet) {
			this.eier = this.eier + n.eier;
			} else {
		throw new PlatzMangelException("Osternest zu klein");
		}
	}


	void fuellen() {
		this.eier ++;
		if (this.kapazitaet > this.eier) {
			fuellen();
		} else {
			System.out.println("Osternest ist voll!");
		}
	}
	

}
