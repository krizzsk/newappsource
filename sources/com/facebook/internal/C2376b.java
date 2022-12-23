package com.facebook.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import mf0.C24362h;
import p009a8.C0098d0;
import p009a8.C0115o;

/* renamed from: com.facebook.internal.b */
public final class C2376b {

    /* renamed from: f */
    public static C2376b f8604f;

    /* renamed from: a */
    public String f8605a;

    /* renamed from: b */
    public long f8606b;

    /* renamed from: c */
    public String f8607c;

    /* renamed from: d */
    public String f8608d;

    /* renamed from: e */
    public boolean f8609e;

    /* renamed from: com.facebook.internal.b$a */
    public static final class C2377a {
        /* JADX WARNING: Can't wrap try/catch for region: R(3:40|41|42) */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d2, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            r4 = com.facebook.internal.C2397f0.f8630a;
            r4 = p009a8.C0115o.f331a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dc, code lost:
            r1.unbindService(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00df, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00d4 */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x01ed  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x01f6  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0039 A[Catch:{ Exception -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x003a A[Catch:{ Exception -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7 A[Catch:{ Exception -> 0x01dd, all -> 0x0174 }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x015b A[Catch:{ Exception -> 0x01dd, all -> 0x0174 }] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x015d A[Catch:{ Exception -> 0x01dd, all -> 0x0174 }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0167 A[Catch:{ Exception -> 0x01dd, all -> 0x0174 }] */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x016b A[Catch:{ Exception -> 0x01dd, all -> 0x0174 }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0177 A[Catch:{ Exception -> 0x01dd, all -> 0x0174 }] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x01d5 A[SYNTHETIC, Splitter:B:99:0x01d5] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.facebook.internal.C2376b m6272a(android.content.Context r17) {
            /*
                r1 = r17
                java.lang.String r0 = "limit_tracking"
                java.lang.String r2 = "androidid"
                java.lang.String r3 = "aid"
                r4 = 1
                r5 = 0
                r6 = 0
                com.facebook.internal.f0 r7 = com.facebook.internal.C2397f0.f8630a     // Catch:{ Exception -> 0x0095 }
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0095 }
                java.lang.Class<android.content.Context> r8 = android.content.Context.class
                r7[r5] = r8     // Catch:{ Exception -> 0x0095 }
                java.lang.String r8 = "com.google.android.gms.common.GooglePlayServicesUtil"
                java.lang.String r9 = "isGooglePlayServicesAvailable"
                java.lang.reflect.Method r7 = com.facebook.internal.C2397f0.m6325s(r8, r9, r7)     // Catch:{ Exception -> 0x0095 }
                if (r7 != 0) goto L_0x001e
                goto L_0x0036
            L_0x001e:
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0095 }
                r8[r5] = r1     // Catch:{ Exception -> 0x0095 }
                java.lang.Object r7 = com.facebook.internal.C2397f0.m6328v(r6, r7, r8)     // Catch:{ Exception -> 0x0095 }
                boolean r8 = r7 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0095 }
                if (r8 == 0) goto L_0x0036
                java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0095 }
                boolean r7 = mf0.C24362h.m61206a(r7, r8)     // Catch:{ Exception -> 0x0095 }
                if (r7 == 0) goto L_0x0036
                r7 = 1
                goto L_0x0037
            L_0x0036:
                r7 = 0
            L_0x0037:
                if (r7 != 0) goto L_0x003a
                goto L_0x0099
            L_0x003a:
                java.lang.String r7 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
                java.lang.String r8 = "getAdvertisingIdInfo"
                java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0095 }
                java.lang.Class<android.content.Context> r10 = android.content.Context.class
                r9[r5] = r10     // Catch:{ Exception -> 0x0095 }
                java.lang.reflect.Method r7 = com.facebook.internal.C2397f0.m6325s(r7, r8, r9)     // Catch:{ Exception -> 0x0095 }
                if (r7 != 0) goto L_0x004b
                goto L_0x0099
            L_0x004b:
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0095 }
                r8[r5] = r1     // Catch:{ Exception -> 0x0095 }
                java.lang.Object r7 = com.facebook.internal.C2397f0.m6328v(r6, r7, r8)     // Catch:{ Exception -> 0x0095 }
                if (r7 != 0) goto L_0x0056
                goto L_0x0099
            L_0x0056:
                java.lang.Class r8 = r7.getClass()     // Catch:{ Exception -> 0x0095 }
                java.lang.String r9 = "getId"
                java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0095 }
                java.lang.reflect.Method r8 = com.facebook.internal.C2397f0.m6324r(r8, r9, r10)     // Catch:{ Exception -> 0x0095 }
                java.lang.Class r9 = r7.getClass()     // Catch:{ Exception -> 0x0095 }
                java.lang.String r10 = "isLimitAdTrackingEnabled"
                java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0095 }
                java.lang.reflect.Method r9 = com.facebook.internal.C2397f0.m6324r(r9, r10, r11)     // Catch:{ Exception -> 0x0095 }
                if (r8 == 0) goto L_0x0099
                if (r9 != 0) goto L_0x0073
                goto L_0x0099
            L_0x0073:
                com.facebook.internal.b r10 = new com.facebook.internal.b     // Catch:{ Exception -> 0x0095 }
                r10.<init>()     // Catch:{ Exception -> 0x0095 }
                java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0095 }
                java.lang.Object r8 = com.facebook.internal.C2397f0.m6328v(r7, r8, r11)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0095 }
                r10.f8605a = r8     // Catch:{ Exception -> 0x0095 }
                java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0095 }
                java.lang.Object r7 = com.facebook.internal.C2397f0.m6328v(r7, r9, r8)     // Catch:{ Exception -> 0x0095 }
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Exception -> 0x0095 }
                if (r7 != 0) goto L_0x008e
                r7 = 0
                goto L_0x0092
            L_0x008e:
                boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x0095 }
            L_0x0092:
                r10.f8609e = r7     // Catch:{ Exception -> 0x0095 }
                goto L_0x009a
            L_0x0095:
                com.facebook.internal.f0 r7 = com.facebook.internal.C2397f0.f8630a
                a8.o r7 = p009a8.C0115o.f331a
            L_0x0099:
                r10 = r6
            L_0x009a:
                if (r10 != 0) goto L_0x00e9
                com.facebook.internal.b$c r7 = new com.facebook.internal.b$c
                r7.<init>()
                android.content.Intent r8 = new android.content.Intent
                java.lang.String r9 = "com.google.android.gms.ads.identifier.service.START"
                r8.<init>(r9)
                java.lang.String r9 = "com.google.android.gms"
                r8.setPackage(r9)
                boolean r4 = r1.bindService(r8, r7, r4)     // Catch:{ SecurityException -> 0x00e0 }
                if (r4 == 0) goto L_0x00e1
                com.facebook.internal.b$b r4 = new com.facebook.internal.b$b     // Catch:{ Exception -> 0x00d4 }
                android.os.IBinder r8 = r7.mo12545a()     // Catch:{ Exception -> 0x00d4 }
                r4.<init>(r8)     // Catch:{ Exception -> 0x00d4 }
                com.facebook.internal.b r8 = new com.facebook.internal.b     // Catch:{ Exception -> 0x00d4 }
                r8.<init>()     // Catch:{ Exception -> 0x00d4 }
                java.lang.String r9 = r4.mo12542G()     // Catch:{ Exception -> 0x00d4 }
                r8.f8605a = r9     // Catch:{ Exception -> 0x00d4 }
                boolean r4 = r4.mo12543H()     // Catch:{ Exception -> 0x00d4 }
                r8.f8609e = r4     // Catch:{ Exception -> 0x00d4 }
                r1.unbindService(r7)
                r10 = r8
                goto L_0x00e2
            L_0x00d2:
                r0 = move-exception
                goto L_0x00dc
            L_0x00d4:
                com.facebook.internal.f0 r4 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x00d2 }
                a8.o r4 = p009a8.C0115o.f331a     // Catch:{ all -> 0x00d2 }
                r1.unbindService(r7)
                goto L_0x00e1
            L_0x00dc:
                r1.unbindService(r7)
                throw r0
            L_0x00e0:
            L_0x00e1:
                r10 = r6
            L_0x00e2:
                if (r10 != 0) goto L_0x00e9
                com.facebook.internal.b r10 = new com.facebook.internal.b
                r10.<init>()
            L_0x00e9:
                android.os.Looper r4 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                android.os.Looper r7 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                boolean r4 = mf0.C24362h.m61206a(r4, r7)     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                if (r4 != 0) goto L_0x01d5
                com.facebook.internal.b r4 = com.facebook.internal.C2376b.f8604f     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                if (r4 == 0) goto L_0x010a
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                long r11 = r4.f8606b     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                long r7 = r7 - r11
                r11 = 3600000(0x36ee80, double:1.7786363E-317)
                int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r9 >= 0) goto L_0x010a
                return r4
            L_0x010a:
                java.lang.String[] r13 = new java.lang.String[]{r3, r2, r0}     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                android.content.pm.PackageManager r4 = r17.getPackageManager()     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                java.lang.String r7 = "com.facebook.katana.provider.AttributionIdProvider"
                android.content.pm.ProviderInfo r4 = r4.resolveContentProvider(r7, r5)     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                android.content.pm.PackageManager r7 = r17.getPackageManager()     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                java.lang.String r8 = "com.facebook.wakizashi.provider.AttributionIdProvider"
                android.content.pm.ProviderInfo r5 = r7.resolveContentProvider(r8, r5)     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                if (r4 == 0) goto L_0x013a
                java.util.HashSet<java.lang.String> r7 = com.facebook.internal.C2424o.f8697a     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                java.lang.String r4 = r4.packageName     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                java.lang.String r7 = "contentProviderInfo.packageName"
                mf0.C24362h.m61210e(r4, r7)     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                boolean r4 = com.facebook.internal.C2424o.m6376a(r1, r4)     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                if (r4 == 0) goto L_0x013a
                java.lang.String r4 = "content://com.facebook.katana.provider.AttributionIdProvider"
                android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                goto L_0x0152
            L_0x013a:
                if (r5 == 0) goto L_0x0154
                java.util.HashSet<java.lang.String> r4 = com.facebook.internal.C2424o.f8697a     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                java.lang.String r4 = r5.packageName     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                java.lang.String r5 = "wakizashiProviderInfo.packageName"
                mf0.C24362h.m61210e(r4, r5)     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                boolean r4 = com.facebook.internal.C2424o.m6376a(r1, r4)     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                if (r4 == 0) goto L_0x0154
                java.lang.String r4 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
                android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
            L_0x0152:
                r12 = r4
                goto L_0x0155
            L_0x0154:
                r12 = r6
            L_0x0155:
                android.content.pm.PackageManager r4 = r17.getPackageManager()     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                if (r4 != 0) goto L_0x015d
                r4 = r6
                goto L_0x0165
            L_0x015d:
                java.lang.String r5 = r17.getPackageName()     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                java.lang.String r4 = r4.getInstallerPackageName(r5)     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
            L_0x0165:
                if (r4 == 0) goto L_0x0169
                r10.f8608d = r4     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
            L_0x0169:
                if (r12 != 0) goto L_0x0177
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                r10.f8606b = r0     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                com.facebook.internal.C2376b.f8604f = r10     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                return r10
            L_0x0174:
                r0 = move-exception
                goto L_0x01f3
            L_0x0177:
                android.content.ContentResolver r11 = r17.getContentResolver()     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                r14 = 0
                r15 = 0
                r16 = 0
                android.database.Cursor r1 = r11.query(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                if (r1 == 0) goto L_0x01c4
                boolean r4 = r1.moveToFirst()     // Catch:{ Exception -> 0x01d3 }
                if (r4 != 0) goto L_0x018c
                goto L_0x01c4
            L_0x018c:
                int r3 = r1.getColumnIndex(r3)     // Catch:{ Exception -> 0x01d3 }
                int r2 = r1.getColumnIndex(r2)     // Catch:{ Exception -> 0x01d3 }
                int r0 = r1.getColumnIndex(r0)     // Catch:{ Exception -> 0x01d3 }
                java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x01d3 }
                r10.f8607c = r3     // Catch:{ Exception -> 0x01d3 }
                if (r2 <= 0) goto L_0x01b8
                if (r0 <= 0) goto L_0x01b8
                java.lang.String r3 = r10.mo12541a()     // Catch:{ Exception -> 0x01d3 }
                if (r3 != 0) goto L_0x01b8
                java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x01d3 }
                r10.f8605a = r2     // Catch:{ Exception -> 0x01d3 }
                java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x01d3 }
                boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x01d3 }
                r10.f8609e = r0     // Catch:{ Exception -> 0x01d3 }
            L_0x01b8:
                r1.close()
                long r0 = java.lang.System.currentTimeMillis()
                r10.f8606b = r0
                com.facebook.internal.C2376b.f8604f = r10
                return r10
            L_0x01c4:
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01d3 }
                r10.f8606b = r2     // Catch:{ Exception -> 0x01d3 }
                com.facebook.internal.C2376b.f8604f = r10     // Catch:{ Exception -> 0x01d3 }
                if (r1 != 0) goto L_0x01cf
                goto L_0x01d2
            L_0x01cf:
                r1.close()
            L_0x01d2:
                return r10
            L_0x01d3:
                r0 = move-exception
                goto L_0x01df
            L_0x01d5:
                com.facebook.FacebookException r0 = new com.facebook.FacebookException     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                java.lang.String r1 = "getAttributionIdentifiers cannot be called on the main thread."
                r0.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
                throw r0     // Catch:{ Exception -> 0x01dd, all -> 0x0174 }
            L_0x01dd:
                r0 = move-exception
                r1 = r6
            L_0x01df:
                com.facebook.internal.f0 r2 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x01f1 }
                com.facebook.internal.b r2 = com.facebook.internal.C2376b.f8604f     // Catch:{ all -> 0x01f1 }
                java.lang.String r2 = "Caught unexpected exception in getAttributionId(): "
                mf0.C24362h.m61216k(r0, r2)     // Catch:{ all -> 0x01f1 }
                a8.o r0 = p009a8.C0115o.f331a     // Catch:{ all -> 0x01f1 }
                if (r1 != 0) goto L_0x01ed
                goto L_0x01f0
            L_0x01ed:
                r1.close()
            L_0x01f0:
                return r6
            L_0x01f1:
                r0 = move-exception
                r6 = r1
            L_0x01f3:
                if (r6 != 0) goto L_0x01f6
                goto L_0x01f9
            L_0x01f6:
                r6.close()
            L_0x01f9:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2376b.C2377a.m6272a(android.content.Context):com.facebook.internal.b");
        }
    }

    /* renamed from: com.facebook.internal.b$b */
    public static final class C2378b implements IInterface {

        /* renamed from: b */
        public final IBinder f8610b;

        public C2378b(IBinder iBinder) {
            this.f8610b = iBinder;
        }

        /* renamed from: G */
        public final String mo12542G() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            C24362h.m61210e(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            C24362h.m61210e(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f8610b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: H */
        public final boolean mo12543H() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            C24362h.m61210e(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            C24362h.m61210e(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f8610b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final IBinder asBinder() {
            return this.f8610b;
        }
    }

    /* renamed from: com.facebook.internal.b$c */
    public static final class C2379c implements ServiceConnection {

        /* renamed from: b */
        public final AtomicBoolean f8611b = new AtomicBoolean(false);

        /* renamed from: c */
        public final LinkedBlockingDeque f8612c = new LinkedBlockingDeque();

        /* renamed from: a */
        public final IBinder mo12545a() throws InterruptedException {
            if (!this.f8611b.compareAndSet(true, true)) {
                Object take = this.f8612c.take();
                C24362h.m61210e(take, "queue.take()");
                return (IBinder) take;
            }
            throw new IllegalStateException("Binder already consumed".toString());
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f8612c.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    public final String mo12541a() {
        if (!C0115o.m217h() || !C0098d0.m168a()) {
            return null;
        }
        return this.f8605a;
    }
}
