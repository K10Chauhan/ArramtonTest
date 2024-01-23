package com.kc.arramtontest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kc.arramtontest.R
import com.kc.arramtontest.adaptere.RecyAdapter
import com.kc.arramtontest.model.modelData
import com.kc.arramtontest.network.RetrofitInst
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var recyInst : RecyclerView
    private lateinit var adapInst : RecyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val resoLiveData: LiveData<Response<modelData>> =
            liveData {
                val rspns = RetrofitInst.api.getData()
                emit(rspns)
            }

        resoLiveData.observe(this, Observer {
            val proitem = it.body()
            if (it.isSuccessful) {
                Log.d("onResponse", it.body().toString())
                adapInst = RecyAdapter(this@MainActivity, proitem!!)
                recyInst.adapter = adapInst
                recyInst.layoutManager = LinearLayoutManager(this@MainActivity)

            }
            else {
                Log.d("onFail", "Api is not calling " + it.errorBody().toString())

            }


        })


    }
}