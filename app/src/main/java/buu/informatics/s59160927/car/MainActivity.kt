package buu.informatics.s59160927.car

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var Car: Integer
    private lateinit var numberCar1: String
    private lateinit var numberCar2: String
    private lateinit var numberCar3: String
    private lateinit var brandCar1 : String
    private lateinit var brandCar2: String
    private lateinit var brandCar3: String
    private lateinit var nameCar1: String
    private lateinit var nameCar2: String
    private lateinit var nameCar3: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.number_text).setOnClickListener {
            updateNumber(it)
        }
        findViewById<TextView>(R.id.brand_text).setOnClickListener {
            updateBrand(it)
        }
        findViewById<TextView>(R.id.name_text).setOnClickListener {
            updateName(it)
        }
        findViewById<Button>(R.id.update_button).setOnClickListener {
            addCar(it)
        }
        findViewById<Button>(R.id.delete_button).setOnClickListener {
            deleteCar(it)
        }
    }

    private fun clickCar1(view: View) {
        //Car = 1
        val numberTextView = findViewById<TextView>(R.id.number_text)
        val brandTextView = findViewById<TextView>(R.id.brand_text)
        val nameTextView = findViewById<TextView>(R.id.name_text)

        val numberEditText = findViewById<EditText>(R.id.number_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameEditText = findViewById<EditText>(R.id.name_edit)

        numberTextView.text = numberCar1
        brandTextView.text = brandCar1
        nameTextView.text = nameCar1

        numberTextView.visibility = View.VISIBLE
        brandTextView.visibility = View.VISIBLE
        nameTextView.visibility = View.VISIBLE
    }

    private fun clickCar2(view: View) {
        //Car = 2
        val numberTextView = findViewById<TextView>(R.id.number_text)
        val brandTextView = findViewById<TextView>(R.id.brand_text)
        val nameTextView = findViewById<TextView>(R.id.name_text)

        numberTextView.text = numberCar2
        brandTextView.text = brandCar2
        nameTextView.text = nameCar2

        numberTextView.visibility = View.VISIBLE
        brandTextView.visibility = View.VISIBLE
        nameTextView.visibility = View.VISIBLE
    }


    private fun clickCar3(view: View) {
        //Car = 3
        val numberTextView = findViewById<TextView>(R.id.number_text)
        val brandTextView = findViewById<TextView>(R.id.brand_text)
        val nameTextView = findViewById<TextView>(R.id.name_text)

        numberTextView.text = numberCar3
        brandTextView.text = brandCar3
        nameTextView.text = nameCar3

        numberTextView.visibility = View.VISIBLE
        brandTextView.visibility = View.VISIBLE
        nameTextView.visibility = View.VISIBLE
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
        brandTextView.visibility = View.VISIBLE

        nameTextView.text = nameEditText.text
        nameEditText.visibility = View.GONE
        nameTextView.visibility = View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(brandEditText, 0)
    }

    private fun updateNumber (view: View) {
        val numberEditText = findViewById<EditText>(R.id.number_edit)
        val numberTextView = findViewById<TextView>(R.id.number_text)

        //numberEditText.text =
        numberTextView.visibility = View.GONE
        numberEditText.visibility = View.VISIBLE
        numberEditText.requestFocus()

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(numberEditText, 0)
    }

    private fun updateBrand (view: View) {
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val brandTextView = findViewById<TextView>(R.id.brand_text)

        brandTextView.visibility = View.GONE
        brandEditText.visibility = View.VISIBLE
        brandEditText.requestFocus()

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(brandEditText, 0)
    }

    private fun updateName (view: View) {
        val nameEditText = findViewById<EditText>(R.id.name_edit)
        val nameTextView = findViewById<TextView>(R.id.name_text)

        nameTextView.visibility = View.GONE
        nameEditText.visibility = View.VISIBLE
        nameEditText.requestFocus()

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(nameEditText, 0)
    }

    private fun deleteCar(view: View) {
        val numberEditText = findViewById<EditText>(R.id.number_edit)
        val numberTextView = findViewById<TextView>(R.id.number_text)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val brandTextView = findViewById<TextView>(R.id.brand_text)
        val nameEditText = findViewById<EditText>(R.id.name_edit)
        val nameTextView = findViewById<TextView>(R.id.name_text)

        numberEditText.text = null
        brandEditText.text = null
        nameEditText.text = null

        numberTextView.text = ""
        brandTextView.text = ""
        nameTextView.text = ""


    }
}
