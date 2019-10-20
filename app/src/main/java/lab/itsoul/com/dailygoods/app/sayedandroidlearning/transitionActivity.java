package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Explode;
import android.transition.Slide;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.Button;

public class transitionActivity extends AppCompatActivity {

    Constants.TransitionType type;
    String toolBarTitle;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //if transition is not activated in the theme then
        // For AppCompact getWindow must be called before
        // super.onCreate and set content View

        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
        init();
        initAnimation();
        Log.d("transitionActivity", " ei jaigai asa important");
    }

    public void clickonGobackButton(View view) {
        finishAfterTransition();

    }

    public void init() {
        type = (Constants.TransitionType) getIntent().getSerializableExtra(Constants.KEY_ANIM_TYPE);
        this.toolBarTitle = getIntent().getExtras().getString(Constants.KEY_TITLE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(toolBarTitle);

    }


    @Override
    public boolean onSupportNavigateUp() {

        finishAfterTransition();
        return true;
    }


    void initAnimation() {
        switch (type) {
            case ExplodeJava: {
                Explode enterTransition = new Explode();
                enterTransition.setDuration(getResources().getInteger(R.integer.anim_duration_long));
                getWindow().setEnterTransition(enterTransition);
                break;
            }

            case SlideJava: {

                Slide enterTransition = new Slide();
                enterTransition.setSlideEdge(Gravity.BOTTOM);
                enterTransition.setDuration(getResources().getInteger(R.integer.anim_duration_long));
               //enterTransition.setInterpolator(new AnticipateOvershootInterpolator());
                getWindow().setEnterTransition(enterTransition);
                break;


            }


        }
    }

    public void clickOnEditPic(View view) {

    }
}

