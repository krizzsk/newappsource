package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import lf0.C24236l;
import lh0.C24307v;
import mf0.C24362h;

final class SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 extends Lambda implements C24236l<CallableMemberDescriptor, C24307v> {

    /* renamed from: f */
    public static final SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 f60748f = new SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1();

    public SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        C24362h.m61211f(callableMemberDescriptor, "it");
        C24307v i = callableMemberDescriptor.mo53443i();
        C24362h.m61208c(i);
        return i;
    }
}
