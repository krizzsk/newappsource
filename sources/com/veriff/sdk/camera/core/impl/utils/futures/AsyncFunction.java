package com.veriff.sdk.camera.core.impl.utils.futures;

import p695od.C18728c;

@FunctionalInterface
public interface AsyncFunction<I, O> {
    C18728c<O> apply(I i) throws Exception;
}
