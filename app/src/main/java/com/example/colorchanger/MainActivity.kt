package com.example.colorchanger

import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {
    private lateinit var spinner : Spinner
    private lateinit var text: TextView
    private lateinit var change:Button
    private lateinit var radioGroup: RadioGroup
    private lateinit var array : Array<String>

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner = findViewById(R.id.spinner)
        spinner.onItemSelectedListener = this
        text = findViewById(R.id.editText)
        var color: Int
        radioGroup = findViewById(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { _, isChecked ->
            color = when(isChecked){
                R.id.blue ->Color.BLUE
                R.id.red -> Color.RED
                R.id.green -> Color.GREEN
                else -> Color.BLACK
            }
           change = findViewById(R.id.button)
            change.setOnClickListener {
                if(text.text.isEmpty()){
                    Toast.makeText(this, "PLease type Something", Toast.LENGTH_LONG).show()
                }
                else {
                    text.setTextColor(color)
                }

            }

        }


         array = arrayOf("Sans_Sarif",
             "Argh",
            "Action_Man",
            "Action_Man_Bold",
            "Action_Man_Bold_Italic",
            "Action_Man_Extended",
            "Action_Man_Extended_Bold",
            "Action_Man_Extended_Bold_Italic",
            "Action_Man_Extended_Italic",
            "Action_Man_Italic",
            "Action_Man_Italic_Shaded",
            "Action_Man_Shaded",
            "Alice_Angular",
            "Anika_New_Basic_B",
            "Anika_New_Basic_B_I",
            "Anika_New_Basic_I",
            "Anika_New_Basic_R",
            "Better_Grade",
            "Darling_To_New")
        val adapters:ArrayAdapter<String>  = ArrayAdapter(this,android.R.layout.simple_spinner_item,array)
        adapters.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapters

    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        Toast.makeText(applicationContext,array[p2] , Toast.LENGTH_LONG).show()
        var typeFace :Typeface = resources.getFont(R.font.action_man)
        if(array[p2]=="Argh"){
             typeFace   = resources.getFont(R.font.aargh)
        }
        if(array[p2]=="Action_Man"){
            typeFace   = resources.getFont(R.font.action_man)
        }
        if(array[p2]=="Action_Man_Bold"){
            typeFace   = resources.getFont(R.font.action_man_bold)
        }
        if(array[p2]=="Action_Man_Bold_Italic"){
            typeFace   = resources.getFont(R.font.action_man_bold_italic)
        }
        if(array[p2]== "Action_Man_Extended"){
            typeFace   = resources.getFont(R.font.action_man_extended)
        }
        if(array[p2]=="Action_Man_Extended_Bold"){
            typeFace   = resources.getFont(R.font.aargh)
        }
        if(array[p2]=="Action_Man_Extended_Bold_Italic"){
            typeFace   = resources.getFont(R.font.action_man_extended_bold_italic)
        }
        if(array[p2]=="Action_Man_Extended_Italic"){
            typeFace   = resources.getFont(R.font.action_man_extended_italic)
        }
        if(array[p2]=="Action_Man_Italic"){
            typeFace   = resources.getFont(R.font.action_man_italic)
        }
        if(array[p2]=="Action_Man_Italic_Shaded"){
            typeFace   = resources.getFont(R.font.action_man_italic_shaded)
        }
        if(array[p2]=="Action_Man_Shaded"){
            typeFace   = resources.getFont(R.font.action_man_shaded)
        }
        if(array[p2]=="Anika_New_Basic_B"){
            typeFace   = resources.getFont(R.font.andikanewbasic_b)
        }
        if(array[p2]=="Anika_New_Basic_B_I"){
            typeFace   = resources.getFont(R.font.andikanewbasic_bi)
        }
        if(array[p2]=="Anika_New_Basic_I"){
            typeFace   = resources.getFont(R.font.andikanewbasic_i)
        }
        if(array[p2]=="Anika_New_Basic_R"){
            typeFace   = resources.getFont(R.font.andikanewbasic_r)
        }
        if(array[p2]=="Better_Grade"){
            typeFace   = resources.getFont(R.font.better_grade)
        }
        if(array[p2]=="Darling_To_New"){
            typeFace   = resources.getFont(R.font.darlingtonemo)
        }
        text.typeface = typeFace


    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        Toast.makeText(applicationContext, "Nothing selected,", Toast.LENGTH_LONG).show()

    }
}