package lesson20;

public class BigHomeWork {


    public static void main(String[] args) {
    /*char charAt(int index) возвращает значение
    char по указанному индексу. Индекс колеблется от 0 до length()-1.
    То есть, первое char значение последовательности находится в index 0,
    следующее — в index 1 и т.д., как и в случае с индексацией массива.*/

        System.out.print("Masha".charAt(0));
        System.out.print("Masha".charAt(1));
        System.out.print("Masha".charAt(2));
        System.out.print("Masha".charAt(3));
        System.out.println("Masha".charAt(4));

       /* codePointAt(int index)
        Этот метод принимает один индекс параметра типа int,
        который представляет индекс символа,
        значение Юникода которого должно быть возвращено.*/

        String Masha = "Masha";
        int index = 2;
        System.out.println(Masha.codePointAt(index));

        String str = "Hello String";
        int count = str.codePointCount(1, 12);
        System.out.println(count);
        System.out.println(str.charAt(2));

        //codePointBefore(int index)
        //Возвращает Unicode-символ, который предшествует данному индексу
        String Masha1 = "Masha";
        int index1 = 3;
        System.out.println(Masha1.codePointAt(index1));

        /*replace(char oldChar, char newChar)
        Возвращает новую строку: заменяет символ oldChar на символ newChar
         */

        String str1 = "Masha;Dasha;Misha;Pasha";
        System.out.println(str1.replace(";", ","));

        /*toLowerCase()
        Преобразует строку к нижнему регистру
         */

        String word = "CITY";
        System.out.println(word.toLowerCase());
        System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());

         /*toUpperCase()
        Преобразует строку к верхнему регистру
         */
        String word2 = "city";
        System.out.println(word.toUpperCase());

        /*trim()
        удаляет начальные и конечные пробелы.
        Этот метод не устраняет промежуточные пробелы строки
         */
        String exs = "  Moscow ";
        System.out.println(exs.trim() + " " + "Berlin" + " " + "Kazan");

        /*startsWith(String prefix)
        endsWith (String suffix)
        в методе startsWith() определяется,
        начинается ли заданный объект типа String с указанной символьной строки,
        а в методе endsWith() - завершается ли объект типа String заданной подстрокой
         */
        String input = "Hello World";
        System.out.println(input.startsWith("e"));//false
        System.out.println(input.startsWith("Hello"));//true
        System.out.println(input.startsWith("Hello"));//true


       /*compareToIgnoreCase(String str)
       сравнивает лексически две строки, игнорируя регистр букв.*/


        String str0 = "Я буду хорошим программистом!";
        String str2 = "Я Буду Хорошим Программистом!";
        String str3 = "Я буду хорошим дворником!";

        int result = str0.compareToIgnoreCase(str2);
        System.out.println(result);

        result = str2.compareToIgnoreCase(str3);
        System.out.println(result);

        result = str3.compareToIgnoreCase(str0);
        System.out.println(result);

        /*concat(String str)
        Объединяет строку с указанной строкой. Возвращается новая строка,
        которая содержит объединение двух строк.
         */
        String cat = "Cat";
        String dog = "Dog";
        String cd = cat.concat(dog);
        System.out.println(cd);

        /*contains(CharSequence s)
        проверяет, входит ли указанная последовательность символов в строку
         */
        String word1 = "Grandmother";
        if (word1.contains("mother")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        /*equals(Object anObject)
        Сравнивает указанный объект и строку и возвращает true,
        если сравниваемые строки равны, т.е. содержит те же символы и в том же порядке с учётом регистра.
         */

        String p1 = "Pelmen";
        String p2 = "Pelmeshek";
        if (p1.equals(p2)) {
            System.out.println("correct");
        } else {
            System.out.println("not correct");
        }
        /*equalsIgnoreCase(String anotherString)
        Сравнивает указанную строку с исходной строкой без учёта
        регистра и возвращает true, если они равны. Диапазон A-Z считается равным диапазону a-z.
         */
        String k1 = "Kate";
        String k2 = "kate";
        if (k1.equalsIgnoreCase(k2)) {
            System.out.println("the same");
        } else {
            System.out.println("not the same");
        }
        /*length()
        Возвращает длину строки
         */
        String e = "Ekaterina";
        System.out.println(e.length());

        /*isEmpty()
        Проверяет, является ли строка пустой
         */

        String empty = "KJKJKJ";
        if (empty.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        /*codePointCount(int beginIndex, int endIndex)
        Этот метод принимает beginIndex и endIndex в качестве параметра,
        где beginIndex — это индекс первого символа текстового диапазона,
        а endIndex — индекс после последнего символа текстового диапазона.
        Индексы относятся к значениям символов (единицам кода Unicode),
        и значение индекса должно находиться в диапазоне от 0 до длины-1.
        Диапазон начинается в beginIndex и заканчивается в char с индексом endIndex — 1.
        Таким образом, длина (в символах) текстового диапазона равна endIndex-beginIndex.
         */
        String testString = "Chicken"; /// Честно говоря, не совсем понятно, зачем нужен этот метод
        int myChar = testString.codePointCount(0, 3);
        System.out.println(myChar);

        /*indexOf(int ch) — возвращает индекс в данной строке
         первого вхождения указанного символа или -1, если символ не встречается.
         */
        String Str = "Zoopark";
        System.out.println(str.indexOf('a'));

        /*toCharArray()
      преобразует данную строку в новый массив символов
         */
            String str12 = "ABC";
            char[] result1 = str12.toCharArray();
        System.out.println(result1);
        System.out.println("Char array:");
        for (int i = 0; i < result1.length; i++)
            System.out.println("Element [" + i + "]: " + result1[i]);
    }
}


