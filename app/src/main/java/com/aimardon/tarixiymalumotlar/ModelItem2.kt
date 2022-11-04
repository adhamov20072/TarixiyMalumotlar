package com.aimardon.tarixiymalumotlar

import android.os.Parcel
import android.os.Parcelable

data class ModelItem2(val haqida: String?):Parcelable{
    constructor(parcel: Parcel) : this(parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(haqida)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ModelItem2> {
        override fun createFromParcel(parcel: Parcel): ModelItem2 {
            return ModelItem2(parcel)
        }

        override fun newArray(size: Int): Array<ModelItem2?> {
            return arrayOfNulls(size)
        }
    }

}