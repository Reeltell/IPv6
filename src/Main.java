import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку для поиска IPv6 адресов: ");
        String input = in.nextLine();

        String regex = "(((([0-9a-fA-F]{1,4}:){7})([0-9a-fA-F]{1,4}))|"+
                        "((([0-9a-fA-F]{1,4}:){1,7}):)|"+
                        "((([0-9a-fA-F]{1,4}:){1,6})(:([0-9a-fA-F]{1,4})))|"+
                        "((([0-9a-fA-F]{1,4}:){1,5})(:([0-9a-fA-F]{1,4})){1,2})|"+
                        "((([0-9a-fA-F]{1,4}:){1,4})(:([0-9a-fA-F]{1,4})){1,3})|"+
                        "((([0-9a-fA-F]{1,4}:){1,3})(:([0-9a-fA-F]{1,4})){1,4})|"+
                        "((([0-9a-fA-F]{1,4}:){1,2})(:([0-9a-fA-F]{1,4})){1,5})|"+
                        "(([0-9a-fA-F]{1,4}:)(:([0-9a-fA-F]{1,4})){1,6})|"+
                        "(:(((:[0-9a-fA-F]{1,4}){1,7})|:)))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Найденные IPv6 адреса:");
        while (matcher.find()) {
            System.out.println(matcher.group().trim());
        }
    }
}