package kotlin.reflect.jvm.internal.calls;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0007"}, mo59060d2 = {"<anonymous>", "", "T", "", "entry", "", "", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 */
final class C23861xd18867f3 extends Lambda implements C24236l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

    /* renamed from: f */
    public static final C23861xd18867f3 f60302f = new C23861xd18867f3();

    public C23861xd18867f3() {
        super(1);
    }

    public final Object invoke(Object obj) {
        String str;
        Map.Entry entry = (Map.Entry) obj;
        C24362h.m61211f(entry, "entry");
        String str2 = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            str = Arrays.toString((boolean[]) value);
            C24362h.m61210e(str, "toString(this)");
        } else if (value instanceof char[]) {
            str = Arrays.toString((char[]) value);
            C24362h.m61210e(str, "toString(this)");
        } else if (value instanceof byte[]) {
            str = Arrays.toString((byte[]) value);
            C24362h.m61210e(str, "toString(this)");
        } else if (value instanceof short[]) {
            str = Arrays.toString((short[]) value);
            C24362h.m61210e(str, "toString(this)");
        } else if (value instanceof int[]) {
            str = Arrays.toString((int[]) value);
            C24362h.m61210e(str, "toString(this)");
        } else if (value instanceof float[]) {
            str = Arrays.toString((float[]) value);
            C24362h.m61210e(str, "toString(this)");
        } else if (value instanceof long[]) {
            str = Arrays.toString((long[]) value);
            C24362h.m61210e(str, "toString(this)");
        } else if (value instanceof double[]) {
            str = Arrays.toString((double[]) value);
            C24362h.m61210e(str, "toString(this)");
        } else if (value instanceof Object[]) {
            str = Arrays.toString((Object[]) value);
            C24362h.m61210e(str, "toString(this)");
        } else {
            str = value.toString();
        }
        return str2 + '=' + str;
    }
}
