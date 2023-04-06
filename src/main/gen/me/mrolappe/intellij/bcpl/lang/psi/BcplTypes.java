// This is a generated file. Not intended for manual editing.
package me.mrolappe.intellij.bcpl.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import me.mrolappe.intellij.bcpl.lang.psi.impl.*;

public interface BcplTypes {

  IElementType CONSTANT_ADD_EXPRESSION = new BcplElementType("CONSTANT_ADD_EXPRESSION");
  IElementType CONSTANT_AND_EXPRESSION = new BcplElementType("CONSTANT_AND_EXPRESSION");
  IElementType CONSTANT_ELEMENT = new BcplElementType("CONSTANT_ELEMENT");
  IElementType CONSTANT_EXPRESSION = new BcplElementType("CONSTANT_EXPRESSION");
  IElementType CONSTANT_MULT_EXPRESSION = new BcplElementType("CONSTANT_MULT_EXPRESSION");
  IElementType CONSTANT_SHIFT_EXPRESSION = new BcplElementType("CONSTANT_SHIFT_EXPRESSION");
  IElementType DECLARATION = new BcplElementType("DECLARATION");
  IElementType DECLARATION_PART = new BcplElementType("DECLARATION_PART");
  IElementType DEFINITION = new BcplElementType("DEFINITION");
  IElementType EXPRESSION = new BcplElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new BcplElementType("EXPRESSION_LIST");
  IElementType GET_DIRECTIVE = new BcplElementType("GET_DIRECTIVE");
  IElementType GLOBAL_DECLARATION = new BcplElementType("GLOBAL_DECLARATION");
  IElementType GLOBAL_ITEM = new BcplElementType("GLOBAL_ITEM");
  IElementType GLOBAL_LIST = new BcplElementType("GLOBAL_LIST");
  IElementType INTEGER_CONSTANT_EXPRESSION = new BcplElementType("INTEGER_CONSTANT_EXPRESSION");
  IElementType MANIFEST_DECLARATION = new BcplElementType("MANIFEST_DECLARATION");
  IElementType MANIFEST_ITEM = new BcplElementType("MANIFEST_ITEM");
  IElementType MANIFEST_LIST = new BcplElementType("MANIFEST_LIST");
  IElementType NAME_ = new BcplElementType("NAME_");
  IElementType NAME_LIST = new BcplElementType("NAME_LIST");
  IElementType SIMPLE_DEFINITION = new BcplElementType("SIMPLE_DEFINITION");
  IElementType SIMULTANEOUS_DECLARATION = new BcplElementType("SIMULTANEOUS_DECLARATION");
  IElementType STATIC_DECLARATION = new BcplElementType("STATIC_DECLARATION");
  IElementType STATIC_DECLARATIONS = new BcplElementType("STATIC_DECLARATIONS");

