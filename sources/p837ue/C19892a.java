package p837ue;

import com.google.firebase.encoders.EncodingException;
import p789se.C19449c;
import p789se.C19450d;

/* renamed from: ue.a */
public final /* synthetic */ class C19892a implements C19449c {
    public final void encode(Object obj, Object obj2) {
        C19450d dVar = (C19450d) obj2;
        StringBuilder k = C13555b.m33972k("Couldn't find encoder for type ");
        k.append(obj.getClass().getCanonicalName());
        throw new EncodingException(k.toString());
    }
}
