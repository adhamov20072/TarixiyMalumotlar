package com.aimardon.tarixiymalumotlar

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ModelItem(
    val imageUrl: String,
    val binoNomi: String,
    val haqida: String
) : Parcelable