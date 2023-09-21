package com.example.cricketrankings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cricketrankings.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val countryList:ArrayList<ModelCountry> = ArrayList<ModelCountry>()

        countryList.add(ModelCountry(R.drawable.ind, "India", "1"))
        countryList.add(ModelCountry(R.drawable.aus, "Australia", "2"))
        countryList.add(ModelCountry(R.drawable.eng, "England", "3"))
        countryList.add(ModelCountry(R.drawable.sa, "South Africa", "4"))
        countryList.add(ModelCountry(R.drawable.nz, "New Zealand", "5"))
        countryList.add(ModelCountry(R.drawable.pak, "Pakistan", "6"))
        countryList.add(ModelCountry(R.drawable.sri, "Sri Lanka", "7"))
        countryList.add(ModelCountry(R.drawable.wi, "West Indies", "8"))
        countryList.add(ModelCountry(R.drawable.bd, "Bangladesh", "9"))
        countryList.add(ModelCountry(R.drawable.zi, "Zimbabwe", "10"))


        val adapater = CountryAdapter(this, countryList)
        binding.listView.adapter = adapater
    }
}