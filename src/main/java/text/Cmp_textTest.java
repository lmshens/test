package text;

import static org.junit.Assert.*;	

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Cmp_textTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRad_t() {
			System.out.println("This is a test case");
			String text1, text2;
			text1 = Creat_text.text_1(null);
			text2 = Creat_text.text_1(null);
			Cmp_text.cmp_text(text1, text2);
			System.out.println();
	}
	
	@Test
	public void testRad_t1() {
			System.out.println("This is a test case");
			String text1, text2;
			text1 = Creat_text.text_1(null);
			text2 = Creat_text.text_1(null);
			Cmp_text.cmp_text(text1, text2);
			System.out.println();
	}
	
	@Test
	public void testRad_t2() {
			System.out.println("This is a test case");
			String text1 = "dasfagafkjklalsdgasdffdhgdf";
			String text2 = "dasfagafkjklalsdgasdf";
			assertEquals(Cmp_text.MaxSubString(text1, text2), text1);
			
			System.out.println();
	}

}
