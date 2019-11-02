package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.FillEventHistory;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  private Button bangladeshBtn , indiaButton , pakButton ;
  private Intent profileActivityIntent , SecondActivityIntent ;
  private TextView ansTV ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.bangladeshBtn = findViewById(R.id.banglades_button);
        this.indiaButton = findViewById(R.id.india_button);
        this.pakButton = findViewById(R.id.pakistan_button);
        this.ansTV = findViewById(R.id.mainActivityTextView);
    }

    public void clickOnBd(View view) {
        String about = view.toString();
        Toast toast = Toast.makeText(getApplicationContext() , "bangladesh button is clicked", Toast.LENGTH_SHORT);
        toast.show();
        System.out.println(about);

        this.profileActivityIntent.putExtra("name","Bangladesh");
        startActivity(this.profileActivityIntent);

    }

    public void clickOnIndia(View view) {
        Toast toast = Toast.makeText(getApplicationContext() , "India button is clicked ", Toast.LENGTH_SHORT);
        toast.show();

        this.profileActivityIntent.putExtra("name","India");
        startActivity(this.profileActivityIntent);

    }

    public void clickOnPak(View view) {
        Toast toast = Toast.makeText(getApplicationContext() , "Pakistan button is clicked ", Toast.LENGTH_SHORT);
        toast.show();

        this.profileActivityIntent.putExtra("name","Pakistan");
        startActivity(this.profileActivityIntent);

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder ;
        builder = new AlertDialog.Builder(MainActivity.this) ;

        builder.setIcon(R.drawable.question);
        builder.setTitle(R.string.question_button_title);
        builder.setCancelable(false);
        builder.setMessage(R.string.question_button_text);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }

    public void clickForSecondActivity(View view) {

        startActivityForResult(this.SecondActivityIntent , 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == 1 && requestCode == 1)
        {
            String value = data.getStringExtra("result");
            this.ansTV.setText(value);
        }
    }
}
