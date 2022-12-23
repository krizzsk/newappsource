package com.moovit.image.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class RemoteImageRef implements ImageRef {
    public static final Parcelable.Creator<RemoteImageRef> CREATOR = new C16056a();

    /* renamed from: c */
    public static C16057b f41818c = new C16057b(RemoteImageRef.class);

    /* renamed from: b */
    public final ServerId f41819b;

    /* renamed from: com.moovit.image.model.RemoteImageRef$a */
    public class C16056a implements Parcelable.Creator<RemoteImageRef> {
        public final Object createFromParcel(Parcel parcel) {
            return (RemoteImageRef) C19612n.m46981v(parcel, RemoteImageRef.f41818c);
        }

        public final Object[] newArray(int i) {
            return new RemoteImageRef[i];
        }
    }

    /* renamed from: com.moovit.image.model.RemoteImageRef$b */
    public class C16057b extends C19619s<RemoteImageRef> {
        public C16057b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new RemoteImageRef(new ServerId(pVar.mo51924l()));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ServerId serverId = ((RemoteImageRef) obj).f41819b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
        }
    }

    public RemoteImageRef(ServerId serverId) {
        this.f41819b = serverId;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: p */
    public final Image mo48235p(String[] strArr) {
        return new RemoteImage(this.f41819b, strArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41818c);
    }
}
