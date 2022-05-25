package mary.dev.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class pgtwoactivity : AppCompatActivity() {
    lateinit var imageView6: ImageView
    lateinit var ettext3:EditText
    lateinit var ettext4:EditText
    lateinit var btnprevious:Button
    lateinit var btnnext1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pgtwoactivity)
        btnprevious = findViewById(R.id.btnprevious)
        btnprevious.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnnext1 = findViewById(R.id.btnnext1)
        btnnext1.setOnClickListener{
            val intent=Intent(this,pgthreeactivity::class.java)
            startActivity(intent)
        }
    }
}