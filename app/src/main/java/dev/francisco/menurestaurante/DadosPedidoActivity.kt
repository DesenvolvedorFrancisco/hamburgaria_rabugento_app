package dev.francisco.menurestaurante

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.francisco.menurestaurante.databinding.ActivityDadosPedidoBinding

class DadosPedidoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDadosPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDadosPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val i = intent
        val  quant_hamburger = i.getStringExtra("quant_hamburger").toString().toLong()
        val  quant_cachorro = i.getStringExtra("quant_cachorro").toString().toLong()
        val  quant_gelado = i.getStringExtra("quant_gelado")?.toLong()?.toInt()
        val  quant_refrigerante = i.getStringExtra("quant_refrigerante")?.toLong()?.toInt()
        val  quant_agua = i.getStringExtra("quant_agua")?.toLong()?.toInt()
        val preco_hamburger = i.getLongExtra("preco_hamburger",0)
        val preco_cachorro = i.getLongExtra("preco_cachorro",0)
        val preco_gelado = i.getLongExtra("preco_gelado",0)
        val preco_refrigerante = i.getLongExtra("preco_refrigerante",0)
        val preco_agua = i.getLongExtra("preco_agua",0)

        val totalPedido =
            quant_hamburger * preco_hamburger +
                    quant_cachorro * preco_cachorro +
                    (quant_gelado?.times(preco_gelado) ?: 0) +
                    (quant_refrigerante?.times(preco_refrigerante) ?: 0) +
                    (quant_agua?.times(preco_agua) ?: 0)

        val textoItens = "Resumo do pedido: \n" +
                "Hamburger: $quant_hamburger Preço: ${quant_hamburger * preco_hamburger} Kz\n" +
                "Cachorro: $quant_cachorro Preço: ${quant_cachorro * preco_cachorro} Kz\n" +
                "Gelado: $quant_gelado Preço: ${quant_gelado?.times(preco_gelado)} Kz\n" +
                "Refrigerante: $quant_refrigerante Preço: ${quant_refrigerante?.times(preco_refrigerante)} Kz\n" +
                "Água: $quant_agua Preço: ${quant_agua?.times(preco_agua)} Kz"

        val textoTotal = "Total do Pedido: $totalPedido Kz"

        binding.textResumoItens.text = textoItens
        binding.textTotal.text = textoTotal





    }
}