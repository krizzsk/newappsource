package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lh0.C24281l0;
import lh0.C24307v;
import mf0.C24362h;

public final class CapturedTypeConstructorKt$createCapturedIfNeeded$1 extends Lambda implements C24225a<C24307v> {
    public final /* synthetic */ C24281l0 $this_createCapturedIfNeeded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CapturedTypeConstructorKt$createCapturedIfNeeded$1(C24281l0 l0Var) {
        super(0);
        this.$this_createCapturedIfNeeded = l0Var;
    }

    public final Object invoke() {
        C24307v type = this.$this_createCapturedIfNeeded.getType();
        C24362h.m61210e(type, "this@createCapturedIfNeeded.type");
        return type;
    }
}
