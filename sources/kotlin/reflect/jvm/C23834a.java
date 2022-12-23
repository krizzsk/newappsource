package kotlin.reflect.jvm;

import bf0.C21047a;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.C23853a;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.C24077b;
import kotlin.reflect.jvm.internal.impl.protobuf.C24078c;
import kotlin.reflect.jvm.internal.impl.protobuf.C24079d;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import mf0.C24362h;
import sg0.C24879e;
import tf0.C24979k;
import tg0.C24982a;
import tg0.C24988e;
import tg0.C24989f;
import tg0.C24991g;

/* renamed from: kotlin.reflect.jvm.a */
public final class C23834a {
    /* renamed from: a */
    public static final KFunctionImpl m58564a(C21047a aVar) {
        boolean z;
        C24362h.m61211f(aVar, "<this>");
        Metadata metadata = (Metadata) aVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] d1 = metadata.mo59059d1();
        boolean z2 = true;
        if (d1.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d1 = null;
        }
        if (d1 == null) {
            return null;
        }
        String[] d2 = metadata.mo59060d2();
        C24079d dVar = C24991g.f63134a;
        C24362h.m61211f(d2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C24982a.m62683b(d1));
        C24989f g = C24991g.m62704g(byteArrayInputStream, d2);
        C24079d dVar2 = C24991g.f63134a;
        ProtoBuf$Function.C24013a aVar2 = ProtoBuf$Function.f60868c;
        aVar2.getClass();
        C24078c cVar = new C24078c(byteArrayInputStream);
        C24090h hVar = (C24090h) aVar2.mo59643a(cVar, dVar2);
        try {
            cVar.mo60019a(0);
            C24077b.m60077b(hVar);
            Pair pair = new Pair(g, (ProtoBuf$Function) hVar);
            C24989f fVar = (C24989f) pair.mo59066a();
            ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) pair.mo59067b();
            int[] mv = metadata.mo59062mv();
            if ((metadata.mo59064xi() & 8) == 0) {
                z2 = false;
            }
            C24988e eVar = new C24988e(mv, z2);
            Class<?> cls = aVar.getClass();
            ProtoBuf$TypeTable P = protoBuf$Function.mo59734P();
            C24362h.m61210e(P, "proto.typeTable");
            return new KFunctionImpl(C23853a.f60285c, (C23903e) C24979k.m62677d(cls, protoBuf$Function, fVar, new C24879e(P), eVar, ReflectLambdaKt$reflect$descriptor$1.f60196b));
        } catch (InvalidProtocolBufferException e) {
            e.mo60010b(hVar);
            throw e;
        }
    }
}
