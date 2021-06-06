//задача вывести надпись в главном потоке, потом поток поставить в ожидание, пока другой поток не завершится
//Сейчас достигли это методом джоин из главноего потока, но пока программа встает. Нужно найти способ закрыть поток СЛАЙВ--


public class TestPotok {
    public static void main(String[] args) {
        System.out.println("HI");
        Thread t = Thread.currentThread();
        SlavePotok slave = new SlavePotok();
        try {
            t.join();
        }catch (InterruptedException e){e.printStackTrace();}
//        do{
//            try{
//                t.sleep(500);
//            }catch (InterruptedException e){e.printStackTrace();}
//        }while (slave.ts.isAlive());
        System.out.println("END");

    }
}
