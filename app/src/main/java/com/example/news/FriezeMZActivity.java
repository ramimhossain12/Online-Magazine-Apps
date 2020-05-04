package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FriezeMZActivity extends AppCompatActivity {

    private WebView webView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frieze_m_z);


        webView4 = findViewById(R.id.web4ID);

        WebSettings webSettings = webView4.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView4.setWebViewClient(new WebViewClient());

        webView4.loadUrl("https://frieze.com/editorial");

    }

    @Override
    public void onBackPressed() {
        if (webView4.canGoBack()){

            webView4.goBack();

        }
        else {
            super.onBackPressed();
        }
    }
}
