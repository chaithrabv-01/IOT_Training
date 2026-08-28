package Strings;

public class BuilderBufferPerformance {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        StringBuffer sbf=new StringBuffer("SNPSU");
        for(int i=0;i<10000000;i++) {
            sbf.append("Institution");
        }
        System.out.println("Time take by Stringbuffer:" + (System.currentTimeMillis()-startTime));
        startTime=System.currentTimeMillis();
        StringBuilder sb= new StringBuilder("SNPSU");
        for(int i=0;i<10000000;i++){
            sb.append("ON");
        }
        System.out.println("Time take by Stringbuilderr:" + (System.currentTimeMillis()-startTime));
    }
}
