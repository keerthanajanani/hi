# hi
import java.io.*
import java.util.*;
public class Positive
{
public static void main(String args[])throws IOException
{
int n;
BufferedReader br=new Bufferedreader(new InputStreamReader(System.in));
System.out.println("Enter the Integer Number");
n=Integer.parseInt(br.readLine());
if(n>0)
{
System.out.println(n + " is positive Number");
}
else if(n<0)
{
System.out.println(n + " is positive Number");
}
else
{
System.out.println("It is Zero");
}
}
}
