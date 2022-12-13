public class Main {
    public static String text = "LOREM IPSUM IS A PLACEHOLDER TEXTYZ";

    public static String encrypt(String text, int shift) {
        String result="";
        //int [] temp = new int[text.length()];
        for (int i=0; i<text.length(); i++ ){
            int temp = text.charAt(i) + shift;
            if (temp > ('A'+26)){
                temp = temp - 26;
            }
                result+=(char)temp;
            }
            return result;
        }






    public static String decrypt(String text, int shift) {
        String result="";
        //int [] temp = new int[text.length()];
        for (int i=0; i<text.length(); i++ ){
            int temp = text.charAt(i) - shift;
            if (temp < 'A'){
                temp = temp + 26;
            }
            result+=(char)temp;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(encrypt(text, 5));
        System.out.println(decrypt(encrypt(text, 5), 5));
    }
}