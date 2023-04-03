package com.example.midmorningsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Instantiate the user interface elements
    lateinit var mAnswer:TextView
    lateinit var mFnum:EditText
    lateinit var mAdd:Button
    lateinit var mSub:Button
    lateinit var mDiv:Button
    lateinit var mMult:Button
    lateinit var mSnum:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAnswer = findViewById(R.id.mTvAnswer)
        mFnum = findViewById(R.id.mEdtFirstNum)
        mSnum = findViewById(R.id.mEdtSecNumb)
        mAdd = findViewById(R.id.mBtnAdd)
        mDiv = findViewById(R.id.mBtnDiv)
        mMult = findViewById(R.id.mBtnMult)
        mSub = findViewById(R.id.mBtnSubtract)

        mAdd.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid number!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                //Display the answer on the textView answer
                mAnswer.text = jibu.toString()
            }
        }
        mSub.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid number!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                //Display the answer on the textView answer
                mAnswer.text = jibu.toString()
            }
        }
        mMult.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid number!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                //Display the answer on the textView answer
                mAnswer.text = jibu.toString()
            }
        }
        mDiv.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                //Display the answer on the textView answer
                mAnswer.text = "Please enter valid number!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                //Display the answer on the textView answer
                mAnswer.text = jibu.toString()
            }
        }
    }
}