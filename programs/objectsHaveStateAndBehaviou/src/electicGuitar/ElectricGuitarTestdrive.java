package electicGuitar;

public class ElectricGuitarTestdrive {
   public static void main(String[] args) {
	   ElectricGuitar guitar = new ElectricGuitar();
	   
	   System.out.println(guitar.getBrand());
	   guitar.setBrand("Hsengiv");
	   System.out.println(guitar.getBrand());
	   
	   System.out.println(guitar.getNumOfPickups());
	   guitar.setNumOfPickups(4);
	   System.out.println(guitar.getNumOfPickups());
	   
	   System.out.println(guitar.getRockStarUsesIt());
	   guitar.setRockStarUsesIt(true);
	   System.out.println(guitar.getRockStarUsesIt());
	   
   }
}
