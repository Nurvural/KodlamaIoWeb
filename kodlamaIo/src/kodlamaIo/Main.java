package kodlamaIo;

import java.util.ArrayList;
import java.util.List;

import kodlamaIo.business.CategoryManager;
import kodlamaIo.business.CourseManager;
import kodlamaIo.business.InstructorManager;
import kodlamaIo.core.logging.DatabaseLogger;
import kodlamaIo.core.logging.FileLogger;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.core.logging.MailLogger;
import kodlamaIo.dataAccess.category.JdbcCategoryDao;
import kodlamaIo.dataAccess.course.HibernateCourseDao;
import kodlamaIo.dataAccess.instructor.HibernateInstructorDao;
import kodlamaIo.entities.Category;
import kodlamaIo.entities.Course;
import kodlamaIo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogger(), new FileLogger() };

		/*
		 * System.out.println("------------------COURSE----------------");
		 * ArrayList<Course> courses = new ArrayList<Course>();
		 * 
		 * Course course0 = new Course(1, "Java", -1); Course course2 = new Course(1,
		 * "Java", 100);
		 * 
		 * CourseManager courseManager = new CourseManager(new HibernateCourseDao(),
		 * loggers, courses); courseManager.add(course0); courseManager.add(course2);
		 */

		System.out.println("------------------CATEGORY----------------");
		Category category = new Category(1, "Programlama");
		Category category2 = new Category(1, "Yapay Zeka");
		ArrayList<Category> categories = new ArrayList<Category>();
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categories);
		categoryManager.add(category);
		categoryManager.add(category2);

		System.out.println("------------------INSTRUCTOR----------------");
		Instructor instructor = new Instructor(1, "Engin", "Demiroð");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
	}

}
