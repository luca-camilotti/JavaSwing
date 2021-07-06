package swing.gui.bar;

public class Table {
	
	private int coperti;
	private int caffe;
	private int sandwich;
	private int juice;
	private int water;
	private int drink;
	private int bibita;
	
	public Table() {
		reset();
	}
	
	public void reset() {
		this.coperti = 0;
		this.caffe = 0;
		this.sandwich = 0;
		this.juice = 0;
		this.water = 0;
		this.drink = 0;
		this.bibita = 0;
	}
	
	/* registra la comanda */
	public void recComanda(Comanda c) {
		coperti = c.getCoperti();
		caffe += c.getCaffe();
		sandwich += c.getSandwich();
		juice += c.getJuice();
		water += c.getWater();
		drink += c.getDrink();
		bibita += c.getBibita();
	}
	
	public double totale() {
		return (caffe*Listino.caffe+sandwich+Listino.sandwich
				+juice*Listino.juice+water*Listino.water
				+drink*Listino.drink+bibita*Listino.bibita);
	}
	public double totalePersona() {
		if(coperti > 0)
			return totale()/coperti;
		else 
			return totale();
	}
	
	public int incCaffe() {
		this.caffe++;
		return caffe;
	}
	public int incSandwich() {
		this.sandwich++;
		return sandwich;
	}
	public int incJuice() {
		this.juice++;
		return juice;
	}
	public int incWater() {
		this.water++;
		return water;
	}
	public int incDrink() {
		this.drink++;
		return drink;
	}
	public int incBibita() {
		this.bibita++;
		return bibita;
	}
	
	public int getCoperti() {
		return coperti;
	}
	public void setCoperti(int coperti) {
		this.coperti = coperti;
	}
	public int getCaffe() {
		return caffe;
	}
	public void setCaffe(int caffe) {
		this.caffe = caffe;
	}
	public int getSandwich() {
		return sandwich;
	}
	public void setSandwich(int sandwich) {
		this.sandwich = sandwich;
	}
	public int getJuice() {
		return juice;
	}
	public void setJuice(int juice) {
		this.juice = juice;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getDrink() {
		return drink;
	}
	public void setDrink(int drink) {
		this.drink = drink;
	}
	public int getBibita() {
		return bibita;
	}
	public void setBibita(int bibita) {
		this.bibita = bibita;
	}

}
