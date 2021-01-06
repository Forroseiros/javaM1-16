package Lesson04;

public class HomeWork04 {

    public static void main(String[] args) {
        findSymbols();
        ekaterinaWeber();
        profile();


    }

    public static void findSymbols() {
        char symbolCopyright = '\u00A9';
        System.out.println(symbolCopyright);
        char symbolSmile = '\u263B';
        System.out.println(symbolSmile);
        char symbolTm = '\u2122';
        System.out.println(symbolTm);
        char symbolEuro = '\u20AC';
        System.out.println(symbolEuro);
        char symbolRub = '\u20BD';
        System.out.println(symbolRub);
        char symbolDollar = '\u0024';
        System.out.println(symbolDollar);
        char symbolParagraph = '\u00A7';
        System.out.println(symbolParagraph);
        char symbolBlackHeart = '\u2665';
        System.out.println(symbolBlackHeart);
        char symbolChess = '\u265F';
        System.out.println(symbolChess);
        char symbolFemale = '\u2640';
        System.out.println(symbolFemale);

    }

    public static void ekaterinaWeber() {
        String firstname = "Екатерина";
        String professional = "\"Бухгалтер\"";
        String user = firstname + " " + professional;
        System.out.println(user);
    }

    public static void profile() {
        String firstName = "Имя пользователя: " + "Ekaterina";
        System.out.println(firstName);
        String secondName = "Фамилия пользователя: " + "Weber";
        System.out.println(secondName);
        String age = "Возраст: " + "32";
        System.out.println(age);
        String adress = "Адрес пользователя:";
        System.out.println(adress);
        String city = "Город: " + "Москва";
        System.out.println(city);
        String street = "Улица: " + "Озерная";
        System.out.println(street);
        String house = "Дом: " + "№" + "18";
        System.out.println(house);
        String flat = "Квартира: " + "№" + "156";
        System.out.println(flat);

    }


}
