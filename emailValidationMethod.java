import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class emailValidationMethod{
    public static boolean checkerEmail(String email) {
        String emailRegex=  "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailP= Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher emailM=emailP.matcher(email);
        return emailM.find();
    }
    public static void main (String[]args){
        String emailL="lenka@gmail.com";
        String emailLw="@lenka.com";
        System.out.println(checkerEmail(emailL));
        System.out.println(checkerEmail(emailLw));
    }
}
