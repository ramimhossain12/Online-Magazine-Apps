package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VanityMZActivity extends AppCompatActivity {

    private WebView webView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vanity_m_z);





        webView3 = findViewById(R.id.web3ID);

        WebSettings webSettings = webView3.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView3.setWebViewClient(new WebViewClient());

        webView3.loadUrl("https://www.vanityfair.com/");

    }

    @Override
    public void onBackPressed() {
        if (webView3.canGoBack()){

            webView3.goBack();

        }
        else {
            super.onBackPressed();
        }
    }
}
