package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.p414v1.C14526h;
import com.google.firebase.perf.p414v1.SessionVerbosity;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import p258t4.C6587a;

public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new C14481a();

    /* renamed from: b */
    public final String f36650b;

    /* renamed from: c */
    public final Timer f36651c;

    /* renamed from: d */
    public boolean f36652d = false;

    /* renamed from: com.google.firebase.perf.session.PerfSession$a */
    public class C14481a implements Parcelable.Creator<PerfSession> {
        public final Object createFromParcel(Parcel parcel) {
            return new PerfSession(parcel);
        }

        public final Object[] newArray(int i) {
            return new PerfSession[i];
        }
    }

    public PerfSession(String str, C6587a aVar) {
        this.f36650b = str;
        this.f36651c = new Timer();
    }

    /* renamed from: c */
    public static C14526h[] m36080c(List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        C14526h[] hVarArr = new C14526h[list.size()];
        C14526h b = list.get(0).mo43491b();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            C14526h b2 = list.get(i).mo43491b();
            if (z || !list.get(i).f36652d) {
                hVarArr[i] = b2;
            } else {
                hVarArr[0] = b2;
                hVarArr[i] = b;
                z = true;
            }
        }
        if (!z) {
            hVarArr[0] = b;
        }
        return hVarArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        if (p578jf.C17823a.m44165q(r4) != false) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c6  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.firebase.perf.session.PerfSession m36081d() {
        /*
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "-"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            com.google.firebase.perf.session.PerfSession r1 = new com.google.firebase.perf.session.PerfSession
            t4.a r2 = new t4.a
            r2.<init>()
            r1.<init>(r0, r2)
            jf.a r0 = p578jf.C17823a.m44161e()
            boolean r2 = r0.mo50415p()
            if (r2 == 0) goto L_0x00cb
            double r2 = java.lang.Math.random()
            java.lang.Class<jf.p> r4 = p578jf.C17838p.class
            monitor-enter(r4)
            jf.p r5 = p578jf.C17838p.f45807b     // Catch:{ all -> 0x00c8 }
            if (r5 != 0) goto L_0x0036
            jf.p r5 = new jf.p     // Catch:{ all -> 0x00c8 }
            r5.<init>()     // Catch:{ all -> 0x00c8 }
            p578jf.C17838p.f45807b = r5     // Catch:{ all -> 0x00c8 }
        L_0x0036:
            jf.p r5 = p578jf.C17838p.f45807b     // Catch:{ all -> 0x00c8 }
            monitor-exit(r4)
            sf.b r4 = r0.mo50411i(r5)
            boolean r6 = r4.mo51862b()
            if (r6 == 0) goto L_0x0057
            java.lang.Object r4 = r4.mo51861a()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r6 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r6
            boolean r6 = p578jf.C17823a.m44165q(r4)
            if (r6 == 0) goto L_0x0057
            goto L_0x00c1
        L_0x0057:
            com.google.firebase.perf.config.RemoteConfigManager r4 = r0.f45790a
            java.lang.String r6 = "fpr_vc_session_sampling_rate"
            sf.b r4 = r4.getFloat(r6)
            boolean r6 = r4.mo51862b()
            if (r6 == 0) goto L_0x0091
            java.lang.Object r6 = r4.mo51861a()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            boolean r6 = p578jf.C17823a.m44165q(r6)
            if (r6 == 0) goto L_0x0091
            jf.t r0 = r0.f45792c
            java.lang.String r5 = "com.google.firebase.perf.SessionSamplingRate"
            java.lang.Object r6 = r4.mo51861a()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r0.mo50418c(r6, r5)
            java.lang.Object r0 = r4.mo51861a()
            java.lang.Float r0 = (java.lang.Float) r0
            float r4 = r0.floatValue()
            goto L_0x00c1
        L_0x0091:
            sf.b r0 = r0.mo50405b(r5)
            boolean r4 = r0.mo51862b()
            if (r4 == 0) goto L_0x00b6
            java.lang.Object r4 = r0.mo51861a()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            boolean r4 = p578jf.C17823a.m44165q(r4)
            if (r4 == 0) goto L_0x00b6
            java.lang.Object r0 = r0.mo51861a()
            java.lang.Float r0 = (java.lang.Float) r0
            float r4 = r0.floatValue()
            goto L_0x00c1
        L_0x00b6:
            r0 = 1008981770(0x3c23d70a, float:0.01)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r4 = r0.floatValue()
        L_0x00c1:
            double r4 = (double) r4
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cb
            r0 = 1
            goto L_0x00cc
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00cb:
            r0 = 0
        L_0x00cc:
            r1.f36652d = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.PerfSession.m36081d():com.google.firebase.perf.session.PerfSession");
    }

    /* renamed from: b */
    public final C14526h mo43491b() {
        C14526h.C14529c x = C14526h.m36210x();
        String str = this.f36650b;
        x.mo43956p();
        C14526h.m36208t((C14526h) x.f36809c, str);
        if (this.f36652d) {
            SessionVerbosity sessionVerbosity = SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
            x.mo43956p();
            C14526h.m36209u((C14526h) x.f36809c, sessionVerbosity);
        }
        return (C14526h) x.mo43954m();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36650b);
        parcel.writeByte(this.f36652d ? (byte) 1 : 0);
        parcel.writeParcelable(this.f36651c, 0);
    }

    public PerfSession(Parcel parcel) {
        boolean z = false;
        this.f36650b = parcel.readString();
        this.f36652d = parcel.readByte() != 0 ? true : z;
        this.f36651c = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
