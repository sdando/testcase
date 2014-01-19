package test;
import java.security.AccessControlContext;
import java.security.AccessController;

import javax.security.auth.Subject;

import org.junit.Test;


public class TestJAAS {
	
	@Test
	public void testSubject(){
	    AccessControlContext context = AccessController.getContext();
	    Subject subject = Subject.getSubject(context);
	    if(subject == null){
	    	subject=new Subject();
	    }
	    JunitTest.Print(subject.toString());
	}

}
