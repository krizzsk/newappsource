package com.google.gson;

import p359ag.C13450g;
import p359ag.C13454k;

public enum LongSerializationPolicy {
    DEFAULT {
        public C13450g serialize(Long l) {
            return new C13454k((Number) l);
        }
    },
    STRING {
        public C13450g serialize(Long l) {
            return new C13454k(String.valueOf(l));
        }
    };

    public abstract C13450g serialize(Long l);
}
