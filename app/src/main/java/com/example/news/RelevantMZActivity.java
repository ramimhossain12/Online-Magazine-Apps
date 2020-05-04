package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class RelevantMZActivity extends AppCompatActivity {


    private WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relevant_m_z);



        webView1 = findViewById(R.id.web1ID);

        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView1.setWebViewClient(new WebViewClient());

        webView1.loadUrl("https://relevantmagazine.com/");

    }

    @Override
    public void onBackPressed() {
        if (webView1.canGoBack()){

            webView1.goBack();

        }
        else {
            super.onBackPressed();
        }
    }
}
