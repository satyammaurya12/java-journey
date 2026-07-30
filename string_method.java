

public class string_method{
    public static void main(String[] args) {
        String str = "hello java";
        System.out.println("Length :"+ str.length());
        System.out.println("Uppercase:" + str.toUpperCase());
        System.out.println("Lowercase" + str.toLowerCase());
        System.out.println("Character at index 1" +str.charAt(1));
        System.err.println("Substring" +str.substring(6));
        System.out.println("Contains java" +str.contains("java"));
        System.out.println("Start with hello" +str.startsWith("hello"));
        System.out.println("End with java: "+str.endsWith("java"));

     }  
}
