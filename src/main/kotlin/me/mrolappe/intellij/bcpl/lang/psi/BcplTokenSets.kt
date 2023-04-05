package me.mrolappe.intellij.bcpl.lang.psi

import com.intellij.psi.tree.TokenSet
import me.mrolappe.intellij.bcpl.lang.psi.BcplTypes.*

object BcplTokenSets {
    val IDENTIFIERS = TokenSet.create(IDENTIFIER)
    val COMMENTS = TokenSet.create(BLOCK_COMMENT, LINE_COMMENT)
    val STRING_LITERALS = TokenSet.create(STRING_CONSTANT)

    val OPERATORS = TokenSet.create(ASSIGN, LSHIFT, PLUS, RSHIFT, STAR)

    val KEYWORDS = TokenSet.create(
            AND,
            BE, BREAK,
            CASE,
            DO,
            ELSE, ENDCASE,
            FOR,
            GET, GLOBAL,
            IF, INTO,
            LET,
            MANIFEST,
            REM, REPEAT, REPEATWHILE, RESULTIS, RETURN,
            STATIC, SWITCHON,
            TABLE, TEST, THEN, TO,
            UNLESS, UNTIL,
            VALOF,
            WHILE
    )
}