  IElementType AND = new IElementType("AND", null);
  IElementType ASSIGN = new IElementType(":=", null);
  IElementType BE = new IElementType("BE", null);
  IElementType BLOCK_COMMENT = new IElementType("BLOCK_COMMENT", null);
  IElementType BREAK = new IElementType("BREAK", null);
  IElementType CASE = new IElementType("CASE", null);
  IElementType CHARACTER_CONSTANT = new IElementType("CHARACTER_CONSTANT", null);
  IElementType COMMA = new IElementType(",", null);
  IElementType COMMAND = new IElementType("command", null);
  IElementType CONDITIONAL_EXPRESSION = new IElementType("conditional_expression", null);
  IElementType DO = new IElementType("DO", null);
  IElementType ELSE = new IElementType("ELSE", null);
  IElementType ENDCASE = new IElementType("ENDCASE", null);
  IElementType EQUALS = new IElementType("=", null);
  IElementType FALSE = new IElementType("FALSE", null);
  IElementType FOR = new IElementType("FOR", null);
  IElementType FUNCTION_DEFINITION = new IElementType("function_definition", null);
  IElementType GET = new IElementType("GET", null);
  IElementType GLOBAL = new IElementType("GLOBAL", null);
  IElementType IDENTIFIER = new IElementType("IDENTIFIER", null);
  IElementType IF = new IElementType("IF", null);
  IElementType INTEGER_CONSTANT = new IElementType("INTEGER_CONSTANT", null);
  IElementType INTO = new IElementType("INTO", null);
  IElementType LBRACE = new IElementType("{", null);
  IElementType LET = new IElementType("LET", null);
  IElementType LINE_COMMENT = new IElementType("LINE_COMMENT", null);
  IElementType LPAREN = new IElementType("(", null);
  IElementType LSHIFT = new IElementType("<<", null);
  IElementType MANIFEST = new IElementType("MANIFEST", null);
  IElementType MINUS = new IElementType("-", null);
  IElementType PLUS = new IElementType("PLUS", null);
  IElementType RBRACE = new IElementType("}", null);
  IElementType REM = new IElementType("REM", null);
  IElementType REPEAT = new IElementType("REPEAT", null);
  IElementType REPEATWHILE = new IElementType("REPEATWHILE", null);
  IElementType RESULTIS = new IElementType("RESULTIS", null);
  IElementType RETURN = new IElementType("RETURN", null);
  IElementType ROUTINE_DEFINITION = new IElementType("routine_definition", null);
  IElementType RPAREN = new IElementType(")", null);
  IElementType RSHIFT = new IElementType(">>", null);
  IElementType SLASH = new IElementType("/", null);
  IElementType STAR = new IElementType("*", null);
  IElementType STATIC = new IElementType("STATIC", null);
  IElementType STRING_CONSTANT = new IElementType("STRING_CONSTANT", null);
  IElementType SWITCHON = new IElementType("SWITCHON", null);
  IElementType TABLE = new IElementType("TABLE", null);
  IElementType TEST = new IElementType("TEST", null);
  IElementType THEN = new IElementType("THEN", null);
  IElementType TO = new IElementType("TO", null);
  IElementType TRUE = new IElementType("TRUE", null);
  IElementType UNLESS = new IElementType("UNLESS", null);
  IElementType UNTIL = new IElementType("UNTIL", null);
  IElementType VALOF = new IElementType("VALOF", null);
  IElementType VECTOR_DEFINITION = new IElementType("vector_definition", null);
  IElementType WHILE = new IElementType("WHILE", null);

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CONSTANT_ADD_EXPRESSION) {
        return new BcplConstantAddExpressionImpl(node);
      }
      else if (type == CONSTANT_AND_EXPRESSION) {
        return new BcplConstantAndExpressionImpl(node);
      }
      else if (type == CONSTANT_ELEMENT) {
        return new BcplConstantElementImpl(node);
      }
      else if (type == CONSTANT_EXPRESSION) {
        return new BcplConstantExpressionImpl(node);
      }
      else if (type == CONSTANT_MULT_EXPRESSION) {
        return new BcplConstantMultExpressionImpl(node);
      }
      else if (type == CONSTANT_SHIFT_EXPRESSION) {
        return new BcplConstantShiftExpressionImpl(node);
      }
      else if (type == DECLARATION) {
        return new BcplDeclarationImpl(node);
      }
      else if (type == DECLARATION_PART) {
        return new BcplDeclarationPartImpl(node);
      }
      else if (type == DEFINITION) {
        return new BcplDefinitionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new BcplExpressionImpl(node);
      }
      else if (type == EXPRESSION_LIST) {
        return new BcplExpressionListImpl(node);
      }
      else if (type == GET_DIRECTIVE) {
        return new BcplGetDirectiveImpl(node);
      }
      else if (type == GLOBAL_DECLARATION) {
        return new BcplGlobalDeclarationImpl(node);
      }
      else if (type == GLOBAL_ITEM) {
        return new BcplGlobalItemImpl(node);
      }
      else if (type == GLOBAL_LIST) {
        return new BcplGlobalListImpl(node);
      }
      else if (type == INTEGER_CONSTANT_EXPRESSION) {
        return new BcplIntegerConstantExpressionImpl(node);
      }
      else if (type == MANIFEST_DECLARATION) {
        return new BcplManifestDeclarationImpl(node);
      }
      else if (type == MANIFEST_ITEM) {
        return new BcplManifestItemImpl(node);
      }
      else if (type == MANIFEST_LIST) {
        return new BcplManifestListImpl(node);
      }
      else if (type == NAME_) {
        return new BcplName_Impl(node);
      }
      else if (type == NAME_LIST) {
        return new BcplNameListImpl(node);
      }
      else if (type == SIMPLE_DEFINITION) {
        return new BcplSimpleDefinitionImpl(node);
      }
      else if (type == SIMULTANEOUS_DECLARATION) {
        return new BcplSimultaneousDeclarationImpl(node);
      }
      else if (type == STATIC_DECLARATION) {
        return new BcplStaticDeclarationImpl(node);
      }
      else if (type == STATIC_DECLARATIONS) {
        return new BcplStaticDeclarationsImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
