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

public class BcplDeclarationImpl extends ASTWrapperPsiElement implements BcplDeclaration {

  public BcplDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BcplVisitor visitor) {
    visitor.visitDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BcplVisitor) accept((BcplVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BcplGlobalDeclaration getGlobalDeclaration() {
    return findChildByClass(BcplGlobalDeclaration.class);
  }

  @Override
  @Nullable
  public BcplManifestDeclaration getManifestDeclaration() {
    return findChildByClass(BcplManifestDeclaration.class);
  }

  @Override
  @Nullable
  public BcplSimultaneousDeclaration getSimultaneousDeclaration() {
    return findChildByClass(BcplSimultaneousDeclaration.class);
  }

  @Override
  @Nullable
  public BcplStaticDeclarations getStaticDeclarations() {
    return findChildByClass(BcplStaticDeclarations.class);
  }

}
