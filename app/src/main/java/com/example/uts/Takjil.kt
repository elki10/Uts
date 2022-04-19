package com.example.uts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Takjil(
    val imgTakjil: Int,
    val nameTakjil: String,
    val descriptionTakjil: String,
) : Parcelable