package Test;

import controller.ProjectController;
import java.util.List;
import model.Project;

/**
 *
 * @author Jorge
 */
public class TestProject {

    public static void main(String[] args) {
         ProjectController projectController = new ProjectController();
        
//         //TEST1
//        Project project = new Project();     
//        //TEST CREATED ->
//        project.setName("Projeto testando");
//        project.setName("description teste");
//        projectController.save(project);
//        //FIM->TEST-> INCLUIR


//        //TEST2        
//        Project project2 = new Project();
//        project2.setId(4);
//        project2.setName("Novo nome do Projeto23");
//        project2.setDescription("description");
//        projectController.update(project2);

          //TEST3
         List<Project> projects = projectController.getAll();
         System.out.println("Total de projetos = "+projects.size());
         //RETURN QUANTIDADE PROJECTS
         
//         //TEST4
//         projectController.removeById(4);
//         //REMOVE PROJECTS where ID = 4;
        
    }

}
