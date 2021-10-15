package live.wecancode.app.ui.home;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewController extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        // This way when a link is clicked we can load the page in our app itself
        view.loadUrl(request.getUrl().toString());
        return true;
    }

    //If you are building app for older version of android.
    // such as older than Android 7.0, then use the below deprecated method.
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
