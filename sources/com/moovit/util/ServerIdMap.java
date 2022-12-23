package com.moovit.util;

import c00.C13720d;
import c00.C13722f;
import c00.C13733n;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ServerIdMap<T> extends HashMap<ServerId, T> {
    private final C13733n<ServerId, T> serverIdToObjectConverter = new C7894a();

    /* renamed from: com.moovit.util.ServerIdMap$a */
    public class C7894a implements C13733n<ServerId, T> {
        public C7894a() {
        }

        public final Object convert(Object obj) throws Exception {
            return ServerIdMap.this.get((ServerId) obj);
        }
    }

    /* renamed from: a */
    public static <T extends C5384a> ServerIdMap<T> m17949a(Iterable<T> iterable) {
        ServerIdMap<T> serverIdMap = new ServerIdMap<>();
        for (T t : iterable) {
            serverIdMap.put(t.getServerId(), t);
        }
        return serverIdMap;
    }

    /* renamed from: b */
    public final ArrayList mo24576b(List list) {
        return C13720d.m34273c(list, (C13722f) null, this.serverIdToObjectConverter);
    }
}
