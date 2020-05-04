package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AdAgeMZActivity extends AppCompatActivity {


    private WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_age_m_z);


        webView2 = findViewById(R.id.web2ID);

        WebSettings webSettings = webView2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView2.setWebViewClient(new WebViewClient());

        webView2.loadUrl("https://adage.com/");

    }

    @Override
    public void onBackPressed() {
         if (webView2.canGoBack()){

             webView2.goBack();

         }
         else {
             super.onBackPressed();
         }
    }
}
