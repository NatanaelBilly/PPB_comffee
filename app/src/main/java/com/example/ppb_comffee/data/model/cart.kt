package com.example.ppb_comffee.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Cart (
    var idKeranjang: Int,
    var idUser: Int
): Parcelable