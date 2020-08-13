package com.example.homework_fragment_2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :BaseClass(), View.OnClickListener {
    private var etSite: EditText? = null
    private var etPhone: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        btnSite.setOnClickListener(this)
        btnPhone.setOnClickListener(this)


    }

    private fun setupViews() {
        etSite = findViewById(R.id.etSite)
        etPhone = findViewById(R.id.etPhone)
    }

    override fun onClick(view: View?) {
        val siteString = etSite?.text.toString()
        val phoneString = etPhone?.text.toString()
        when (view?.id) {
            R.id.btnSite ->{
                toastWeb("Переход по ссылке")
                startActivity(
                    Intent(Intent.ACTION_VIEW, Uri.parse("https://$siteString/")
                    )
                )
            }
            R.id.btnPhone -> {
                toastPhone("Переход к звонилке :)")
                startActivity(
                    Intent(Intent.ACTION_DIAL, Uri.parse("tel: $phoneString")
                    )
                )
            }
        }
    }
}
