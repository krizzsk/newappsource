package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import kotlin.jvm.internal.FunctionReference;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24857d;

final /* synthetic */ class ReflectJavaClass$fields$1 extends FunctionReference implements C24236l<Member, Boolean> {

    /* renamed from: b */
    public static final ReflectJavaClass$fields$1 f60538b = new ReflectJavaClass$fields$1();

    public ReflectJavaClass$fields$1() {
        super(1);
    }

    public final String getName() {
        return "isSynthetic";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(Member.class);
    }

    public final String getSignature() {
        return "isSynthetic()Z";
    }

    public final Object invoke(Object obj) {
        Member member = (Member) obj;
        C24362h.m61211f(member, "p0");
        return Boolean.valueOf(member.isSynthetic());
    }
}
