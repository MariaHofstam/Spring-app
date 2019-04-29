package se.lexicon.spring_app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import se.lexicon.spring_app.data_access.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
    	
    	StudentDao studentDao = context.getBean(StudentDao.class);
    }
}
