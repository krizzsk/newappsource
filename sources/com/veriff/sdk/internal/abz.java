package com.veriff.sdk.internal;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public interface abz extends Closeable, Flushable {
    /* renamed from: a */
    acb mo53674a();

    /* renamed from: a_ */
    void mo53675a_(abi abi, long j) throws IOException;

    void close() throws IOException;

    void flush() throws IOException;
}
