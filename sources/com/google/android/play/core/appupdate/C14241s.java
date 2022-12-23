package com.google.android.play.core.appupdate;

/* renamed from: com.google.android.play.core.appupdate.s */
public final class C14241s extends C14225c {

    /* renamed from: a */
    public final int f35785a;

    /* renamed from: b */
    public final boolean f35786b;

    public /* synthetic */ C14241s(int i, boolean z) {
        this.f35785a = i;
        this.f35786b = z;
    }

    /* renamed from: a */
    public final boolean mo42694a() {
        return this.f35786b;
    }

    /* renamed from: b */
    public final int mo42695b() {
        return this.f35785a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14225c) {
            C14225c cVar = (C14225c) obj;
            if (this.f35785a == cVar.mo42695b() && this.f35786b == cVar.mo42694a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f35785a ^ 1000003) * 1000003) ^ (true != this.f35786b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f35785a;
        boolean z = this.f35786b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
