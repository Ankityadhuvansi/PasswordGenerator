import java.util.Random;

public class AlphaNumeric {
    static String alphanumeric(int size){
        StringBuilder stringBuilder2=new StringBuilder();
        Random random=new Random();
        for (int i = 0; i < size; i++) {
            int randomASCII=random.nextInt(62)+48;
            char Alphanumeric= (char) randomASCII;
            stringBuilder2.append(Alphanumeric);
        }
        return "Your Generated Password -> "+stringBuilder2.toString();
    }

}
