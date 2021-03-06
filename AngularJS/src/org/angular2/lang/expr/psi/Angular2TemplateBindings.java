// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.angular2.lang.expr.psi;

import org.jetbrains.annotations.NotNull;

public interface Angular2TemplateBindings extends Angular2EmbeddedExpression {

  @NotNull
  String getTemplateName();

  @NotNull
  Angular2TemplateBinding[] getBindings();
}
