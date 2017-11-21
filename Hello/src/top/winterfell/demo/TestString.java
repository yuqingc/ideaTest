package top.winterfell.demo;

import java.util.UUID;

public class TestString {
    
    private static long testString (String s) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            s = s + "hi";
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long testStringBuilder (StringBuilder sb) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            sb = sb.append("hi");
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long testStringBuffer (StringBuffer sf) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            sf = sf.append("hi");
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        String s = "";
        StringBuilder sb = new StringBuilder();
        StringBuffer sf = new StringBuffer();
        //Which one is the fastest?
        System.out.println(testString(s));
        System.out.println(testStringBuilder(sb));
        System.out.println(testStringBuffer(sf));
        UUID id = UUID.randomUUID();
        System.out.println(id);
    }

}
