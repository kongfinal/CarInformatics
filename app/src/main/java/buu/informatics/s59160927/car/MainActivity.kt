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

    var Car = 0
    var numberCar1:String = ""
    var numberCar2 = ""
    var numberCar3 = ""
    var brandCar1 = ""
    var brandCar2 = ""
    var brandCar3 = ""
    var nameCar1 = ""
    var nameCar2 = ""
    var nameCar3 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.car1_button).setOnClickListener {
            clickCar1(it)
        }
        findViewById<Button>(R.id.car2_button).setOnClickListener {
            clickCar2(it)
        }
        findViewById<Button>(R.id.car3_button).setOnClickListener {
            clickCar3(it)
        }
        findViewById<Button>(R.id.update_button).setOnClickListener {
            addCar(it)
        }
        findViewById<TextView>(R.id.number_text).setOnClickListener {
            updateNumber(it)
        }
        findViewById<TextView>(R.id.brand_text).setOnClickListener {
            updateBrand(it)
        }
        findViewById<TextView>(R.id.name_text).setOnClickListener {
            updateName(it)
        }
    }

    private fun clickCar1(view: View) {
        Car = 1
        val numberTextView = findViewById<TextView>(R.id.number_text)
        val brandTextView = findViewById<TextView>(R.id.brand_text)
        val nameTextView = findViewById<TextView>(R.id.name_text)

        numberTextView.text = numberCar1
        brandTextView.text = brandCar1
        nameTextView.text = nameCar1
    }

    private fun clickCar2(view: View) {
        Car = 2
        val numberTextView = findViewById<TextView>(R.id.number_text)
        val brandTextView = findViewById<TextView>(R.id.brand_text)
        val nameTextView = findViewById<TextView>(R.id.name_text)

        numberTextView.text = numberCar2
        brandTextView.text = brandCar2
        nameTextView.text = nameCar2
    }

    private fun clickCar3(view: View) {
        Car = 3
        val numberTextView = findViewById<TextView>(R.id.number_text)
        val brandTextView = findViewById<TextView>(R.id.brand_text)
        val nameTextView = findViewById<TextView>(R.id.name_text)

        numberTextView.text = numberCar3
        brandTextView.text = brandCar3
        nameTextView.text = nameCar3
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

        if(Car == 1){
            numberCar1 = numberEditText.text.toString()
            brandCar1 =  brandEditText.text.toString()
            nameCar1 = nameEditText.text.toString()
        }else if(Car == 2){
            numberCar2 = numberEditText.text.toString()
            brandCar2 =  brandEditText.text.toString()
            nameCar2 = nameEditText.text.toString()
        }else{
            numberCar3 = numberEditText.text.toString()
            brandCar3 =  brandEditText.text.toString()
            nameCar3 = nameEditText.text.toString()
        }
    }

    private fun updateNumber (view: View) {
        val numberEditText = findViewById<EditText>(R.id.number_edit)
        numberEditText.visibility = View.VISIBLE
        numberEditText.requestFocus()

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(numberEditText, 0)
    }

    private fun updateBrand (view: View) {
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        brandEditText.visibility = View.VISIBLE
        brandEditText.requestFocus()

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(brandEditText, 0)
    }

    private fun updateName (view: View) {
        val nameEditText = findViewById<EditText>(R.id.name_edit)
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

        if(Car == 1){
            numberCar1 = ""
            brandCar1 =  ""
            nameCar1 = ""
        }else if(Car == 2){
            numberCar2 = ""
            brandCar2 =  ""
            nameCar2 = ""
        }else{
            numberCar3 = ""
            brandCar3 =  ""
            nameCar3 = ""
        }
    }
}
