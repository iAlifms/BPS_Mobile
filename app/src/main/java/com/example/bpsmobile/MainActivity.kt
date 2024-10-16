package com.example.bpsmobile

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    //Deklarasi Variabel
    lateinit var webView: WebView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.myWV)

        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://bps.go.id/")
        val webSettings = webView.settings

        //Pengaturan agar javascript dan komponen web lainnya seperti bootstrap aktif
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true


    }

    override fun onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack()
        } else{
            super.onBackPressed()
        }


    }
}