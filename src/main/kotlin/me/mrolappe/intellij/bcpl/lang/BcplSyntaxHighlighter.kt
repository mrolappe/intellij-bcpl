package me.mrolappe.intellij.bcpl.lang

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import me.mrolappe.intellij.bcpl.lang.psi.BcplTokenSets.KEYWORDS
import me.mrolappe.intellij.bcpl.lang.psi.BcplTypes

class BcplSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val EMPTY_KEYS: Array<TextAttributesKey> = arrayOf()
        val KEYWORD_KEY = createTextAttributesKey("BCPL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val BLOCK_COMMENT_KEY = createTextAttributesKey("BCPL_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
        val LINE_COMMENT_KEY = createTextAttributesKey("BCPL_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    }

    override fun getHighlightingLexer() = BcplLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when {
            KEYWORDS.contains(tokenType) -> arrayOf(KEYWORD_KEY)

            else -> when (tokenType) {
                BcplTypes.BLOCK_COMMENT -> arrayOf(BLOCK_COMMENT_KEY)
                BcplTypes.LINE_COMMENT -> arrayOf(LINE_COMMENT_KEY)
                else -> EMPTY_KEYS
            }
        }
    }
}