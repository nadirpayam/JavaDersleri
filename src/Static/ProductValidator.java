package Static;

public class ProductValidator {

	static {
		System.out.println("static constructor �al��t�.");
	}
	
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void bisey() { // bu new'lenmeden �a�r�lmaz ��nk� static tan�mlanmad�
		
	}
}
