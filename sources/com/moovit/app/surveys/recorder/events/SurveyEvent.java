package com.moovit.app.surveys.recorder.events;

import android.content.Context;
import android.os.Parcelable;

public abstract class SurveyEvent implements Parcelable {

    /* renamed from: b */
    public final int f39879b;

    /* renamed from: c */
    public final long f39880c;

    public SurveyEvent(int i, long j) {
        this.f39879b = i;
        this.f39880c = j;
    }

    /* renamed from: b */
    public void mo46040b(Context context) throws SurveyEventResolveException {
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
