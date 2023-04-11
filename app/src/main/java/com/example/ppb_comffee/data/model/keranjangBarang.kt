package com.example.ppb_comffee.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class KeranjangBarang (
    var cartId: Int,
    var userId: Int,
    var items: ArrayList<item>,
    var quantity: Int,
//    detailCart: ArrayList<DetailCart>
): Parcelable