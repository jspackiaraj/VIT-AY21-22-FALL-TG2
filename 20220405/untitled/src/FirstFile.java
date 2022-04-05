import java.io.File;
public class FirstFile {
    public static void main(String[] args) {
        // Create a file called TG2_NewFile.txt
        // in the directory C:\JAVA_Files\JAVAFilesDemo\
        // (Change the directory as per your machine's directory structure
        try{
            File fsFileObject = new File("C:\\JAVA_Files\\JAVAFilesDemo\\TG2_NewFile.txt");
            if(fsFileObject.exists()) {
                System.out.println("File Exists ..");
            } else {
                System.out.println("File does not exist ..");
                fsFileObject.createNewFile();
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
