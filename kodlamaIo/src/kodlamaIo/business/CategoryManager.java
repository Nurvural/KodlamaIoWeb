package kodlamaIo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.category.CategoryDao;
import kodlamaIo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories = new ArrayList<Category>();

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {
		// is kurallari
		for (Category category1 : categories) {
			if (category1.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception(
						"Girdiðiniz kategori adýnda bir kategori mevcut. Lütfen farklý bir kategori giriniz");
			}
		}
		categories.add(category);
		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
