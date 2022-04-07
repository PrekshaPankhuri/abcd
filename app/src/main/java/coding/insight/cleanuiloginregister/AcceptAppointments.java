package coding.insight.cleanuiloginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcceptAppointments extends AppCompatActivity {

    Button pending,booked;
    String HospitalName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accept_appointments);

        pending=findViewById(R.id.PendingAppointment);
        booked=findViewById(R.id.BookedAppointments);
        HospitalName = getIntent().getStringExtra("HospitalName");

        pending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcceptAppointments.this, PendingAppointments.class);
                intent.putExtra("HospitalName",HospitalName);
                startActivity(intent);
            }
        });

        booked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BookedAppointments.class));
            }
        });

    }

    public void onLoginClick(View view){
        startActivity(new Intent(getApplicationContext(),HospitalScreen.class));
        overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);

    }
}