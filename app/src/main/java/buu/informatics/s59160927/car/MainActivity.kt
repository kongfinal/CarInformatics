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

    var Car = 1
    var numberCar1 = "empty"
    var numberCar2 = "empty"
    var numberCar3 = "empty"
    var brandCar1 = "empty"
    var brandCar2 = "empty"
    var brandCar3 = "empty"
    var nameCar1 = "empty"
    var nameCar2 = "empty"
    var nameCar3 = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numberEditText = findViewById<EditText>(R.id.number_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameEditText = findViewById<EditText>(R.id.name_edit)

        val numberTextView = findViewById<TextView>(R.id.number_text)
        val brandTextView = findViewById<TextView>(R.id.brand_text)
        val nameTextView = findViewById<TextView>(R.id.name_text)

        numberTextView.setBackgroundResource(R.color.colorCar1)
        brandTextView.setBackgroundResource(R.color.colorCar1)
        nameTextView.setBackgroundResource(R.color.colorCar1)

        numberEditText.visibility = View.GONE
        brandEditText.visibility = View.GONE
        nameEditText.visibility = View.GONE

        findViewById<Button>(R.id.car1_button).setOnClickListener {
            clickCar1(it)
        }
        findViewById<Button>(R.id.car2_button).setOnClickListener {
            clickCar2(it)
        }
        findViewById<Button>(R.id.car3_button).setOnClickListener {
            clickCar3(it)
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
        findViewById<Button>(R.id.update_button).setOnClickListener {
            addCar(it)
        }
        findViewById<Button>(R.id.delete_button).setOnClickListener {
            deleteCar(it)
        }
    }

    private fun setEditTextVisibilityGONE() {
        val numberEditText = findViewById<EditText>(R.id.number_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameEditText = findViewById<EditText>(R.id.name_edit)

        numberEditText.visibility = View.GONE
        brandEditText.visibility = View.GONE
        nameEditText.visibility = View.GONE
    }

    private fun setTextViewVisibilityVISIBLE() {
        val numberTextView = findViewById<TextView>(R.id.number_text)
        val brandTextView = findViewById<TextView>(R.id.brand_text)
        val nameTextView = findViewById<TextView>(R.id.name_text)

        numberTextView.visibility = View.VISIBLE
        brandTextView.visibility = View.VISIBLE
        nameTextView.visibility = View.VISIBLE
    }


    private fun setEmptyCar1() {
        val numberEditText = findViewById<EditText>(R.id.number_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameEditText = findViewById<EditText>(R.id.name_edit)

        setEditTextVisibilityGONE()

        if(numberCar1.equals("empty")){
            numberEditText.setText("")
        }else{
            numberEditText.setText(numberCar1)
        }

        if(brandCar1.equals("empty")){
            brandEditText.setText("")
        }else{
            brandEditText.setText(brandCar1)
        }

        if(nameCar1.equals("empty")){
            nameEditText.setText("")
        }else{
            nameEditText.setText(nameCar1)
        }

    }

    private fun setEmptyCar2() {
        val numberEditText = findViewById<EditText>(R.id.number_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameEditText = findViewById<EditText>(R.id.name_edit)

        setEditTextVisibilityGONE()

        if(numberCar2.equals("empty")){
            numberEditText.setText("")
        }else{
            numberEditText.setText(numberCar2)
        }

        if(brandCar2.equals("empty")){
            brandEditText.setText("")
        }else{
            brandEditText.setText(brandCar2)
        }

        if(nameCar2.equals("empty")){
            nameEditText.setText("")
        }else{
            nameEditText.setText(nameCar2)
        }

    }

    private fun setEmptyCar3() {
        val numberEditText = findViewById<EditText>(R.id.number_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameEditText = findViewById<EditText>(R.id.name_edit)

        setEditTextVisibilityGONE()

        if(numberCar3.equals("empty")){
            numberEditText.setText("")
        }else{
            numberEditText.setText(numberCar3)
        }

        if(brandCar3.equals("empty")){
            brandEditText.setText("")
        }else{
            brandEditText.setText(brandCar3)
        }

        if(nameCar3.equals("empty")){
            nameEditText.setText("")
        }else{
            nameEditText.setText(nameCar3)
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

        numberTextView.setBackgroundResource(R.color.colorCar1)
        brandTextView.setBackgroundResource(R.color.colorCar1)
        nameTextView.setBackgroundResource(R.color.colorCar1)

        setTextViewVisibilityVISIBLE()
        setEmptyCar1()
    }

    private fun clickCar2(view: View) {
        Car = 2
        val numberTextView = findViewById<TextView>(R.id.number_text)
        val brandTextView = findViewById<TextView>(R.id.brand_text)
        val nameTextView = findViewById<TextView>(R.id.name_text)

        numberTextView.text = numberCar2
        brandTextView.text = brandCar2
        nameTextView.text = nameCar2

        numberTextView.setBackgroundResource(R.color.colorCar2)
        brandTextView.setBackgroundResource(R.color.colorCar2)
        nameTextView.setBackgroundResource(R.color.colorCar2)

        setTextViewVisibilityVISIBLE()
        setEmptyCar2()
    }


    private fun clickCar3(view: View) {
        Car = 3
        val numberTextView = findViewById<TextView>(R.id.number_text)
        val brandTextView = findViewById<TextView>(R.id.brand_text)
        val nameTextView = findViewById<TextView>(R.id.name_text)

        numberTextView.text = numberCar3
        brandTextView.text = brandCar3
        nameTextView.text = nameCar3

        numberTextView.setBackgroundResource(R.color.colorCar3)
        brandTextView.setBackgroundResource(R.color.colorCar3)
        nameTextView.setBackgroundResource(R.color.colorCar3)

        setTextViewVisibilityVISIBLE()
        setEmptyCar3()
    }



    private fun addCar(view: View) {
        val numberEditText = findViewById<EditText>(R.id.number_edit)
        val numberTextView = findViewById<TextView>(R.id.number_text)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val brandTextView = findViewById<TextView>(R.id.brand_text)
        val nameEditText = findViewById<EditText>(R.id.name_edit)
        val nameTextView = findViewById<TextView>(R.id.name_text)

        setTextViewVisibilityVISIBLE()

        setEditTextVisibilityGONE()

        if(numberEditText.text.toString().equals("")){
            numberTextView.text = "empty"
        }else{
            numberTextView.text = numberEditText.text
        }

        if(brandEditText.text.toString().equals("")){
            brandTextView.text = "empty"
        }else{
            brandTextView.text = brandEditText.text
        }

        if(nameEditText.text.toString().equals("")){
            nameTextView.text = "empty"
        }else{
            nameTextView.text = nameEditText.text
        }

        if(Car == 1){
            numberCar1 = numberTextView.text.toString()
            brandCar1 =  brandTextView.text.toString()
            nameCar1 = nameTextView.text.toString()
        }else if(Car == 2){
            numberCar2 = numberTextView.text.toString()
            brandCar2 =  brandTextView.text.toString()
            nameCar2 = nameTextView.text.toString()
        }else{
            numberCar3 = numberTextView.text.toString()
            brandCar3 =  brandTextView.text.toString()
            nameCar3 = nameTextView.text.toString()
        }
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

        setEditTextVisibilityGONE()

        setTextViewVisibilityVISIBLE()

        numberTextView.setText("empty")
        brandTextView.setText("empty")
        nameTextView.setText("empty")

        numberEditText.setText("")
        brandEditText.setText("")
        nameEditText.setText("")

        if(Car == 1){
            numberCar1 = "empty"
            brandCar1 =  "empty"
            nameCar1 = "empty"
        }else if(Car == 2){
            numberCar2 = "empty"
            brandCar2 = "empty"
            nameCar2 = "empty"
        }else{
            numberCar3 = "empty"
            brandCar3 =  "empty"
            nameCar3 = "empty"
        }
    }
}
