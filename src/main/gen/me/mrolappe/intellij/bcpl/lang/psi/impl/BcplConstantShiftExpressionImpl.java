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

public class BcplConstantShiftExpressionImpl extends ASTWrapperPsiElement implements BcplConstantShiftExpression {

  public BcplConstantShiftExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BcplVisitor visitor) {
    visitor.visitConstantShiftExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BcplVisitor) accept((BcplVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public BcplConstantAddExpression getConstantAddExpression() {
    return findNotNullChildByClass(BcplConstantAddExpression.class);
  }

  @Override
  @Nullable
  public BcplConstantShiftExpression getConstantShiftExpression() {
    return findChildByClass(BcplConstantShiftExpression.class);
  }

}