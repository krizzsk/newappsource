package com.google.protobuf;

import com.google.protobuf.C14606i;
import java.util.Map;

/* renamed from: com.google.protobuf.a0 */
public final class C14585a0 extends C14587b0<Object, Object> {
    public C14585a0(int i) {
        super(i);
    }

    /* renamed from: g */
    public final void mo43987g() {
        if (!this.f36818e) {
            for (int i = 0; i < mo43994d(); i++) {
                ((C14606i.C14608b) mo43991c(i).getKey()).mo43962x();
            }
            for (Map.Entry key : mo43995e()) {
                ((C14606i.C14608b) key.getKey()).mo43962x();
            }
        }
        super.mo43987g();
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((C14606i.C14608b) obj, obj2);
    }
}
