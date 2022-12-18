class Pattern_2
{
    public static void main(String[] args)
    {
        int i,j;

        for(i=1; i<=5; i++) //rows
        {
            for(j=1; j<=i; j++) //colums
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}