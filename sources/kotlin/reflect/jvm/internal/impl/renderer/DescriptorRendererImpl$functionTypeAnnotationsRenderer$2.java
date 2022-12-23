package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import lf0.C24225a;
import mf0.C24362h;
import mf0.C24365j;
import of0.C24584a;
import sf0.C24855b;
import uh0.C25081h;
import wg0.C25150c;

public final class DescriptorRendererImpl$functionTypeAnnotationsRenderer$2 extends Lambda implements C24225a<DescriptorRendererImpl> {
    public final /* synthetic */ DescriptorRendererImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(DescriptorRendererImpl descriptorRendererImpl) {
        super(0);
        this.this$0 = descriptorRendererImpl;
    }

    public final Object invoke() {
        boolean z;
        DescriptorRendererImpl descriptorRendererImpl = this.this$0;
        C241081 r1 = C241081.f61127f;
        descriptorRendererImpl.getClass();
        C24362h.m61211f(r1, "changeOptions");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.f61121c;
        descriptorRendererOptionsImpl.getClass();
        Class<DescriptorRendererOptionsImpl> cls = DescriptorRendererOptionsImpl.class;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = new DescriptorRendererOptionsImpl();
        Field[] declaredFields = cls.getDeclaredFields();
        C24362h.m61210e(declaredFields, "this::class.java.declaredFields");
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            Field field = declaredFields[i];
            i++;
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(descriptorRendererOptionsImpl);
                C24584a aVar = null;
                if (obj instanceof C24584a) {
                    aVar = (C24584a) obj;
                }
                if (aVar != null) {
                    String name = field.getName();
                    C24362h.m61210e(name, "field.name");
                    C25081h.m62835F(name, "is");
                    C24855b a = C24365j.m61219a(cls);
                    String name2 = field.getName();
                    String name3 = field.getName();
                    C24362h.m61210e(name3, "field.name");
                    if (name3.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        C24362h.m61210e(substring, "this as java.lang.String).substring(startIndex)");
                        name3 = upperCase + substring;
                    }
                    new PropertyReference1Impl(a, name2, C24362h.m61216k(name3, "get"));
                    field.set(descriptorRendererOptionsImpl2, new C25150c(aVar.f62314a, descriptorRendererOptionsImpl2));
                }
            }
        }
        r1.invoke(descriptorRendererOptionsImpl2);
        descriptorRendererOptionsImpl2.f61153a = true;
        return new DescriptorRendererImpl(descriptorRendererOptionsImpl2);
    }
}
