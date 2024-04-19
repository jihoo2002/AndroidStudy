package com.cookandroid.project4_2

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var text1 : TextView
    lateinit var text2 : TextView
    lateinit var chkAgree : CheckBox
    lateinit var rGroup1 : RadioGroup
    lateinit var rdoDog : RadioButton
    lateinit var rdoCat : RadioButton
    lateinit var rdoRabbit : RadioButton
    lateinit var btnOk : Button
    lateinit var imgPet : ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
      title = "애완동물 사진 보기"

        text1 = findViewById<TextView>(R.id.Text1)
        chkAgree = findViewById<CheckBox>(R.id.ChkAgree)

        text2 = findViewById<TextView>(R.id.Text2)
        rGroup1 = findViewById<RadioGroup>(R.id.Rgroup1)
        rdoDog = findViewById<RadioButton>(R.id.RdoDog)
        rdoCat = findViewById<RadioButton>(R.id.RdoCat)
        rdoRabbit = findViewById<RadioButton>(R.id.RdoRabbit)


        btnOk = findViewById<Button>(R.id.BtnOk)
        imgPet = findViewById<ImageView>(R.id.ImgPet)



      chkAgree.setOnClickListener{

          if(chkAgree.isChecked == true) {
              text2.visibility = android.view.View.VISIBLE
              rGroup1.visibility = android.view.View.VISIBLE
              btnOk.visibility =  android.view.View.VISIBLE
              imgPet.visibility =  android.view.View.VISIBLE
          }else {
              text2.visibility =  android.view.View.INVISIBLE
              rGroup1.visibility =  android.view.View.INVISIBLE
              btnOk.visibility =  android.view.View.INVISIBLE
              imgPet.visibility =  android.view.View.INVISIBLE
          }

      }

        btnOk.setOnClickListener {
            when(rGroup1.checkedRadioButtonId) {
                R.id.RdoDog -> imgPet.setImageResource(R.drawable.dog)
                R.id.RdoCat -> imgPet.setImageResource(R.drawable.cat)
                R.id.RdoRabbit -> imgPet.setImageResource(R.drawable.rabbit)
                else -> Toast.makeText(applicationContext,
                    "동물 먼저 선택하세요", Toast.LENGTH_SHORT
                    ).show()
            }
        }





    }
}