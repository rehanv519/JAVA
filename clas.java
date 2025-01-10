public class clas
{
     int x = 15;
     int y = 20;

    public static void main(String[] args)
    {
        clas cl = new clas();
        clas cs = new clas();
      
        System.out.println("X : " + cl.x);
        System.out.println("Y : " + cl.y);

        cl.x=16;
        cl.y=21;

        System.out.println("X : " + cl.x);
        System.out.println("Y : " + cl.y);

        cs.x = 100;
        cs.y = 200;

        System.out.println("X : " + cs.x);
        System.out.println("Y : " + cs.y); 

        cs.x = 1000;
        cs.y = 2000;
		
		System.out.println("X : " + cs.x);
        System.out.println("Y : " + cs.y); 


		

    }
}    