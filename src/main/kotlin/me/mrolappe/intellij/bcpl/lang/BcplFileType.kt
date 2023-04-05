package me.mrolappe.intellij.bcpl.lang

import com.intellij.openapi.fileTypes.LanguageFileType

class BcplFileType private constructor() : LanguageFileType(BcplLanguage.INSTANCE) {
    companion object {
        val INSTANCE = BcplFileType()
    }

    override fun getName() = "BCPL"

    override fun getDescription() = "BCPL file"

    override fun getDefaultExtension() = "b"

    override fun getIcon() = BcplIcons.FILE
}