/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.phoenix.calcite;

import org.apache.calcite.sql.validate.SqlConformance;

public class PhoenixSqlConformance implements SqlConformance {

    public static final PhoenixSqlConformance INSTANCE =
            new PhoenixSqlConformance();

    private PhoenixSqlConformance() { }

    @Override
    public boolean isSortByOrdinal() {
        return true;
    }

    @Override
    public boolean isSortByAlias() {
        return true;
    }

    @Override
    public boolean isSortByAliasObscures() {
        return false;
    }

    @Override
    public boolean isFromRequired() {
        return false;
    }

    @Override
    public boolean isBangEqualAllowed() {
        return true;
    }

    @Override
    public boolean isMinusAllowed() {
        return false;
    }

    @Override
    public boolean isApplyAllowed() {
        return false;
    }

    @Override
    public boolean isInsertSubsetColumnsAllowed() {
        return true;
    }

    @Override
    public boolean allowNiladicParentheses() {
        return true;
    }

    @Override
    public boolean isGroupByAlias() {
        return true;
    }

    @Override
    public boolean isGroupByOrdinal() {
        return true;
    }

    @Override
    public boolean isHavingAlias() {
        return true;
    }
}