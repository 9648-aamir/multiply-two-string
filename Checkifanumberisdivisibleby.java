public class Checkifanumberisdivisibleby {
    int DivisibleByEight(String s){
        if(s.length()<=3) return (Integer.valueOf(s)%8==0)?1:-1;
        else return DivisibleByEight(s.substring(s.length()-3)) ;
        
     }
}
