/*****************************************************************************
 * Copyright (C) Codehaus.org                                                *
 * ------------------------------------------------------------------------- *
 * Licensed under the Apache License, Version 2.0 (the "License");           *
 * you may not use this file except in compliance with the License.          *
 * You may obtain a copy of the License at                                   *
 *                                                                           *
 * http://www.apache.org/licenses/LICENSE-2.0                                *
 *                                                                           *
 * Unless required by applicable law or agreed to in writing, software       *
 * distributed under the License is distributed on an "AS IS" BASIS,         *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  *
 * See the License for the specific language governing permissions and       *
 * limitations under the License.                                            *
 *****************************************************************************/
package org.codehaus.jparsec.examples.sql.ast;

import java.util.Collections;
import java.util.List;

import org.codehaus.jparsec.examples.common.ValueObject;
import org.codehaus.jparsec.functors.Pair;

/**
 * The "{@code case when cond1 then val1 when cond2 then val2 else def end}" expression.
 * 
 * @author Ben Yu
 */
public final class FullCaseExpression extends ValueObject implements Expression {
  public final List<Pair<Expression, Expression>> cases;
  public final Expression defaultValue;
  
  public FullCaseExpression(List<Pair<Expression, Expression>> cases, Expression defaultValue) {
    this.cases = Collections.unmodifiableList(cases);
    this.defaultValue = defaultValue;
  }
}
