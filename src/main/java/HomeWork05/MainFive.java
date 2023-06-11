package HomeWork05;

import HomeWork05.controllers.UserController;
import HomeWork05.model.FileOperation;
import HomeWork05.model.FileOperationImpl;
import HomeWork05.model.Repository;
import HomeWork05.model.RepositoryFile;
import HomeWork05.utils.Validate;
import HomeWork05.views.ViewUser;
public class MainFive {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);

        view.run();
    }
}
