package fr.imt.student_manager.repository;

import fr.imt.student_manager.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
}
