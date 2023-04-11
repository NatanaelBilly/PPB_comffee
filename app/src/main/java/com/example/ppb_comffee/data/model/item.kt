package com.example.ppb_comffee.data.model

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
class item (
    var idBarang: Int,
    var nama: String,
    var harga: Int,
    var gambar: String
):Parcelable