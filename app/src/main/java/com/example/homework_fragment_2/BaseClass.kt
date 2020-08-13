package com.example.homework_fragment_2

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

abstract class BaseClass:AppCompatActivity() {

        protected fun toastWeb (string : String){
            Toast.makeText(applicationContext,string, Toast.LENGTH_LONG).show()
        }
        protected fun toastPhone(string : String){
            Toast.makeText(applicationContext,string, Toast.LENGTH_LONG).show()
        }


}