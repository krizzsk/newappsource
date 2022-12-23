package com.google.android.gms.internal.mlkit_vision_common;

import com.google.firebase.encoders.EncodingException;
import p789se.C19449c;
import p789se.C19450d;

public final /* synthetic */ class zzak implements C19449c {
    public static final /* synthetic */ zzak zza = new zzak();

    private /* synthetic */ zzak() {
    }

    public final void encode(Object obj, Object obj2) {
        String str;
        C19450d dVar = (C19450d) obj2;
        int i = zzal.zza;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str = "Couldn't find encoder for type ".concat(valueOf);
        } else {
            str = new String("Couldn't find encoder for type ");
        }
        throw new EncodingException(str);
    }
}
