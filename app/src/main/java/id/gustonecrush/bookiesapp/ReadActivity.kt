package id.gustonecrush.bookiesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_details.ic_back
import kotlinx.android.synthetic.main.activity_read.*

class ReadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read)
        supportActionBar?.hide()

        btnBackListener()
    }

    private fun btnBackListener() {
        ic_back.setOnClickListener {
            startActivity(Intent(this, DetailsActivity::class.java))
        }
    }
}