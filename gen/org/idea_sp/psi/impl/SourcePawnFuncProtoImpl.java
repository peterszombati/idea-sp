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

public class SourcePawnFuncProtoImpl extends ASTWrapperPsiElement implements SourcePawnFuncProto {

  public SourcePawnFuncProtoImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitFuncProto(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SourcePawnArgdef> getArgdefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SourcePawnArgdef.class);
  }

}
