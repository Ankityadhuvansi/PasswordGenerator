import java.util.Random;

public class uppercasePass {
    public static String uppercase(int size){
        StringBuilder stringBuilder=new StringBuilder();
        Random random=new Random();
        for (int i = 0; i < size; i++) {
            int randomASCII=random.nextInt(26)+65;

            char uppercase= (char) randomASCII;
            if (Character.isUpperCase(uppercase)){
                stringBuilder.append(uppercase);
            }
        }

        return "Your Generated Password -> "+stringBuilder.toString();
    }
}
