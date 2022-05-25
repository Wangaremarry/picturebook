package mary.dev.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class pgfouractivity : AppCompatActivity() {
    lateinit var imageView8:ImageView
    lateinit var ettext7:EditText
    lateinit var ettext8:EditText
    lateinit var btnprevious2:Button
    lateinit var btnnext3:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pgfouractivity)
        btnprevious2 = findViewById(R.id.btnprevious2)
        btnprevious2.setOnClickListener{
            val intent= Intent(this,pgthreeactivity::class.java)
            startActivity(intent)
        }
        btnnext3 = findViewById(R.id.btnnext3)
        btnnext3.setOnClickListener{
            val intent= Intent(this,pgfiveactivity::class.java)
            startActivity(intent)
        }
    }
}