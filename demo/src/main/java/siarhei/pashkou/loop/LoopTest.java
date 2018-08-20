package siarhei.pashkou.loop;

import org.junit.Test;

public class LoopTest {

	@Test
	public void testBreak() {
		for(int i = 0; i < 3; i++) {
			System.out.println("i = " + i);
			if(i == 1) {
				break;
			}
			System.out.println("after break i = " + i);
		}
	}
	
	@Test
	public void testContinue() {
		for(int i = 0; i < 3; i++) {
			System.out.println("i = " + i);
			if(i == 1) {
				continue;
			}
			System.out.println("after continue i = " + i);
		}
	}
}
