public class Camelcase {

     public static String toCamelCase(String inputstring) {
       String result = "";
       if (inputstring.length() == 0) {
           return result;
       }
       char firstChar = inputstring.charAt(0);
       char firstCharToUpperCase = Character.toUpperCase(firstChar);
       result = result + firstCharToUpperCase;
       for (int i = 1; i < inputstring.length(); i++) {
           char currentChar = inputstring.charAt(i);
           char previousChar = inputstring.charAt(i - 1);
           if (previousChar == ' ') {
               char currentCharToUpperCase = Character.toUpperCase(currentChar);
               result = result + currentCharToUpperCase;
           } else {
               char currentCharToLowerCase = Character.toLowerCase(currentChar);
               result = result + currentCharToLowerCase;
           }
       }
       return result;
   }
    public static void main(String[] args) {
        
        System.out.println("Camel Case : " + toCamelCase(inputstring));
        }
    
}
