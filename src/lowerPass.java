import java.util.Random;

public class lowerPass {
    static String lowercase(int size){
        StringBuilder stringBuilder1=new StringBuilder();
        Random random=new Random();
        for (int i = 0; i < size; i++) {
            int randomASCII=random.nextInt(26)+97;

            char lowercase= (char) randomASCII;
            if (Character.isLowerCase(lowercase)){
                stringBuilder1.append(lowercase);
            }
        }

        return "Your Generated Password -> "+stringBuilder1.toString();
    }

}
