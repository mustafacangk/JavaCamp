package oopIntro;

public class Product { 
	
		public  Product() {			//constracter block
			System.out.println("Ben �al��t�m");
		}
		
										
		public Product(int id,String name,double unitPrice,String detail) /*signature*/ {						//over loading a��r� y�klenme bir yapt���n� bir defa yapma
			
			this.id = id; //e�er id varsa burada �al�� (this => bu class demek
			this.name=name;
			this.unitPrice=unitPrice;
			this.detail=detail;
					
			
		}
		
		
		int id;
		String name;
		double unitPrice;
		String detail;
		
		
}
