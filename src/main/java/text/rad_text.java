package text;

import org.apache.commons.text.*;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class rad_text {			//主模块
	public static void rad_t(String args) {
		String t1, t2;
		t1 = args;
		
		Creat_text t = new Creat_text();
        t2 = t.text_1(null);
        
        Cmp_text ct = new Cmp_text();
        ct.cmp_text(t1, t2);
        
   }
}

class Creat_text{				//桩模块1
	public static String text_1(String[] args) {
		RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('a', 'z').build();
        String random = generator.generate(20);
        System.out.println(StringUtils.center("随机字符串",20, "="));
        System.out.println(random);
        return random;
	}
}

class Cmp_text{					//桩模块2
	public static void cmp_text(String t1, String t2) {
		System.out.println("最大公共子串：" + MaxSubString(t1, t2));
	}
	
	public static String MaxSubString(String shortstr, String longstr) {
        // TODO 自动生成的方法存根
        String temp = new String("");
        for(int i = 0;i<shortstr.length();i++)//先从短字符串的长度开始，逐步递减长度，直到出现符合的字符串
        {
            for(int j = 0,k = shortstr.length()-i;k<shortstr.length();j++,k++)
            {
                temp = shortstr.substring(j, k);
                if(longstr.contains(temp))
                {
                    return temp;
                }
            }
        }
        return null;
    }
}