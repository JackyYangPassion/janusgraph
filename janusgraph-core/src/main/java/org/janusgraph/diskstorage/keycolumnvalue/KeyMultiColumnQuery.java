// Copyright 2021 JanusGraph Authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.janusgraph.diskstorage.keycolumnvalue;

import org.janusgraph.graphdb.query.BaseQuery;

import java.nio.ByteBuffer;
import java.util.List;

public class KeyMultiColumnQuery extends BaseQuery {
    private final ByteBuffer key;
    private final List<ByteBuffer> columns;

    public KeyMultiColumnQuery(ByteBuffer key, List<ByteBuffer> columns, int limit) {
        super(limit);
        this.key = key;
        this.columns = columns;
    }

    public ByteBuffer getKey() {
        return key;
    }

    public List<ByteBuffer> getColumns() {
        return columns;
    }

    @Override
    public KeyMultiColumnQuery setLimit(final int limit) {
        super.setLimit(limit);
        return this;
    }
}
