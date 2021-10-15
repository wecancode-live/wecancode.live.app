package live.wecancode.app.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import live.wecancode.app.R;
import live.wecancode.app.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //Lets add the WebView
        WebView webView = root.findViewById(R.id.web_view_home);
        webView.loadUrl("http://wecancode.live/posts");

        // IMPORTANT: we have created webview but we need to have WebClient to be loaded inside the webview
        // WebViewController is the class we have to create and add our page loading to webclient.
        webView.setWebViewClient(new WebViewController());


        // We have to allow javascripts to work inside our android app webview.
        // only then our webpages can work properlly
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}