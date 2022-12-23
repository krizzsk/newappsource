package com.masabi.justride.sdk.jobs.purchase.payment;

import p988j$.util.concurrent.ConcurrentHashMap;

public final class OrderProgressStore {

    /* renamed from: a */
    public final ConcurrentHashMap<String, OrderProgress> f37126a = new ConcurrentHashMap<>();

    public enum OrderProgress {
        IN_PROGRESS,
        SUCCEEDED,
        FAILED
    }
}
