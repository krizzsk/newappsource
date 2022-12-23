package com.amazonaws.util;

final class TimingInfoUnmodifiable extends TimingInfo {
    public TimingInfoUnmodifiable(Long l, long j, Long l2) {
        super(l, j, l2);
    }

    public TimingInfo endTiming() {
        throw new UnsupportedOperationException();
    }

    public void setEndTime(long j) {
        throw new UnsupportedOperationException();
    }

    public void setEndTimeNano(long j) {
        throw new UnsupportedOperationException();
    }
}
