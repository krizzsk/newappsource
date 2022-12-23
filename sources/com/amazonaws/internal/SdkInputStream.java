package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import com.amazonaws.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;

public abstract class SdkInputStream extends InputStream implements MetricAware {
    public void abort() throws IOException {
    }

    public final void abortIfNeeded() {
        if (Thread.interrupted()) {
            try {
                abort();
            } catch (IOException e) {
                LogFactory.getLog(getClass()).debug("FYI", e);
            }
            throw new AbortedException();
        }
    }

    public abstract InputStream getWrappedInputStream();

    @Deprecated
    public final boolean isMetricActivated() {
        InputStream wrappedInputStream = getWrappedInputStream();
        if (wrappedInputStream instanceof MetricAware) {
            return ((MetricAware) wrappedInputStream).isMetricActivated();
        }
        return false;
    }
}
