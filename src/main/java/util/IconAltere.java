
package util;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * Basico -> Realiza��o da altera��o do ICON da Aplica��o
 */
public class IconAltere {
    public void InserirIcone(JFrame frm){
        try {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/tick.png"));
        frm.setIconImage(icon);
        frm.setTitle("TodoApp: Controle suas tarefas, simplifique sua vida.");
    } catch (Exception ex) {
        System.out.println(ex.toString());
    }
    }
    
}
