package id.gustonecrush.bookiesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        supportActionBar?.hide()

        btnBackListener()
        btnReadListener()
    }

    private fun btnBackListener() {
        ic_back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun btnReadListener() {
        btn_read.setOnClickListener {
            startActivity(Intent(this, ReadActivity::class.java))
        }
    }

}