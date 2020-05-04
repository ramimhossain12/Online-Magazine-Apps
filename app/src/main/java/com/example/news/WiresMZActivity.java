package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WiresMZActivity extends AppCompatActivity {

    private WebView webView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wires_m_z);




        webView6 = findViewById(R.id.web6ID);

        WebSettings webSettings = webView6.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView6.setWebViewClient(new WebViewClient());

        webView6.loadUrl("https://www.wired.com/");

    }

    @Override
    public void onBackPressed() {
        if (webView6.canGoBack()){

            webView6.goBack();

        }
        else {
            super.onBackPressed();
        }
    }
}

