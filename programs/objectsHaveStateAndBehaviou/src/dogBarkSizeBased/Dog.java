package dogBarkSizeBased;

public class Dog {
  int size;
  String name;
  
  static void barksFromInstance(int times, String barkType) { 
	 while(times > 0) { 
		 System.out.print(barkType);
		 if(times == 1) {
		 System.out.println();
		 }
		 times -=1;
	 }
  };
  
  void bark(int numOfBarks) {
	  if(size > 60) {
		  barksFromInstance(numOfBarks, "Wooof!");
	  }else if(size > 14) {
		  barksFromInstance(numOfBarks, "Ruff!");
	  }else {
		  barksFromInstance(numOfBarks, "Yip!");
	  }
  }
}
