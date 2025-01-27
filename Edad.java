package pro9;

public class Edad {
	private int edad;
	private int minimun;
	private int maximun;
	
	public Edad(int min, int max) {
		if (min>max) {
			throw new RangoIncorrectoException("El valor m�nimo es mayor al m�ximo");
		}
		if (min<0) {
			throw new RangoIncorrectoException("El valor m�nimo es menor a 0");
		}
		this.minimun=min;
		this.maximun=max;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public int getMin() {
		return min;
	}
	
	public int getMax() {
		return max;
	}
	
	public void setEdad(int edad) {
		if (edad>=this.min && edad <=this.max) {
			this.edad=edad;
		} else {
			throw new EdadFueraDeRangoException("Minimo: "+this.min+", Maximo: "+this.max);
		}
	}
	
	public int compareTo(Edad e) {
		
		if (this.edad==e.getEdad()) return 0;
		if (this.edad<e.getEdad()) return -1;
		return 1;
	}
	
}
