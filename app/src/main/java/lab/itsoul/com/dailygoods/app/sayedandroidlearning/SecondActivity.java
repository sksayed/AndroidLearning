package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    Button submit;
    EditText name, password, email, contact, date;
    Intent backTomainPage ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        name = (EditText) findViewById(R.id.editText1);
        password = (EditText) findViewById(R.id.editText2);
        email = (EditText) findViewById(R.id.editText3);
        date = (EditText) findViewById(R.id.editText4);
        contact = (EditText) findViewById(R.id.editText5);
        submit = (Button) findViewById(R.id.button);

        this.backTomainPage = new Intent(SecondActivity.this , MainActivity.class);
    }

    public void clickForSecondActivity(View view) {

        StringBuilder sb = new StringBuilder();
        sb.append(this.name.getText().toString());
        sb.append("\n");
        sb.append(this.password.getText().toString());
        sb.append("\n");
        sb.append(this.email.getText().toString());
        sb.append("\n");
        sb.append(this.date.getText().toString());
        sb.append("\n");
        sb.append(this.contact.getText().toString());
        sb.append("\n");

        this.backTomainPage.putExtra("result", sb.toString());
        setResult(1 , this.backTomainPage);
        finish();

    }
}
