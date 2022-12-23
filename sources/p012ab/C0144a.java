package p012ab;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p011aa.C0141e;
import p277ub.C6803r;
import p326ya.C7357c;

/* renamed from: ab.a */
public final class C0144a extends C0141e {
    /* renamed from: m */
    public final Metadata mo321m(C7357c cVar, ByteBuffer byteBuffer) {
        C6803r rVar = new C6803r(byteBuffer.array(), byteBuffer.limit());
        String k = rVar.mo22992k();
        k.getClass();
        String k2 = rVar.mo22992k();
        k2.getClass();
        return new Metadata(new EventMessage(k, k2, rVar.mo22991j(), rVar.mo22991j(), Arrays.copyOfRange(rVar.f21038a, rVar.f21039b, rVar.f21040c)));
    }
}
