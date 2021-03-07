import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ClassRosterDaoFileImpl implements ClassRosterDao
{
    private Map<String, Student> students = new HashMap<>();
    public static final String ROSTER_FILE ="roster.txt";
    public static final String DELIMITER = "::";

    @Override
    public Student addStudent(String studentId, Student student)
    {
        Student prevStudent = students.put(studentId, student);
        return prevStudent;
    }

    @Override
    public List<Student> getAllStudents()
    {
        return new ArrayList<Student>(students.values());
    }

    @Override
    public Student getStudent(String studentId)
    {
        return students.get(studentId);
    }

    @Override
    public Student removeStudent(String studentId)
    {
        Student removedStudent = students.remove(studentId);
        return removedStudent;
    }

    private Student unmarshallStudent(String studentAsText)
    {
        // studentAsText is expecting a line read in from our file.
        // For example, it might look like this:
        // 1234::Ada::Lovelace::Java-September1842
        //
        // We then split that line on our DELIMITER - which we are using as ::
        // Leaving us with an array of Strings, stored in studentTokens.
        // Which should look like this:
        // ______________________________________
        // |    |   |        |                  |
        // |1234|Ada|Lovelace|Java-September1842|
        // |    |   |        |                  |
        // --------------------------------------
        //  [0]  [1]    [2]         [3]
        String [] studentTokens = studentAsText.split(DELIMITER);

        // Given the pattern above, the student Id is in index 0 of the array.
        String studentId = studentTokens[0];

        // Which we can then use to create a new Student object to satisfy
        // the requirements of the Student constructor.
        Student studentFromFile = new Student(studentId);

        // However, there are 3 remaining tokens that need to be set into the
        // new student object. Do this manually by using the appropriate setters.

        //Index 1 - FirstName
        studentFromFile.setFirstName(studentTokens[1]);

        //Index 2 - LastName
        studentFromFile.setLastName(studentTokens[2]);

        //Index 3 - Cohort
        studentFromFile.setCohort(studentTokens[3]);

        //We have now created a student! Return it!
        return studentFromFile;
    }

    private void loadRoster() throws ClassRosterDaoException
    {
        Scanner scanner;

        try
        {
            //Create Scanner for reading the file
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(ROSTER_FILE)));
        }
        catch (FileNotFoundException e)
        {
            throw new ClassRosterDaoException(
                    "-_- Could not load roster data into memory.", e);

        }
    }

}