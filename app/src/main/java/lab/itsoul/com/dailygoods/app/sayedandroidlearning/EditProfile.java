package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class EditProfile extends AppCompatActivity {


    private ImageButton myimagbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Edit Profile");

        Slide enterTransition = new Slide();
        enterTransition.setSlideEdge(Gravity.BOTTOM);
        enterTransition.setDuration(1000);
        enterTransition.setInterpolator( new AnticipateOvershootInterpolator());
        getWindow().setEnterTransition(enterTransition);

        myimagbutton = findViewById(R.id.edit_pic_id);
        SharedPreferences sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
        if (sharedPreferences.contains("image")) {


        } else {
            this.myimagbutton.setImageResource(R.drawable.bangladesh);
        }


    }

    @Override
    public boolean onSupportNavigateUp() {
        finishAfterTransition();
        return super.onSupportNavigateUp();
    }

    public void pressedOnSaveForProfile(View view) {


    }

    public void goToChoosePicture(View view) {

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent intent = new Intent(this , ChoosePicture.class);
        startActivity(intent , options.toBundle());
    }


    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
        if (sharedPreferences.contains("image")) {
            String path = sharedPreferences.getString("image" , "null");
            if ( path.equals("null")) {

            }else
            {
                File sd = Environment.getExternalStorageDirectory();
                File image = new File(sd+path, "hi");
                BitmapFactory.Options bmOptions = new BitmapFactory.Options();
                Bitmap bitmap = BitmapFactory.decodeFile(image.getAbsolutePath(),bmOptions);
                //bitmap = Bitmap.createScaledBitmap(bitmap,parent.getWidth(),parent.getHeight(),true);
                myimagbutton.setImageBitmap(bitmap);
            }

        }


    }
}
