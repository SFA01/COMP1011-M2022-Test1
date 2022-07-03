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
    public ArrayList<Student> readVectorTable()
    {
        // Instantiates an ArrayList collection of type Vector2D (empty container)
        ArrayList<Student> vectors = new ArrayList<Student>();

        String sql = "SELECT vectors.vectorID, X, Y FROM vectors GROUP BY vectors.vectorID";

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
                int vectorID = resultSet.getInt("vectorID");
                float X = resultSet.getFloat("X");
                float Y = resultSet.getFloat("Y");

                // create an anonymous Vector2D object with the data from the database
                // then add the new Vector2D object to the vectors ArrayList
                //vectors.add( new Student(vectorId, X, Y));
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }

        return vectors;
    }

    /**
     * This method returns the Bar Chart Data from the Database
     * @return
     */
    public XYChart.Series<String, Float> getMagnitude()
    {
        // Step 1. Create a Series
        XYChart.Series<String, Float> magnitudes = new XYChart.Series<>();
        magnitudes.setName("2022");

        // Step 2. Get the Data from the Database
        ArrayList<Student> vectors = readVectorTable();

        // mock data example
        /*
        magnitudes.getData().add(new XYChart.Data<>("0, 0", 0.0f));
        magnitudes.getData().add(new XYChart.Data<>("10, 20", 10.0f));
        magnitudes.getData().add(new XYChart.Data<>("30, 40", 20.0f));
        magnitudes.getData().add(new XYChart.Data<>("50, 80", 30.0f));
         */

        // Step 3. For Each Vector in the Data...Loop and add it to the Series
        /*for (var vector : vectors)
        {
            var chartData = new XYChart.Data<>(vector.toOneDecimalString(), vector.getMagnitude());
            magnitudes.getData().add(chartData);
        }
*/
        return magnitudes;
    }
}
