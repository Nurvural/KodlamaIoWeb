package kodlamaIo.dataAccess.course;

import kodlamaIo.entities.Course;

public class JdbcCourseDao implements CourseDao {

	public void add(Course course) {
		System.out.println("JDBC �LE VER�TABANINA EKLEND�");
	}
}
