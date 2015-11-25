
public class PUPIL
{
    //list of properties
    private String fName;
    private String sName;
    private float mark;
    
    public PUPIL()
    {
        //constructor
        //initialise instance vars
        fName = "";
        sName = "";
        mark = 0.0f;
    }
    
    public void readPupilsMark(String dataItems)
    {
        //unpack string of row data into fields 
        String[] rowItems = dataItems.split(",");
        
        //store each data item as instance property
        fName = rowItems[0];
        sName = rowItems[1];
        mark = Float.parseFloat(rowItems[2]);
        
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
        
    }
