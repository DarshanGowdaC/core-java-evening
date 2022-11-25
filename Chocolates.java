class Chocolates{

    static String choclatesName[] = {"MilkyBar", "Perk", "DairyMilk", "Munch", "Ferrero Rocher", "Gems", "Temptation", "Bourville", "5Star", "Snickers"};
	
	public static void getChoclates(){
	   System.out.println("inside getChoclates method Started");
	   System.out.println(choclatesName.length);
	   for(int index = 0; index < choclatesName.length; index++){
	   System.out.println(fruitsName[index]);
	   
	   }
	System.out.println("getChoclates method ended");
	}
	
   
 public static void main(String SuperMarket[]){
	     getChoclates();
		System.out.println("main method started");
		System.out.println("main method ended");
 }

}