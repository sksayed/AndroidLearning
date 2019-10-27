package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ConfirmDeliveryLocation extends Fragment {

    View view ;
    private TextView deliveryAddress ;
    private TextView requestDeliveryButton ;

    private EditText name ;
    private EditText phoneNumber ;
    private EditText address ;

    private FloatingActionButton backButton ;




    public ConfirmDeliveryLocation ()
    {
        //Required public empty constructor
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       this.view = inflater.inflate(R.layout.fragment_confirm_delivary_locations , container , false);

        initViews();

        initContents();

        initListeners();

        return view ;
    }

    private void initListeners() {
    }

    private void initContents() {
    }

    private void initViews() {

        this.name = view.findViewById(R.id.RecipientNameEditText);
        this.phoneNumber = view.findViewById(R.id.RecipientNumber);
        this.address = view.findViewById(R.id.RecipentAddress);

        this.backButton = view.findViewById(R.id.fab);
        this.requestDeliveryButton = view.findViewById(R.id.bottomLayoutTextViewId);
        this.deliveryAddress = view.findViewById(R.id.deliveryAddressTV);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}
