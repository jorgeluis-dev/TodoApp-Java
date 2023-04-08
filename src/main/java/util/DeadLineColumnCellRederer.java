package util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

/**
 *
 * Herança
 */
public class DeadLineColumnCellRederer extends DefaultTableCellRenderer {
    Color greenr1g152b103 = new Color(1, 152, 103);
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col){
    
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);        
        label.setHorizontalAlignment(CENTER);
        
        //Get Task => Verifica a data => Return color(true) or (false)
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        Task task = taskModel.getTasks().get(row);
        
        
        if(task.getDeadline().after(new Date())){
                label.setBackground(greenr1g152b103);
                label.setForeground(Color.WHITE);
                label.setFont(new Font("Segoe UI", Font.BOLD, 12));
        }else{
               label.setBackground(Color.RED);               
                label.setForeground(Color.WHITE);
                label.setFont(new Font("Segoe UI", Font.BOLD, 12));

                
        }   
        return label;   
    }
    
}
