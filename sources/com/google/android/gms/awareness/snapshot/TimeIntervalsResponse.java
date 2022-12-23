package com.google.android.gms.awareness.snapshot;

import com.google.android.gms.awareness.state.TimeIntervals;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.internal.Preconditions;

public class TimeIntervalsResponse extends Response<TimeIntervalsResult> {
    public TimeIntervals getTimeIntervals() {
        return (TimeIntervals) Preconditions.checkNotNull(((TimeIntervalsResult) getResult()).getTimeIntervals());
    }
}
