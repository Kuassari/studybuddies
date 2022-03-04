package DB_Tables;
import java.sql.*;
import Base.*;
import java.util.Arrays;
import java.util.List;

// connect or statement must be passed to all functions in order to access the DB - ?
// create init function to register driver, create connect and statement and return statement - ?
// Statement will be used for executing static SQL statements and it can't accept input parameters.
// PreparedStatement will be used for executing SQL statements many times dynamically. It will accept input parameters.

//public class DB_Connection {
//    private Connection connect = null;
//    private Statement statement = null;
//    private PreparedStatement preparedStatement = null;
//    private ResultSet resultSet = null;
//
//    public DB_Connection(String url, String uname, String pass) throws Exception{
//        try{
//            // register the JDBC Driver
//            Class.forName("com.mysql.jdbc.Driver");
//
//            // setup the connection with the DB
//            connect = DriverManager.getConnection(url, uname, pass);
//
//            // statements allow to issue SQL queries to the database
//            statement = connect.createStatement();
//
//            printStudents();
//
//        }
//
//        catch(ClassNotFoundException ex){
//            System.out.println("Error: " + ex.toString());
//            //System.out.println("Error: unable to load driver class!");
//        } finally {
//            close();
//        }
//
//    }
public class DB_Connection {
    final private String url = "jdbc:mysql://localhost:3306/Study_Buddies_DB";
    final private String uname = "root";
    final private String pass = "javaproject1";

    private Connection conn = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public DB_Connection() throws Exception{
        try{
            // register the JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");
        }

        catch(ClassNotFoundException ex){
            System.out.println("Error: " + ex.toString());
            //System.out.println("Error: unable to load driver class!");
        } finally {
            close();
        }

    }

    // setup the connection with the DB (register the Driver)
    public Connection connect() throws SQLException{
        return DriverManager.getConnection(url, uname, pass);
    }


    public void close(){
        try {
            if (resultSet != null){
                resultSet.close();
            }
            if (statement != null){
                statement.close();
            }
            if (conn != null){
                conn.close();
            }
        }
        catch(Exception e){}
    }


    ////////// Student Queries //////////


    // print students (by username) from DB
    // automatically closes connections after try block
    public void printStudents() throws Exception {
        try (Connection conn = connect();
             Statement statement = conn.createStatement()){

            // get the result of the SQL query
            resultSet = statement.executeQuery("select * from Study_Buddies_DB.students");

            // print result
            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
            //System.out.println("Error: unable to load driver class!");
        }
    }

    // add student to DB
    // automatically closes connections after try block
    public boolean addStudent(Base.Student student) throws Exception {
        try (Connection conn = connect()){

            // @TODO check if the username already exists in DB

            // get the result of the SQL query
            preparedStatement = conn.prepareStatement("insert into Study_Buddies_DB.students values (?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, student.getUsername());
            preparedStatement.setString(2, student.getStudentName());
            preparedStatement.setString(3, student.getPassword());
            preparedStatement.setString(4, student.getCity());
            preparedStatement.setString(5, student.getLocation());
            preparedStatement.setString(6, student.getPhoneNum());
            preparedStatement.setString(7, student.getGender());

            int recordAdded = preparedStatement.executeUpdate();

            if (recordAdded ==1){
                System.out.println("Student was added successfully");
                return true;
            }
            else{
                System.out.println("student was not added");
                return false;
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
            return false;
        }

    }


    // delete student from DB
    // param: username - key in students table
    // automatically closes connections after try block
    public boolean deleteStudent(String username) throws Exception {
        try (Connection conn = connect()){

            // get the result of the SQL query
            preparedStatement = conn.prepareStatement("delete from Study_Buddies_DB.students where username = ? ");
            preparedStatement.setString(1, username);

            int recordsDeleted = preparedStatement.executeUpdate();
            if(recordsDeleted == 1){
                System.out.println("Student was deleted successfully");
                return true;
            }
            else
                System.out.println("Student was not found in DB");
            return false;

        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
            return false;
        }
    }

    // retrieve student from DB
    // automatically closes connections after try block
    public Base.Student getStudent(String username) throws Exception {
        Base.Student student = null;
        try (Connection conn = connect()){

            preparedStatement = conn.prepareStatement("select * from Study_Buddies_DB.students where username = ? ");
            preparedStatement.setString(1, username);

            resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                student = new Base.Student();
                student.setUsername(resultSet.getString("username"));
                student.setStudentName(resultSet.getString("studentName"));
                student.setPassword(resultSet.getString("password"));
                student.setCity(resultSet.getString("city"));
                student.setLocation(resultSet.getString("location"));
                student.setPhoneNum(resultSet.getString("phoneNum"));
                student.setGender(resultSet.getString("gender"));

                System.out.println("Student retrieved successfully");
                student.printStudent(student);
            }
            else
                System.out.println("Student was not found");

        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }

        return student;
    }

    // update student in DB
    // automatically closes connections after try block
    public boolean updateStudent(String username, String column, String newValue) throws Exception {
        try (Connection conn = connect();
             Statement statement = conn.createStatement()){

            String [] columns = {"username", "studentName", "password", "city", "location", "phoneNum", "gender"};
            List valid = Arrays.asList(columns);

            // check if column is valid
            if(valid.contains(column)){
                // valid column, update student
                String query = "UPDATE Study_Buddies_DB.students"
                        + " SET " + column + " = ?"
                        + " WHERE username = ?";

                preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1, newValue);
                preparedStatement.setString(2, username);

                int updatedStudent = preparedStatement.executeUpdate();

                if (updatedStudent==1){
                    System.out.println("Student was updated successfully");
                    return true;
                }
                else
                    System.out.println("Student was not updated");
            }
            else
                System.out.println("Invalid column in students table");

        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
            return false;
        }
        return false;
    }




