import java.io.*; 

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String readFile(String filename){
		FileReader inputStream = null;
		String result = "";
		try{
			inputStream = new FileReader(filename);
			int c;
			while((c = inputStream.read()) != -1){
				result += (char)(c);
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
		return result;
	}
	
	public static String backwardsReadFile(String filename){
		FileReader inputStream = null;
		String result = "";
		String word = "";
		try{
			inputStream = new FileReader(filename);
			int c;
			while((c = inputStream.read()) != -1){
				word += (char)(c);
			}
			for(int i = word.length()-1; i >= 0; i--){
				result += word.charAt(i);
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
		return result;
	}
}
