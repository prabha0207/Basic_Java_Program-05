import java.io.*;
class RString
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char ch[] = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
    }
}
