public class Column_name_from_a_given_column_number {
    String colName (long n)
    {
        StringBuilder sb=new StringBuilder();
        while(n-->0)
        {
            sb.insert(0,(char)('A'+(n%26)));
            n=n/26;
        }
        return sb.toString();
    }
}
