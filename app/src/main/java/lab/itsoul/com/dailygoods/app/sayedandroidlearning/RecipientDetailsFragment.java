package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class RecipientDetailsFragment extends Fragment {

    private View view;
    private FloatingActionButton buttonBack;
    private TextView continueButton;

    private EditText searchLocation;
    private EditText searchLocationSuggestion;
    private EditText recipentName;
    private EditText recipentNumber;
    private EditText recipentAddress;


    public RecipientDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.view = inflater.inflate(R.layout.fragment_receipient_details, container, false);

        initViews();

        initContents();

        initListeners();

        return view;
    }

    private void initListeners() {

    }

    private void initContents() {

    }

    private void initViews() {

        this.buttonBack = view.findViewById(R.id.fab);
        this.continueButton = view.findViewById(R.id.bottomLayoutTextViewId);
        this.searchLocation = view.findViewById(R.id.searchLayout_suggestion);
        this.searchLocationSuggestion = view.findViewById(R.id.editText_searchLocation_suggestion);
        this.recipentName = view.findViewById(R.id.RecipientNameEditText);
        this.recipentNumber = view.findViewById(R.id.RecipientNumber);
        this.recipentAddress = view.findViewById(R.id.RecipentAddress);

    }


}
