import java.io.*; 

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String readFile(String filename){
		FileReader inputStream = null;
		try{
			inputStream = new FileReader(filename);
			String result = "";
			while((c = inputStream.read()) != -1){
				result += c;
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally{
			try{
				if(inputStream != null){
					inputStream.close();
				}
			}
			catch(IOException e){
				System.out.println(e);
			}
		}
	}

}
