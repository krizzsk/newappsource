package com.google.android.exoplayer2.scheduler;

import android.os.Parcel;
import android.os.Parcelable;

public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new C3980a();

    /* renamed from: b */
    public final int f14007b;

    /* renamed from: com.google.android.exoplayer2.scheduler.Requirements$a */
    public class C3980a implements Parcelable.Creator<Requirements> {
        public final Object createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new Requirements[i];
        }
    }

    public Requirements(int i) {
        this.f14007b = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16270b(android.content.Context r10) {
        /*
            r9 = this;
            int r0 = r9.f14007b
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 == 0) goto L_0x0009
            r0 = 1
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            r3 = 2
            r4 = 16
            if (r0 != 0) goto L_0x0010
            goto L_0x0059
        L_0x0010:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r10.getSystemService(r0)
            r0.getClass()
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r5 = r0.getActiveNetworkInfo()
            if (r5 == 0) goto L_0x005b
            boolean r5 = r5.isConnected()
            if (r5 == 0) goto L_0x005b
            int r5 = p277ub.C6774a0.f20959a
            r6 = 24
            if (r5 >= r6) goto L_0x002e
            goto L_0x0041
        L_0x002e:
            android.net.Network r5 = r0.getActiveNetwork()
            if (r5 != 0) goto L_0x0035
            goto L_0x0043
        L_0x0035:
            android.net.NetworkCapabilities r5 = r0.getNetworkCapabilities(r5)
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.hasCapability(r4)
            if (r5 == 0) goto L_0x0043
        L_0x0041:
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            if (r5 != 0) goto L_0x0047
            goto L_0x005b
        L_0x0047:
            int r5 = r9.f14007b
            r5 = r5 & r3
            if (r5 == 0) goto L_0x004e
            r5 = 1
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            if (r5 == 0) goto L_0x0059
            boolean r0 = r0.isActiveNetworkMetered()
            if (r0 == 0) goto L_0x0059
            r0 = 2
            goto L_0x005f
        L_0x0059:
            r0 = 0
            goto L_0x005f
        L_0x005b:
            int r0 = r9.f14007b
            r0 = r0 & 3
        L_0x005f:
            int r5 = r9.f14007b
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0067
            r5 = 1
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            r6 = 0
            if (r5 == 0) goto L_0x008d
            android.content.IntentFilter r5 = new android.content.IntentFilter
            java.lang.String r7 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r7)
            android.content.Intent r5 = r10.registerReceiver(r6, r5)
            if (r5 != 0) goto L_0x0079
            goto L_0x0086
        L_0x0079:
            r7 = -1
            java.lang.String r8 = "status"
            int r5 = r5.getIntExtra(r8, r7)
            if (r5 == r3) goto L_0x0088
            r3 = 5
            if (r5 != r3) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r3 = 0
            goto L_0x0089
        L_0x0088:
            r3 = 1
        L_0x0089:
            if (r3 != 0) goto L_0x008d
            r0 = r0 | 8
        L_0x008d:
            int r3 = r9.f14007b
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0095
            r3 = 1
            goto L_0x0096
        L_0x0095:
            r3 = 0
        L_0x0096:
            if (r3 == 0) goto L_0x00c6
            java.lang.String r3 = "power"
            java.lang.Object r3 = r10.getSystemService(r3)
            r3.getClass()
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            int r5 = p277ub.C6774a0.f20959a
            r7 = 23
            if (r5 < r7) goto L_0x00ae
            boolean r3 = r3.isDeviceIdleMode()
            goto L_0x00c2
        L_0x00ae:
            r7 = 20
            if (r5 < r7) goto L_0x00b9
            boolean r3 = r3.isInteractive()
            if (r3 != 0) goto L_0x00c1
            goto L_0x00bf
        L_0x00b9:
            boolean r3 = r3.isScreenOn()
            if (r3 != 0) goto L_0x00c1
        L_0x00bf:
            r3 = 1
            goto L_0x00c2
        L_0x00c1:
            r3 = 0
        L_0x00c2:
            if (r3 != 0) goto L_0x00c6
            r0 = r0 | 4
        L_0x00c6:
            int r3 = r9.f14007b
            r3 = r3 & r4
            if (r3 == 0) goto L_0x00cd
            r3 = 1
            goto L_0x00ce
        L_0x00cd:
            r3 = 0
        L_0x00ce:
            if (r3 == 0) goto L_0x00e3
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "android.intent.action.DEVICE_STORAGE_LOW"
            r3.<init>(r4)
            android.content.Intent r10 = r10.registerReceiver(r6, r3)
            if (r10 != 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            r1 = 0
        L_0x00df:
            if (r1 != 0) goto L_0x00e3
            r0 = r0 | 16
        L_0x00e3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.scheduler.Requirements.mo16270b(android.content.Context):int");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Requirements.class == obj.getClass() && this.f14007b == ((Requirements) obj).f14007b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14007b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14007b);
    }
}
