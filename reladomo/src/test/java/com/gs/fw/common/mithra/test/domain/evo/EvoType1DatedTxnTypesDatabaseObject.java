/*
 Copyright 2016 Goldman Sachs.
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.
 */

package com.gs.fw.common.mithra.test.domain.evo;

import com.gs.fw.common.mithra.MithraDataObject;

import java.sql.Timestamp;

public class EvoType1DatedTxnTypesDatabaseObject extends EvoType1DatedTxnTypesDatabaseObjectAbstract
{

    protected EvoType1DatedTxnTypes constructEvoType1DatedTxnTypes(MithraDataObject data, Timestamp businessDate, Timestamp processingDate)
    {
        EvoType1DatedTxnTypesData typesData = (EvoType1DatedTxnTypesData) data;
        if (typesData.getPkCharAttribute() == EvoType1DatedTxnTypes.TYPE_A)
        {
            return new EvoType1DatedTxnTypesA(businessDate, processingDate);
        }
        if (typesData.getPkCharAttribute() == EvoType1DatedTxnTypes.TYPE_B) {
            return new EvoType1DatedTxnTypesB(businessDate, processingDate);
        }
        return null;
    }
}
