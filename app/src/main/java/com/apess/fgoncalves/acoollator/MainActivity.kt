package com.apess.fgoncalves.acoollator

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /**
         * Chama a função do cálculo ABV Cerveja
         */

        btn_calcular.setOnClickListener {

            abvCerveja()
        }

        /**
         * Redireciona botão Instagram
         */
        btnInstagram.setOnClickListener {
            val uris = Uri.parse("https://www.instagram.com/cozinhabrewer/")
            val intent = Intent(Intent.ACTION_VIEW, uris)
            startActivity(intent)
        }


    }


   private fun abvCerveja() {

       //var og:Double = 0.0
       //var fg:Double = 0.0

        val og = tx_og.text.toString().toInt()
        val fg = tx_fg.text.toString().toInt()


       if(og == 0 && fg == 0){
           Toast.makeText(this,"Insira os valores de OG e FG",Toast.LENGTH_SHORT).show()
       }else {


           val abv = ((og - fg) * 131.25) * 0.001


           txt_resultado.text = "ABV %.2f".format(abv) + "%"
       }


   }


}
