String Compression

  input = "aaabbbccd"
  output = a3b3c2d


  public static String comp(String str) {
        String newStr = "";
        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }


Using StringBuilder

  public static String comp(String str) {

        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i));
            if(count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
