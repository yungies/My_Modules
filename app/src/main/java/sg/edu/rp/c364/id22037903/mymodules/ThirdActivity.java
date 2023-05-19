package sg.edu.rp.c364.id22037903.mymodules;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import sg.edu.rp.c364.id22037903.mymodules.R;

public class ThirdActivity extends AppCompatActivity {
    TextView tv2;
    TextView tv8;
    TextView tv9;
    TextView tv10;
    TextView tv11;
    TextView tv12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tv2 = findViewById(R.id.tv2);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);
        tv10 = findViewById(R.id.tv10);
        tv11 = findViewById(R.id.tv11);
        tv12 = findViewById(R.id.textView12);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("ModuleCode");
        tv2.setText("Module Code: " + moduleCode);

        String moduleName = intentReceived.getStringExtra("ModuleName");
        tv8.setText("Module Name: " + moduleName);

        int academicYear  = intentReceived.getIntExtra("AcademicYear",0);
        tv9.setText("Academic Year: " + academicYear);

        int semester  = intentReceived.getIntExtra("Semester",0);
        tv10.setText("Semester: " + semester);

        int moduleCredit  = intentReceived.getIntExtra("ModuleCredit",0);
        tv11.setText("Module Credit: " + moduleCredit);

        String venue = intentReceived.getStringExtra("Venue");
        tv12.setText("Venue: " + venue);
    }
}