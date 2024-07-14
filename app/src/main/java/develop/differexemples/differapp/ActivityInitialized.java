
package develop.differexemples.differapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.FacebookSdk;


public class ActivityInitialized extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initialized);

        Button button_initialized = findViewById(R.id.button_initialized);
        button_initialized.setOnClickListener(view -> {
            if (FacebookSdk.isInitialized()) {
                Log.d("MyLog ActivityInitialized", "SDK инициализирован");
            } else {
                Log.d("MyLog ActivityInitialized", "SDK не инициализирован");
            }
        });
    }
}
