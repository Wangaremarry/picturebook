package mary.dev.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class pgthreeactivity : AppCompatActivity() {
    lateinit var imageView7:ImageView
    lateinit var ettext5:EditText
    lateinit var ettext6:EditText
    lateinit var ettext10:EditText
    lateinit var btnprevious1:Button
    lateinit var btnnext2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pgthreeactivity)
        btnprevious1 = findViewById(R.id.btnprevious1)
        btnprevious1.setOnClickListener{
            val intent= Intent(this,pgtwoactivity::class.java)
            startActivity(intent)
        }
        btnnext2 = findViewById(R.id.btnnext2)
        btnnext2.setOnClickListener{
            val intent= Intent(this,pgfouractivity::class.java)
            startActivity(intent)
        }
    }
}