package siarhei.pashkou.exception;

import org.junit.Test;

public class TestException {

	@Test
	public void testToThrowAneXception() {
		
		try {
			throw new BasicException("My basic exception message");
		}catch(FirstInheritException basicException) {
			System.out.println(basicException.getMsg());
		}catch(BasicException basicException) {
			System.out.println(basicException.getMsg());
		}
		
	}
}
