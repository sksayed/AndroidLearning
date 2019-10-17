package lab.itsoul.com.dailygoods.app.sayedandroidlearning.ui.send;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SendViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SendViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Tanvir bhai ekjon boss");
    }

    public LiveData<String> getText() {
        return mText;
    }
}