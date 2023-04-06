// This is a generated file. Not intended for manual editing.
package me.mrolappe.intellij.bcpl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BcplDeclarationPart extends PsiElement {

  @NotNull
  List<BcplDeclaration> getDeclarationList();

  @NotNull
  List<BcplGetDirective> getGetDirectiveList();

}
