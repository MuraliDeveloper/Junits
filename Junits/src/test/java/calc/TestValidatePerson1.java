package calc;

import org.junit.Assert;
import org.junit.Test;

public class TestValidatePerson1 {

	Service service = new Service();
	
	@Test
	public void testValid() throws ServiceException { 
		Person p = new Person("user1", 19, "hyderabad", "admin", null,null);
		boolean res = service.processRegistration(p);
		Assert.assertTrue("expected succeesul validation", res);
	}
	
	@Test(expected= ServiceException.class,timeout=1000)
	public void invadlidAge() throws ServiceException { 
		Person p = new Person("user1", 15, "hyderabad", "admin", null,null);
		service.processRegistration(p);
	}
	
	@Test(expected= ServiceException.class)
	public void testInValidACity() throws ServiceException { 
		Person p = new Person("user1", 19, "xyz", "admin", null,null);
		service.processRegistration(p);
	}
	
	@Test(expected= ServiceException.class)
	public void testInValidCityNull() throws ServiceException { 
		Person p = new Person("user1", 19, null, "admin", null,null);
		service.processRegistration(p);
	}

}
