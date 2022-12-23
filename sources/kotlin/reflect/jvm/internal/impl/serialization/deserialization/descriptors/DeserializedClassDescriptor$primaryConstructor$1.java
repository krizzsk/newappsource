package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import lf0.C24225a;
import mf0.C24362h;
import sg0.C24872b;
import xg0.C25258b;
import zf0.C25430b;

public final class DeserializedClassDescriptor$primaryConstructor$1 extends Lambda implements C24225a<C25430b> {
    public final /* synthetic */ DeserializedClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$primaryConstructor$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.this$0 = deserializedClassDescriptor;
    }

    public final Object invoke() {
        T t;
        DeserializedClassDescriptor deserializedClassDescriptor = this.this$0;
        if (deserializedClassDescriptor.f61266l.isSingleton()) {
            C25258b.C25259a aVar = new C25258b.C25259a(deserializedClassDescriptor);
            aVar.mo59453V0(deserializedClassDescriptor.mo53412q());
            return aVar;
        }
        List<ProtoBuf$Constructor> W = deserializedClassDescriptor.f61260f.mo59660W();
        C24362h.m61210e(W, "classProto.constructorList");
        Iterator<T> it = W.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (!C24872b.f62894m.mo61346c(((ProtoBuf$Constructor) t).mo59690w()).booleanValue()) {
                break;
            }
        }
        ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) t;
        if (protoBuf$Constructor == null) {
            return null;
        }
        return deserializedClassDescriptor.f61267m.f59339i.mo60193d(protoBuf$Constructor, true);
    }
}
