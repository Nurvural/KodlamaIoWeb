package kodlamaIo.dataAccess.category;

import kodlamaIo.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	// veritaban� nesnesi, veritaban�na eri�im i�lemleri
	@Override
	public void add(Category category) {
		System.out.println("JDBC �LE VER�TABANINA EKLEND�");
	}
}
