/* NAME: Abnitha San Roby
   CSE A
   ROLL NO: 8
*/
import java.io.*;
class FileCount
{
    public static void main(String args[]) throws IOException
    {
        int c1=0,c2=0,c3=1;
        FileInputStream f;
        try
        {
            f=new FileInputStream("f1.txt");
            int c;
            do
            {
                c=f.read();
                if(c!=-1)
                {
                    System.out.print((char)c);
                    if(c=='\n')
                    {
                        c1++;
                    }
                    if(c!=' '&&c!='\n')
                    {
                        c2++;
                    }
                    if(c==' ')
                    {
                        c3++;
                    }
                }
            }while(c!=-1);
            c1++;
        System.out.println("\nNo of lines : "+c1);
        System.out.println("No of characters : "+c2);
        System.out.println("No of words : "+c3);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("file not found");
        }
    }
}
/*OUTPUT
hi bye
bye hi
hi hi
No of lines : 3
No of characters : 14
No of words : 4
*/


