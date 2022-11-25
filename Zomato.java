class Zomato{

 public static double  findItem(String item){
  
  System.out.println("invoked findItem()");
  if(item == "Briyani")
  {
  
  return 225.00;
 }
 else if(item == "Kabab")
 {
	 return 100.00;
 }
  else{
       System.out.println("Item not available");
  }
  System.out.println("end of findItem()");
  
  return 0.0;
}
}