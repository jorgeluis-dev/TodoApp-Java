package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author Jorge
 */
public class TaskTableModel extends AbstractTableModel {

    //1
    String[] columns = {"Nome", "Descrição", "prazo", "tarefa Conluída", "Editar", "Excluir"};
    List<Task> tasks = new ArrayList();

    @Override
    public int getRowCount() {
        //Quantas linhas a tabela vai ser exibida no Jtable?[2]
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        //Quantas colunas a tabela vai exibir no Jtable?[3]
        return columns.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }
    
    //Transformar as celulas JTABLE editaveis
   public boolean isCellEditable(int rowIndex, int colmnIndex){
       return colmnIndex == 3;
   } 
    
   //[booleano1]Pega o dado, tipo => Pega a Class do dados[Return string example]
   @Override
   public Class<?> getColumnClass(int columnIndex){
       if(tasks.isEmpty()){
           return Object.class;
       }       
       return this.getValueAt(0, columnIndex).getClass();
   }
   
    //[booleano2] Controlar o comportamento
   @Override
   public void setValueAt(Object aValue, int rowIndex, int columnIndex){
       tasks.get(rowIndex).setCompleted((boolean) aValue);
   
   }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Retorna uma informação correspondente a [LINHA,COLUNA] (matriz)[4]
        switch (columnIndex) {
            case 0:
                return tasks.get(rowIndex).getName();

            case 1:
                return tasks.get(rowIndex).getDescription();

            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
                
            case 3:
                return tasks.get(rowIndex).isCompleted();

            case 4:
                return "";
            case 5:
                return "";

            default:
                return "Dados não encontrados";

        }
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    

}
