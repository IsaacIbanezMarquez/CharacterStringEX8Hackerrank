




import java.io.*;
import java.util.*;

// Xifratge de Julius Cesar:

/* Donada una cadena de lletres majúscules i un nombre enter en l'interval [1,9], genera la cadena codificada segons l'algorisme de Julius Cesar

Xifratge Julius Cesar

Input Format

Introdueix una paraula en majúscules fins a final de línia. Dígit entre 1 i 9.

Constraints

No n'hi ha.

Output Format

Imprimeix la paraula xifrada.

Sample Input 0

DAM
1
Sample Output 0

EBN

 */


public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String codigo = sc.nextLine();

        int num = sc.nextInt();
        String frase = "";


        for(int i=0; i < codigo.length(); i++)
        {

            char letra = codigo.charAt(i);


            if(letra >= 'a' && letra <= 'z')
            {
                letra = (char) (letra + num);

                if (letra > 'z')
                {
                    letra = (char) (letra+'a'-'z'-1);
                }

                frase = frase + letra;
            }

            else if (letra >= 'A' && letra <= 'Z')
            {
                letra = (char) (letra + num);

                if(letra > 'Z')
                {
                    letra = (char) (letra + 'A'-'Z'-1);
                }

                frase = frase + letra;
            }
            else
            {
                frase = frase + letra;
            }

        }

        System.out.println(frase);
    }
}
