package com.example.shenf.hehaseoul;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by shenf on 2017/12/2.
 */

public class InsideWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
