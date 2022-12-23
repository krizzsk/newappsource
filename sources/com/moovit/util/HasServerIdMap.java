package com.moovit.util;

import j40.C5384a;
import java.util.Collection;
import java.util.Iterator;

public class HasServerIdMap<T extends C5384a> extends ServerIdMap<T> {
    /* renamed from: c */
    public final void mo24548c(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            C5384a aVar = (C5384a) it.next();
            put(aVar.getServerId(), aVar);
        }
    }
}
