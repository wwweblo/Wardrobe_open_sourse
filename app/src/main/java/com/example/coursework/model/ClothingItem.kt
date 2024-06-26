package com.example.coursework.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "ClothingItem")
data class ClothingItem (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val image: String?,
    val title: String,
    val type: String,
    val season: String,
    val description: String,

    var isSelected: Boolean?,
    val dateUpdated: Long

): Parcelable