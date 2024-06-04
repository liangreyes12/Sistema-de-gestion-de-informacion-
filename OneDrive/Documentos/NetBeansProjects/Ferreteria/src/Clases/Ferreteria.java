package Clases;

import Interfaces.Carga;
import Interfaces.Login;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class Ferreteria {

    public static void main(String[] args) {
        Carga car = new Carga();
        car.setVisible(true);

        Timer timer = new Timer(42, new ActionListener() {
            private int progress = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    car.LbPorcentaje.setText(Integer.toString(progress) + "%");
                    car.PrBarra.setValue(progress);

                    if (progress == 101) {
                        car.setVisible(false);
                        Login Iniciar = new Login();
                        Iniciar.setVisible(true);
                        ((Timer) e.getSource()).stop();
                    }

                    progress++;
                });
            }
        });

        timer.start();
    }
}
