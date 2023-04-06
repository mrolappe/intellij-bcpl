// This is a generated file. Not intended for manual editing.
package me.mrolappe.intellij.bcpl.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static me.mrolappe.intellij.bcpl.lang.psi.BcplTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class BcplParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return file(b, l + 1);
  }

  /* ********************************************************** */
  // constant_add_expression ( PLUS | MINUS ) constant_mult_expression
  //     | ( PLUS | MINUS ) constant_mult_expression
  //     constant_mult_expression
  public static boolean constant_add_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_add_expression")) return false;
    if (!nextTokenIs(b, "<constant add expression>", MINUS, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_ADD_EXPRESSION, "<constant add expression>");
    r = constant_add_expression_0(b, l + 1);
    if (!r) r = constant_add_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // constant_add_expression ( PLUS | MINUS ) constant_mult_expression
  private static boolean constant_add_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_add_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constant_add_expression(b, l + 1);
    r = r && constant_add_expression_0_1(b, l + 1);
    r = r && constant_mult_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS | MINUS
  private static boolean constant_add_expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_add_expression_0_1")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  // ( PLUS | MINUS ) constant_mult_expression
  //     constant_mult_expression
  private static boolean constant_add_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_add_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constant_add_expression_1_0(b, l + 1);
    r = r && constant_mult_expression(b, l + 1);
    r = r && constant_mult_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS | MINUS
  private static boolean constant_add_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_add_expression_1_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // constant_and_expression '&' constant_shift_expression
  //     | constant_shift_expression
  public static boolean constant_and_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_and_expression")) return false;
    if (!nextTokenIs(b, "<constant and expression>", MINUS, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_AND_EXPRESSION, "<constant and expression>");
    r = constant_and_expression_0(b, l + 1);
    if (!r) r = constant_shift_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // constant_and_expression '&' constant_shift_expression
  private static boolean constant_and_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_and_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constant_and_expression(b, l + 1);
    r = r && consumeToken(b, "&");
    r = r && constant_shift_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CHARACTER_CONSTANT
  //     | INTEGER_CONSTANT
  //     | name_
  //     | TRUE
  //     | FALSE
  //     | '(' constant_expression ')'
  public static boolean constant_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_ELEMENT, "<constant element>");
    r = consumeToken(b, CHARACTER_CONSTANT);
    if (!r) r = consumeToken(b, INTEGER_CONSTANT);
    if (!r) r = name_(b, l + 1);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = constant_element_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' constant_expression ')'
  private static boolean constant_element_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_element_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && constant_expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // constant_element
  //     | constant_expression '|' constant_and_expression
  //     | constant_and_expression
  public static boolean constant_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_EXPRESSION, "<constant expression>");
    r = constant_element(b, l + 1);
    if (!r) r = constant_expression_1(b, l + 1);
    if (!r) r = constant_and_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // constant_expression '|' constant_and_expression
  private static boolean constant_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constant_expression(b, l + 1);
    r = r && consumeToken(b, "|");
    r = r && constant_and_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // constant_mult_expression ( STAR | SLASH | REM ) constant_element
  //     | constant_element
  public static boolean constant_mult_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_mult_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_MULT_EXPRESSION, "<constant mult expression>");
    r = constant_mult_expression_0(b, l + 1);
    if (!r) r = constant_element(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // constant_mult_expression ( STAR | SLASH | REM ) constant_element
  private static boolean constant_mult_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_mult_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constant_mult_expression(b, l + 1);
    r = r && constant_mult_expression_0_1(b, l + 1);
    r = r && constant_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STAR | SLASH | REM
  private static boolean constant_mult_expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_mult_expression_0_1")) return false;
    boolean r;
    r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, SLASH);
    if (!r) r = consumeToken(b, REM);
    return r;
  }

  /* ********************************************************** */
  // constant_shift_expression ( LSHIFT | RSHIFT ) constant_add_expression
  //     | constant_add_expression
  public static boolean constant_shift_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_shift_expression")) return false;
    if (!nextTokenIs(b, "<constant shift expression>", MINUS, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_SHIFT_EXPRESSION, "<constant shift expression>");
    r = constant_shift_expression_0(b, l + 1);
    if (!r) r = constant_add_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // constant_shift_expression ( LSHIFT | RSHIFT ) constant_add_expression
  private static boolean constant_shift_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_shift_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constant_shift_expression(b, l + 1);
    r = r && constant_shift_expression_0_1(b, l + 1);
    r = r && constant_add_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LSHIFT | RSHIFT
  private static boolean constant_shift_expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_shift_expression_0_1")) return false;
    boolean r;
    r = consumeToken(b, LSHIFT);
    if (!r) r = consumeToken(b, RSHIFT);
    return r;
  }

  /* ********************************************************** */
  // simultaneous_declaration
  //     | manifest_declaration
  //     | static_declarations
  //     | global_declaration
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = simultaneous_declaration(b, l + 1);
    if (!r) r = manifest_declaration(b, l + 1);
    if (!r) r = static_declarations(b, l + 1);
    if (!r) r = global_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // declaration|get_directive ( [';'] (declaration|get_directive) )*
  public static boolean declaration_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION_PART, "<declaration part>");
    r = declaration(b, l + 1);
    if (!r) r = declaration_part_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // get_directive ( [';'] (declaration|get_directive) )*
  private static boolean declaration_part_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_part_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = get_directive(b, l + 1);
    r = r && declaration_part_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( [';'] (declaration|get_directive) )*
  private static boolean declaration_part_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_part_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declaration_part_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_part_1_1", c)) break;
    }
    return true;
  }

  // [';'] (declaration|get_directive)
  private static boolean declaration_part_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_part_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declaration_part_1_1_0_0(b, l + 1);
    r = r && declaration_part_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [';']
  private static boolean declaration_part_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_part_1_1_0_0")) return false;
    consumeToken(b, ";");
    return true;
  }

  // declaration|get_directive
  private static boolean declaration_part_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_part_1_1_0_1")) return false;
    boolean r;
    r = declaration(b, l + 1);
    if (!r) r = get_directive(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // simple_definition
  //     | vector_definition
  //     | function_definition
  //     | routine_definition
  public static boolean definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINITION, "<definition>");
    r = simple_definition(b, l + 1);
    if (!r) r = consumeToken(b, VECTOR_DEFINITION);
    if (!r) r = consumeToken(b, FUNCTION_DEFINITION);
    if (!r) r = consumeToken(b, ROUTINE_DEFINITION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TABLE constant_expression ( COMMA constant_expression )*
  //     | VALOF command
  //     | conditional_expression
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, VALOF, COMMAND);
    if (!r) r = consumeToken(b, CONDITIONAL_EXPRESSION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TABLE constant_expression ( COMMA constant_expression )*
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TABLE);
    r = r && constant_expression(b, l + 1);
    r = r && expression_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COMMA constant_expression )*
  private static boolean expression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_0_2", c)) break;
    }
    return true;
  }

  // COMMA constant_expression
  private static boolean expression_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && constant_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression ( COMMA expression)
  public static boolean expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_LIST, "<expression list>");
    r = expression(b, l + 1);
    r = r && expression_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA expression
  private static boolean expression_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // declaration_part
  static boolean file(PsiBuilder b, int l) {
    return declaration_part(b, l + 1);
  }

  /* ********************************************************** */
  // GET STRING_CONSTANT
  public static boolean get_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "get_directive")) return false;
    if (!nextTokenIs(b, GET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GET, STRING_CONSTANT);
    exit_section_(b, m, GET_DIRECTIVE, r);
    return r;
  }

  /* ********************************************************** */
  // GLOBAL '$(' global_list '$)'
  //     | GLOBAL '{' global_list '}'
  public static boolean global_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_declaration")) return false;
    if (!nextTokenIs(b, GLOBAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = global_declaration_0(b, l + 1);
    if (!r) r = global_declaration_1(b, l + 1);
    exit_section_(b, m, GLOBAL_DECLARATION, r);
    return r;
  }

  // GLOBAL '$(' global_list '$)'
  private static boolean global_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GLOBAL);
    r = r && consumeToken(b, "$(");
    r = r && global_list(b, l + 1);
    r = r && consumeToken(b, "$)");
    exit_section_(b, m, null, r);
    return r;
  }

  // GLOBAL '{' global_list '}'
  private static boolean global_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GLOBAL, LBRACE);
    r = r && global_list(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER [ ':' constant_expression]
  public static boolean global_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_item")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && global_item_1(b, l + 1);
    exit_section_(b, m, GLOBAL_ITEM, r);
    return r;
  }

  // [ ':' constant_expression]
  private static boolean global_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_item_1")) return false;
    global_item_1_0(b, l + 1);
    return true;
  }

  // ':' constant_expression
  private static boolean global_item_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_item_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && constant_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // global_item ( [';'] global_item)*
  public static boolean global_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = global_item(b, l + 1);
    r = r && global_list_1(b, l + 1);
    exit_section_(b, m, GLOBAL_LIST, r);
    return r;
  }

  // ( [';'] global_item)*
  private static boolean global_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!global_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "global_list_1", c)) break;
    }
    return true;
  }

  // [';'] global_item
  private static boolean global_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = global_list_1_0_0(b, l + 1);
    r = r && global_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [';']
  private static boolean global_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_list_1_0_0")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // INTEGER_CONSTANT
  //     | INTEGER_CONSTANT '+' integer_constant_expression
  public static boolean integer_constant_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_constant_expression")) return false;
    if (!nextTokenIs(b, INTEGER_CONSTANT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER_CONSTANT);
    if (!r) r = integer_constant_expression_1(b, l + 1);
    exit_section_(b, m, INTEGER_CONSTANT_EXPRESSION, r);
    return r;
  }

  // INTEGER_CONSTANT '+' integer_constant_expression
  private static boolean integer_constant_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_constant_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER_CONSTANT);
    r = r && consumeToken(b, "+");
    r = r && integer_constant_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MANIFEST '$(' manifest_list '$)'
  //     | MANIFEST '{' manifest_list '}'
  public static boolean manifest_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_declaration")) return false;
    if (!nextTokenIs(b, MANIFEST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = manifest_declaration_0(b, l + 1);
    if (!r) r = manifest_declaration_1(b, l + 1);
    exit_section_(b, m, MANIFEST_DECLARATION, r);
    return r;
  }

  // MANIFEST '$(' manifest_list '$)'
  private static boolean manifest_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MANIFEST);
    r = r && consumeToken(b, "$(");
    r = r && manifest_list(b, l + 1);
    r = r && consumeToken(b, "$)");
    exit_section_(b, m, null, r);
    return r;
  }

  // MANIFEST '{' manifest_list '}'
  private static boolean manifest_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MANIFEST, LBRACE);
    r = r && manifest_list(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // name_
  //     | name_ '=' constant_expression
  public static boolean manifest_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_item")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_(b, l + 1);
    if (!r) r = manifest_item_1(b, l + 1);
    exit_section_(b, m, MANIFEST_ITEM, r);
    return r;
  }

  // name_ '=' constant_expression
  private static boolean manifest_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_item_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && constant_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // manifest_item ( [';'] manifest_item)*
  public static boolean manifest_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = manifest_item(b, l + 1);
    r = r && manifest_list_1(b, l + 1);
    exit_section_(b, m, MANIFEST_LIST, r);
    return r;
  }

  // ( [';'] manifest_item)*
  private static boolean manifest_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!manifest_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "manifest_list_1", c)) break;
    }
    return true;
  }

  // [';'] manifest_item
  private static boolean manifest_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = manifest_list_1_0_0(b, l + 1);
    r = r && manifest_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [';']
  private static boolean manifest_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_list_1_0_0")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean name_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, NAME_, r);
    return r;
  }

  /* ********************************************************** */
  // name_ ( COMMA name_ )*
  public static boolean name_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_(b, l + 1);
    r = r && name_list_1(b, l + 1);
    exit_section_(b, m, NAME_LIST, r);
    return r;
  }

  // ( COMMA name_ )*
  private static boolean name_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!name_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "name_list_1", c)) break;
    }
    return true;
  }

  // COMMA name_
  private static boolean name_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && name_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // name_list EQUALS expression_list
  public static boolean simple_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_definition")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_list(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && expression_list(b, l + 1);
    exit_section_(b, m, SIMPLE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // LET definition ( AND definition )*
  public static boolean simultaneous_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simultaneous_declaration")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LET);
    r = r && definition(b, l + 1);
    r = r && simultaneous_declaration_2(b, l + 1);
    exit_section_(b, m, SIMULTANEOUS_DECLARATION, r);
    return r;
  }

  // ( AND definition )*
  private static boolean simultaneous_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simultaneous_declaration_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simultaneous_declaration_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simultaneous_declaration_2", c)) break;
    }
    return true;
  }

  // AND definition
  private static boolean simultaneous_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simultaneous_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && definition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // name_
  //     | name_ '=' integer_constant_expression
  public static boolean static_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_declaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_(b, l + 1);
    if (!r) r = static_declaration_1(b, l + 1);
    exit_section_(b, m, STATIC_DECLARATION, r);
    return r;
  }

  // name_ '=' integer_constant_expression
  private static boolean static_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && integer_constant_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STATIC '$(' static_declaration '$)'
  //     | STATIC '{' static_declaration '}'
  public static boolean static_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_declarations")) return false;
    if (!nextTokenIs(b, STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_declarations_0(b, l + 1);
    if (!r) r = static_declarations_1(b, l + 1);
    exit_section_(b, m, STATIC_DECLARATIONS, r);
    return r;
  }

  // STATIC '$(' static_declaration '$)'
  private static boolean static_declarations_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_declarations_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STATIC);
    r = r && consumeToken(b, "$(");
    r = r && static_declaration(b, l + 1);
    r = r && consumeToken(b, "$)");
    exit_section_(b, m, null, r);
    return r;
  }

  // STATIC '{' static_declaration '}'
  private static boolean static_declarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_declarations_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STATIC, LBRACE);
    r = r && static_declaration(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

}
