class Pattern_1{
    public static void main(String[] args)
    {
        int i,j,k;

        for(i=1; i<=3; i++)  // i=1,2
        {
            for(j=3; j>i; j--) // j=3,2,1
            {
                System.out.print("  "); // condtion true then print space 
            }
            for(k=1;k<=2*i-1;k++) // k=1,2,3
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    } 
}