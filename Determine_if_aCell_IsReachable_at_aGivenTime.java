public class Determine_if_aCell_IsReachable_at_aGivenTime {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int dis=Math.max(Math.abs(fy-sy),Math.abs(fx-sx));
    if((sx==fx)&&(sy==fy))
    {
        if(t==1)
        return false;
        else
         return true;
    }
    
        if(t>=dis)
        return true;
        else
        return false;

    }
}
