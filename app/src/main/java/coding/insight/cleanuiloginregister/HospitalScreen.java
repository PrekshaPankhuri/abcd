package coding.insight.cleanuiloginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HospitalScreen extends AppCompatActivity {
    Button hosinfo,book;
    String HospitalID, HospitalName;
    Button DoctorInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_screen);

        hosinfo = findViewById(R.id.buttonhosinfo);
        DoctorInfo = findViewById(R.id.buttondoct);

        HospitalID = getIntent().getStringExtra("ID");
        HospitalName = getIntent().getStringExtra("Name");
        book=findViewById(R.id.bookings);

        hosinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HospitalScreen.this, HospitalInfoPop.class);
                intent.putExtra("ID",HospitalID);
                startActivity(intent);
            }
        });



        DoctorInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HospitalScreen.this, HosDoctorInfoPop.class);
                Log.e("HospitalName1",HospitalName);
                intent.putExtra("HosName",HospitalName);
                startActivity(intent);
            }
        });

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HospitalScreen.this, AcceptAppointments.class);
                intent.putExtra("HospitalName",HospitalName);
                startActivity(intent);
            }
        });

    }
}