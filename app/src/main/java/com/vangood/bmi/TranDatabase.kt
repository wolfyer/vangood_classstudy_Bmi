package com.vangood.bmi

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Transaction::class), version = 1)
 abstract class TranDatabase :RoomDatabase(){
    abstract fun tranDao():TransactionDao
}