package test;

public class TestStuff {
	static int i =0;
	public static int lastIndexOf(int[] x, int y){ 
	   
	    for (int z : x) {
			if(z!=y){
				i++;
				if(i==7){
					i=-1;
					break;
				}
			}
			else{	
				break;
			}
		}
	    return i;
	    
	    
	
	
	}
	public static void main(String[] args) {
		int[] r = {1,2,3,4,5,6,7};
		
		System.out.println(lastIndexOf(r, 7));
		

	}

}
