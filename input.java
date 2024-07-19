import java.io.*;
class input 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Name = br.readLine();
		int age = Integer.parseInt(br.readLine());
		System.out.println("Name is"+Name);
		System.out.println("Age is"+Age);
	}
}
