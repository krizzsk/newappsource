package com.moovit.util;

import aa0.C7536h;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p693nz.C18653e;
import p693nz.C18659h;
import p693nz.C18661i;
import p693nz.C18662j;

public class ParcelableDiskRef<P extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ParcelableDiskRef<?>> CREATOR = new C7886a();

    /* renamed from: d */
    public static volatile C18662j f23854d;

    /* renamed from: b */
    public final String f23855b;

    /* renamed from: c */
    public final Task<P> f23856c;

    /* renamed from: com.moovit.util.ParcelableDiskRef$a */
    public class C7886a implements Parcelable.Creator<ParcelableDiskRef<?>> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelableDiskRef(parcel);
        }

        public final Object[] newArray(int i) {
            return new ParcelableDiskRef[i];
        }
    }

    /* renamed from: com.moovit.util.ParcelableDiskRef$b */
    public static class C7887b<P extends Parcelable> implements Callable<P> {

        /* renamed from: b */
        public final String f23857b;

        public C7887b(String str) {
            this.f23857b = str;
        }

        public final Object call() throws Exception {
            Parcelable parcelable = (Parcelable) ParcelableDiskRef.m17941b().get(this.f23857b);
            if (parcelable != null) {
                return parcelable;
            }
            StringBuilder k = C13555b.m33972k("Unable to find the cache file, ");
            k.append(this.f23857b);
            throw new IOException(k.toString());
        }
    }

    /* renamed from: com.moovit.util.ParcelableDiskRef$c */
    public static class C7888c extends C18653e<String, Parcelable> {

        /* renamed from: k */
        public static final long f23858k = TimeUnit.DAYS.toMillis(7);

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C7888c(java.io.File r10) {
            /*
                r9 = this;
                com.moovit.commons.utils.DataUnit r0 = com.moovit.commons.utils.DataUnit.MiB
                r1 = 4617315517961601024(0x4014000000000000, double:5.0)
                double r0 = r0.toBytes(r1)
                long r4 = java.lang.Math.round(r0)
                tz.a$a r8 = p834tz.C19794a.f50330h
                r6 = 1
                r2 = r9
                r3 = r10
                r7 = r8
                r2.<init>(r3, r4, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.util.ParcelableDiskRef.C7888c.<init>(java.io.File):void");
        }

        /* renamed from: k */
        public final long mo23807k(Object obj, Object obj2) {
            String str = (String) obj;
            Parcelable parcelable = (Parcelable) obj2;
            return System.currentTimeMillis() + f23858k;
        }
    }

    /* renamed from: com.moovit.util.ParcelableDiskRef$d */
    public static class C7889d<P extends Parcelable> implements SuccessContinuation<P, P> {

        /* renamed from: b */
        public final String f23859b;

        public C7889d(String str) {
            this.f23859b = str;
        }

        public final Task then(Object obj) throws Exception {
            Parcelable parcelable = (Parcelable) obj;
            if (parcelable != null && !ParcelableDiskRef.m17941b().put(this.f23859b, parcelable)) {
                Tasks.forException(new IOException("Failed to put object in cache"));
            }
            return Tasks.forResult(parcelable);
        }
    }

    /* renamed from: com.moovit.util.ParcelableDiskRef$e */
    public static class C7890e<P extends Parcelable> implements OnSuccessListener<P> {

        /* renamed from: b */
        public final String f23860b;

        public C7890e(String str) {
            this.f23860b = str;
        }

        public final void onSuccess(Object obj) {
            Parcelable parcelable = (Parcelable) obj;
            try {
                ParcelableDiskRef.m17941b().remove(this.f23860b);
            } catch (Exception unused) {
            }
        }
    }

    public ParcelableDiskRef(Bundle bundle) {
        this.f23855b = UUID.randomUUID().toString();
        this.f23856c = Tasks.forResult(bundle);
    }

    /* renamed from: b */
    public static C18662j m17941b() throws IOException {
        if (f23854d == null) {
            synchronized (ParcelableDiskRef.class) {
                if (f23854d == null) {
                    f23854d = m17942c();
                }
            }
        }
        return f23854d;
    }

    /* renamed from: c */
    public static C18662j m17942c() throws IOException {
        MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
        C18659h hVar = new C18659h(5);
        C7888c cVar = new C7888c(new File(moovitApplication.getCacheDir(), "parcelable_disk_refs"));
        cVar.mo51042l();
        C18662j jVar = new C18662j(new C18661i(hVar, cVar));
        moovitApplication.registerComponentCallbacks(new C7536h(jVar));
        return jVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        this.f23856c.onSuccessTask(MoovitExecutors.SINGLE, new C7889d(this.f23855b));
        parcel.writeString(this.f23855b);
        if (!this.f23856c.isSuccessful() || this.f23856c.getResult() != null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
    }

    public ParcelableDiskRef(Parcel parcel) {
        Task<P> task;
        String readString = parcel.readString();
        C21100e.m49373x(readString, "id");
        this.f23855b = readString;
        if (parcel.readInt() == 1) {
            task = Tasks.forResult(null);
        } else {
            task = Tasks.call(MoovitExecutors.SINGLE, new C7887b(readString));
        }
        this.f23856c = task;
    }
}
