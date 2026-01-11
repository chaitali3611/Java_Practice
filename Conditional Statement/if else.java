class Data
{
    public static void main(String arg[])
    {
        int x = 8;
        
        if (x > 10)
            System.out.println("Hello");
            
        else
            System.out.println("Bye");
    }
}


//compare two numbers
class Data
{
    public static void main(String arg[])
    {
        int x = 78;
        int y = 9;
        if (x > y)
        {    System.out.println(x);
            System.out.println("Thank you");
        }   
        else
            System.out.println(y);
    }
}


//compare three numbers
class Statement
{
    public static void main(String arg[])
    {
        int x = 4;
        int y = 5;
        int z = 6;
        
        if(x > y && x > z)
            System.out.println(x);
        else 
            if(y > z)
                System.out.println(y);
            else
                System.out.println(z);
    }
}


//condition
class Statement
{
    public static void main(String arg[])
    {
        int n = 45;
        int result = 0;
        
        if(n%2==0)
            result = 10;
        else
            result = 20;
        System.out.println(result);
    }
}