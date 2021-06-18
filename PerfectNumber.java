package javaLogicalProgram;

public class PerfectNumber {
        public static void main(String[] args)
        {
            int sum = 0;

            System.out.print("Enter any integer you want to check:");
            int n = Utility.getUserSpecificInteger();
            for(int i = 1; i < n; i++)
            {
                if(n % i == 0)
                {
                    sum = sum + i;
                }
            }
            if(sum == n)
            {
                System.out.println("Given number is Perfect");
            }
            else
            {
                System.out.println("Given number is not Perfect");
            }
        }

    }

