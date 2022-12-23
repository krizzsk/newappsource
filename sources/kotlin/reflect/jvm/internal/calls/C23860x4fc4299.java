package kotlin.reflect.jvm.internal.calls;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo59060d2 = {"<anonymous>", "", "T", "", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2 */
public final class C23860x4fc4299 extends Lambda implements C24225a<String> {
    public final /* synthetic */ Class<T> $annotationClass;
    public final /* synthetic */ Map<String, Object> $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23860x4fc4299(Class<T> cls, Map<String, ? extends Object> map) {
        super(0);
        this.$annotationClass = cls;
        this.$values = map;
    }

    public final Object invoke() {
        Class<T> cls = this.$annotationClass;
        Map<String, Object> map = this.$values;
        StringBuilder q = C25541a.m63886q('@');
        q.append(cls.getCanonicalName());
        C23825c.m58518o0(map.entrySet(), q, ", ", "(", ")", C23861xd18867f3.f60302f, 48);
        String sb = q.toString();
        C24362h.m61210e(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
