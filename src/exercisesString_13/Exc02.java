package exercisesString_13;

//Упражнения 7-9
public class Exc02 {
    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));// →"and"
        System.out.println(middleThree("and"));// →"and"
        System.out.println(middleThree("solving"));// →"lvi"

        System.out.println(lastChars("last", "chars"));// →"ls"
        System.out.println(lastChars("yo", "java"));// →"ya"
        System.out.println(lastChars("hi", ""));// →"h@"

        System.out.println(seeColor("redxx"));// →"red"
        System.out.println(seeColor("xxred"));// →""
        System.out.println(seeColor("blueTimes"));// →"blue"
    }

    public static String middleThree(String word) {
        int input = word.length() / 2;
        return word.substring(input - 1, input + 2);
    }

    public static String lastChars(String a, String b) {
        if (b == "") {
            return a.substring(0, 1) + "@";
        } else {
            return a.substring(0, 1) + b.substring(b.length() - 1);
        }
    }

    public static String seeColor(String color) {
        if(color.startsWith("red")){
            return "red";

        } else if (color.startsWith("blue")){
            return "blue";
        }else {
            return " ";
        }
    }
}
