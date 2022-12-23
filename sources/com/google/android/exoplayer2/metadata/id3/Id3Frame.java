package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p099ga.C4910k0;

public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: b */
    public final String f13927b;

    public Id3Frame(String str) {
        this.f13927b = str;
    }

    /* renamed from: X1 */
    public final /* synthetic */ byte[] mo16090X1() {
        return null;
    }

    /* renamed from: c2 */
    public /* synthetic */ void mo16091c2(C4910k0.C4911a aVar) {
    }

    /* renamed from: d0 */
    public final /* synthetic */ Format mo16092d0() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f13927b;
    }
}
