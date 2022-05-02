public class Ashe extends Champion implements AsheActionCallBacks {
    public Ashe(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }

    @Override
    public void frostShot(Screen s) {
        System.out.println("Lanzo una flecha");
        s.setVisible(true);
        s.out(showMessage(),"Helvetica", 28, Colors.BlueHorizon);
        s.showImage("frostShot.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void hawkShot(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica", 28, Colors.BlueHorizon);
        s.showImage("frostShot.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void rangerFocus(Screen s) {
        System.out.println("Lanzo una flecha");
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica", 28, Colors.BlueHorizon);
        s.showImage("rangerFocus.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void volley(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica", 28, Colors.BlueHorizon);
        s.showImage("volley.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void crystalArrow(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica", 28, Colors.BlueHorizon);
        s.showImage("crystalArrow.gif");
        s.setBounds(200,100,1100,900);
    }
}
