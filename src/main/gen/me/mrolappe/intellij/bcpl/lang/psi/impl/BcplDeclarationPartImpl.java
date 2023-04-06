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

public class BcplDeclarationPartImpl extends ASTWrapperPsiElement implements BcplDeclarationPart {

  public BcplDeclarationPartImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BcplVisitor visitor) {
    visitor.visitDeclarationPart(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BcplVisitor) accept((BcplVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<BcplDeclaration> getDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BcplDeclaration.class);
  }

  @Override
  @NotNull
  public List<BcplGetDirective> getGetDirectiveList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BcplGetDirective.class);
  }

}
