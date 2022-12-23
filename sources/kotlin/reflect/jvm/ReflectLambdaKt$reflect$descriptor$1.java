package kotlin.reflect.jvm;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import lf0.C24240p;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24857d;

@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
final /* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends FunctionReference implements C24240p<MemberDeserializer, ProtoBuf$Function, C23903e> {

    /* renamed from: b */
    public static final ReflectLambdaKt$reflect$descriptor$1 f60196b = new ReflectLambdaKt$reflect$descriptor$1();

    public ReflectLambdaKt$reflect$descriptor$1() {
        super(2);
    }

    public final String getName() {
        return "loadFunction";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(MemberDeserializer.class);
    }

    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    public final Object invoke(Object obj, Object obj2) {
        MemberDeserializer memberDeserializer = (MemberDeserializer) obj;
        ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) obj2;
        C24362h.m61211f(memberDeserializer, "p0");
        C24362h.m61211f(protoBuf$Function, "p1");
        return memberDeserializer.mo60194e(protoBuf$Function);
    }
}
