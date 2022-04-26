package my.application.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button btnGoToMainAct = (Button) findViewById(R.id.btnGoToMainAct);

        View.OnClickListener oclbtnGoToMainAct = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Activity_2.this, MainActivity.class);
                startActivity(intent);

            }
        };

        btnGoToMainAct.setOnClickListener(oclbtnGoToMainAct);
    }
}