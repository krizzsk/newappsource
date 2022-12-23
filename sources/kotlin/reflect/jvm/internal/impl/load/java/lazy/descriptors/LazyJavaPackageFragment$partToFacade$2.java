package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ch0.C21203b;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import lf0.C24225a;
import p845um.C19958a;
import qg0.C24757k;

public final class LazyJavaPackageFragment$partToFacade$2 extends Lambda implements C24225a<HashMap<C21203b, C21203b>> {
    public final /* synthetic */ LazyJavaPackageFragment this$0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$partToFacade$2$a */
    public /* synthetic */ class C23930a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60671a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
            iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
            f60671a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment$partToFacade$2(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.this$0 = lazyJavaPackageFragment;
    }

    public final Object invoke() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((Map) C19958a.m47435j(this.this$0.f60667j, LazyJavaPackageFragment.f60664n[0])).entrySet()) {
            C21203b c = C21203b.m49812c((String) entry.getKey());
            KotlinClassHeader c2 = ((C24757k) entry.getValue()).mo58420c();
            int i = C23930a.f60671a[c2.f60764a.ordinal()];
            boolean z = true;
            if (i == 1) {
                String str = c2.f60769f;
                if (c2.f60764a != KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) {
                    z = false;
                }
                if (!z) {
                    str = null;
                }
                if (str != null) {
                    hashMap.put(c, C21203b.m49812c(str));
                }
            } else if (i == 2) {
                hashMap.put(c, c);
            }
        }
        return hashMap;
    }
}
