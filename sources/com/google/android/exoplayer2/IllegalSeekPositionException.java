package com.google.android.exoplayer2;

import p099ga.C4879e1;

public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final C4879e1 timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(C4879e1 e1Var, int i, long j) {
        this.timeline = e1Var;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
