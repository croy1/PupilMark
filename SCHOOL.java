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
    public void processPupils()
    {
        setUpPupilList();
        countHighestMark();
    }

    private void setUpPupilList()
    {
        //placeholder
    }

    public void countHighestMark()
    {
        //placeholder
    }
}
