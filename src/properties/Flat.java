package properties;
import java.sql.Statement;
import realEstate.*;
public class Flat
{
    Flat()
    {
        Statement stmt = null;
    }
    String country,city,street;
    
    int sizeSqft,totalFloor,attachedBaths,commonBaths,beds,
            parkings,Balconies,floorNo;
    
    
    String projectType,floorType;
    
    boolean gas,electricity,wasa,intercom,ccTv,cableConnection,internet,roofTopGarden,
            generator,lift,communityHall,gym,swimingPool;
    
    boolean fireExting,fireAlarm,emergencyExit;
    
    int salePrice,utilityCost,parkingCost;
    
    String description;
    
    
    
    public boolean addFlat()
    {
        return true;
    }
}
