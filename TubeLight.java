class TubeLight{

     static boolean isConnected = false ;
	 
	 public static void main(String a[]){
	 
	 // invoking an givelight method
	 givelight() ;
	 givelight() ;
	 }

     //declaration of a givelight method
	 public static void givelight(){
	     System.out.println("givelight method started");
		 
		 
	 // false == false
	 if(isConnected == false){
	     isConnected = true ;
		 
     System.out.println("Tube Light is Turned on");
	 
	 }
	      else{
		  System.out.println("Gube.. Switched is already turned on");
		  
}
        System.out.println(" givelight method ended");
		
	}

}