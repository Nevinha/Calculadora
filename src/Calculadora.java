
public class Calculadora {
	private float numA, numB;
	
	public Calculadora (){
	
	}	
		

	public Calculadora (float numA, float numB){
		this.numA = numA;
		this.numB = numB; 
		//AE KROL TD FMZ
	}
	
	public void getNumA (){
		this.numA = numA;
	}
	
	public float setNumA (float NumA){
		return numA;
	}
	
	public void getNumB (){
		this.numB = numB;
	}
	
	public float setNumB (float NumB){
		return numB;
	}
	
	public float soma (float numA, float numB){
		return (numA + numB);
	}
	
	public float diferenša (float numA, float numB){
		return (numA - numB);
	}
	
	public float produto (float numA, float numB){
		return (numA * numB);
	}
	
	public float quociente (float numA, float numB){
		return (numA / numB);
	}
	
		

	}
