package com.example.mahi4kuh

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button_plusA(view: View) {

        if (editText1A.text == null) {
            textViewRA.text = editTextA.text
        } else {
            val baf1 = textViewSA.text.toString()
            var baf2: Int = Integer.parseInt(baf1)
            var baF: Int = baf2
            baF++
            textViewSA.text = baF.toString()

            val ad1: String = editText1A.text.toString()
            var ad2: Int = Integer.parseInt(ad1)
            var result2: Int = ad2


            //var sum =ad2
            // sum=-ad2+1
            // textViewSA.text

            val a1: String = textViewRA.text.toString()
            val a2: Int = Integer.parseInt(a1)
            val result1: Int = a2

            val add1: String = editTextA.text.toString()
            var add2: Int = Integer.parseInt(add1)
            val result3: Int = add2




            if (result1 > 0) {
                val a = result2 + result1
                textViewRA.text = a.toString()

            } else {
                val a = (result2 + result3) + result1
                textViewRA.text = a.toString()

            }
            editText1A.text = null
        }
        /*
        baf++
        val button_plusA = Integer.toString(baf)
        textViewSA.text="Всього бафів $baf"



        */
    }

    fun button_minusA(view: View) {

        val baf1 = textView8.text.toString()
        var baf2: Int = Integer.parseInt(baf1)
        var baF: Int = baf2
        baF++
        textView8.text = baF.toString()

        val a1: String = textViewRA.text.toString()
        val a2: Int = Integer.parseInt(a1)
        val result1: Int = a2

        val addd1: String = editTextA.text.toString()
        val addd2: Int = Integer.parseInt(addd1)
        val result3: Int = addd2

        val ad1: String = editText2A.text.toString()
        val ad2: Int = Integer.parseInt(ad1)
        val result2: Int = ad2

        if (result1 > 0) {
            val a = result1 - result2
            textViewRA.text = a.toString()
        } else {
            val a = (result1 + result3) - result2
            textViewRA.text = a.toString()
        }
        editText2A.text = null
    }

    fun button_plusO(view: View) {

        val baf1 = TextViewSO.text.toString()
        var baf2: Int = Integer.parseInt(baf1)
        var baF: Int = baf2
        baF++
        TextViewSO.text = baF.toString()

        val a1: String = textViewRO.text.toString()
        val a2: Int = Integer.parseInt(a1)
        val result1: Int = a2

        val ad1: String = editText3O.text.toString()
        val ad2: Int = Integer.parseInt(ad1)
        val result2: Int = ad2

        val add1: String = editTextO.text.toString()
        val add2: Int = Integer.parseInt(add1)
        val result3: Int = add2

        if (result1 > 0) {
            val a = result2 + result1
            textViewRO.text = a.toString()
        } else {
            val a = (result2 + result3) + result1
            textViewRO.text = a.toString()
        }
        editText3O.text = null
    }

    fun button_minusO(view: View) {
        val baf1 = textViewS1A.text.toString()
        var baf2: Int = Integer.parseInt(baf1)
        var baF: Int = baf2
        baF++
        textViewS1A.text = baF.toString()

        val a1: String = textViewRO.text.toString()
        val a2: Int = Integer.parseInt(a1)
        val result1: Int = a2

        val addd1: String = editTextO.text.toString()
        val addd2: Int = Integer.parseInt(addd1)
        val result3: Int = addd2

        val ad1: String = editText4O.text.toString()
        val ad2: Int = Integer.parseInt(ad1)
        val result2: Int = ad2

        if (result1 > 0) {
            val a = result1 - result2
            textViewRO.text = a.toString()
        } else {
            val a = (result1 + result3) - result2
            textViewRO.text = a.toString()
        }
        editText4O.text = null
    }

    fun button_fight(view: View) {

        val o1: String = textViewRO.text.toString()
        val o2: Int = Integer.parseInt(o1)
        val resultO: Int = o2

        val a1: String = textViewRA.text.toString()
        val a2: Int = Integer.parseInt(a1)
        val resultA: Int = a2

        if (resultA > resultO) {

            val r: Int = resultA - resultO
            val rt = Toast.makeText(this, "Переміг Манічкин з розривом $r", Toast.LENGTH_LONG)
            rt.show()
        } else if (resultA ==0 && resultO ==0) {
            val o1: String = editTextO.text.toString()
            val o2: Int = Integer.parseInt(o1)
            val resultO: Int = o2

            val a1: String = editTextA.text.toString()
            val a2: Int = Integer.parseInt(a1)
            val resultA: Int = a2

            if (resultA > resultO) {
                val r: Int = resultA - resultO
                val rt = Toast.makeText(this, "Переміг Манічкин з розривом $r", Toast.LENGTH_LONG)
                rt.show()
            }else{
                val r: Int = resultO - resultA
                val rt = Toast.makeText(this, "Переміг Монстр з розривом в $r", Toast.LENGTH_SHORT)
                rt.show()
            }
        }
        else {

            val r: Int = resultO - resultA
            val rt = Toast.makeText(this, "Переміг Монстр з розривом в $r", Toast.LENGTH_SHORT)
            rt.show()
        }
    }


fun button_new(view: View){

 val a1: String = textViewRA.text.toString()
 val a2: Int = Integer.parseInt(a1)
 var result1: Int = a2
 result1=0
 textViewRA.text=result1.toString()

 val aa1: String = textViewRO.text.toString()
 val aa2: Int = Integer.parseInt(aa1)
 var result2: Int = aa2
 result2=0
 textViewRO.text=result2.toString()

 val ad1: String = textViewSA.text.toString()
 val ad2: Int = Integer.parseInt(ad1)
 var resultd1: Int = ad2
 resultd1=0
 textViewSA.text=result1.toString()

 val add1: String = TextViewSO.text.toString()
 val add2: Int = Integer.parseInt(add1)
 var resultdd1: Int = add2
 resultdd1=0
 TextViewSO.text=result1.toString()

 editTextA.text=null
 editTextO.text=null


}
}