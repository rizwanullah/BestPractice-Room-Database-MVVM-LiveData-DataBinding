package com.animal.interfaces

import com.animal.models.AnimalModel

interface OnItemClickListener {
    fun onClick(model: AnimalModel?, status : Int)
}