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

public class SourcePawnNativeDeclarationImpl extends ASTWrapperPsiElement implements SourcePawnNativeDeclaration {

  public SourcePawnNativeDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitNativeDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SourcePawnFuncProto getFuncProto() {
    return findNotNullChildByClass(SourcePawnFuncProto.class);
  }

  @Override
  @NotNull
  public SourcePawnTaggedIdentifier getTaggedIdentifier() {
    return findNotNullChildByClass(SourcePawnTaggedIdentifier.class);
  }

}
