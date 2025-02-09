package Variables;

public class Strings {
    public static void main(String[] args) {
        String name = "Jose Manuel Obando";

        //Literal string
        String literalString = "Hello Devs!";

        //Object String
        String objectString = new String("Hello devs from an Object String!");

        System.out.println(name);

        //Concatenation
        String firstname = "Jose Manuel";
        String lastname = "Obando";
        int age = 26;
        String company = "Electronic Parts S.A.";

        //First form
        System.out.println("Hello! i'm " + firstname + lastname + "and i'm " + age + " years old. " + "I work at: " + company);

        //Length
        System.out.println(firstname.length());

        //isEmpty or Blank
        System.out.println(lastname.isEmpty() || lastname.isBlank());

        //Uppercase
        System.out.println(company.toUpperCase());

        //Lowercase
        System.out.println(company.toLowerCase());

        //Equals
        System.out.println(company.equals(lastname));
        System.out.println(company.equalsIgnoreCase(lastname));

        //Replace
        System.out.println(lastname.replace("and", "111"));

        //Contains
        System.out.println(company.contains("tronic"));
    }
}
