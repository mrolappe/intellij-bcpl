package me.mrolappe.intellij.bcpl.lang.psi

import com.intellij.psi.tree.IElementType
import me.mrolappe.intellij.bcpl.lang.BcplLanguage
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

class BcplTokenType(@NotNull @NonNls debugName: String) : IElementType(debugName, BcplLanguage.INSTANCE) {
    override fun toString() = "BcplTokenType.${super.toString()}"
}