    ////////// StudyGroup Queries //////////

    // add StudyGroup to DB
    // automatically closes connections after try block
    public boolean createStudyGroup(StudyGroup group) throws Exception {
        try (Connection conn = connect()){

            // get the result of the SQL query
            preparedStatement = conn.prepareStatement("insert into Study_Buddies_DB.studyGroups values (?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setLong(1, group.getGroupId());
            preparedStatement.setString(2, group.getCourse());
            preparedStatement.setInt(3, group.getCourseId());
            preparedStatement.setInt(4, group.getMaxParticipants());
            preparedStatement.setInt(5, group.getNumOfParticipants());
            preparedStatement.setString(6, group.getCity());
            preparedStatement.setString(7, group.getLocation());
            preparedStatement.setString(8, group.getAdmin());

            int recordAdded = preparedStatement.executeUpdate();

            if (recordAdded ==1){
                System.out.println("StudyGroup was added successfully");
                return true;
            }
            else{
                System.out.println("StudyGroup was not added");
                return false;
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
            return false;
        }
    }


    // delete StudyGroup from DB
    // param: username - key in studyGroup table
    // automatically closes connections after try block
    public boolean deleteStudyGroup(long groupId) throws Exception {
        try (Connection conn = connect()){

            // get the result of the SQL query
            preparedStatement = conn.prepareStatement("delete from Study_Buddies_DB.studyGroups where groupId = ? ");
            preparedStatement.setLong(1, groupId);

            int recordsDeleted = preparedStatement.executeUpdate();
            if(recordsDeleted == 1){
                System.out.println("studyGroup was deleted successfully");
                return true;
            }
            else
                System.out.println("studyGroup was not found in DB");
            return false;

        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
            return false;
        }
    }

    // retrieve study group from DB
    // automatically closes connections after try block
    public StudyGroupModel getStudyGroup(long groupId) throws Exception {
        StudyGroup group = null;
        try (Connection conn = connect()){

            preparedStatement = conn.prepareStatement("select * from Study_Buddies_DB.StudyGroups where groupId = ? ");
            preparedStatement.setLong(1, groupId);

            resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                group = new StudyGroup();
                group.setGroupId(resultSet.getLong("groupId"));
                group.setCourse(resultSet.getString("course"));
                group.setCourseId(resultSet.getInt("courseId"));
                group.setMaxParticipants(resultSet.getInt("maxParticipants"));
                group.setNumOfParticipants(resultSet.getInt("numOfParticipants"));
                group.setCity(resultSet.getString("city"));
                group.setLocation(resultSet.getString("location"));
                group.setAdmin(resultSet.getString("admin"));

                System.out.println("StudyGroup retrieved successfully");
            }
            else
                System.out.println("StudyGroup was not found");

        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }

        return group;
    }

    // update Study Group in DB
    // automatically closes connections after try block
    public boolean updateStudyGroup(long groupId, String column, String newValue) throws Exception {
        try (Connection conn = connect();
             Statement statement = conn.createStatement()){

            String [] columns = {"groupId", "course", "courseId", "maxParticipants", "numOfParticipants", "city", "location", "admin"};
            List valid = Arrays.asList(columns);

            // check if column is valid
            if(valid.contains(column)){
                // valid column, update study group
                String query = "UPDATE Study_Buddies_DB.studyGroups"
                        + " SET " + column + " = ?"
                        + " WHERE groupId = ?";

                preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1, newValue);
                preparedStatement.setLong(2, groupId);

                int updatedStudent = preparedStatement.executeUpdate();

                if (updatedStudent==1){
                    System.out.println("StudyGroup was updated successfully");
                    return true;
                }
                else
                    System.out.println("StudyGroup was not updated");
            }
            else
                System.out.println("Invalid column in StudyGroup table");

        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
            return false;
        }
        return false;
    }

    ////////// Student-Group Queries //////////

    // create student-studyGroup relation in DB
    // automatically closes connections after try block
//    public boolean addStudentGroupRelation(StudyGroup group) throws Exception {
//        try (Connection conn = connect()){
//
//            // continue here
//
//            // get the result of the SQL query
//            preparedStatement = conn.prepareStatement("insert into Study_Buddies_DB.studyGroups values (?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
//            preparedStatement.setLong(1, group.getGroupId());
//            preparedStatement.setString(2, group.getCourse());
//            preparedStatement.setInt(3, group.getCourseId());
//            preparedStatement.setInt(4, group.getMaxParticipants());
//            preparedStatement.setInt(5, group.getNumOfParticipants());
//            preparedStatement.setString(6, group.getCity());
//            preparedStatement.setString(7, group.getLocation());
//            preparedStatement.setString(8, group.getAdmin());
//
//            int recordAdded = preparedStatement.executeUpdate();
//
//            if (recordAdded ==1){
//                System.out.println("StudyGroup was added successfully");
//                return true;
//            }
//            else{
//                System.out.println("StudyGroup was not added");
//                return false;
//            }
//
//        } catch (Exception ex) {
//            System.out.println("Error: " + ex.toString());
//            return false;
//        }
//    }












}
