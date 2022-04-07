package coding.insight.cleanuiloginregister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;

public class PendingAppointments extends AppCompatActivity {

    RecyclerView recyclerView;
    PendingAdapter pendingAdapter;
    FirebaseAuth fauth;
    String HospitalName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending_appointments);

        recyclerView=findViewById(R.id.pendingapplist);
        HospitalName = getIntent().getStringExtra("HospitalName");

        fauth=FirebaseAuth.getInstance();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        String ID= Objects.requireNonNull(fauth.getCurrentUser()).getUid();

        FirebaseRecyclerOptions<PendingModel> options=new FirebaseRecyclerOptions.Builder<PendingModel>()
                .setQuery(FirebaseDatabase.getInstance().getReference("PendingAppointments").orderByChild("Name").equalTo(HospitalName),PendingModel.class)
                .build();

        pendingAdapter=new PendingAdapter(options);
        recyclerView.setAdapter(pendingAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        pendingAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        pendingAdapter.stopListening();
    }

    public void onLoginClick(View view){
        startActivity(new Intent(getApplicationContext(),AcceptAppointments.class));
        overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);

    }
}