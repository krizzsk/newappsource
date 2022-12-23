package cg0;

import com.usebutton.sdk.internal.models.Configuration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23902d;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import lh0.C24287o0;
import lh0.C24307v;
import ug0.C25069e;
import zf0.C25431b0;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25447i;
import zf0.C25448i0;
import zf0.C25453l;
import zf0.C25478n;
import zf0.C25480o;
import zf0.C25491z;

/* renamed from: cg0.d0 */
public class C21164d0 extends C21184m0 implements C25491z {

    /* renamed from: i */
    public final Modality f53029i;

    /* renamed from: j */
    public C25478n f53030j;

    /* renamed from: k */
    public Collection<? extends C25491z> f53031k;

    /* renamed from: l */
    public final C25491z f53032l;

    /* renamed from: m */
    public final CallableMemberDescriptor.Kind f53033m;

    /* renamed from: n */
    public final boolean f53034n;

    /* renamed from: o */
    public final boolean f53035o;

    /* renamed from: p */
    public final boolean f53036p;

    /* renamed from: q */
    public final boolean f53037q;

    /* renamed from: r */
    public final boolean f53038r;

    /* renamed from: s */
    public final boolean f53039s;

    /* renamed from: t */
    public C25433c0 f53040t;

    /* renamed from: u */
    public C25433c0 f53041u;

    /* renamed from: v */
    public ArrayList f53042v;

    /* renamed from: w */
    public C21167e0 f53043w;

    /* renamed from: x */
    public C25431b0 f53044x;

    /* renamed from: y */
    public C25480o f53045y;

    /* renamed from: z */
    public C25480o f53046z;

    /* renamed from: cg0.d0$a */
    public class C21165a {

        /* renamed from: a */
        public C25442g f53047a;

        /* renamed from: b */
        public Modality f53048b;

        /* renamed from: c */
        public C25478n f53049c;

        /* renamed from: d */
        public C25491z f53050d = null;

        /* renamed from: e */
        public CallableMemberDescriptor.Kind f53051e;

        /* renamed from: f */
        public C24287o0 f53052f;

        /* renamed from: g */
        public boolean f53053g;

        /* renamed from: h */
        public C25433c0 f53054h;

        /* renamed from: i */
        public C25069e f53055i;

        /* renamed from: j */
        public C24307v f53056j;

        public C21165a() {
            this.f53047a = C21164d0.this.mo53399b();
            this.f53048b = C21164d0.this.mo53436s();
            this.f53049c = C21164d0.this.mo53429g();
            this.f53051e = C21164d0.this.mo53433p();
            this.f53052f = C24287o0.f61584a;
            this.f53053g = true;
            this.f53054h = C21164d0.this.f53040t;
            this.f53055i = C21164d0.this.getName();
            this.f53056j = C21164d0.this.getType();
        }

