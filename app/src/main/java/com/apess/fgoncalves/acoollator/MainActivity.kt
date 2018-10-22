package com.apess.fgoncalves.acoollator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
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
    }

   private fun abvCerveja() {
        val og = tx_og.text.toString().toDouble()
        val fg = tx_fg.text.toString().toDouble()

        val abv = ((og - fg) * 131.25)*0.001

        txt_resultado.text = "ABV %.2f".format(abv) + "%"
    }


}
