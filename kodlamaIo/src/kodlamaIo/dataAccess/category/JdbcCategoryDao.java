package kodlamaIo.dataAccess.category;

import kodlamaIo.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	// veritabaný nesnesi, veritabanýna eriþim iþlemleri
	@Override
	public void add(Category category) {
		System.out.println("JDBC ÝLE VERÝTABANINA EKLENDÝ");
	}
}
