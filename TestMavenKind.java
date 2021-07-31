import java.util.Scanner;
import java.io.File;
public class TestMavenKind{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the full path , project name ,  the archetype ");
		String path = sc.nextLine();
		String projectName = sc.nextLine();
		String archetype = sc.nextLine();
		
		File file = new File(path+"/"+projectName);
		file.mkdir();
		
		if(archetype.equals("web-app")){
			
			System.out.println(archetype);
		}
	}

}


