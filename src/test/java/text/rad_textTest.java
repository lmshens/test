package text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class rad_textTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void test1() {
		System.out.println("This is a test case");
		String text = "adfhj";
		rad_text.rad_t(text);
		System.out.println();
	}
	
	@Test
	void test2() {
		System.out.println("This is a test case");
		String text = "¹þ¹þ¹þ";
		rad_text.rad_t(text);
		System.out.println();
	}
	
	@Test
	void test3() {
		System.out.println("This is a test case");
		String text = "666adsjfk¿¨µÄË§¸ç#£¤%¡­¡­&*";
		rad_text.rad_t(text);
		System.out.println();
	}
	
	@Test
	void test4() {
		System.out.println("This is a test case");
		String text = "-1 -1-1-1-1";
		rad_text.rad_t(text);
		System.out.println();
	}
	
	@Test
	void test5() {
		System.out.println("This is a test case");
		String text = "65565656dsfsagas656dfs62sda45sd4af54g454a4rf4e841fgas8ftew4f1wseag4g19e8";
		rad_text.rad_t(text);
		System.out.println();
	}

}
