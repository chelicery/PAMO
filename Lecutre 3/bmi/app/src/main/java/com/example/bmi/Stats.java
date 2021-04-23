package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class Stats extends AppCompatActivity {
    private WebView webView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        this.webView = (WebView) findViewById(R.id.webview);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //webView.loadUrl("https://news.google.com/covid19/map?hl=pl&gl=PL&ceid=PL:pl");
        webView.loadData("<div class=\"flourish-embed flourish-chart\" data-src=\"story/230110\"><script src=\"https://public.flourish.studio/resources/embed.js\"></script></div>\n", "text/html", "UTF-8");
    }
}