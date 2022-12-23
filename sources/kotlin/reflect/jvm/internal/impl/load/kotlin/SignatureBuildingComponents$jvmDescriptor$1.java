package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

final class SignatureBuildingComponents$jvmDescriptor$1 extends Lambda implements C24236l<String, CharSequence> {

    /* renamed from: f */
    public static final SignatureBuildingComponents$jvmDescriptor$1 f60757f = new SignatureBuildingComponents$jvmDescriptor$1();

    public SignatureBuildingComponents$jvmDescriptor$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        C24362h.m61211f(str, "it");
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }
}
