package com.info.retrofitkullanimi

class ApiUtils {

    companion object{

        //val BASE_URL = "http://kasimadalan.pe.hu/"
        val BASE_URL = "https://yts.am/api/v2/"

        fun getKisilerDaoInterface():KisilerDaoInterface{

            return RetrofitClient.getClient(BASE_URL).create(KisilerDaoInterface::class.java)

        }


    }
}