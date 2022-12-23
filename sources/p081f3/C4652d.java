package p081f3;

import android.app.Notification;
import p358af.C13437d;

/* renamed from: f3.d */
public final class C4652d {

    /* renamed from: a */
    public final int f15895a;

    /* renamed from: b */
    public final int f15896b;

    /* renamed from: c */
    public final Notification f15897c;

    public C4652d(int i, int i2, Notification notification) {
        this.f15895a = i;
        this.f15897c = notification;
        this.f15896b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4652d.class != obj.getClass()) {
            return false;
        }
        C4652d dVar = (C4652d) obj;
        if (this.f15895a == dVar.f15895a && this.f15896b == dVar.f15896b) {
            return this.f15897c.equals(dVar.f15897c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15897c.hashCode() + (((this.f15895a * 31) + this.f15896b) * 31);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("ForegroundInfo{", "mNotificationId=");
        n.append(this.f15895a);
        n.append(", mForegroundServiceType=");
        n.append(this.f15896b);
        n.append(", mNotification=");
        n.append(this.f15897c);
        n.append('}');
        return n.toString();
    }
}
