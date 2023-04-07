package com.example.ppb_comffee

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Item (
    var name: String,
    var photo: String,
    var price: Int
    ) : Parcelable