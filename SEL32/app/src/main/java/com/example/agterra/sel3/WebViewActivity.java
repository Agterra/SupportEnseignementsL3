package com.example.agterra.sel3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    private String lessonURL;

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_web_view);

        WebView webView = (WebView) findViewById(R.id.webView);

        this.webView = webView;

        Intent intent = getIntent();

        this.lessonURL = intent.getStringExtra("url");

        webView.loadUrl(this.lessonURL);

    }
}
