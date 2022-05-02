public class Game {

    public static void main(String[] args) throws InterruptedException {
        testAshe();

        // s.setVisible(true);
        // s.out(ashe.showMessage(), "Helvetica", 28, Colors.BlueHorizon);
    }

    public static void testAshe()  throws InterruptedException {
        Screen screen = new Screen();

        Ashe ashe = new Ashe(
                01,
                "Ashe",
                "Marksman",
                "Moderate",
                "Iceborn warmother of the Avarosan tribe, Ashe commands the most populous horde in the north."
        );

        Runnable attack = new Runnable() {
            @Override
            public void run() {
                try {
                    ashe.frostShot(screen);
                    Thread.sleep(3000);

                    ashe.hawkShot(screen);
                    Thread.sleep(3000);

                    ashe.volley(screen);
                    Thread.sleep(3000);

                    ashe.rangerFocus(screen);
                    Thread.sleep(3000);

                    ashe.crystalArrow(screen);
                    Thread.sleep(3000);

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread attackAshe = new Thread(attack);
        attackAshe.start();


        // ashe.frostShot(screen);
        // Thread.sleep(3000);
        //ashe.crystalArrow(screen);
    }
}
