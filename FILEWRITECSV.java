import javax.swing.*;
import java.io.*;
public class FILEWRITECSV
{
    
    //file object to open, read and close file
    private FileWriter fWriter;
    
    //(no class constructor, just use default constructor)
    
    public void writeCSVtable(String outBuffer) throws IOException
    {
        String csvFile;
        //create a file chooser
        File currentDir = new File("").getAbsoluteFile();
        final JFileChooser fc = new JFileChooser(currentDir);
        //In response to a button click 
        int returnVal = fc.showSaveDialog(null);
        //open file
        File file = fc.getSelectedFile();
        //obtain filename
        csvFile = file.getName();
        
        //open the file
        fWriter = new FileWriter(csvFile);
        //write all the to the file in 1 burst
        fWriter.write(outBuffer);
        //CLOSE TEH FILE
        fWriter.close();
    }
}
        