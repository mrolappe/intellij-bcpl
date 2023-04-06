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

public class BcplConstantExpressionImpl extends ASTWrapperPsiElement implements BcplConstantExpression {

  public BcplConstantExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BcplVisitor visitor) {
    visitor.visitConstantExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BcplVisitor) accept((BcplVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BcplConstantAndExpression getConstantAndExpression() {
    return findChildByClass(BcplConstantAndExpression.class);
  }

  @Override
  @Nullable
  public BcplConstantElement getConstantElement() {
    return findChildByClass(BcplConstantElement.class);
  }

  @Override
  @Nullable
  public BcplConstantExpression getConstantExpression() {
    return findChildByClass(BcplConstantExpression.class);
  }

}
