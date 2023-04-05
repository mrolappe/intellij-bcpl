package me.mrolappe.intellij.bcpl.lang

import com.intellij.lang.Language

class BcplLanguage private constructor() : Language("BCPL"){
    companion object {
        val INSTANCE = BcplLanguage()
    }
}
