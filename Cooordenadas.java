package pacoteprova2;

public class Cooordenadas {
	int x;
	int y;
	
	//metodo construtor
	public Cooordenadas(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	//metodo que determina a distancia das duas coordenadas em relação ao (0,0)
	public double distancia(int x,int y) {
		
		return Math.sqrt(((x*x)+(y*y)));
	}

	@Override
	public String toString() {
		return "Cooordenadas [x=" + x + ", y=" + y + "]";
	}
	
	
}
