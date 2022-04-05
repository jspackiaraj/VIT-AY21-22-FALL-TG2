import java.io.*;
public class WritingToAFile {
    public static void main(String[] args) {
        // Write Contents to File called TG2_NewFile.txt
        // in the directory C:\JAVA_Files\JAVAFilesDemo\
        // (Change the directory as per your machine's directory structure
        try{
            FileWriter Writer = new FileWriter("C:\\JAVA_Files\\JAVAFilesDemo\\TG2_NewFile.txt");
            Writer.write("// End of FIle");
            Writer.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
