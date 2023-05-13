package com.info.retrofitkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //kisiSil()
        //kisiEkle()
        //kisiGuncelle()
        tumKisiler()
      //  kisiArama()

    }

    fun kisiSil(){

        val kdi = ApiUtils.getKisilerDaoInterface()

        kdi.kisiSil(386).enqueue(object : Callback<CRUDCevap>{

            override fun onResponse(call: Call<CRUDCevap>?, response: Response<CRUDCevap>?) {

                if(response != null){
                    Log.e("Başarı",response.body().success.toString())
                    Log.e("Mesaj",response.body().message)
                }

            }

            override fun onFailure(call: Call<CRUDCevap>?, t: Throwable?) {

            }

        })

    }

    fun kisiEkle(){

        val kdi = ApiUtils.getKisilerDaoInterface()

        kdi.kisiEkle("ahmet","9999999").enqueue(object : Callback<CRUDCevap>{

            override fun onResponse(call: Call<CRUDCevap>?, response: Response<CRUDCevap>?) {

                if(response != null){
                    Log.e("Başarı",response.body().success.toString())
                    Log.e("Mesaj",response.body().message)
                }

            }

            override fun onFailure(call: Call<CRUDCevap>?, t: Throwable?) {

            }

        })


    }

    fun kisiGuncelle(){

        val kdi = ApiUtils.getKisilerDaoInterface()

        kdi.kisiGuncelle(388,"aaaa","bbbbb").enqueue(object : Callback<CRUDCevap>{

            override fun onResponse(call: Call<CRUDCevap>?, response: Response<CRUDCevap>?) {

                if(response != null){
                    Log.e("Başarı",response.body().success.toString())
                    Log.e("Mesaj",response.body().message)
                }

            }

            override fun onFailure(call: Call<CRUDCevap>?, t: Throwable?) {

            }

        })

    }

    fun tumKisiler(){

        val kdi = ApiUtils.getKisilerDaoInterface()

        kdi.tumKisiler().enqueue(object : Callback<KisilerCevap>{

            override fun onResponse(call: Call<KisilerCevap>?, response: Response<KisilerCevap>?) {

                if(response != null){

                    val kisilerListe = response.body().kisiler

                    for(k in kisilerListe){

                        Log.e("*******","*******")
                        Log.e("Kişi id",(k.kisiId).toString())
                        Log.e("Kişi ad",k.kisiAd)
                        Log.e("Kişi tel",k.kisiTel)

                    }

                }

            }

            override fun onFailure(call: Call<KisilerCevap>?, t: Throwable?) {

            }

        })

    }

    fun kisiArama(){

        val kdi = ApiUtils.getKisilerDaoInterface()

        kdi.kisiAra("FATİH").enqueue(object : Callback<KisilerCevap>{

            override fun onResponse(call: Call<KisilerCevap>?, response: Response<KisilerCevap>?) {

                if(response != null){

                    val kisilerListe = response.body().kisiler

                    for(k in kisilerListe){

                        Log.e("*******","*******")
                        Log.e("Kişi id",(k.kisiId).toString())
                        Log.e("Kişi ad",k.kisiAd)
                        Log.e("Kişi tel",k.kisiTel)

                    }

                }

            }

            override fun onFailure(call: Call<KisilerCevap>?, t: Throwable?) {

            }

        })



    }


}
