package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NewYorkerMZActivity extends AppCompatActivity {
    private WebView webView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_yorker_m_z);




        webView5 = findViewById(R.id.web5ID);

        WebSettings webSettings = webView5.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView5.setWebViewClient(new WebViewClient());

        webView5.loadUrl("https://www.newyorker.com/?irclickid=QP-0IfyPjR3lV-swK-Q1-xttUki2IJUxqyPJRU0&irgwc=1&source=affiliate_impactpmx_12f6tote_desktop_Viglink%20Primary&utm_source=impact-affiliate&utm_medium=27795&utm_campaign=impact&utm_content=Subscribe%20to%20The%20New%20Yorker%20Now%20and%20Get%2012%20issues%20for%20%246&utm_brand=tny");

    }

    @Override
    public void onBackPressed() {
        if (webView5.canGoBack()){

            webView5.goBack();

        }
        else {
            super.onBackPressed();
        }
    }
}
