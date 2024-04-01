import java.util.Random;

public class RandomAlphanumericWithSpecialCharsGenerator {
    static String strongPass(int size){
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()-_+=<>?";
        StringBuilder stringBuild=new StringBuilder();
        Random random=new Random();
        for (int i = 0; i < size; i++) {
            int randomASCII=random.nextInt(characters.length());
            stringBuild.append(characters.charAt(randomASCII));
        }
        return "Your Generated Password -> "+stringBuild.toString();
    }
}
