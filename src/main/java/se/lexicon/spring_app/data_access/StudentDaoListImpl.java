package se.lexicon.spring_app.data_access;

import java.util.List;
import org.springframework.stereotype.Component;
import se.lexicon.spring_app.models.Student;

@Component
public class StudentDaoListImpl implements StudentDao{
	
	public List<Student> students; 	

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
