package dsTutorialPoints;

public class ArrayM {

	int am[];
	
	public ArrayM(int[] t) {
		// TODO Auto-generated constructor stub
		am = t;
		
	}
	
	public int[] insert(int i, int index){
		
		int j = this.getSize();
		
		while(index <= j){
			
			j--;
			am[j+1] = am[j];
			
		}
		am[index] = i;
		
		return am;
	}
	
	public int getSize(){
		return am.length; 
	}
	
}
