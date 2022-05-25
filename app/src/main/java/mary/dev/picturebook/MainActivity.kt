package mary.dev.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var btnnext:Button
    lateinit var imageView4:ImageView
    lateinit var ettext1:EditText
    lateinit var ettext2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnnext = findViewById(R.id.btnnext)
        btnnext.setOnClickListener{
            val intent= Intent(this,pgtwoactivity::class.java)
            startActivity(intent)
        }
    }
}