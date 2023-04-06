// This is a generated file. Not intended for manual editing.
package me.mrolappe.intellij.bcpl.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static me.mrolappe.intellij.bcpl.lang.psi.BcplTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import me.mrolappe.intellij.bcpl.lang.psi.*;

public class BcplConstantElementImpl extends ASTWrapperPsiElement implements BcplConstantElement {

  public BcplConstantElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BcplVisitor visitor) {
    visitor.visitConstantElement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BcplVisitor) accept((BcplVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BcplConstantExpression getConstantExpression() {
    return findChildByClass(BcplConstantExpression.class);
  }

  @Override
  @Nullable
  public BcplName_ getName_() {
    return findChildByClass(BcplName_.class);
  }

  @Override
  @Nullable
  public PsiElement getCharacterConstant() {
    return findChildByType(CHARACTER_CONSTANT);
  }

  @Override
  @Nullable
  public PsiElement getIntegerConstant() {
    return findChildByType(INTEGER_CONSTANT);
  }

}
