import java.util.List;

public class ClassRosterController {

    private ClassRosterView view;
    private ClassRosterDao dao;


    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;

        while (keepGoing)
        {
            menuSelection = getMenuSelection();

            switch (menuSelection)
            {
                case 1:
                    listStudents();
                    break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    viewStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }

        }
        exitMessage();
    }

    private int getMenuSelection()
    {
        return view.printMenuAndGetSelection();
    }

    private void createStudent()
    {
        view.displayCreateStudentBanner();
        Student newStudent = view.getNewStudentInfo();
        dao.addStudent(newStudent.getStudentId(), newStudent);
        view.displayCreateSuccessBanner();
    }

    private void listStudents()
    {
        view.displayDisplayAllBanner();
        List<Student> studentList = dao.getAllStudents();
        view.displayStudentList(studentList);
    }

    private void viewStudent()
    {
        view.displayDisplayStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student student = dao. getStudent(studentId);
        view.displayStudent(student);
    }

    private void removeStudent()
    {
        view.displayDisplayStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student removedStudent = dao.removeStudent(studentId);
        view.displayRemoveResult(removedStudent);
    }

    private void unknownCommand()
    {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage()
    {
        view.displayExitBanner();
    }

    public ClassRosterController(ClassRosterDao dao, ClassRosterView view)
    {
        this.dao = dao;
        this.view = view;
    }

}
