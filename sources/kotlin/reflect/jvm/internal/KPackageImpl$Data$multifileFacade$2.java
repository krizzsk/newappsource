package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;
import lf0.C24225a;

@Metadata(mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KPackageImpl$Data$multifileFacade$2 extends Lambda implements C24225a<Class<?>> {
    public final /* synthetic */ KPackageImpl.Data this$0;
    public final /* synthetic */ KPackageImpl this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$multifileFacade$2(KPackageImpl.Data data, KPackageImpl kPackageImpl) {
        super(0);
        this.this$0 = data;
        this.this$1 = kPackageImpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0 != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r6 = this;
            kotlin.reflect.jvm.internal.KPackageImpl$Data r0 = r6.this$0
            tf0.i$a r0 = r0.f60242c
            sf0.j<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.KPackageImpl.Data.f60241g
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = r0.invoke()
            eg0.d r0 = (eg0.C23293d) r0
            r1 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            r4 = r3
            goto L_0x0024
        L_0x0015:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r0.f59075b
            java.lang.String r4 = r0.f60769f
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = r0.f60764a
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r5 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART
            if (r0 != r5) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0013
        L_0x0024:
            if (r4 == 0) goto L_0x0043
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x002d
            r2 = 1
        L_0x002d:
            if (r2 == 0) goto L_0x0043
            kotlin.reflect.jvm.internal.KPackageImpl r0 = r6.this$1
            java.lang.Class<?> r0 = r0.f60239c
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 47
            r2 = 46
            java.lang.String r1 = uh0.C25081h.m62834E(r4, r1, r2)
            java.lang.Class r3 = r0.loadClass(r1)
        L_0x0043:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPackageImpl$Data$multifileFacade$2.invoke():java.lang.Object");
    }
}
