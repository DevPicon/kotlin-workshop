package pe.devpicon.android.mykotlinandroidapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showHelloInSpanish("Hola! Mucho gusto!")
    }

    private fun showHelloInSpanish(message: String) {
        val txtLabel = findViewById(R.id.txt_label) as TextView
        txtLabel.text = message
    }
}
