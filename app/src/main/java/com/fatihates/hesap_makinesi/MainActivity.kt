package com.fatihates.hesap_makinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.fatihates.hesap_makinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun sayisec(view: View) {
        if (yenioperator) {
            binding.sonuc.text = ""
        }
        yenioperator = false
        val butonsec = view as Button
        var butondeger: String = binding.sonuc.text.toString()

        when (butonsec.id) {
            binding.sifir.id -> {
                butondeger += "0"
            }

            binding.bir.id -> {
                butondeger += "1"
            }

            binding.iki.id -> {
                butondeger += "2"
            }

            binding.uc.id -> {
                butondeger += "3"
            }

            binding.dort.id -> {
                butondeger += "4"
            }

            binding.bes.id -> {
                butondeger += "5"
            }

            binding.alti.id -> {
                butondeger += "6"
            }

            binding.yedi.id -> {
                butondeger += "7"
            }

            binding.sekiz.id -> {
                butondeger += "8"
            }

            binding.dokuz.id -> {
                butondeger += "9"
            }
        }
        binding.sonuc.text = butondeger
    }

    var operator = " "
    var eskisayi = " "
    var yenioperator = true
    fun islem(islemsec: View) {
        val islemSec = islemsec as Button

        when (islemSec.id) {
            binding.carpi.id -> {
                operator = "*"
            }

            binding.bolme.id -> {
                operator = "/"
            }

            binding.arti.id -> {
                operator = "+"
            }

            binding.eksi.id -> {
                operator = "-"
            }
        }
        eskisayi = binding.sonuc.text.toString()
        yenioperator = true
    }

    fun ac(silmeislemi: View) {
        binding.sonuc.text = "0"
        yenioperator = true
    }

    fun esittir(esittir: View) {
        var yenisayi = binding.sonuc.text.toString()
        var islemsonucu: Double? = null
        when (operator) {
            "*" -> {
                islemsonucu = eskisayi.toDouble() * yenisayi.toDouble()
            }

            "/" -> {
                islemsonucu = eskisayi.toDouble() / yenisayi.toDouble()
            }

            "-" -> {
                islemsonucu = eskisayi.toDouble() - yenisayi.toDouble()
            }

            "+" -> {
                islemsonucu = eskisayi.toDouble() + yenisayi.toDouble()
            }
        }
        binding.sonuc.text = islemsonucu.toString()
        yenioperator = true
    }
}
