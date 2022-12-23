package com.saiful.navigationfragment

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Trainee(
    val name: String = "Untitled",
    val id: Int = 0
) : Parcelable
