package com.shenfive.shenf.hehaseoul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebOne extends AppCompatActivity {



    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_one);
        webView = (WebView)findViewById(R.id.web);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webView.canGoBack();
        webView.setWebViewClient(new InsideWebViewClient());
        webView.loadUrl("http://www.hehaseoul.com/");

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (webView.getUrl().equals("http://www.hehaseoul.com/")) {
            this.finish();
        } else {
            webView.goBack();
        }

        return true;
    }
}
