package p000a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import p253t.C6512d;

/* renamed from: a.b */
public interface C0003b extends IInterface {

    /* renamed from: a.b$a */
    public static abstract class C0004a extends Binder implements C0003b {

        /* renamed from: b */
        public static final /* synthetic */ int f2b = 0;

        /* renamed from: a.b$a$a */
        public static class C0005a implements C0003b {

            /* renamed from: b */
            public IBinder f3b;

            public C0005a(IBinder iBinder) {
                this.f3b = iBinder;
            }

            public final IBinder asBinder() {
                return this.f3b;
            }

            /* renamed from: f */
            public final boolean mo6f(C6512d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(dVar);
                    boolean z = false;
                    if (!this.f3b.transact(3, obtain, obtain2, 0)) {
                        int i = C0004a.f2b;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public final boolean mo7q(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    boolean z = false;
                    if (!this.f3b.transact(2, obtain, obtain2, 0)) {
                        int i = C0004a.f2b;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: v */
            public final boolean mo8v(C0000a aVar, Uri uri, Bundle bundle, ArrayList arrayList) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(arrayList);
                    if (!this.f3b.transact(4, obtain, obtain2, 0)) {
                        int i = C0004a.f2b;
                    }
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
        }

        public C0004a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        public final IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.customtabs.ICustomTabsService"
                if (r5 == r0) goto L_0x0259
                r0 = 0
                java.lang.String r3 = "CustomTabsSessionToken must have either a session id or a callback (or both)."
                switch(r5) {
                    case 2: goto L_0x0244;
                    case 3: goto L_0x022b;
                    case 4: goto L_0x01ee;
                    case 5: goto L_0x01c0;
                    case 6: goto L_0x0187;
                    case 7: goto L_0x0156;
                    case 8: goto L_0x011a;
                    case 9: goto L_0x00d0;
                    case 10: goto L_0x00a4;
                    case 11: goto L_0x005d;
                    case 12: goto L_0x0013;
                    default: goto L_0x000e;
                }
            L_0x000e:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0013:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m2G(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x002c
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
            L_0x002c:
                r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x003e
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x003e:
                r6 = r4
                androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.C0490a) r6
                androidx.browser.customtabs.CustomTabsService r6 = androidx.browser.customtabs.CustomTabsService.this
                android.app.PendingIntent r8 = androidx.browser.customtabs.CustomTabsService.C0490a.m1356G(r0)
                if (r5 != 0) goto L_0x0052
                if (r8 == 0) goto L_0x004c
                goto L_0x0052
            L_0x004c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r5.<init>(r3)
                throw r5
            L_0x0052:
                boolean r5 = r6.mo2218e()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x005d:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m2G(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0076
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
            L_0x0076:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0085
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0085:
                r6 = r4
                androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.C0490a) r6
                androidx.browser.customtabs.CustomTabsService r6 = androidx.browser.customtabs.CustomTabsService.this
                android.app.PendingIntent r8 = androidx.browser.customtabs.CustomTabsService.C0490a.m1356G(r0)
                if (r5 != 0) goto L_0x0099
                if (r8 == 0) goto L_0x0093
                goto L_0x0099
            L_0x0093:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r5.<init>(r3)
                throw r5
            L_0x0099:
                boolean r5 = r6.mo2219f()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00a4:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m2G(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00be
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00be:
                r6 = r4
                androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.C0490a) r6
                android.app.PendingIntent r8 = androidx.browser.customtabs.CustomTabsService.C0490a.m1356G(r0)
                boolean r5 = r6.mo2224H(r5, r8)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00d0:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m2G(r5)
                r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00ec
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
            L_0x00ec:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00fb
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00fb:
                r6 = r4
                androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.C0490a) r6
                androidx.browser.customtabs.CustomTabsService r6 = androidx.browser.customtabs.CustomTabsService.this
                android.app.PendingIntent r8 = androidx.browser.customtabs.CustomTabsService.C0490a.m1356G(r0)
                if (r5 != 0) goto L_0x010f
                if (r8 == 0) goto L_0x0109
                goto L_0x010f
            L_0x0109:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r5.<init>(r3)
                throw r5
            L_0x010f:
                boolean r5 = r6.mo2221h()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x011a:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m2G(r5)
                r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0137
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0137:
                r6 = r4
                androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.C0490a) r6
                androidx.browser.customtabs.CustomTabsService r6 = androidx.browser.customtabs.CustomTabsService.this
                android.app.PendingIntent r8 = androidx.browser.customtabs.CustomTabsService.C0490a.m1356G(r0)
                if (r5 != 0) goto L_0x014b
                if (r8 == 0) goto L_0x0145
                goto L_0x014b
            L_0x0145:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r5.<init>(r3)
                throw r5
            L_0x014b:
                int r5 = r6.mo2217d()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0156:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m2G(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x016f
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                android.net.Uri r6 = (android.net.Uri) r6
            L_0x016f:
                r6 = r4
                androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.C0490a) r6
                androidx.browser.customtabs.CustomTabsService r6 = androidx.browser.customtabs.CustomTabsService.this
                if (r5 == 0) goto L_0x0181
                boolean r5 = r6.mo2219f()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0181:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r5.<init>(r3)
                throw r5
            L_0x0187:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m2G(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x01a1
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x01a1:
                r6 = r4
                androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.C0490a) r6
                androidx.browser.customtabs.CustomTabsService r6 = androidx.browser.customtabs.CustomTabsService.this
                android.app.PendingIntent r8 = androidx.browser.customtabs.CustomTabsService.C0490a.m1356G(r0)
                if (r5 != 0) goto L_0x01b5
                if (r8 == 0) goto L_0x01af
                goto L_0x01b5
            L_0x01af:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r5.<init>(r3)
                throw r5
            L_0x01b5:
                boolean r5 = r6.mo2220g()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01c0:
                r6.enforceInterface(r2)
                r6.readString()
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x01d4
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
            L_0x01d4:
                r5 = r4
                androidx.browser.customtabs.CustomTabsService$a r5 = (androidx.browser.customtabs.CustomTabsService.C0490a) r5
                androidx.browser.customtabs.CustomTabsService r5 = androidx.browser.customtabs.CustomTabsService.this
                android.os.Bundle r5 = r5.mo2214a()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01e9
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x01ed
            L_0x01e9:
                r5 = 0
                r7.writeInt(r5)
            L_0x01ed:
                return r1
            L_0x01ee:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m2G(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0208
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0209
            L_0x0208:
                r8 = r0
            L_0x0209:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0217
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0217:
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.util.ArrayList r6 = r6.createTypedArrayList(r2)
                r2 = r4
                androidx.browser.customtabs.CustomTabsService$a r2 = (androidx.browser.customtabs.CustomTabsService.C0490a) r2
                boolean r5 = r2.mo8v(r5, r8, r0, r6)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x022b:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m2G(r5)
                r6 = r4
                androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.C0490a) r6
                boolean r5 = r6.mo2224H(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0244:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r8 = r4
                androidx.browser.customtabs.CustomTabsService$a r8 = (androidx.browser.customtabs.CustomTabsService.C0490a) r8
                boolean r5 = r8.mo7q(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0259:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.C0003b.C0004a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: f */
    boolean mo6f(C6512d dVar) throws RemoteException;

    /* renamed from: q */
    boolean mo7q(long j) throws RemoteException;

    /* renamed from: v */
    boolean mo8v(C0000a aVar, Uri uri, Bundle bundle, ArrayList arrayList) throws RemoteException;
}
