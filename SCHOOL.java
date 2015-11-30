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

    public void setUpPupilList() throws IOException
    {
        //First user message
        System.out.println("PupilMark School: Pupil Mark update");
        System.out.println("** Preparing to read data file.");
        
        //read file, fetch data as string array containing rows
        String[] dataRows = markFile.readCSVtable();
        //calculate the number of pupil rows
        noOfPupils = dataRows.length;
        
        //update user with number of rows with pupil details
        System.out.println("**" + noOfPupils + "rows read.\n\n");
        //placeholder
        
        //prepare array for pupils
        pupilList = new PUPIL [noOfPupils];
        //create pupil objects and copy data
        for (int i = 0; i< noOfPupils; i++){
            pupilList[i] = new PUPIL();
            pupilList[i].readPupilsMark(dataRows[i]);
        }
    }

    public void countHighestMark()
    {
        //loop for each item ; pupil
        for (int i = 0; i < noOfPupils; i++)
        {
            //decidenif current item; pupil matches highest mark
            if ((pupilList[i].getMark()>187) && (pupilList[i].getMark() <200))
            {
                
                //display the details of the member
                pupilList[i].displayDetails();
            }
        }
    }
}
