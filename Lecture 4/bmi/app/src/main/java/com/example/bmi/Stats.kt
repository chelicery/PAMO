package com.example.bmi

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class Stats : AppCompatActivity() {
    private var webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)
        webView = findViewById<View>(R.id.webview) as WebView?
        val webSettings: WebSettings = webView.getSettings()
        webSettings.setJavaScriptEnabled(true)

        //webView.loadUrl("https://news.google.com/covid19/map?hl=pl&gl=PL&ceid=PL:pl");
        webView.loadData("<div class=\"flourish-embed flourish-chart\" data-src=\"story/230110\"><script src=\"https://public.flourish.studio/resources/embed.js\"></script></div>\n", "text/html", "UTF-8")
    }
}