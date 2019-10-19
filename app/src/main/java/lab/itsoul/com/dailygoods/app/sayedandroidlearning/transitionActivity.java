package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class transitionActivity extends AppCompatActivity implements Button.OnClickListener{

    Constants.TransitionType type ;
    String toolBarTitle ;
    Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

    //if transition is not activated in the theme then
    // For AppCompact getWindow must be called before
    // super.onCreate and set content View


        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
    }

    public void clickonGobackButton(View view) {

    }

    public void init ()
    {
        type = (Constants.TransitionType) getIntent().getSerializableExtra(Constants.KEY_ANIM_TYPE);
        this.toolBarTitle = getIntent().getExtras().getString(Constants.KEY_TITLE);
        this.button.setOnClickListener(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(toolBarTitle);

    }

    @Override
    public void onClick(View v) {
        finishAfterTransition();
    }

    @Override
    public boolean onSupportNavigateUp() {

        finishAfterTransition();
        return true ;
    }
}
