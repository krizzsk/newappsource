package p861ve;

import com.google.firebase.encoders.proto.C14456b;
import java.util.Map;
import p789se.C19449c;
import p789se.C19450d;

/* renamed from: ve.c */
public final /* synthetic */ class C20112c implements C19449c {
    public final void encode(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        C19450d dVar = (C19450d) obj2;
        dVar.add(C14456b.f36515g, entry.getKey());
        dVar.add(C14456b.f36516h, entry.getValue());
    }
}
