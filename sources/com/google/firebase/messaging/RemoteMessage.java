package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;
import p241s0.C6302b;
import p484ff.C16995x;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C16995x();
    @SafeParcelable.Field(mo65739id = 2)

    /* renamed from: b */
    public Bundle f36585b;

    /* renamed from: c */
    public C6302b f36586c;

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(mo65742id = 2) Bundle bundle) {
        this.f36585b = bundle;
    }

    public final Map<String, String> getData() {
        if (this.f36586c == null) {
            Bundle bundle = this.f36585b;
            C6302b bVar = new C6302b();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals("from") && !next.equals("message_type") && !next.equals("collapse_key")) {
                        bVar.put(next, str);
                    }
                }
            }
            this.f36586c = bVar;
        }
        return this.f36586c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f36585b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
