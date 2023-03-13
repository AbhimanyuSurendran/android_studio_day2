package abhimanyu.android_studio_day2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button_click;
    //NAME
    EditText editText_name;
    static String string_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_click=findViewById(R.id.click);
        //NAME
        editText_name=findViewById(R.id.name);
    }

    public void chandan(View view) {
        //NAME
        string_name=editText_name.getText().toString().trim();

        Intent intent_new = new Intent(MainActivity.this,Welcome.class);
        startActivity(intent_new);
    }
}