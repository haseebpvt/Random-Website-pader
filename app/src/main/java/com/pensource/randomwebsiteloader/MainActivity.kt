package com.pensource.randomwebsiteloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    private val listSize = Links.LINKS.size

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.web_view)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener {
            val randomUrl = Links.LINKS[Random.nextInt(Links.LINKS.size)]
            webView.loadUrl(randomUrl)
        }
    }
}