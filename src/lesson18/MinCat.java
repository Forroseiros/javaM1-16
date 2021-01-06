package lesson18;

public class MinCat {

        public static void main(String[] args) {
            System.out.println(minCat("Hello", "Hi"));// → "loHi"
            System.out.println(minCat("Hello", "java"));// → "ellojava"
            System.out.println(minCat("java", "Hello"));// → "javaello"

        }

        private static String minCat(String str, String str2) {
            int puk = str.length()-str2.length();
            int puk2 = str2.length()-str.length();
            if(str2.length()<str.length()){
                return str.substring(puk,str.length())+str2;
            }else if(str2.length()>str.length()) {
                return str+ str2.substring(puk2,str2.length());
            }else {
                return "0";
            }

        }
    }

