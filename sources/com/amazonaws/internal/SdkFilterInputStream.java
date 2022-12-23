package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SdkFilterInputStream extends FilterInputStream implements MetricAware {
    public SdkFilterInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public void abort() {
    }

    public final void abortIfNeeded() {
        if (Thread.interrupted()) {
            abort();
            throw new AbortedException();
        }
    }

    public int available() throws IOException {
        abortIfNeeded();
        return this.in.available();
    }

    public void close() throws IOException {
        this.in.close();
        abortIfNeeded();
    }

    @Deprecated
    public boolean isMetricActivated() {
        if (this.in instanceof MetricAware) {
            return ((MetricAware) this.in).isMetricActivated();
        }
        return false;
    }

    public synchronized void mark(int i) {
        abortIfNeeded();
        this.in.mark(i);
    }

    public boolean markSupported() {
        abortIfNeeded();
        return this.in.markSupported();
    }

    public int read() throws IOException {
        abortIfNeeded();
        return this.in.read();
    }

    public synchronized void reset() throws IOException {
        abortIfNeeded();
        this.in.reset();
    }

    public long skip(long j) throws IOException {
        abortIfNeeded();
        return this.in.skip(j);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        abortIfNeeded();
        return this.in.read(bArr, i, i2);
    }
}
