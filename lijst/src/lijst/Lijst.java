package lijst;

public class Lijst {
	
	private int[] lijst;
	
	
	public Lijst(int[] lijst) {
		
		this.lijst = lijst;
	}
	
	public int GetLength() {
		return this.lijst.length;
		
	}
	
	public int[] GetArray() {
		return this.lijst;
	}
	
	public int GetElementAtIndex(int index) {
		if (index>0 || index<this.GetLength())
			throw new IllegalArgumentException("niet juiste index");
		return this.lijst[index];
	}
	
	
	public void AddLijst(int getal) {
		
		
		int lengte = this.GetLength();
		int[] oudelijst =this.lijst;
		int[] nieuwelijst = new int[lengte+1];
		
		for(int i=0;i<lengte;i++) {
			nieuwelijst[i] = oudelijst[i];
			}
		nieuwelijst[lengte] = getal;
		
		this.lijst = nieuwelijst;
		
	}
	
	
	
	public void RemoveLijst() {
		int lengte = this.GetLength();
		int[] oudelijst =this.lijst;
		int[] nieuwelijst = new int[lengte-1];
		
		
		for(int i=0;i<lengte-1;i++) {
			nieuwelijst[i] = oudelijst[i];
			}
		this.lijst = nieuwelijst;
		
		
	}
		
	
	
	
	
	
	

}
