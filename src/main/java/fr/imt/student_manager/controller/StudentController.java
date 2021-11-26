package fr.imt.student_manager.controller;

import fr.imt.student_manager.model.Student;
import fr.imt.student_manager.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewStudent(@RequestParam String firstName, @RequestParam String lastName, @RequestParam Integer evaluation){
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setEvaluation(evaluation);
        studentRepository.save(student);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
