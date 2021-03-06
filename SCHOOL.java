import javax.swing.JOptionPane;
import java.io.*;

public class SCHOOL
{
    //array of PUPIL objects
    private PUPIL pupilList[];
    //number of pupils to be called
    int noOfPupils;
    FILEREADCSV markFile;
    FILEWRITECSV resultFile;

    public SCHOOL() throws IOException
    {
        markFile = new FILEREADCSV();  //to read file from storage
        resultFile = new FILEWRITECSV();  //to write data from storage
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

    public void countHighestMark() throws IOException
    {
        //prepare a string to write data to disc
        String fileContent = "";
        System.out.println("A report of the pupils with the highest mark\n");
        int topmark = 0;
        //start the count
        //int count = 0; 
        //loop for each item ; pupil
        for (int i = 0; i < noOfPupils; i++)
        {
            //decide if current item; pupil matches highest mark
            if (pupilList[i].getMark() > pupilList[topmark].getMark()){

                //choose position of first value
                topmark = i;

            }
        }
        pupilList[topmark].displayDetails();

        System.out.println();

        fileContent = fileContent.concat(pupilList[topmark].writeDetails());

        //send for writing to file as a string containing all data
        System.out.print("** Preparing to write data file.");
        resultFile.writeCSVtable(fileContent);
        System.out.println("**File written and closed.");

    }
}
