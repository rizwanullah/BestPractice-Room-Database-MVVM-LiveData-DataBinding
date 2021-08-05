package com.animal.utils

open class Constants {
    val isUpdate = "IS_UPDATE"
    val selectedModel = "SELECTED_MODEL"

    companion object {
        var DATABASE_NAME = "ANIMAL_DATABASE"
        var TAG = "TAG"

        var NORMAL = 1
        var DELETE = 2
        var FAV = 3
    }

    val startActivity = 0
    val startActivityWithFinish = 1
    val startActivityWithClearBackStack = 2
    val startActivityWithClearTop = 3
    val finishCurrentActivity = 4
}