package coding.insight.cleanuiloginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Accepting extends AppCompatActivity {

    String Name,AppID,UserID,HospitalID,Problem,ProblemDescription,Date,Time,DoctorType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accepting);
        Name=getIntent().getStringExtra("Name");
        AppID=getIntent().getStringExtra("AppID");
        UserID=getIntent().getStringExtra("UserID");
        HospitalID=getIntent().getStringExtra("HospitalID");
        Problem=getIntent().getStringExtra("ProblemDescription");
        ProblemDescription=getIntent().getStringExtra("Date");
        Date=getIntent().getStringExtra("Date");
        Time=getIntent().getStringExtra("Time");
        DoctorType=getIntent().getStringExtra("DoctorType");
    }
}