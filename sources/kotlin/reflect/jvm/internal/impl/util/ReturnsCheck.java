package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import lf0.C24236l;
import lh0.C24307v;
import mf0.C24362h;
import qh0.C24770a;

public abstract class ReturnsCheck implements C24770a {

    /* renamed from: a */
    public final C24236l<C23867c, C24307v> f61379a;

    /* renamed from: b */
    public final String f61380b;

    public static final class ReturnsBoolean extends ReturnsCheck {

        /* renamed from: c */
        public static final ReturnsBoolean f61381c = new ReturnsBoolean();

        public ReturnsBoolean() {
            super("Boolean", C241701.f61382f);
        }
    }

    public static final class ReturnsInt extends ReturnsCheck {

        /* renamed from: c */
        public static final ReturnsInt f61383c = new ReturnsInt();

        public ReturnsInt() {
            super("Int", C241711.f61384f);
        }
    }

    public static final class ReturnsUnit extends ReturnsCheck {

        /* renamed from: c */
        public static final ReturnsUnit f61385c = new ReturnsUnit();

        public ReturnsUnit() {
            super("Unit", C241721.f61386f);
        }
    }

    public ReturnsCheck(String str, C24236l lVar) {
        this.f61379a = lVar;
        this.f61380b = C24362h.m61216k(str, "must return ");
    }

    /* renamed from: a */
    public final String mo60274a(C23900c cVar) {
        return C24770a.C24771a.m62306a(this, cVar);
    }

    /* renamed from: b */
    public final boolean mo60275b(C23900c cVar) {
        C24362h.m61211f(cVar, "functionDescriptor");
        return C24362h.m61206a(cVar.mo53443i(), this.f61379a.invoke(DescriptorUtilsKt.m60284e(cVar)));
    }

    public final String getDescription() {
        return this.f61380b;
    }
}
