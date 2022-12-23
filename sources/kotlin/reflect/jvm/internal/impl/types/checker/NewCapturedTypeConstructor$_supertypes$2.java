package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lh0.C24306u0;

public final class NewCapturedTypeConstructor$_supertypes$2 extends Lambda implements C24225a<List<? extends C24306u0>> {
    public final /* synthetic */ NewCapturedTypeConstructor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$_supertypes$2(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        super(0);
        this.this$0 = newCapturedTypeConstructor;
    }

    public final Object invoke() {
        C24225a<? extends List<? extends C24306u0>> aVar = this.this$0.f61361b;
        if (aVar == null) {
            return null;
        }
        return (List) aVar.invoke();
    }
}
