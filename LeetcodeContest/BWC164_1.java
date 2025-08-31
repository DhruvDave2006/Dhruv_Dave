// Biweekly Contest 164_P1 : Find the Least Frequent Digit

// Given an integer n, find the digit that occurs least frequently in its decimal representation. If multiple digits have the same frequency, choose the smallest digit.

// Return the chosen digit as an integer.

// The frequency of a digit x is the number of times it appears in the decimal representation of n.
 

// Example 1:

// Input: n = 1553322

// Output: 1

// Explanation:

// The least frequent digit in n is 1, which appears only once. All other digits appear twice.

// Example 2:

// Input: n = 723344511

// Output: 2

// Explanation:

// The least frequent digits in n are 7, 2, and 5; each appears only once.

 

// Constraints:

// 1 <= n <= 231​​​​​​​ - 1

public class BWC164_1 {
    
    public int getLeastFrequentDigit(int n) {
        
        int []count = new int[10];

        if(n == 0){
            return 0; 
        }

        int num = Math.abs(n);

        while(num > 0){

            int digit = num % 10;
            count[digit]++;
            num /= 10;
        }

        int freq = Integer.MAX_VALUE;
        
        for(int i = 0; i < 10; i++){
            if(count[i] > 0 && count[i] < freq){
                freq = count[i];
            }
        }

        for(int i = 0; i < 10; i++){
            if(count[i] == freq){
                return i;
            }
        }
        
        return -1;
        
    }
}
