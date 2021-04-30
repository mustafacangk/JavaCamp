package carProject;

public class Car {
	//encapsulation (kaps�lle�tirme)
	 private int id;
	 private int categoryId;
	 private String makeCar;
	 private String modalCar;
	 private Double priceCar;	 
	 private Double discountPriceCar;
	
	//private ile de�i�kenleri classta kapat�yoruz ve i�eriden y�neten getterlar ve setterlar yap�yoruz.
	//okumak i�in get yazmak i�in set kullan�yoruz
	public Car(int id, int categoryId, String makeCar, String modalCar, Double carPrice,
			Double discountPriceCar,Double unitPriceAfterDiscount) {
		 
		this.id = id;
		this.categoryId = categoryId;
		this.makeCar = makeCar;
		this.modalCar = modalCar;
		this.priceCar = carPrice;
		this.discountPriceCar = discountPriceCar;
		 
	}
	public Car() {
		
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public String getMakeCar() {			//isim oku
		return makeCar +"!";
	}



	public void setMakeCar(String makeCar) {	//bana isim g�nder
		this.makeCar = makeCar;
	}



	public String getModalCar() {
		return modalCar;
	}



	public void setModalCar(String modalCar) {
		this.modalCar = modalCar;
	}



	public Double getCarPrice() {
		return priceCar;
	}



	public void setCarPrice(Double carPrice) {
		this.priceCar = carPrice;
	}



	public Double getDiscount() {
		return discountPriceCar;
	}



	public void setDiscount(Double discount) {
		this.discountPriceCar = discount;
	}



	public Double getUnitPriceAfterDiscount() { // bu hesap sonucunda ��kacak
		return this.priceCar-(this.priceCar*this.discountPriceCar/100);
	}
	
	
	 

	
}
