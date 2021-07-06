package swing.gui.bar;

public class Comanda {
	private int tavolo;
	private int coperti;
	private int caffe;
	private int sandwich;
	private int juice;
	private int water;
	private int drink;
	private int bibita;
	
	public Comanda() {
		reset();
	}
	public void reset() {
		tavolo=0;
		coperti=0;
		caffe=0;
		sandwich=0;
		juice=0;
		water=0;
		drink=0;
		bibita=0;		
	}
	public int countAll() {
		return (caffe+sandwich+juice+water+drink+bibita);
	}
	public String toString() {
		String str ="tavolo "+this.tavolo+": ";
		if(this.caffe > 0 )
			str+=this.caffe+" caffe, ";
		if(this.sandwich > 0)
			str+=this.sandwich+" sandwich, ";
		if(this.juice > 0)
			str+=this.juice+" succhi, ";
		if(this.water > 0)
			str+=this.water+" acqua, ";
		if(this.drink > 0)
			str+=this.drink+" drink, ";
		if(this.bibita > 0)
			str+=this.bibita+" bibite, ";
		return str;
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
	public int getTavolo() {
		return tavolo;
	}
	public void setTavolo(int tavolo) {
		this.tavolo = tavolo;
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
