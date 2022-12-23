package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

@Metadata(mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo59060d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "V", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KPropertyImpl$_javaField$1 extends Lambda implements C24225a<Field> {
    public final /* synthetic */ KPropertyImpl<V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImpl$_javaField$1(KPropertyImpl<? extends V> kPropertyImpl) {
        super(0);
        this.this$0 = kPropertyImpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        if (r7 != false) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4 A[SYNTHETIC, Splitter:B:43:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r10 = this;
            ug0.b r0 = tf0.C24978j.f63115a
            kotlin.reflect.jvm.internal.KPropertyImpl<V> r0 = r10.this$0
            zf0.z r0 = r0.mo59298d()
            tf0.b r0 = tf0.C24978j.m62672b(r0)
            boolean r1 = r0 instanceof tf0.C24962b.C24965c
            r2 = 0
            if (r1 == 0) goto L_0x00d3
            tf0.b$c r0 = (tf0.C24962b.C24965c) r0
            zf0.z r1 = r0.f63099a
            kotlin.reflect.jvm.internal.impl.protobuf.d r3 = tg0.C24991g.f63134a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r3 = r0.f63100b
            sg0.c r4 = r0.f63102d
            sg0.e r5 = r0.f63103e
            r6 = 1
            tg0.d$a r3 = tg0.C24991g.m62699b(r3, r4, r5, r6)
            if (r3 != 0) goto L_0x0026
            goto L_0x00e5
        L_0x0026:
            kotlin.reflect.jvm.internal.KPropertyImpl<V> r4 = r10.this$0
            r5 = 0
            if (r1 == 0) goto L_0x00cf
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r7 = r1.mo53433p()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r8 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            if (r7 != r8) goto L_0x0034
            goto L_0x0095
        L_0x0034:
            zf0.g r7 = r1.mo53399b()
            if (r7 == 0) goto L_0x00cb
            boolean r8 = xg0.C25260c.m63395l(r7)
            if (r8 == 0) goto L_0x0066
            zf0.g r8 = r7.mo53399b()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r9 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
            boolean r9 = xg0.C25260c.m63397n(r8, r9)
            if (r9 != 0) goto L_0x0057
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r9 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS
            boolean r8 = xg0.C25260c.m63397n(r8, r9)
            if (r8 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r8 = 0
            goto L_0x0058
        L_0x0057:
            r8 = 1
        L_0x0058:
            if (r8 == 0) goto L_0x0066
            zf0.c r7 = (zf0.C25432c) r7
            java.util.LinkedHashSet r8 = wf0.C25138b.f63413a
            boolean r7 = mf0.C24361g.m61152V(r7)
            if (r7 != 0) goto L_0x0066
            r7 = 1
            goto L_0x0067
        L_0x0066:
            r7 = 0
        L_0x0067:
            if (r7 == 0) goto L_0x006a
            goto L_0x0096
        L_0x006a:
            zf0.g r7 = r1.mo53399b()
            boolean r7 = xg0.C25260c.m63395l(r7)
            if (r7 == 0) goto L_0x0095
            zf0.o r7 = r1.mo53444C0()
            if (r7 == 0) goto L_0x0088
            ag0.e r7 = r7.getAnnotations()
            ug0.c r8 = hg0.C23479o.f59266a
            boolean r7 = r7.mo53070b1(r8)
            if (r7 == 0) goto L_0x0088
            r7 = 1
            goto L_0x0092
        L_0x0088:
            ag0.e r7 = r1.getAnnotations()
            ug0.c r8 = hg0.C23479o.f59266a
            boolean r7 = r7.mo53070b1(r8)
        L_0x0092:
            if (r7 == 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r6 = 0
        L_0x0096:
            if (r6 != 0) goto L_0x00b7
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r0 = r0.f63100b
            boolean r0 = tg0.C24991g.m62701d(r0)
            if (r0 == 0) goto L_0x00a1
            goto L_0x00b7
        L_0x00a1:
            zf0.g r0 = r1.mo53399b()
            boolean r1 = r0 instanceof zf0.C25432c
            if (r1 == 0) goto L_0x00b0
            zf0.c r0 = (zf0.C25432c) r0
            java.lang.Class r0 = tf0.C24979k.m62680g(r0)
            goto L_0x00c1
        L_0x00b0:
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r4.f60257c
            java.lang.Class r0 = r0.mo59301a()
            goto L_0x00c1
        L_0x00b7:
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r4.f60257c
            java.lang.Class r0 = r0.mo59301a()
            java.lang.Class r0 = r0.getEnclosingClass()
        L_0x00c1:
            if (r0 != 0) goto L_0x00c4
            goto L_0x00e5
        L_0x00c4:
            java.lang.String r1 = r3.f63123a     // Catch:{ NoSuchFieldException -> 0x00e5 }
            java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x00e5 }
            goto L_0x00e5
        L_0x00cb:
            hg0.C23462d.m57555a(r6)
            throw r2
        L_0x00cf:
            hg0.C23462d.m57555a(r5)
            throw r2
        L_0x00d3:
            boolean r1 = r0 instanceof tf0.C24962b.C24963a
            if (r1 == 0) goto L_0x00dc
            tf0.b$a r0 = (tf0.C24962b.C24963a) r0
            java.lang.reflect.Field r2 = r0.f63096a
            goto L_0x00e5
        L_0x00dc:
            boolean r1 = r0 instanceof tf0.C24962b.C24964b
            if (r1 == 0) goto L_0x00e1
            goto L_0x00e5
        L_0x00e1:
            boolean r0 = r0 instanceof tf0.C24962b.C24966d
            if (r0 == 0) goto L_0x00e6
        L_0x00e5:
            return r2
        L_0x00e6:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPropertyImpl$_javaField$1.invoke():java.lang.Object");
    }
}
