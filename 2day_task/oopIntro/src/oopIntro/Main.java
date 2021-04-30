package oopIntro;

public class Main {

	public static void main(String[] args) {
		
	
		Product product1 = new Product();   //classý oluþturmak için kullanýlýr. Refarans oluþturma , intance //altýnda sarý çizgi onu kullanmadýðýn için çýkýyor
		product1.id =1;	
		product1.name="Lenovo V14";
		product1.unitPrice= 15000;
		product1.detail="16 gb ram";
		Product product2 = new Product();   
		product2.id =2;	
		product2.name="Lenovo V14";
		product2.unitPrice= 15000;
		product2.detail="16 gb ram";
		Product product3 = new Product();   
		product3.id =3;	
		product3.name="Lenovo V14";
		product3.unitPrice= 15000;
		product3.detail="16 gb ram";
		Product[] products = {product1,product2,product3};
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		Category category2 = new Category();
		category1.id =1;
		category1.name="Bilgisayar";
		category2.id =2;
		category2.name="Ev/Bahce";
		System.out.println(category1.name+category2.name);
	
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1); //parantez içi parametredir.
		productManager.addToCart(product2); //parantez içi parametredir.
		productManager.addToCart(product3); //parantez içi parametredir.
		
		
	}

}
