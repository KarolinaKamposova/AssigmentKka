public class assigment{

    public static void main(String args[]){
		 sequen1(0,0);
        sequen2(1,0,0);
		 sequen3(0,0);
		
    }
	
	public static void sequen1(int a, int b) {
		for(a=0;a < 3; a++) {
	    	for(b=0;b < 3; b++) {
	    		if(a >= b)
	    			System.out.print("*");
	    	}
	    	System.out.println();
	    }

	}	
	public static void sequen2(int z, int k, int m) {
			z=z;
		for(k=0;k<=4; k++) {
			for (m=0;m<4 ;m++){
				System.out.print((int)(Math.random()*10)+" ");  
		}
		System.out.println();
		}
		}
	   public static void sequen3(int i,int j){
		for (i = 0; i<= 2; i++)
        {
			for (j=0;j<=i;j++)
			System.out.print(" ");
			for (j=0;j<=2-i;j++)
				System.out.print("*");
			System.out.println();
		
    }
}

}

//4.
/*public int countCode(String str) { int count=0;
   for(int i =0; i < str.length()-3; i++) {
    if(str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e")) {
      count++;
    }
  }
  return count; */

