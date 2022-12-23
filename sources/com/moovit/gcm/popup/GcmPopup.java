package com.moovit.gcm.popup;

import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.MoovitActivity;
import com.moovit.gcm.condition.GcmCondition;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.gcm.payload.GcmPayload;
import g10.C17137a;
import p583jk.C17884p;

public abstract class GcmPopup implements Parcelable, C17137a {

    /* renamed from: b */
    public final GcmCondition f41608b;

    /* renamed from: c */
    public final GcmPayload f41609c;

    /* renamed from: d */
    public final GcmNotification f41610d;

    public GcmPopup(GcmCondition gcmCondition, GcmPayload gcmPayload, GcmNotification gcmNotification) {
        C21100e.m49373x(gcmCondition, "condition");
        this.f41608b = gcmCondition;
        C21100e.m49373x(gcmPayload, "payload");
        this.f41609c = gcmPayload;
        this.f41610d = gcmNotification;
    }

    /* renamed from: b */
    public final GcmCondition mo47961b() {
        return this.f41608b;
    }

    /* renamed from: c */
    public boolean mo48118c() {
        return false;
    }

    /* renamed from: d */
    public abstract void mo48119d(MoovitActivity moovitActivity);

    public final boolean equals(Object obj) {
        if (!(obj instanceof GcmPopup)) {
            return false;
        }
        return this.f41609c.equals(((GcmPopup) obj).f41609c);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f41609c);
    }
}
