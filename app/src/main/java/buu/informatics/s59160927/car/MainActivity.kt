package buu.informatics.s59160927.car

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.update_button).setOnClickListener {
            addCar(it)
        }
    }

    private fun addCar(view: View) {
        val numberEditText = findViewById<EditText>(R.id.number_edit)
        val numberTextView = findViewById<TextView>(R.id.number_text)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val brandTextView = findViewById<TextView>(R.id.brand_text)
        val nameEditText = findViewById<EditText>(R.id.name_edit)
        val nameTextView = findViewById<TextView>(R.id.name_text)
        numberTextView.text = numberEditText.text
        numberEditText.visibility = View.GONE
        numberTextView.visibility = View.VISIBLE
        brandTextView.text = brandEditText.text
        brandEditText.visibility = View.GONE
        brandTextView.visibility = View.VISIBLEMy
        nameTextView.text = nameEditText.text
        nameEditText.visibility = View.GONE
        nameTextView.visibility = View.VISIBLE
    }
}
