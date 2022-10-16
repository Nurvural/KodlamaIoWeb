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
				throw new Exception("Girdi�iniz kurs ad�nda bir kurs mevcut. L�tfen farkl� bir kurs giriniz");
			}

			if (course1.getUnitPrice() < 0) {
				throw new Exception("�r�n fiyat� 0'dan k���k olamaz");
			}

		}
		// CourseDao courseDao = new JdbcCourseDao();//i� kurallar�na uyuyorsa
		// veritaban�na ekler
		courses.add(course);
		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}
