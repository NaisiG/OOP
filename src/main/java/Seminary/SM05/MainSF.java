package Seminary.SM05;

import Seminary.SM05.controllers.UserController;
import Seminary.SM05.model.FileOperation;
import Seminary.SM05.model.FileOperationImpl;
import Seminary.SM05.model.Repository;
import Seminary.SM05.model.RepositoryFile;
import Seminary.SM05.views.ViewUser;
public class MainSF {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
