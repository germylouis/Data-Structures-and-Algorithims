package RandomCodeChallenges;

public class PrimeNums {
    static void primes(){
        int n = 100;
        int count;

        for (int i = 1; i <= n; i++){
            count = 0;
            for(int j = i; j >= 1; j--){
                if (i%j==0){
                    count= count + 1;
                }
            }
            if (count == 2){
                System.out.print( i + " ");
            }
        }

    }

}
