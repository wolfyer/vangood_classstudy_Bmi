package com.vangood.bmi

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Transaction (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val account:String,
    @ColumnInfo(name = "createAt")//change database name init date
    val date:String,
    @ColumnInfo(name="amount")
    val  amount:Int,
    var type:Int){
}