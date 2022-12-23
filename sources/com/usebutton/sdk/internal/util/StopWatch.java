package com.usebutton.sdk.internal.util;

import android.os.SystemClock;
import com.usebutton.sdk.internal.functional.Pair;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0016g;

public class StopWatch {
    private static final String TAG = "StopWatch";
    private final List<Pair<Long, String>> laps = new ArrayList();
    private final long start = SystemClock.uptimeMillis();

    public void lap(String str) {
        this.laps.add(new Pair(Long.valueOf(SystemClock.uptimeMillis()), str));
    }

    public void stop(String str) {
        StringBuilder t = C0016g.m36t(str, " took: ");
        t.append(SystemClock.uptimeMillis() - this.start);
        t.append("ms");
        StringBuffer stringBuffer = new StringBuffer(t.toString());
        long j = this.start;
        for (Pair next : this.laps) {
            stringBuffer.append("\n - @");
            stringBuffer.append(((Long) next.first()).longValue() - this.start);
            stringBuffer.append("ms, Δ");
            stringBuffer.append(((Long) next.first()).longValue() - j);
            stringBuffer.append("ms :");
            stringBuffer.append((String) next.second());
            j = ((Long) next.first()).longValue();
        }
        ButtonLog.info(TAG, stringBuffer.toString());
    }
}
