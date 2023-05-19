package sg.edu.rp.c364.id22037903.mymodules;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import sg.edu.rp.c364.id22037903.mymodules.R;

public class SecondActivity extends AppCompatActivity {
    TextView tvAnswer;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    TextView tv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.tv1);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("ModuleCode");
        tvAnswer.setText("Module Code: " + moduleCode);

        String moduleName = intentReceived.getStringExtra("ModuleName");
        tv3.setText("Module Name: " + moduleName);

        int academicYear  = intentReceived.getIntExtra("AcademicYear",0);
        tv4.setText("Academic Year: " + academicYear);

        int semester  = intentReceived.getIntExtra("Semester",0);
        tv5.setText("Semester: " + semester);

        int moduleCredit  = intentReceived.getIntExtra("ModuleCredit",0);
        tv6.setText("Module Credit: " + moduleCredit);

        String venue = intentReceived.getStringExtra("Venue");
        tv7.setText("Venue: " + venue);
    }
}