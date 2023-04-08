package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class ButtonColumnCellRederer extends DefaultTableCellRenderer{
        //Mostrar na tella icones botoes usuarios
     private String buttonType;
     
     public ButtonColumnCellRederer(String buttonType){
         this.buttonType = buttonType;     
     }

    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
      JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
      
      label.setHorizontalAlignment(CENTER);
      
      label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + buttonType + ".png")));
     return label;
    
    }
     
     
}
