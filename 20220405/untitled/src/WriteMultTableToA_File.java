import java.io.*;
public class WriteMultTableToA_File {
    public static void main(String[] args) {
        // Write Contents to File called TG2_NewFile.txt
        // in the directory C:\JAVA_Files\JAVAFilesDemo\
        // (Change the directory as per your machine's directory structure
        try{
            FileWriter Writer = new FileWriter("C:\\JAVA_Files\\JAVAFilesDemo\\TG2_NewFile.txt");
            Writer.write("// Multiplication Tables \n");
            int intMultTableToPrint = 3;
            int intMultTableFrom = 1;
            int intMultTableTill = 12;
            for (int intI = intMultTableFrom; intI <= intMultTableTill; intI++){
                Writer.write(intI + " * " + intMultTableToPrint + " = " + intI * intMultTableToPrint + "\n");
            }
            Writer.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
