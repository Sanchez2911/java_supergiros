import javax.swing.SwingUtilities;

import Vst_Controller.CrudGUI;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CrudGUI();
            }
        });
    }
}
