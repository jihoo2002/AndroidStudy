package com.cookandroid.project6_3

import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit internal var edtUrl : EditText
    lateinit internal var btnGo : Button
    lateinit internal var btnBack : Button
    lateinit internal var web : WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        edtUrl = findViewById<EditText>(R.id.edtUrl)
        btnGo = findViewById<Button>(R.id.btnGo)
        btnBack = findViewById<Button>(R.id.btnBack)
        web = findViewById<WebView>(R.id.webView1)

        web.webViewClient = CookWebViewClient()

        var webSet = web.settings
        webSet.builtInZoomControls = true

        btnGo.setOnClickListener {
            web.loadUrl(edtUrl.text.toString())
        }
        btnBack.setOnClickListener {
            web.goBack()
        }

        }




    class CookWebViewClient : WebViewClient() {
        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            return super.shouldOverrideUrlLoading(view, request)
        }
    }


    }
