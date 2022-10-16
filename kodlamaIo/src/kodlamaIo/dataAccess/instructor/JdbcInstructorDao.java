package kodlamaIo.dataAccess.instructor;

import kodlamaIo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ÝLE VERÝTABANINA EKLENDÝ");

	}

}
