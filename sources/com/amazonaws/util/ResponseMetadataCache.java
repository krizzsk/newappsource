package com.amazonaws.util;

import com.amazonaws.ResponseMetadata;
import java.util.LinkedHashMap;
import java.util.Map;

public class ResponseMetadataCache {
    private final InternalCache internalCache;

    public static final class InternalCache extends LinkedHashMap<Integer, ResponseMetadata> {
        private int maxSize;

        public InternalCache(int i) {
            super(i);
            this.maxSize = i;
        }

        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > this.maxSize;
        }
    }

    public ResponseMetadataCache(int i) {
        this.internalCache = new InternalCache(i);
    }

    public synchronized void add(Object obj, ResponseMetadata responseMetadata) {
        if (obj != null) {
            this.internalCache.put(Integer.valueOf(System.identityHashCode(obj)), responseMetadata);
        }
    }

    public ResponseMetadata get(Object obj) {
        return (ResponseMetadata) this.internalCache.get(Integer.valueOf(System.identityHashCode(obj)));
    }
}
