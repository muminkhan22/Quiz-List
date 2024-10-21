package com.example.quiz

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.location.LocationRequestCompat.Quality
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quiz.databinding.ActivityPlayBinding

class playActivity : AppCompatActivity() {

    lateinit var binding: ActivityPlayBinding

    val quizlist = listOf<Quiz>(

        Quiz("Where is the capital of Bangladesh ?",
            " Dhaka",
            "Barisal",
            "Comilla",
            "Chittagong",
            "Dhaka"),

        Quiz("What is the former name of Barisal ?",
            "Chandradeep",
            "Noakhali",
            "Rajsahi",
            " Dhaka",
            "Chandradeep"),

        Quiz("How many divisions does Bangladesh have ?",
            "10",
            "5",
            "9",
            "8",
            "9"),


        Quiz("When is the victory day of Bengal ?",
            "21st February",
            "16th December",
            "15th August",
            "5th August",
            "16th December"),

        )

    var index=0
    var updatQuestion=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPlayBinding .inflate(layoutInflater)
        setContentView(binding.root)

        initQuestion()

    }

    private fun initQuestion() {

            val quiz= quizlist[index]

        binding.apply {
            textTV.text=quiz.question
            optionBtn1.text=quiz.option1
            optionBtn2.text=quiz.option2
            optionBtn3.text=quiz.option3
            optionBtn4.text=quiz.option4
        }
    }

    private fun shoNextQuestion(){
        checkAnswer()

        if(updatQuestion <quizlist.size)



    }

    private fun checkAnswer() {

    }
}