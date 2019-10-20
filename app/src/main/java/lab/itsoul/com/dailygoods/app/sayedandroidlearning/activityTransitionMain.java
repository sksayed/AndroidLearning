package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.FillEventHistory;
import android.util.Log;
import android.view.View;

public class activityTransitionMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_main);
    }

    public void explodeTransitionByCode(View view) {
        Log.d("main" , "ekhane asche");
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i = new Intent(this , transitionActivity.class);
        i.putExtra(Constants.KEY_ANIM_TYPE , Constants.TransitionType.ExplodeJava);
        i.putExtra(Constants.KEY_TITLE , "Explode by java Code ");
        startActivity(i , options.toBundle());
    }

    public void explodeTransitionByXML(View view) {


    }

    public void SlideTransitionByCode(View view) {

        ActivityOptions options;
        options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i = new Intent(this, transitionActivity.class );
        i.putExtra(Constants.KEY_ANIM_TYPE , Constants.TransitionType.SlideJava);
        i.putExtra(Constants.KEY_TITLE , " Slide Transition by code ");
        startActivity(i , options.toBundle());

    }

    public void SlideTransitionByXML(View view) {
    }
}
