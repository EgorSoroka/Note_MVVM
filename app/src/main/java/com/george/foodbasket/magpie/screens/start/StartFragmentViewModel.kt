package com.george.foodbasket.magpie.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.george.foodbasket.magpie.database.room.AppRoomDatabase
import com.george.foodbasket.magpie.database.room.AppRoomRepository
import com.george.foodbasket.magpie.utilits.REPOSITOTY
import com.george.foodbasket.magpie.utilits.TYPE_ROOM

class StartFragmentViewModel(application: Application): AndroidViewModel(application) {

    private val mContext = application

    fun initDatabase(type:String,onSuccess:()->Unit){
        when(type){
            TYPE_ROOM ->{
                val dao = AppRoomDatabase.getInstance(mContext).getAppRoomDao()
                REPOSITOTY = AppRoomRepository(dao)
                onSuccess()
            }
        }
    }
}