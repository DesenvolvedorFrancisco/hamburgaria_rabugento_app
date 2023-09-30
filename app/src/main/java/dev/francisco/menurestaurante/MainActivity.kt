package dev.francisco.menurestaurante

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import dev.francisco.menurestaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val precoHamburger: Long = 2000
    private val precoCachorro: Long = 1000
    private val precoGelado: Long = 750
    private val precoRefrigerante: Long = 600
    private val precoAgua: Long = 200


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonPedido.setOnClickListener {
            val i = Intent(this,SplashScreenActivity::class.java)
            i.putExtra("quant_hamburger", binding.EditQuantidadeHamburger.text.toString())
            i.putExtra("quant_cachorro", binding.EditQuantidadeCachorro.text.toString())
            i.putExtra("quant_gelado", binding.EditQuantidadeGelado.text.toString())
            i.putExtra("quant_refrigerante", binding.EditQuantidadeRefrigerante.text.toString())
            i.putExtra("quant_agua", binding.EditQuantidadeAgua.text.toString())
            i.putExtra("preco_hamburger", precoHamburger)
            i.putExtra("preco_cachorro", precoCachorro)
            i.putExtra("preco_gelado", precoGelado)
            i.putExtra("preco_refrigerante", precoRefrigerante)
            i.putExtra("preco_agua", precoAgua)
            startActivity(i)
        }

        binding.checkHamburger.setOnClickListener {
            if (binding.checkHamburger.isChecked()) {
                binding.EditQuantidadeHamburger.setText("1")
                binding.textPrecoHamburger.visibility = View.VISIBLE
            } else {
                binding.EditQuantidadeHamburger.setText("0")
                binding.textPrecoHamburger.visibility = View.GONE
            }
        }

        binding.checkCachorro.setOnClickListener {
            if (binding.checkCachorro.isChecked()) {
                binding.EditQuantidadeCachorro.setText("1")
                binding.textPrecoPao.visibility = View.VISIBLE
            } else {
                binding.EditQuantidadeCachorro.setText("0")
                binding.textPrecoPao.visibility = View.GONE
            }
        }


        binding.checkGelado.setOnClickListener {
           if (binding.checkGelado.isChecked()) {
               binding.EditQuantidadeGelado.setText("1")
               binding.textPrecoChocolate.visibility = View.VISIBLE
           } else {
               binding.EditQuantidadeGelado.setText("0")
               binding.textPrecoChocolate.visibility = View.GONE
           }
        }

        binding.checkRefrigerante.setOnClickListener {
            if (binding.checkRefrigerante.isChecked()) {
                binding.EditQuantidadeRefrigerante.setText("1")
                binding.textPrecoRefrigerante.visibility = View.VISIBLE
            } else {
                binding.EditQuantidadeRefrigerante.setText("0")
                binding.textPrecoRefrigerante.visibility = View.GONE
            }
        }

        binding.checkAgua.setOnClickListener {
            if (binding.checkAgua.isChecked()) {
                binding.EditQuantidadeAgua.setText("1")
                binding.textPrecoAgua.visibility = View.VISIBLE
            } else {
                binding.EditQuantidadeAgua.setText("0")
                binding.textPrecoAgua.visibility = View.GONE
            }
        }
    }
}