        /* renamed from: a */
        public static /* synthetic */ void m49546a(int i) {
            int i2 = i;
            String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? 2 : 3)];
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i2 == 1) {
                objArr[1] = "setOwner";
            } else if (i2 == 2) {
                objArr[1] = "setOriginal";
            } else if (i2 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i2 == 5) {
                objArr[1] = "setReturnType";
            } else if (i2 == 7) {
                objArr[1] = "setModality";
            } else if (i2 == 9) {
                objArr[1] = "setVisibility";
            } else if (i2 == 11) {
                objArr[1] = "setKind";
            } else if (i2 == 19) {
                objArr[1] = "setName";
            } else if (i2 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i2 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i2 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i2 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
            if (r4 == null) goto L_0x005e;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final cg0.C21164d0 mo53456b() {
            /*
                r21 = this;
                r0 = r21
                cg0.d0 r8 = cg0.C21164d0.this
                r8.getClass()
                zf0.g r2 = r0.f53047a
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = r0.f53048b
                zf0.n r4 = r0.f53049c
                zf0.z r5 = r0.f53050d
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = r0.f53051e
                ug0.e r7 = r0.f53055i
                zf0.d0$a r20 = zf0.C25435d0.f63736a
                r1 = r8
                cg0.d0 r1 = r1.mo53454l0(r2, r3, r4, r5, r6, r7)
                java.util.List r2 = r8.getTypeParameters()
                java.util.ArrayList r3 = new java.util.ArrayList
                int r4 = r2.size()
                r3.<init>(r4)
                lh0.o0 r4 = r0.f53052f
                kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r2 = mf0.C24361g.m61174m0(r2, r4, r1, r3)
                lh0.v r4 = r0.f53056j
                kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
                lh0.v r6 = r2.mo60251k(r4, r5)
                r7 = 0
                if (r6 != 0) goto L_0x0039
                goto L_0x005e
            L_0x0039:
                kotlin.reflect.jvm.internal.impl.types.Variance r9 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
                lh0.v r4 = r2.mo60251k(r4, r9)
                if (r4 == 0) goto L_0x0044
                r1.mo53448P0(r4)
            L_0x0044:
                zf0.c0 r4 = r0.f53054h
                if (r4 == 0) goto L_0x004f
                cg0.d r4 = r4.mo53408c(r2)
                if (r4 != 0) goto L_0x0050
                goto L_0x005e
            L_0x004f:
                r4 = r7
            L_0x0050:
                zf0.c0 r10 = r8.f53041u
                if (r10 == 0) goto L_0x0078
                lh0.v r10 = r10.getType()
                lh0.v r9 = r2.mo60251k(r10, r9)
                if (r9 != 0) goto L_0x0061
            L_0x005e:
                r1 = r7
                goto L_0x01dc
            L_0x0061:
                cg0.g0 r10 = new cg0.g0
                fh0.a r11 = new fh0.a
                zf0.c0 r12 = r8.f53041u
                fh0.c r12 = r12.getValue()
                r11.<init>(r1, r9, r12)
                zf0.c0 r9 = r8.f53041u
                ag0.e r9 = r9.getAnnotations()
                r10.<init>(r1, r11, r9)
                goto L_0x0079
            L_0x0078:
                r10 = r7
            L_0x0079:
                r1.mo53449Q0(r6, r3, r4, r10)
                cg0.e0 r3 = r8.f53043w
                if (r3 != 0) goto L_0x0082
                r4 = r7
                goto L_0x00c5
            L_0x0082:
                cg0.e0 r4 = new cg0.e0
                ag0.e r11 = r3.getAnnotations()
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r12 = r0.f53048b
                cg0.e0 r3 = r8.f53043w
                zf0.n r3 = r3.mo53429g()
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = r0.f53051e
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r9 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
                if (r6 != r9) goto L_0x00a2
                zf0.n r6 = r3.mo62741d()
                boolean r6 = zf0.C25455m.m63776e(r6)
                if (r6 == 0) goto L_0x00a2
                zf0.m$k r3 = zf0.C25455m.f63747h
            L_0x00a2:
                r13 = r3
                cg0.e0 r3 = r8.f53043w
                boolean r14 = r3.f53021f
                boolean r15 = r3.f53022g
                boolean r3 = r3.f53025j
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = r0.f53051e
                zf0.z r9 = r0.f53050d
                if (r9 != 0) goto L_0x00b4
                r18 = r7
                goto L_0x00ba
            L_0x00b4:
                cg0.e0 r9 = r9.getGetter()
                r18 = r9
            L_0x00ba:
                r9 = r4
                r10 = r1
                r16 = r3
                r17 = r6
                r19 = r20
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            L_0x00c5:
                if (r4 == 0) goto L_0x00dc
                cg0.e0 r3 = r8.f53043w
                lh0.v r6 = r3.f53059n
                kotlin.reflect.jvm.internal.impl.descriptors.c r3 = cg0.C21164d0.m49514N0(r2, r3)
                r4.f53028m = r3
                if (r6 == 0) goto L_0x00d8
                lh0.v r3 = r2.mo60251k(r6, r5)
                goto L_0x00d9
            L_0x00d8:
                r3 = r7
            L_0x00d9:
                r4.mo53464P0(r3)
            L_0x00dc:
                zf0.b0 r3 = r8.f53044x
                if (r3 != 0) goto L_0x00e2
                r5 = r7
                goto L_0x012d
            L_0x00e2:
                cg0.f0 r5 = new cg0.f0
                ag0.e r11 = r3.getAnnotations()
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r12 = r0.f53048b
                zf0.b0 r3 = r8.f53044x
                zf0.n r3 = r3.mo53429g()
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = r0.f53051e
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r9 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
                if (r6 != r9) goto L_0x0102
                zf0.n r6 = r3.mo62741d()
                boolean r6 = zf0.C25455m.m63776e(r6)
                if (r6 == 0) goto L_0x0102
                zf0.m$k r3 = zf0.C25455m.f63747h
            L_0x0102:
                r13 = r3
                zf0.b0 r3 = r8.f53044x
                boolean r14 = r3.mo53417J()
                zf0.b0 r3 = r8.f53044x
                boolean r15 = r3.mo53428c0()
                zf0.b0 r3 = r8.f53044x
                boolean r16 = r3.mo53437w()
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r3 = r0.f53051e
                zf0.z r6 = r0.f53050d
                if (r6 != 0) goto L_0x011e
                r18 = r7
                goto L_0x0124
            L_0x011e:
                zf0.b0 r6 = r6.getSetter()
                r18 = r6
            L_0x0124:
                r9 = r5
                r10 = r1
                r17 = r3
                r19 = r20
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            L_0x012d:
                if (r5 == 0) goto L_0x0188
                zf0.b0 r3 = r8.f53044x
                java.util.List r10 = r3.mo53442h()
                r12 = 0
                r13 = 0
                r14 = 0
                r9 = r5
                r11 = r2
                java.util.ArrayList r3 = kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b.m58860P0(r9, r10, r11, r12, r13, r14)
                r6 = 0
                r9 = 1
                if (r3 != 0) goto L_0x0164
                zf0.g r3 = r0.f53047a
                kotlin.reflect.jvm.internal.impl.builtins.c r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60284e(r3)
                lh0.z r3 = r3.mo59392o()
                zf0.b0 r10 = r8.f53044x
                java.util.List r10 = r10.mo53442h()
                java.lang.Object r10 = r10.get(r6)
                zf0.k0 r10 = (zf0.C25452k0) r10
                ag0.e r10 = r10.getAnnotations()
                kotlin.reflect.jvm.internal.impl.descriptors.impl.d r3 = cg0.C21169f0.m49566O0(r5, r3, r10)
                java.util.List r3 = java.util.Collections.singletonList(r3)
            L_0x0164:
                int r10 = r3.size()
                if (r10 != r9) goto L_0x0182
                zf0.b0 r9 = r8.f53044x
                kotlin.reflect.jvm.internal.impl.descriptors.c r9 = cg0.C21164d0.m49514N0(r2, r9)
                r5.f53028m = r9
                java.lang.Object r3 = r3.get(r6)
                zf0.k0 r3 = (zf0.C25452k0) r3
                if (r3 == 0) goto L_0x017d
                r5.f53064n = r3
                goto L_0x0188
            L_0x017d:
                r1 = 6
                cg0.C21169f0.m49565A(r1)
                throw r7
            L_0x0182:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>()
                throw r1
            L_0x0188:
                zf0.o r3 = r8.f53045y
                if (r3 != 0) goto L_0x018e
                r6 = r7
                goto L_0x0197
            L_0x018e:
                cg0.s r6 = new cg0.s
                ag0.e r3 = r3.getAnnotations()
                r6.<init>(r1, r3)
            L_0x0197:
                zf0.o r3 = r8.f53046z
                if (r3 != 0) goto L_0x019c
                goto L_0x01a5
            L_0x019c:
                cg0.s r7 = new cg0.s
                ag0.e r3 = r3.getAnnotations()
                r7.<init>(r1, r3)
            L_0x01a5:
                r1.mo53447O0(r4, r5, r6, r7)
                boolean r3 = r0.f53053g
                if (r3 == 0) goto L_0x01d0
                rh0.d r3 = new rh0.d
                r3.<init>()
                java.util.Collection r4 = r8.mo53440d()
                java.util.Iterator r4 = r4.iterator()
            L_0x01b9:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x01cd
                java.lang.Object r5 = r4.next()
                zf0.z r5 = (zf0.C25491z) r5
                cg0.d0 r5 = r5.mo53408c(r2)
                r3.add(r5)
                goto L_0x01b9
            L_0x01cd:
                r1.mo53416I0(r3)
            L_0x01d0:
                boolean r2 = r8.mo53451e0()
                if (r2 == 0) goto L_0x01dc
                kh0.f<zg0.g<?>> r2 = r8.f53098h
                if (r2 == 0) goto L_0x01dc
                r1.f53098h = r2
            L_0x01dc:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: cg0.C21164d0.C21165a.mo53456b():cg0.d0");
        }
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [zf0.z] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21164d0(zf0.C25442g r12, zf0.C25491z r13, ag0.C20989e r14, kotlin.reflect.jvm.internal.impl.descriptors.Modality r15, zf0.C25478n r16, boolean r17, ug0.C25069e r18, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r19, zf0.C25435d0 r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            r11 = this;
            r6 = r11
            r7 = r15
            r8 = r16
            r9 = r19
            r10 = 0
            if (r12 == 0) goto L_0x0067
            if (r14 == 0) goto L_0x0062
            if (r7 == 0) goto L_0x005d
            if (r8 == 0) goto L_0x0058
            if (r18 == 0) goto L_0x0053
            if (r9 == 0) goto L_0x004e
            if (r20 == 0) goto L_0x0049
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r18
            r4 = r17
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f53031k = r10
            r6.f53029i = r7
            r6.f53030j = r8
            if (r13 != 0) goto L_0x002b
            r0 = r6
            goto L_0x002c
        L_0x002b:
            r0 = r13
        L_0x002c:
            r6.f53032l = r0
            r6.f53033m = r9
            r0 = r21
            r6.f53034n = r0
            r0 = r22
            r6.f53035o = r0
            r0 = r23
            r6.f53036p = r0
            r0 = r24
            r6.f53037q = r0
            r0 = r25
            r6.f53038r = r0
            r0 = r26
            r6.f53039s = r0
            return
        L_0x0049:
            r0 = 6
            m49513A(r0)
            throw r10
        L_0x004e:
            r0 = 5
            m49513A(r0)
            throw r10
        L_0x0053:
            r0 = 4
            m49513A(r0)
            throw r10
        L_0x0058:
            r0 = 3
            m49513A(r0)
            throw r10
        L_0x005d:
            r0 = 2
            m49513A(r0)
            throw r10
        L_0x0062:
            r0 = 1
            m49513A(r0)
            throw r10
        L_0x0067:
            r0 = 0
            m49513A(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cg0.C21164d0.<init>(zf0.g, zf0.z, ag0.e, kotlin.reflect.jvm.internal.impl.descriptors.Modality, zf0.n, boolean, ug0.e, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, zf0.d0, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: A */
    public static /* synthetic */ void m49513A(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 24 || i == 34 || i == 35 || i == 37 || i == 38)) {
            switch (i) {
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 24 || i == 34 || i == 35 || i == 37 || i == 38)) {
            switch (i) {
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 17:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 31:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 33:
                objArr[0] = "source";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
                objArr[0] = "outType";
                break;
            case 16:
                objArr[0] = "typeParameters";
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 34:
            case 35:
            case 37:
            case 38:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 23:
                objArr[0] = "originalSubstitutor";
                break;
            case 25:
                objArr[0] = "copyConfiguration";
                break;
            case 26:
                objArr[0] = "substitutor";
                break;
            case 27:
                objArr[0] = "accessorDescriptor";
                break;
            case 28:
                objArr[0] = "newOwner";
                break;
            case 29:
                objArr[0] = "newModality";
                break;
            case 30:
                objArr[0] = "newVisibility";
                break;
            case 32:
                objArr[0] = "newName";
                break;
            case 36:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 24) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 34) {
            objArr[1] = "getOriginal";
        } else if (i == 35) {
            objArr[1] = "getKind";
        } else if (i == 37) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 38) {
            switch (i) {
                case 18:
                    objArr[1] = "getTypeParameters";
                    break;
                case 19:
                    objArr[1] = "getReturnType";
                    break;
                case 20:
                    objArr[1] = "getModality";
                    break;
                case 21:
                    objArr[1] = "getVisibility";
                    break;
                case 22:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = Configuration.KEY_COPY;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
                objArr[2] = "setType";
                break;
            case 17:
                objArr[2] = "setVisibility";
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 34:
            case 35:
            case 37:
            case 38:
                break;
            case 23:
                objArr[2] = "substitute";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 26:
            case 27:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 36:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 24 || i == 34 || i == 35 || i == 37 || i == 38)) {
            switch (i) {
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: N0 */
    public static C23900c m49514N0(TypeSubstitutor typeSubstitutor, C23902d dVar) {
        if (dVar == null) {
            m49513A(27);
            throw null;
        } else if (dVar.mo53438w0() != null) {
            return dVar.mo53438w0().mo53408c(typeSubstitutor);
        } else {
            return null;
        }
    }

    /* renamed from: B0 */
    public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return iVar.mo60159j(this, d);
    }

    /* renamed from: C0 */
    public final C25480o mo53444C0() {
        return this.f53045y;
    }

    /* renamed from: D0 */
    public final boolean mo53445D0() {
        return this.f53034n;
    }

    /* renamed from: F */
    public final boolean mo53446F() {
        return this.f53039s;
    }

    /* renamed from: I0 */
    public final void mo53416I0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != null) {
            this.f53031k = collection;
        } else {
            m49513A(36);
            throw null;
        }
    }

    /* renamed from: L0 */
    public final CallableMemberDescriptor mo53420L0(C25442g gVar, Modality modality, C25453l lVar, CallableMemberDescriptor.Kind kind) {
        C21165a aVar = new C21165a();
        if (gVar != null) {
            aVar.f53047a = gVar;
            aVar.f53050d = null;
            aVar.f53048b = modality;
            if (lVar != null) {
                aVar.f53049c = lVar;
                if (kind != null) {
                    aVar.f53051e = kind;
                    aVar.f53053g = false;
                    C21164d0 b = aVar.mo53456b();
                    if (b != null) {
                        return b;
                    }
                    m49513A(38);
                    throw null;
                }
                C21165a.m49546a(10);
                throw null;
            }
            C21165a.m49546a(8);
            throw null;
        }
        C21165a.m49546a(0);
        throw null;
    }

    /* renamed from: O */
    public final C25433c0 mo53422O() {
        return this.f53040t;
    }

    /* renamed from: O0 */
    public final void mo53447O0(C21167e0 e0Var, C21169f0 f0Var, C25480o oVar, C25480o oVar2) {
        this.f53043w = e0Var;
        this.f53044x = f0Var;
        this.f53045y = oVar;
        this.f53046z = oVar2;
    }

    /* renamed from: P0 */
    public void mo53448P0(C24307v vVar) {
    }

    /* renamed from: Q0 */
    public final void mo53449Q0(C24307v vVar, List list, C25433c0 c0Var, C21171g0 g0Var) {
        if (vVar == null) {
            m49513A(15);
            throw null;
        } else if (list != null) {
            this.f53094f = vVar;
            this.f53042v = new ArrayList(list);
            this.f53041u = g0Var;
            this.f53040t = c0Var;
        } else {
            m49513A(16);
            throw null;
        }
    }

    /* renamed from: R */
    public final C25433c0 mo53423R() {
        return this.f53041u;
    }

    /* renamed from: S */
    public final C25480o mo53450S() {
        return this.f53046z;
    }

    /* renamed from: a0 */
    public final boolean mo53427a0() {
        return this.f53037q;
    }

    /* renamed from: c0 */
    public boolean mo53428c0() {
        return this.f53038r;
    }

    /* renamed from: d */
    public final Collection<? extends C25491z> mo53440d() {
        Collection<? extends C25491z> collection = this.f53031k;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        m49513A(37);
        throw null;
    }

    /* renamed from: e0 */
    public boolean mo53451e0() {
        return this.f53035o;
    }

    /* renamed from: g */
    public final C25478n mo53429g() {
        C25478n nVar = this.f53030j;
        if (nVar != null) {
            return nVar;
        }
        m49513A(21);
        throw null;
    }

    public final C21167e0 getGetter() {
        return this.f53043w;
    }

    public final C25431b0 getSetter() {
        return this.f53044x;
    }

    public final List<C25448i0> getTypeParameters() {
        ArrayList arrayList = this.f53042v;
        if (arrayList != null) {
            return arrayList;
        }
        StringBuilder k = C13555b.m33972k("typeParameters == null for ");
        k.append(C21185n.m49696C(this));
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: i */
    public final C24307v mo53443i() {
        C24307v type = getType();
        if (type != null) {
            return type;
        }
        m49513A(19);
        throw null;
    }

    /* renamed from: l0 */
    public C21164d0 mo53454l0(C25442g gVar, Modality modality, C25478n nVar, C25491z zVar, CallableMemberDescriptor.Kind kind, C25069e eVar) {
        C25435d0.C25436a aVar = C25435d0.f63736a;
        if (gVar == null) {
            m49513A(28);
            throw null;
        } else if (modality == null) {
            m49513A(29);
            throw null;
        } else if (nVar == null) {
            m49513A(30);
            throw null;
        } else if (kind == null) {
            m49513A(31);
            throw null;
        } else if (eVar != null) {
            return new C21164d0(gVar, zVar, getAnnotations(), modality, nVar, this.f53097g, eVar, kind, aVar, this.f53034n, mo53451e0(), this.f53036p, this.f53037q, mo53428c0(), this.f53039s);
        } else {
            m49513A(32);
            throw null;
        }
    }

    /* renamed from: p */
    public final CallableMemberDescriptor.Kind mo53433p() {
        CallableMemberDescriptor.Kind kind = this.f53033m;
        if (kind != null) {
            return kind;
        }
        m49513A(35);
        throw null;
    }

    /* renamed from: p0 */
    public final boolean mo53434p0() {
        return this.f53036p;
    }

    /* renamed from: s */
    public final Modality mo53436s() {
        Modality modality = this.f53029i;
        if (modality != null) {
            return modality;
        }
        m49513A(20);
        throw null;
    }

    /* renamed from: x */
    public final ArrayList mo53455x() {
        ArrayList arrayList = new ArrayList(2);
        C21167e0 e0Var = this.f53043w;
        if (e0Var != null) {
            arrayList.add(e0Var);
        }
        C25431b0 b0Var = this.f53044x;
        if (b0Var != null) {
            arrayList.add(b0Var);
        }
        return arrayList;
    }

    /* renamed from: y0 */
    public <V> V mo53439y0(C23894a.C23895a<V> aVar) {
        return null;
    }

    /* renamed from: c */
    public final C21164d0 m49534c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m49513A(23);
            throw null;
        } else if (typeSubstitutor.mo60249h()) {
            return this;
        } else {
            C21165a aVar = new C21165a();
            C24287o0 g = typeSubstitutor.mo60248g();
            if (g != null) {
                aVar.f53052f = g;
                aVar.f53050d = m49530a();
                return aVar.mo53456b();
            }
            C21165a.m49546a(15);
            throw null;
        }
    }

    /* renamed from: a */
    public final C25491z m49531a() {
        C25491z zVar = this.f53032l;
        C25491z a = zVar == this ? this : zVar.mo53407a();
        if (a != null) {
            return a;
        }
        m49513A(34);
        throw null;
    }
}
