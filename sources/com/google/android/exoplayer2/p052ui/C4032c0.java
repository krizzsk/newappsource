package com.google.android.exoplayer2.p052ui;

/* renamed from: com.google.android.exoplayer2.ui.c0 */
public interface C4032c0 {

    /* renamed from: com.google.android.exoplayer2.ui.c0$a */
    public interface C4033a {
        /* renamed from: a */
        void mo16432a(long j);

        /* renamed from: c */
        void mo16435c(long j);

        /* renamed from: d */
        void mo16436d(long j, boolean z);
    }

    /* renamed from: a */
    void mo16352a(C4033a aVar);

    /* renamed from: b */
    void mo16353b(long[] jArr, boolean[] zArr, int i);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
