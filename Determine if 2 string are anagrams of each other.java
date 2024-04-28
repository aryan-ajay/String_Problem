Determine if 2 string are anagrams of each other


public class Ajay{
  public static void main(String[] args) {
        String str1 = "ajay";
        String str2 = "jaya";

        //convert into lower Case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //check length are same or not
        if(str1.length() == str2.length()) {
            // convert string to char Array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            //sort the 
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            //compare 
            boolean result = Arrays.equals(str1charArray, str2charArray);

            if(result) {
                System.out.println(str1 +" "+ "And"+" " + str2 +" "+ "Are Anagrams");
            } else {
                System.out.println(str1 +" "+"And"+" "+ str2 + " Are not Anagrams");
            }
        } else {
            System.out.println(str1 +" "+"And"+" "+ str2 + " Are not Anagrams");
        }
    }
}

