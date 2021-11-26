package fr.imt.student_manager.repository;

import fr.imt.student_manager.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
