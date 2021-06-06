public class SlavePotok implements Runnable {
    private static int x;
    Thread ts;
    SlavePotok(){
        ts = new Thread(this,"Slave Potok");
        ts.start();
    }
    public void run(){
        for (int x = 1; x < 6; x++){
            try{
                ts.sleep(500);
            }catch (InterruptedException e){e.printStackTrace();}
            System.out.println("Slave Potok " + x);
        }


    }
}
