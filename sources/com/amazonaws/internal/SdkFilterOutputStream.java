package com.amazonaws.internal;

import java.io.FilterOutputStream;
import java.io.OutputStream;

@Deprecated
public class SdkFilterOutputStream extends FilterOutputStream implements MetricAware {
    public SdkFilterOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public boolean isMetricActivated() {
        OutputStream outputStream = this.out;
        if (outputStream instanceof MetricAware) {
            return ((MetricAware) outputStream).isMetricActivated();
        }
        return false;
    }
}
