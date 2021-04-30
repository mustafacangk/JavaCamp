package carProject;

public class CategoryManager {

	public void addCategory(Category category) {
		System.out.println("Yeni kategori eklendi "+category.getCategoryName());
	}
	public void deleteCategory(Category category) {
		System.out.println("Kategori silindi "+category.getCategoryName());
	}
	public void addCategoryMultiple(Category[] categories) {
 		for(Category category: categories) {
 			addCategory(category);
 		}
 	}
} 
