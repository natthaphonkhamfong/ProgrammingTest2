/**
 * Created by pruet on 18/11/2559.
 */
public class Request implements IRequest {

    private  String StudentID;
    private  String CourseID;
    private  int RequestType;

    public static IRequest createRequest(int type, String studentID, String courseID) {


         IRequest ir = new Request(type,studentID,courseID);
        return ir;

        }


    protected Request()
    {
        throw new UnsupportedOperationException("Please override this method");
    }

    public Request(int type, String studentID, String courseID){
        this.setStudentID(studentID);
        this.setCourseID(courseID);
        this.setRequestType(type);
   }

    @Override
    public String getStudentID() {
        return this.StudentID;
    }

    @Override
    public String setStudentID(String studentID) {
        if(null == studentID) throw new RuntimeException("StudentID is null");
        this.StudentID = studentID;
        return this.StudentID;
    }

    @Override
    public String getCourseID() {
        return this.CourseID;
    }

    @Override
    public void setCourseID(String courseID) {
        if(null == courseID) throw new RuntimeException("CourseID is null");
        this.CourseID = courseID;

    }

    @Override
    public int getRequestType() {
        return this.RequestType;
    }
    @Override
    public void setRequestType(int type) {
        if(type!=2||type!=1) throw new RuntimeException("choose type 1 or 2");

        this.RequestType = type;
    }
}
