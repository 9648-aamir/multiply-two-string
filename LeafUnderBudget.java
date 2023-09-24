import java.util.HashMap;

public class LeafUnderBudget {
    HashMap<Integer,Integer> bilu=new HashMap<>();
    int minlevel=25665933;
    int maxlevel=0;
    void trawith(Node temp,int level){
        if(temp==null){
            return;
        }
        if(temp.left==null && temp.right==null){
            if(bilu.containsKey(level)){
                bilu.replace(level,bilu.get(level)+1);
            }
            else{
                bilu.put(level,1);
            }
            if(level<minlevel) minlevel=level;
            if(level>maxlevel) maxlevel=level;
            return;
        }
        
        
            trawith(temp.left,level+1);
            trawith(temp.right,level+1);
    }
    public int getCount(Node node, int bud)
    {
        //code here
        trawith(node,1);
        int budget=bud;
        int out=0;
        for(int i=minlevel;i<=maxlevel;i++){
            if(bilu.containsKey(i)){
                for(int j=0;j<bilu.get(i);j++){
                    budget=budget-i;
                    if(budget<0) return out;
                    out++;
                    if(budget==0) return out;
                }
            }
        }
        return out;
        
    }
}
