/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import controller.TaskController;
import java.util.Date;
import java.util.List;
import model.Task;

/**
 *
 * @author Jorge
 */
public class TestTask {

    public static void main(String[] args) {
        TaskController taskController = new TaskController();

        //TEST1
//        Task task = new Task();
//        task.setIdProject(2);
//        task.setName("Criar as telas da aplicação");
//        task.setDescription("Devem ser criadas telas para os cadastros");
//        task.setCompleted(false);
//        task.setNotes("Sem notas");
//        task.setDeadline(new Date());        
//        taskController.save(task);

//        //TEST2       
//          Task task2 = new Task();         
//          task2.setId(1);
//          task2.setIdProject(2);
//          task2.setName("Criar telas V2");
//          task2.setDescription("Tela cadastro V2");
//          task2.setCompleted(false);          
//          task2.setNotes("Sem notas");
//          task2.setDeadline(new Date());
//          taskController.update(task2);

//            //TEST3 -> Lista
//            Task task3 = new Task();
//            List<Task> tasks = taskController.getAll();
//            System.out.println("Total de tarefas= "+tasks.size());
//            //RETURN QUANTIDADE TAREFAS

            //TEST4 -> Remove
            taskController.removeById(1);
            //remove a tarefa id = 1;
          
    }

}
