package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import lf0.C24236l;
import lh0.C24307v;
import mf0.C24362h;
import zf0.C25433c0;

final class SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 extends Lambda implements C24236l<CallableMemberDescriptor, C24307v> {

    /* renamed from: f */
    public static final SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 f60747f = new SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1();

    public SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        C24362h.m61211f(callableMemberDescriptor, "it");
        C25433c0 R = callableMemberDescriptor.mo53423R();
        C24362h.m61208c(R);
        C24307v type = R.getType();
        C24362h.m61210e(type, "it.extensionReceiverParameter!!.type");
        return type;
    }
}
