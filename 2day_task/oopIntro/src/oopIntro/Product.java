package oopIntro;

public class Product { 
	
		public  Product() {			//constracter block
			System.out.println("Ben çalýþtým");
		}
		
										
		public Product(int id,String name,double unitPrice,String detail) /*signature*/ {						//over loading aþýrý yüklenme bir yaptýðýný bir defa yapma
			
			this.id = id; //eðer id varsa burada çalýþ (this => bu class demek
			this.name=name;
			this.unitPrice=unitPrice;
			this.detail=detail;
					
			
		}
		
		
		int id;
		String name;
		double unitPrice;
		String detail;
		
		
}
