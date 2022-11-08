package com.example.hacathonapp
//add a button that will open a second activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val first = findViewById<Button>(R.id.first)
        val account = findViewById<Button>(R.id.account)
        val loan = findViewById<Button>(R.id.loan)
        val sale = findViewById<Button>(R.id.sale)
        first.setOnClickListener(View.OnClickListener {
                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)
                startActivity(intent)

         })


    }
}