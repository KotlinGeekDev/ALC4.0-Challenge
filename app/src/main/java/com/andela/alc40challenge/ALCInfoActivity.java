package com.andela.alc40challenge;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ALCInfoActivity extends AppCompatActivity {

    private String mUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcinfo);

        ActionBar actionBar = getSupportActionBar();

        mUrl = "https://andela.com/alc/";

        WebView browser = findViewById(R.id.alc_about_page);

        browser.getSettings().setJavaScriptEnabled(true);
        browser.getSettings().setBuiltInZoomControls(true);
        browser.setWebViewClient(new SSLWebViewClient());

        browser.loadUrl(mUrl);



    }


    private class SSLWebViewClient extends WebViewClient {
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed();
        }
    }
}
