package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.appsflyer.internal.p */
public final class C2085p {

    /* renamed from: com.appsflyer.internal.p$c */
    public static final class C2087c {
        public final String valueOf;
        private final boolean values;

        public C2087c(String str, boolean z) {
            this.valueOf = str;
            this.values = z;
        }

        public final boolean $$b() {
            return this.values;
        }
    }

    /* renamed from: com.appsflyer.internal.p$d */
    public static final class C2088d implements IInterface {
        private IBinder valueOf;

        public C2088d(IBinder iBinder) {
            this.valueOf = iBinder;
        }

        public final boolean $$b() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.valueOf.transact(2, obtain, obtain2, 0);
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
            return this.valueOf;
        }

        public final String values() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.valueOf.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static C2087c values(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                C2086a aVar = new C2086a((byte) 0);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!context.bindService(intent, aVar, 1)) {
                        context.unbindService(aVar);
                        throw new IOException("Google Play connection failed");
                    } else if (!aVar.$$a) {
                        aVar.$$a = true;
                        C2088d dVar = new C2088d(aVar.valueOf.take());
                        C2087c cVar = new C2087c(dVar.values(), dVar.$$b());
                        context.unbindService(aVar);
                        return cVar;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th) {
                    context.unbindService(aVar);
                    throw th;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    /* renamed from: com.appsflyer.internal.p$a */
    public static final class C2086a implements ServiceConnection {
        public boolean $$a;
        public final LinkedBlockingQueue<IBinder> valueOf;

        private C2086a() {
            this.valueOf = new LinkedBlockingQueue<>(1);
            this.$$a = false;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.valueOf.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ C2086a(byte b) {
            this();
        }
    }
}
