package ca.georgiancollege.comp1011m2022test1;

import javafx.scene.chart.XYChart;

import java.sql.*;
import java.util.ArrayList;

/* Singleton */
public class DBManager
{
    /********************* SINGLETON SECTION *****************************/
    // Step 1. private static instance member variable
    private static DBManager m_instance = null;
    // Step 2. make the default constructor private
    private DBManager() {}
    // Step 3. create a public static entry point / instance method
    public static DBManager Instance()
    {
        // Step 4. Check if the private instance member variable is null
        if(m_instance == null)
        {
            // Step 5. Instantiate a new DBManager instance
            m_instance = new DBManager();
        }
        return m_instance;
    }
    /*********************************************************************/

    // private instance member variables
    private String m_user = "root";
    private String m_password = "";
    private String m_connectURL = "jdbc:mysql://localhost:3306/javatest";

    /**
     * This method reads the vectors table from the MySQL database
     * and returns an ArrayList of Vector2D type
     * @return
     */
    public ArrayList<Student> readStudentTable()
    {
        // Instantiates an ArrayList collection of type Vector2D (empty container)
        ArrayList<Student> students = new ArrayList<Student>();

        String sql = "SELECT students.studentNum, firstName, lastName, homeAddress, telephone, province, avgGrade, major FROM students";

        try
                (
                        Connection connection = DriverManager.getConnection(m_connectURL, m_user, m_password);
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql);
                )
        {
            // while there is another record...loop
            while(resultSet.next())
            {
                // deserialize (decode) the data from database table
                int StudentNumber = resultSet.getInt("studentNum");
                String FirstName = resultSet.getString("firstName");
                String LastName = resultSet.getString("lastName");
                String HomeAddress = resultSet.getString("homeAddress");
                String Telephone = resultSet.getString("telephone");
                String Province = resultSet.getString("province");
                int AverageGrade = resultSet.getInt("avgGrade");
                String Major = resultSet.getString("major");

                students.add( new Student(StudentNumber, FirstName, LastName, HomeAddress, Telephone, Province, AverageGrade, Major));

            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }

        return students;
    }





}
