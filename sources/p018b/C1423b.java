package p018b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b.b */
public abstract class C1423b extends Binder implements IInterface {
    public C1423b() {
        attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
    }

    public final IBinder asBinder() {
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: android.os.Bundle} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x017c, code lost:
        if (p266u.C6672a.m15753b(r10.f1681b, r4) == false) goto L_0x0185;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) throws android.os.RemoteException {
        /*
            r9 = this;
            r0 = 1
            r1 = 9
            r2 = 0
            java.lang.String r3 = "android.support.customtabs.trusted.ITrustedWebActivityService"
            if (r10 == r1) goto L_0x019b
            r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r10 == r1) goto L_0x0197
            java.lang.String r1 = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS"
            r4 = 26
            java.lang.String r5 = "android.support.customtabs.trusted.CHANNEL_NAME"
            java.lang.String r6 = "android.support.customtabs.trusted.PLATFORM_ID"
            java.lang.String r7 = "android.support.customtabs.trusted.PLATFORM_TAG"
            r8 = 0
            switch(r10) {
                case 2: goto L_0x0120;
                case 3: goto L_0x00ec;
                case 4: goto L_0x00d6;
                case 5: goto L_0x00a0;
                case 6: goto L_0x004f;
                case 7: goto L_0x0020;
                default: goto L_0x001b;
            }
        L_0x001b:
            boolean r10 = super.onTransact(r10, r11, r12, r13)
            return r10
        L_0x0020:
            r11.enforceInterface(r3)
            r10 = r9
            androidx.browser.trusted.TrustedWebActivityService$a r10 = (androidx.browser.trusted.TrustedWebActivityService.C0492a) r10
            r10.mo2232G()
            androidx.browser.trusted.TrustedWebActivityService r10 = androidx.browser.trusted.TrustedWebActivityService.this
            int r11 = r10.mo2228d()
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            r1 = -1
            if (r11 != r1) goto L_0x0038
            goto L_0x0045
        L_0x0038:
            android.content.res.Resources r10 = r10.getResources()
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeResource(r10, r11)
            java.lang.String r11 = "android.support.customtabs.trusted.SMALL_ICON_BITMAP"
            r13.putParcelable(r11, r10)
        L_0x0045:
            r12.writeNoException()
            r12.writeInt(r0)
            r13.writeToParcel(r12, r0)
            return r0
        L_0x004f:
            r11.enforceInterface(r3)
            int r10 = r11.readInt()
            if (r10 == 0) goto L_0x0061
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            java.lang.Object r10 = r10.createFromParcel(r11)
            r8 = r10
            android.os.Bundle r8 = (android.os.Bundle) r8
        L_0x0061:
            r10 = r9
            androidx.browser.trusted.TrustedWebActivityService$a r10 = (androidx.browser.trusted.TrustedWebActivityService.C0492a) r10
            r10.mo2232G()
            ce0.C21100e.m49321P(r8, r5)
            java.lang.String r11 = r8.getString(r5)
            androidx.browser.trusted.TrustedWebActivityService r10 = androidx.browser.trusted.TrustedWebActivityService.this
            r10.mo2226b()
            androidx.core.app.NotificationManagerCompat r13 = androidx.core.app.NotificationManagerCompat.from(r10)
            boolean r13 = r13.areNotificationsEnabled()
            if (r13 != 0) goto L_0x007e
            goto L_0x008e
        L_0x007e:
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 >= r4) goto L_0x0084
            r2 = 1
            goto L_0x008e
        L_0x0084:
            android.app.NotificationManager r10 = r10.f1681b
            java.lang.String r11 = androidx.browser.trusted.TrustedWebActivityService.m1361a(r11)
            boolean r2 = p266u.C6672a.m15753b(r10, r11)
        L_0x008e:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            r10.putBoolean(r1, r2)
            r12.writeNoException()
            r12.writeInt(r0)
            r10.writeToParcel(r12, r0)
            return r0
        L_0x00a0:
            r11.enforceInterface(r3)
            r10 = r9
            androidx.browser.trusted.TrustedWebActivityService$a r10 = (androidx.browser.trusted.TrustedWebActivityService.C0492a) r10
            r10.mo2232G()
            androidx.browser.trusted.TrustedWebActivityService r10 = androidx.browser.trusted.TrustedWebActivityService.this
            r10.mo2226b()
            int r11 = android.os.Build.VERSION.SDK_INT
            r13 = 23
            if (r11 < r13) goto L_0x00ce
            android.app.NotificationManager r10 = r10.f1681b
            android.service.notification.StatusBarNotification[] r10 = r10.getActiveNotifications()
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r13 = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS"
            r11.putParcelableArray(r13, r10)
            r12.writeNoException()
            r12.writeInt(r0)
            r11.writeToParcel(r12, r0)
            return r0
        L_0x00ce:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "onGetActiveNotifications cannot be called pre-M."
            r10.<init>(r11)
            throw r10
        L_0x00d6:
            r11.enforceInterface(r3)
            r10 = r9
            androidx.browser.trusted.TrustedWebActivityService$a r10 = (androidx.browser.trusted.TrustedWebActivityService.C0492a) r10
            r10.mo2232G()
            androidx.browser.trusted.TrustedWebActivityService r10 = androidx.browser.trusted.TrustedWebActivityService.this
            int r10 = r10.mo2228d()
            r12.writeNoException()
            r12.writeInt(r10)
            return r0
        L_0x00ec:
            r11.enforceInterface(r3)
            int r10 = r11.readInt()
            if (r10 == 0) goto L_0x00fe
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            java.lang.Object r10 = r10.createFromParcel(r11)
            r8 = r10
            android.os.Bundle r8 = (android.os.Bundle) r8
        L_0x00fe:
            r10 = r9
            androidx.browser.trusted.TrustedWebActivityService$a r10 = (androidx.browser.trusted.TrustedWebActivityService.C0492a) r10
            r10.mo2232G()
            ce0.C21100e.m49321P(r8, r7)
            ce0.C21100e.m49321P(r8, r6)
            java.lang.String r11 = r8.getString(r7)
            int r13 = r8.getInt(r6)
            androidx.browser.trusted.TrustedWebActivityService r10 = androidx.browser.trusted.TrustedWebActivityService.this
            r10.mo2226b()
            android.app.NotificationManager r10 = r10.f1681b
            r10.cancel(r11, r13)
            r12.writeNoException()
            return r0
        L_0x0120:
            r11.enforceInterface(r3)
            int r10 = r11.readInt()
            if (r10 == 0) goto L_0x0132
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            java.lang.Object r10 = r10.createFromParcel(r11)
            r8 = r10
            android.os.Bundle r8 = (android.os.Bundle) r8
        L_0x0132:
            r10 = r9
            androidx.browser.trusted.TrustedWebActivityService$a r10 = (androidx.browser.trusted.TrustedWebActivityService.C0492a) r10
            r10.mo2232G()
            ce0.C21100e.m49321P(r8, r7)
            ce0.C21100e.m49321P(r8, r6)
            java.lang.String r11 = "android.support.customtabs.trusted.NOTIFICATION"
            ce0.C21100e.m49321P(r8, r11)
            ce0.C21100e.m49321P(r8, r5)
            java.lang.String r13 = r8.getString(r7)
            int r3 = r8.getInt(r6)
            android.os.Parcelable r11 = r8.getParcelable(r11)
            android.app.Notification r11 = (android.app.Notification) r11
            java.lang.String r5 = r8.getString(r5)
            androidx.browser.trusted.TrustedWebActivityService r10 = androidx.browser.trusted.TrustedWebActivityService.this
            r10.mo2226b()
            androidx.core.app.NotificationManagerCompat r6 = androidx.core.app.NotificationManagerCompat.from(r10)
            boolean r6 = r6.areNotificationsEnabled()
            if (r6 != 0) goto L_0x0168
            goto L_0x0185
        L_0x0168:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L_0x017f
            java.lang.String r4 = androidx.browser.trusted.TrustedWebActivityService.m1361a(r5)
            android.app.NotificationManager r6 = r10.f1681b
            android.app.Notification r11 = p266u.C6672a.m15752a(r10, r6, r11, r4, r5)
            android.app.NotificationManager r5 = r10.f1681b
            boolean r4 = p266u.C6672a.m15753b(r5, r4)
            if (r4 != 0) goto L_0x017f
            goto L_0x0185
        L_0x017f:
            android.app.NotificationManager r10 = r10.f1681b
            r10.notify(r13, r3, r11)
            r2 = 1
        L_0x0185:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            r10.putBoolean(r1, r2)
            r12.writeNoException()
            r12.writeInt(r0)
            r10.writeToParcel(r12, r0)
            return r0
        L_0x0197:
            r12.writeString(r3)
            return r0
        L_0x019b:
            r11.enforceInterface(r3)
            r11.readString()
            int r10 = r11.readInt()
            if (r10 == 0) goto L_0x01af
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            java.lang.Object r10 = r10.createFromParcel(r11)
            android.os.Bundle r10 = (android.os.Bundle) r10
        L_0x01af:
            android.os.IBinder r10 = r11.readStrongBinder()
            r11 = r9
            androidx.browser.trusted.TrustedWebActivityService$a r11 = (androidx.browser.trusted.TrustedWebActivityService.C0492a) r11
            r11.mo2232G()
            androidx.browser.trusted.TrustedWebActivityService r11 = androidx.browser.trusted.TrustedWebActivityService.this
            if (r10 != 0) goto L_0x01be
            goto L_0x01cc
        L_0x01be:
            java.lang.String r13 = "android.support.customtabs.trusted.ITrustedWebActivityCallback"
            android.os.IInterface r10 = r10.queryLocalInterface(r13)
            if (r10 == 0) goto L_0x01cc
            boolean r13 = r10 instanceof p018b.C1422a
            if (r13 == 0) goto L_0x01cc
            b.a r10 = (p018b.C1422a) r10
        L_0x01cc:
            r11.getClass()
            r12.writeNoException()
            r12.writeInt(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p018b.C1423b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
