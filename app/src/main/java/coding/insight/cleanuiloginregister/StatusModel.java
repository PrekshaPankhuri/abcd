package coding.insight.cleanuiloginregister;

public class StatusModel {

    String HospitalID,UserID,Problem,ProblemDescription,DoctorType,Date,Time;

    StatusModel(){}

    public StatusModel(String hospitalID, String userID, String problem, String problemDescription, String doctorType, String date, String time) {
        HospitalID = hospitalID;
        UserID = userID;
        Problem = problem;
        ProblemDescription = problemDescription;
        DoctorType = doctorType;
        Date = date;
        Time = time;
    }

    public String getHospitalID() {
        return HospitalID;
    }

    public void setHospitalID(String hospitalID) {
        HospitalID = hospitalID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getProblem() {
        return Problem;
    }

    public void setProblem(String problem) {
        Problem = problem;
    }

    public String getProblemDescription() {
        return ProblemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        ProblemDescription = problemDescription;
    }

    public String getDoctorType() {
        return DoctorType;
    }

    public void setDoctorType(String doctorType) {
        DoctorType = doctorType;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
