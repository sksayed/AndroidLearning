package lab.itsoul.com.dailygoods.app.sayedandroidlearning;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class LoginActivity extends AppCompatActivity {

    Intent navigationWindowIntent ;
    private TextView loadTextView;
    private Button saveButton, loadButton;
    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ui);
        this.username = findViewById(R.id.usernameEditTextId);
        this.password = findViewById(R.id.passwordEditTextId);
        this.saveButton = findViewById(R.id.saveButtonId);
        this.loadButton = findViewById(R.id.loadButtonId);
        this.loadTextView = findViewById(R.id.loadViewTextId);
        this.navigationWindowIntent = new Intent(this , NavigationDashboard.class);

    }

    public void pressedOnSave(View view) {


        String uName, pass;
        uName = this.username.getText().toString();
        pass = this.password.getText().toString();

        if (uName.equals("") && pass.equals("")) {
            Toast.makeText(getApplicationContext(), "Please enter value ", Toast.LENGTH_SHORT).show();
        } else {
            SharedPreferences preferences = getSharedPreferences("Login", MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("username", uName);
            editor.putString("password", pass);
            this.username.setText("");
            this.password.setText("");
            editor.commit();
            startActivity(this.navigationWindowIntent);
            Toast.makeText(getApplicationContext(), "saved ", Toast.LENGTH_SHORT).show();
        }

    }


    public void pressedOnLoad(View view) {

        SharedPreferences sharedPreferences = getSharedPreferences("Login", MODE_PRIVATE);
        if (sharedPreferences.contains("username") && sharedPreferences.contains("password")) {
            StringBuilder sb = new StringBuilder();
            sb.append(sharedPreferences.getString("username", " no data was found "));
            sb.append("\n");
            sb.append(sharedPreferences.getString("password", " no data was found"));
            this.loadTextView.setText(sb);

        }

    }
}
