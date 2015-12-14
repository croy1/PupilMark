
public class PUPIL
{
    //list of properties
    private String fName;
    private String sName;
    private int mark;

    public PUPIL()
    {
        //constructor
        //initialise instance vars
        fName = "";
        sName = "";
        mark = 0;
    }

    public void readPupilsMark(String dataItems)
    {
        //unpack string of row data into fields 
        String[] rowItems = dataItems.split(",");

        //store each data item as instance property
        fName = rowItems[0];
        sName = rowItems[1];
        mark =  Integer.parseInt(rowItems[2]);

        //produce name and mark of the highest mark
    }

    public String writeDetails()
    {
        String pupilData ="";
        pupilData = pupilData.concat(fName);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(sName);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(Float.toString(mark));
        return pupilData;
    }

    public int getMark()
    {
        return mark; 
        
    }
    
    public String getDetails()
    {
        return "Pupil; " + fName + " " + sName;
    }
    public void displayDetails()
    {
        //output basic details
        System.out.print("Pupil; " + fName + " " + sName);
        System.out.print("Mark is " + mark);
        System.out.println();

    }
}

