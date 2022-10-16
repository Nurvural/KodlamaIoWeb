package kodlamaIo.dataAccess.course;

import kodlamaIo.entities.Course;

public class HibernateCourseDao implements CourseDao {

	public void add(Course course) {
		System.out.println("HÝBERNATE ÝLE VERÝTABANINA EKLENDÝ");
	}
}
