package kodlamaIo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.course.CourseDao;
import kodlamaIo.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	private ArrayList<Course> courses = new ArrayList<Course>();

	public CourseManager(CourseDao courseDao, Logger[] loggers, ArrayList<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	// List<Course> courses = new ArrayList<>();

	public void add(Course course) throws Exception {
		// is kurallari

		for (Course course1 : courses) {

			if (course1.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Girdiðiniz kurs adýnda bir kurs mevcut. Lütfen farklý bir kurs giriniz");
			}

			if (course1.getUnitPrice() < 0) {
				throw new Exception("Ürün fiyatý 0'dan küçük olamaz");
			}

		}
		// CourseDao courseDao = new JdbcCourseDao();//iþ kurallarýna uyuyorsa
		// veritabanýna ekler
		courses.add(course);
		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}
