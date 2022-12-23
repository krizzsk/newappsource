package com.google.android.play.core.review;

import android.app.PendingIntent;

final class zza extends ReviewInfo {

    /* renamed from: b */
    public final PendingIntent f36151b;

    /* renamed from: c */
    public final boolean f36152c;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.f36151b = pendingIntent;
            this.f36152c = z;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    /* renamed from: b */
    public final PendingIntent mo42948b() {
        return this.f36151b;
    }

    /* renamed from: c */
    public final boolean mo42949c() {
        return this.f36152c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (!this.f36151b.equals(reviewInfo.mo42948b()) || this.f36152c != reviewInfo.mo42949c()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f36151b.hashCode() ^ 1000003) * 1000003) ^ (true != this.f36152c ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f36151b.toString();
        boolean z = this.f36152c;
        StringBuilder sb = new StringBuilder(obj.length() + 40);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(obj);
        sb.append(", isNoOp=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
