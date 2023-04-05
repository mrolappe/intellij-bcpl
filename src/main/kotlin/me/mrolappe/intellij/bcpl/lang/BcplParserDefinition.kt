package me.mrolappe.intellij.bcpl.lang

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.tree.IFileElementType
import me.mrolappe.intellij.bcpl.lang.parser.BcplParser
import me.mrolappe.intellij.bcpl.lang.psi.BcplFile
import me.mrolappe.intellij.bcpl.lang.psi.BcplTokenSets
import me.mrolappe.intellij.bcpl.lang.psi.BcplTypes
import org.jetbrains.annotations.NotNull

class BcplParserDefinition : ParserDefinition {
    companion object {
        val FILE = IFileElementType(BcplLanguage.INSTANCE)
    }

    override fun createLexer(project: Project?) = BcplLexerAdapter()

    override fun createParser(project: Project?) = BcplParser()

    override fun getFileNodeType() = FILE

    override fun getCommentTokens() = BcplTokenSets.COMMENTS

    override fun getStringLiteralElements() = BcplTokenSets.STRING_LITERALS

    override fun createElement(node: ASTNode?) = BcplTypes.Factory.createElement(node)

    override fun createFile(@NotNull viewProvider: FileViewProvider) = BcplFile(viewProvider)
}