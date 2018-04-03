import java.util.*;

public class binary
{
    public binary()
    {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a bitty boi (binary): ");
        String input = reader.next();
        int sum = 0;
        int exponent = input.length()-1;
        for(int i = 0; i < input.length(); i++){
            sum += Integer.parseInt(input.substring(i,i+1)) * (Math.pow(2,exponent));
            exponent --;
        }
        System.out.println("decimal boi: " + sum);
    }
}
