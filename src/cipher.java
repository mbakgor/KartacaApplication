import java.util.HashMap;

public class cipher {

    static HashMap<Character, Character> mirror = new HashMap<Character, Character>(){{
        put('A', 'Z'); put('B', 'Y'); put('C', 'X'); put('D', 'W'); put('E', 'V'); put('F', 'U');
        put('G', 'T'); put('H', 'S'); put('I', 'R'); put('J', 'Q'); put('K', 'P'); put('L', 'O');
        put('M', 'N'); put('N', 'M'); put('O', 'L'); put('P', 'K'); put('Q', 'J'); put('R', 'I');
        put('S', 'H'); put('T', 'G'); put('U', 'F'); put('V', 'E'); put('W', 'D'); put('X', 'C');
        put('Y', 'B'); put('Z', 'A');
    }};


    public static String decode(String message)
    {
        String crypt = "";
        for(char letter : message.toCharArray())
        {

            if(letter != ' ')
            {

                crypt += Character.toLowerCase(mirror.get(Character.toUpperCase(letter)));
            }
            else
            {

                crypt += ' ';
            }
        }
        return crypt;
    }


    public static void main(String[] args)
    {

        String message = "gbkv REGISTER  mznv blfi mznv";
        System.out.println(decode(message));

    }
}

