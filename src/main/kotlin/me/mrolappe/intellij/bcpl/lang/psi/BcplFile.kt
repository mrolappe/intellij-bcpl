package me.mrolappe.intellij.bcpl.lang.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider
import me.mrolappe.intellij.bcpl.lang.BcplFileType
import me.mrolappe.intellij.bcpl.lang.BcplLanguage
import org.jetbrains.annotations.NotNull

class BcplFile(@NotNull viewProvider: FileViewProvider) : PsiFileBase(viewProvider, BcplLanguage.INSTANCE) {
    override fun getFileType() = BcplFileType.INSTANCE

    override fun toString() = "BCPL File"
}