package DB_Tables;

public class StudentCourseDB{
    private String username;
    private int courseId;

    public String getUserName(){
        return username;
    }

    public int getCourseId(){
        return courseId;
    }

    public void setUserName(String username){
        this.username = username;
    }

    public void setCourseId(int course_id){
        this.courseId = course_id;
    }



}