package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import lf0.C24240p;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24857d;
import zf0.C25491z;

@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public /* synthetic */ class KPackageImpl$getLocalProperty$1$1$1 extends FunctionReference implements C24240p<MemberDeserializer, ProtoBuf$Property, C25491z> {

    /* renamed from: b */
    public static final KPackageImpl$getLocalProperty$1$1$1 f60246b = new KPackageImpl$getLocalProperty$1$1$1();

    public KPackageImpl$getLocalProperty$1$1$1() {
        super(2);
    }

    public final String getName() {
        return "loadProperty";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(MemberDeserializer.class);
    }

    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    public final Object invoke(Object obj, Object obj2) {
        MemberDeserializer memberDeserializer = (MemberDeserializer) obj;
        ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) obj2;
        C24362h.m61211f(memberDeserializer, "p0");
        C24362h.m61211f(protoBuf$Property, "p1");
        return memberDeserializer.mo60195f(protoBuf$Property);
    }
}
