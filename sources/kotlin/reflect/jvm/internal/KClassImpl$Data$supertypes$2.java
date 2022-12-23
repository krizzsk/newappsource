package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import lf0.C24225a;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24361g;
import mf0.C24362h;
import xg0.C25260c;

@Metadata(mo59059d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo59060d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "T", "", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KClassImpl$Data$supertypes$2 extends Lambda implements C24225a<List<? extends KTypeImpl>> {
    public final /* synthetic */ KClassImpl<T>.Data this$0;
    public final /* synthetic */ KClassImpl<T> this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$supertypes$2(KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = data;
        this.this$1 = kClassImpl;
    }

    public final Object invoke() {
        boolean z;
        Collection<C24307v> n = this.this$0.mo59315a().mo53481j().mo53459n();
        C24362h.m61210e(n, "descriptor.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList(n.size());
        KClassImpl<T>.Data data = this.this$0;
        KClassImpl<T> kClassImpl = this.this$1;
        for (C24307v vVar : n) {
            C24362h.m61210e(vVar, "kotlinType");
            arrayList.add(new KTypeImpl(vVar, new KClassImpl$Data$supertypes$2$1$1(vVar, data, kClassImpl)));
        }
        if (!C23867c.m58677H(this.this$0.mo59315a())) {
            boolean z2 = true;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ClassKind p = C25260c.m63386c(((KTypeImpl) it.next()).f60270a).mo53513p();
                    C24362h.m61210e(p, "getClassDescriptorForType(it.type).kind");
                    if (p == ClassKind.INTERFACE || p == ClassKind.ANNOTATION_CLASS) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z2) {
                C24312z f = DescriptorUtilsKt.m60284e(this.this$0.mo59315a()).mo59383f();
                C24362h.m61210e(f, "descriptor.builtIns.anyType");
                arrayList.add(new KTypeImpl(f, C238443.f60222f));
            }
        }
        return C24361g.m61195x(arrayList);
    }
}
