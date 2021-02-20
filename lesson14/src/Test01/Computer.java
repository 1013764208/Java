package Test01;

public class Computer {

    public void transferData(USB usb){   // USB usb = new Flash
        usb.start();

        System.out.println("具体传输数据的细节");

        usb.stop();
    }
}
