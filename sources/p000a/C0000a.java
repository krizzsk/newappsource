package p000a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: a.a */
public interface C0000a extends IInterface {

    /* renamed from: a.a$a */
    public static abstract class C0001a extends Binder implements C0000a {

        /* renamed from: b */
        public static final /* synthetic */ int f0b = 0;

        /* renamed from: a.a$a$a */
        public static class C0002a implements C0000a {

            /* renamed from: b */
            public IBinder f1b;

            public C0002a(IBinder iBinder) {
                this.f1b = iBinder;
            }

            /* renamed from: E */
            public final void mo1E(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f1b.transact(4, obtain, obtain2, 0)) {
                        int i = C0001a.f0b;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f1b;
            }

            /* renamed from: n */
            public final void mo2n(Bundle bundle, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f1b.transact(5, obtain, obtain2, 0)) {
                        int i = C0001a.f0b;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0001a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        /* renamed from: G */
        public static C0000a m2G(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0000a)) {
                return new C0002a(iBinder);
            }
            return (C0000a) queryLocalInterface;
        }

        public final IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) throws android.os.RemoteException {
            /*
                r10 = this;
                r0 = 1
                r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
                java.lang.String r2 = "android.support.customtabs.ICustomTabsCallback"
                if (r11 == r1) goto L_0x0117
                r1 = 0
                r3 = 0
                switch(r11) {
                    case 2: goto L_0x00eb;
                    case 3: goto L_0x00bf;
                    case 4: goto L_0x00a3;
                    case 5: goto L_0x0083;
                    case 6: goto L_0x003b;
                    case 7: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r11 = super.onTransact(r11, r12, r13, r14)
                return r11
            L_0x0012:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x0028
                android.os.Parcelable$Creator r14 = android.os.Bundle.CREATOR
                java.lang.Object r12 = r14.createFromParcel(r12)
                android.os.Bundle r12 = (android.os.Bundle) r12
                goto L_0x0029
            L_0x0028:
                r12 = r3
            L_0x0029:
                r14 = r10
                t.d r14 = (p253t.C6512d) r14
                t4.a r14 = r14.f20309d
                if (r14 != 0) goto L_0x0037
                r13.writeNoException()
                r13.writeInt(r1)
                return r0
            L_0x0037:
                r14.mo22702s(r12, r11)
                throw r3
            L_0x003b:
                r12.enforceInterface(r2)
                int r6 = r12.readInt()
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0052
                android.os.Parcelable$Creator r11 = android.net.Uri.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                android.net.Uri r11 = (android.net.Uri) r11
                r7 = r11
                goto L_0x0053
            L_0x0052:
                r7 = r3
            L_0x0053:
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x005b
                r8 = 1
                goto L_0x005c
            L_0x005b:
                r8 = 0
            L_0x005c:
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x006b
                android.os.Parcelable$Creator r11 = android.os.Bundle.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x006b:
                r9 = r3
                r5 = r10
                t.d r5 = (p253t.C6512d) r5
                t4.a r11 = r5.f20309d
                if (r11 != 0) goto L_0x0074
                goto L_0x007f
            L_0x0074:
                android.os.Handler r11 = r5.f20308c
                t.f r12 = new t.f
                r4 = r12
                r4.<init>(r5, r6, r7, r8, r9)
                r11.post(r12)
            L_0x007f:
                r13.writeNoException()
                return r0
            L_0x0083:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x0099
                android.os.Parcelable$Creator r14 = android.os.Bundle.CREATOR
                java.lang.Object r12 = r14.createFromParcel(r12)
                r3 = r12
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0099:
                r12 = r10
                t.d r12 = (p253t.C6512d) r12
                r12.mo2n(r3, r11)
                r13.writeNoException()
                return r0
            L_0x00a3:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x00b5
                android.os.Parcelable$Creator r11 = android.os.Bundle.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00b5:
                r11 = r10
                t.d r11 = (p253t.C6512d) r11
                r11.mo1E(r3)
                r13.writeNoException()
                return r0
            L_0x00bf:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x00d5
                android.os.Parcelable$Creator r14 = android.os.Bundle.CREATOR
                java.lang.Object r12 = r14.createFromParcel(r12)
                r3 = r12
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00d5:
                r12 = r10
                t.d r12 = (p253t.C6512d) r12
                t4.a r14 = r12.f20309d
                if (r14 != 0) goto L_0x00dd
                goto L_0x00e7
            L_0x00dd:
                android.os.Handler r14 = r12.f20308c
                t.c r1 = new t.c
                r1.<init>(r12, r11, r3)
                r14.post(r1)
            L_0x00e7:
                r13.writeNoException()
                return r0
            L_0x00eb:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x0101
                android.os.Parcelable$Creator r14 = android.os.Bundle.CREATOR
                java.lang.Object r12 = r14.createFromParcel(r12)
                r3 = r12
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0101:
                r12 = r10
                t.d r12 = (p253t.C6512d) r12
                t4.a r14 = r12.f20309d
                if (r14 != 0) goto L_0x0109
                goto L_0x0113
            L_0x0109:
                android.os.Handler r14 = r12.f20308c
                t.b r1 = new t.b
                r1.<init>(r12, r11, r3)
                r14.post(r1)
            L_0x0113:
                r13.writeNoException()
                return r0
            L_0x0117:
                r13.writeString(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.C0000a.C0001a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: E */
    void mo1E(Bundle bundle) throws RemoteException;

    /* renamed from: n */
    void mo2n(Bundle bundle, String str) throws RemoteException;
}
