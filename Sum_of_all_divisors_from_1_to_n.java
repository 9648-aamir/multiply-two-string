public class Sum_of_all_divisors_from_1_to_n {
    static long sumOfDivisors(int N){
        // code here
        long sum = 0;
        for(int i=1;i<=N;i++){
            sum = sum + i*(N/i);
        }
        return sum;
    }
}
