package mary.dev.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class pgfiveactivity : AppCompatActivity() {
    lateinit var imageView3:ImageView
    lateinit var btnprevious3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pgfiveactivity2)
        btnprevious3 = findViewById(R.id.btnprevious3)
        btnprevious3.setOnClickListener{
            val intent= Intent(this,pgfouractivity::class.java)
            startActivity(intent)
        }
    }
}