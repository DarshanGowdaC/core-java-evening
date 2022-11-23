class Netflix {


   static String englishSeries[] = {"Love 020", "Peaky Blinders", "Stranger Things", "Money Heist", "Dark"};
        // Datatype variableName[]
      public static void main(String args[]){
	  
	  System.out.println(englishSeries.length);
	 System.out.println("List of English Series are");
	  
	  //System.out.println(englishSeries[1] + " "+ englishSeries[2]);
	  
	         // 0 < 5
	  for(int series = 0 ; series < englishSeries.length ; series++ ) {
	   System.out.println(englishSeries[series]) ;
	  }
		  
	  }
 }