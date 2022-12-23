package com.usebutton.sdk.internal.api;

import com.usebutton.sdk.internal.functional.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Parameters implements Iterable<Pair<String, Object>> {
    private final List<Pair<String, Object>> mParameters = new ArrayList();

    private Parameters add(Pair pair) {
        this.mParameters.add(pair);
        return this;
    }

    public Parameters addIfNotNullValue(Pair pair) {
        if (pair.second() == null) {
            return this;
        }
        this.mParameters.add(pair);
        return this;
    }

    public Iterator<Pair<String, Object>> iterator() {
        return this.mParameters.iterator();
    }

    public Parameters add(String str, String str2) {
        return add(new Pair(str, str2));
    }
}
