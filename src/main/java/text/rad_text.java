package text;

import org.apache.commons.text.*;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class rad_text {			//Ö÷Ä£¿é
	public static void rad_t(String args) {
		String t1, t2;
		t1 = args;
		
		Creat_text t = new Creat_text();
        t2 = t.text_1(null);
        
        Cmp_text ct = new Cmp_text();
        ct.cmp_text(t1, t2);
        
   }
}

class Creat_text{				//×®Ä£¿é1
	public static String text_1(String[] args) {
		RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('a', 'z').build();
        String random = generator.generate(20);
        System.out.println(StringUtils.center("Ëæ»ú×Ö·û´®",20, "="));
        System.out.println(random);
        return random;
	}
}

class Cmp_text{					//×®Ä£¿é2
	public static void cmp_text(String t1, String t2) {
		boolean a = false, b = false;
		int c = 0, j = 0, f = 0;
		for(int i=0; i<t1.length(); i++)
		{
			if(b == false) j=f;
			while(j < 15)				//×¢Èë´íÎó
			{
				if(t2.charAt(j) == t1.charAt(i))
				{
					a = true;
					b = true;
					c++;
					System.out.print(t2.charAt(j) + " ");
					f = j+1;
					break;
				}
				j++;
				b = false;
			}	
		}
			
		if(a == false)
			System.out.println("There is no same character!");
		else {
			System.out.println();
			double d = c/20.0;
			System.out.println("The semblance is " + d + "%");
		}
	}
}