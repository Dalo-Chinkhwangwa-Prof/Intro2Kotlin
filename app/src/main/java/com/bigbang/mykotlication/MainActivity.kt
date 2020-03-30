package com.bigbang.mykotlication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    /*public void onCreate(Bundle savedInstanceState){
    }*/

    //var is mutable BUT val is immutable
    var carCost: Int? = 1
    val carPaintJob: Int = 0

//    lateinit var mainTextView: TextView

    lateinit var member: Member
    lateinit var memberKt: MemberKt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        mainTextView = findViewById(R.id.main_textview)

        member = Member("Dalo", "707")
        memberKt = MemberKt("Dalo", "707")

        carCost = 4
        var x = carCost?.plus(2)

        //Use of extension function addPrefix
        main_textview.text = "${memberKt.name.addPrefix()} was right.. his id is ${memberKt.memberID} cube of $carCost is ${carCost?.cube()}"//This is called string interpolation
        printArray()
    }

    //Extension function
    fun String.addPrefix(): String {
        return "Mr. $this"
    }

    //Extension function
    fun Int.cube(): Int {
        return (this*this*this)
    }


    //for loop
    fun printArray(){
        val seasonArray = mutableListOf<String>("Winter","Spring","Summer", "Fall")

        for(i in 0 until seasonArray.size)
            Log.d("TAG_X", seasonArray[i])
    }


    //Recap
    /*
    *   - Kotlin Synthetics
    *   - Data class
    *   - String interpolation
    *   - val vs var
    *   - fun in kotlin
    *   - ? symbol in Kotlin
    *   - let modifier
    *   - Extension functions
    *   - for loop in Kotlin
    *
    * */


}
