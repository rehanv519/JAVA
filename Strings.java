public class Strings
{
    public static void main(String[] args)
    {
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println(txt.length());
    System.out.println(txt.toUpperCase());
    System.out.println(txt.toLowerCase());
    System.out.println(txt.indexOf("MNO"));

    String firstName = "John ";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName));

    }
}