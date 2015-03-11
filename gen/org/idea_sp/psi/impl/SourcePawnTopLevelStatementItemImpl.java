// This is a generated file. Not intended for manual editing.
package org.idea_sp.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.idea_sp.psi.SourcePawnTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.idea_sp.psi.*;

public class SourcePawnTopLevelStatementItemImpl extends ASTWrapperPsiElement implements SourcePawnTopLevelStatementItem {

  public SourcePawnTopLevelStatementItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitTopLevelStatementItem(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SourcePawnEnumDeclaration getEnumDeclaration() {
    return findChildByClass(SourcePawnEnumDeclaration.class);
  }

  @Override
  @Nullable
  public SourcePawnForwardDeclaration getForwardDeclaration() {
    return findChildByClass(SourcePawnForwardDeclaration.class);
  }

  @Override
  @Nullable
  public SourcePawnGlobalDeclaration getGlobalDeclaration() {
    return findChildByClass(SourcePawnGlobalDeclaration.class);
  }

  @Override
  @Nullable
  public SourcePawnNativeDeclaration getNativeDeclaration() {
    return findChildByClass(SourcePawnNativeDeclaration.class);
  }

}
