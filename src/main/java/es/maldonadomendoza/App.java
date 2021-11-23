package es.maldonadomendoza;

public class App 
{
    public static void main( String[] args )
    {
       AccessData adsl = AccessData.getInstance();
       adsl.checkService();
    }
}
