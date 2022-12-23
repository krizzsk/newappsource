package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.C23816b;
import kotlin.collections.C23825c;

public enum DescriptorRendererModifier {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    
    public static final Set<DescriptorRendererModifier> ALL = null;
    public static final Set<DescriptorRendererModifier> ALL_EXCEPT_ANNOTATIONS = null;
    public static final C24109a Companion = null;
    private final boolean includeByDefault;

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier$a */
    public static final class C24109a {
    }

    /* access modifiers changed from: public */
    static {
        int i;
        Companion = new C24109a();
        DescriptorRendererModifier[] values = values();
        ArrayList arrayList = new ArrayList();
        int length = values.length;
        while (i < length) {
            DescriptorRendererModifier descriptorRendererModifier = values[i];
            i++;
            if (descriptorRendererModifier.getIncludeByDefault()) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = C23825c.m58503O0(arrayList);
        ALL = C23816b.m58453i1(values());
    }

    private DescriptorRendererModifier(boolean z) {
        this.includeByDefault = z;
    }

    public final boolean getIncludeByDefault() {
        return this.includeByDefault;
    }
}
