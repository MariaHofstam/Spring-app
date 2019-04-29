package se.lexicon.spring_app.data_access;

import java.util.List;
import se.lexicon.spring_app.models.Student;

public interface StudentDao {

	Student save(Student student);
	Student find(int id);
	List<Student> findAll();
	void delete(int id);
}
