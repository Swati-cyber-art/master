package innerclasses;

abstract class innerClassAssisted3 {
	   public abstract void display();
	}


	public class AnonymousInnerClass  {

	public static void main(String[] args) {
		innerClassAssisted3 i = new innerClassAssisted3() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
	}

