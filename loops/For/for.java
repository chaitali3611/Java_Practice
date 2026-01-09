class For
{
    public static void main(String a[])
    {
        for(int i = 4;i>=1;i--)
        {
            System.out.println("Hi " + i);
        }
    }
}


//sarting from zero
class For
{
    public static void main(String a[])
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println("Hi " + i);
        }
    }
}

//nested for loop
class For
{
    public static void main(String a[])
    {
        for(int i =1;i<=5;i++)
        {
            System.out.println("Day " +i);
            
            for(int j = 1;j<=9;j++)
            {
                System.out.println("    " +(j + 8)+("-") + (j +9));
            }
        }
    }
}