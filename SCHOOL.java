import javax.swing.JOptionPane;
import java.io.*;

public class SCHOOL
{
    //array of PUPIL objects
    private PUPIL pupilList[];
    //number of pupils to be called
    int noOfPupils;
    FILEREADCSV markFile;

    public SCHOOL()
    {
        markFile = new FILEREADCSV();
    }

    //top level algorithm
    public void processPupils() throws IOException
    {
        setUpPupilList();
        countHighestMark();
    }

    private void setUpPupilList() throws IOException
    {
        //First user message
        System.out.println("PupilMark School: Pupil Mark update");
        System.out.println("** Preparing to read data file.");
        
        //read file, fetch data as string array containing rows
        String[] dataRows = markFile.readCSVtable();
        //calculate the number of pupil rows, skip headings
        noOfPupils = dataRows.length - 1;
        
        //update user with number of rows with pupil details
        System.out.println("**" + noOfPupils + "rows read.\n\n");
        //placeholder
    }

    public void countHighestMark()
    {
        //placeholder
    }
}
