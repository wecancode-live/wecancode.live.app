package live.wecancode.app.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("I have removed the old text and added new Message to display in my Android App Home Screen");
    }

    public LiveData<String> getText() {
        return mText;
    }
}