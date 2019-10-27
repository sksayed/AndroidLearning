package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class PickupPointFragment extends Fragment {

    private View view;
    private FloatingActionButton buttonBack;
    private TextView nextButton;

    private EditText searchLocation;
    private EditText searchLocationSuggestion;
    private EditText OwnerName;
    private EditText OwnerNumber;
    private EditText OwnerAddress;


    public PickupPointFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        this.view = inflater.inflate(R.layout.fragment_pickup_point, container, false);

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
        this.nextButton = view.findViewById(R.id.bottomLayoutTextViewId);
        this.searchLocation = view.findViewById(R.id.searchLayout_suggestion);
        this.searchLocationSuggestion = view.findViewById(R.id.editText_searchLocation_suggestion);
        this.OwnerName = view.findViewById(R.id.OwnerNameEditText);
        this.OwnerNumber = view.findViewById(R.id.OwnerNumber);
        this.OwnerAddress = view.findViewById(R.id.OwnerAddress);

    }


}
