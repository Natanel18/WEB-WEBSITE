import java.awt.SplashScreen;

import javax.swing.JFrame;

public class Splashscreen {

    private static final int SHOW_FOR = 3000;

    public Splashscreen() {
JFrame frame = new JFrame("Splash-Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);

        Thread t = new Thread() {
            public void run() {
                SplashScreen splash = SplashScreen.getSplashScreen();
                if (splash == null) {
                    System.err
                            .println("SplashScreen kann nicht erzeugt werden.");
                    return;
                }
                try {
                    Thread.sleep(SHOW_FOR);
                } catch (InterruptedException e) {
                    System.err.println("Thread unterbrochen");
                }
                splash.close();
                frame.setVisible(true);
            }
        };
        t.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Splashscreen());
    }
}import java.awt.SplashScreen;

import javax.swing.JFrame;

public class Splashscreen {

    private static final int SHOW_FOR = 3000;

    public Splashscreen() {
JFrame frame = new JFrame("Splash-Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);

        Thread t = new Thread() {
            public void run() {
                SplashScreen splash = SplashScreen.getSplashScreen();
                if (splash == null) {
                    System.err
                            .println("SplashScreen kann nicht erzeugt werden.");
                    return;
                }
                try {
                    Thread.sleep(SHOW_FOR);
                } catch (InterruptedException e) {
                    System.err.println("Thread unterbrochen");
                }
                splash.close();
                frame.setVisible(true);
            }
        };
        t.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Splashscreen());
    }
}