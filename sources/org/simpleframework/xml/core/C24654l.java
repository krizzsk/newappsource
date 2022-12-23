package org.simpleframework.xml.core;

import gj0.C23433l;
import gj0.C23437p;
import ij0.C23637i;
import ij0.C23639i1;
import ij0.C23640j;
import ij0.C23643k;
import ij0.C23661p1;
import ij0.C23663q0;
import ij0.C23673t0;
import ij0.C23675u;
import java.util.ArrayList;
import java.util.List;
import p247s6.C6478c;

/* renamed from: org.simpleframework.xml.core.l */
public final class C24654l implements C24658o {

    /* renamed from: a */
    public C24663t f62404a;

    /* renamed from: b */
    public C23643k f62405b;

    /* renamed from: c */
    public C23661p1 f62406c;

    /* renamed from: d */
    public C24664u f62407d;

    /* renamed from: e */
    public C23675u f62408e;

    /* JADX WARNING: Removed duplicated region for block: B:148:0x0375 A[LOOP:10: B:133:0x0330->B:148:0x0375, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0378 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24654l(ij0.C23675u r19, org.simpleframework.xml.core.C24664u r20) throws java.lang.Exception {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r18.<init>()
            ij0.k r3 = new ij0.k
            r3.<init>(r1, r2)
            r0.f62405b = r3
            org.simpleframework.xml.core.t r3 = new org.simpleframework.xml.core.t
            r3.<init>(r0, r1, r2)
            r0.f62404a = r3
            r0.f62407d = r2
            r0.f62408e = r1
            r19.getType()
            org.simpleframework.xml.core.t r2 = r0.f62404a
            org.simpleframework.xml.core.o r3 = r2.f62436h
            gj0.l r3 = r3.getOrder()
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x00a2
            ij0.z0 r7 = r2.f62431c
            org.simpleframework.xml.core.TreeModel r2 = r2.f62439k
            r7.getClass()
            java.lang.String[] r8 = r3.elements()
            int r9 = r8.length
            r10 = 0
        L_0x0038:
            if (r10 >= r9) goto L_0x005e
            r11 = r8[r10]
            ij0.m0 r12 = r7.f59870a
            ij0.l0 r11 = r12.mo58822a(r11)
            boolean r12 = r11.mo58798t()
            if (r12 != 0) goto L_0x004e
            r7.mo58886b(r2, r11)
            int r10 = r10 + 1
            goto L_0x0038
        L_0x004e:
            org.simpleframework.xml.core.PathException r1 = new org.simpleframework.xml.core.PathException
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r11
            ij0.u r3 = r7.f59872c
            r2[r6] = r3
            java.lang.String r3 = "Ordered element '%s' references an attribute in %s"
            r1.<init>(r3, r2)
            throw r1
        L_0x005e:
            java.lang.String[] r3 = r3.attributes()
            int r8 = r3.length
            r9 = 0
        L_0x0064:
            if (r9 >= r8) goto L_0x00a2
            r10 = r3[r9]
            ij0.m0 r11 = r7.f59870a
            ij0.l0 r11 = r11.mo58822a(r10)
            boolean r12 = r11.mo58798t()
            if (r12 != 0) goto L_0x008b
            boolean r12 = r11.mo58785A0()
            if (r12 != 0) goto L_0x007b
            goto L_0x008b
        L_0x007b:
            org.simpleframework.xml.core.PathException r1 = new org.simpleframework.xml.core.PathException
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r11
            ij0.u r3 = r7.f59872c
            r2[r6] = r3
            java.lang.String r3 = "Ordered attribute '%s' references an element in %s"
            r1.<init>(r3, r2)
            throw r1
        L_0x008b:
            boolean r12 = r11.mo58785A0()
            if (r12 != 0) goto L_0x009c
            lj0.g r11 = r7.f59871b
            t4.a r11 = r11.f61633b
            r11.getClass()
            r2.mo61028j(r10)
            goto L_0x009f
        L_0x009c:
            r7.mo58885a(r2, r11)
        L_0x009f:
            int r9 = r9 + 1
            goto L_0x0064
        L_0x00a2:
            java.lang.Class r2 = r19.getType()
            org.simpleframework.xml.DefaultType r3 = r19.mo58859l()
            org.simpleframework.xml.core.u r7 = r0.f62407d
            org.simpleframework.xml.core.ContactList r2 = r7.mo61101b(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x00b4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00cc
            java.lang.Object r3 = r2.next()
            ij0.p r3 = (ij0.C23659p) r3
            java.lang.annotation.Annotation r7 = r3.mo58838a()
            if (r7 == 0) goto L_0x00b4
            org.simpleframework.xml.core.t r8 = r0.f62404a
            r8.mo61096a(r3, r7)
            goto L_0x00b4
        L_0x00cc:
            java.lang.Class r2 = r19.getType()
            org.simpleframework.xml.DefaultType r3 = r19.mo58859l()
            org.simpleframework.xml.core.u r7 = r0.f62407d
            org.simpleframework.xml.core.ContactList r2 = r7.mo61103d(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x00de:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00f6
            java.lang.Object r3 = r2.next()
            ij0.p r3 = (ij0.C23659p) r3
            java.lang.annotation.Annotation r7 = r3.mo58838a()
            if (r7 == 0) goto L_0x00de
            org.simpleframework.xml.core.t r8 = r0.f62404a
            r8.mo61096a(r3, r7)
            goto L_0x00de
        L_0x00f6:
            java.lang.Class r2 = r19.getType()
            org.simpleframework.xml.core.t r3 = r0.f62404a
            ij0.j r7 = r3.f62432d
            r8 = 3
            if (r7 != 0) goto L_0x02bc
            org.simpleframework.xml.core.f r7 = r3.f62429a
            ij0.j r10 = r7.f62389b
            if (r10 != 0) goto L_0x02b8
            org.simpleframework.xml.core.o r10 = r7.f62394g
            java.util.List r10 = r10.mo61047g()
            java.util.Iterator r10 = r10.iterator()
        L_0x0111:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x015c
            java.lang.Object r11 = r10.next()
            org.simpleframework.xml.core.r r11 = (org.simpleframework.xml.core.C24661r) r11
            org.simpleframework.xml.core.r r12 = new org.simpleframework.xml.core.r
            java.lang.reflect.Constructor r13 = r11.f62425c
            java.lang.Class r14 = r11.f62426d
            r12.<init>(r13, r14)
            java.util.Iterator r11 = r11.iterator()
        L_0x012a:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0151
            java.lang.Object r13 = r11.next()
            ij0.c1 r13 = (ij0.C23619c1) r13
            ij0.t0 r14 = r7.mo61076c(r13)
            if (r14 == 0) goto L_0x0142
            ij0.h r15 = new ij0.h
            r15.<init>(r14, r13)
            goto L_0x0143
        L_0x0142:
            r15 = 0
        L_0x0143:
            if (r15 == 0) goto L_0x012a
            java.lang.Object r13 = r15.getKey()
            if (r13 == 0) goto L_0x012a
            org.simpleframework.xml.core.ParameterMap r14 = r12.f62424b
            r14.put(r13, r15)
            goto L_0x012a
        L_0x0151:
            org.simpleframework.xml.core.s r11 = new org.simpleframework.xml.core.s
            r11.<init>(r12)
            java.util.ArrayList r12 = r7.f62388a
            r12.add(r11)
            goto L_0x0111
        L_0x015c:
            ij0.u r10 = r7.f62395h
            ij0.j r11 = r7.f62389b
            if (r11 != 0) goto L_0x017f
            org.simpleframework.xml.core.o r11 = r7.f62394g
            org.simpleframework.xml.core.r r11 = r11.mo61041a()
            org.simpleframework.xml.core.o r12 = r7.f62394g
            r12.getParameters()
            if (r11 == 0) goto L_0x0175
            org.simpleframework.xml.core.s r12 = new org.simpleframework.xml.core.s
            r12.<init>(r11)
            goto L_0x0176
        L_0x0175:
            r12 = 0
        L_0x0176:
            ij0.j r11 = new ij0.j
            java.util.ArrayList r13 = r7.f62388a
            r11.<init>(r13, r12, r10)
            r7.f62389b = r11
        L_0x017f:
            ij0.u r10 = r7.f62395h
            org.simpleframework.xml.core.o r11 = r7.f62394g
            org.simpleframework.xml.core.ParameterMap r11 = r11.getParameters()
            java.util.List r11 = r11.mo61007i()
            java.util.Iterator r11 = r11.iterator()
        L_0x018f:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x027e
            java.lang.Object r12 = r11.next()
            ij0.c1 r12 = (ij0.C23619c1) r12
            ij0.t0 r13 = r7.mo61076c(r12)
            java.lang.String r14 = r12.mo58747q()
            if (r13 == 0) goto L_0x0270
            ij0.p r14 = r13.mo58755C()
            java.lang.String r15 = r12.getName()
            java.lang.Class r16 = r12.getType()
            java.lang.Class r14 = r14.getType()
            boolean r17 = r16.isPrimitive()
            if (r17 == 0) goto L_0x01bf
            java.lang.Class r16 = org.simpleframework.xml.core.C24664u.m62100e(r16)
        L_0x01bf:
            r9 = r16
            boolean r16 = r14.isPrimitive()
            if (r16 == 0) goto L_0x01cb
            java.lang.Class r14 = org.simpleframework.xml.core.C24664u.m62100e(r14)
        L_0x01cb:
            boolean r9 = r14.isAssignableFrom(r9)
            if (r9 == 0) goto L_0x0260
            java.lang.String[] r9 = r13.mo58757F()
            java.lang.String r14 = r12.getName()
            int r15 = r9.length
            r5 = 0
        L_0x01db:
            if (r5 >= r15) goto L_0x01ee
            r6 = r9[r5]
            if (r6 != r14) goto L_0x01e2
            goto L_0x01e8
        L_0x01e2:
            boolean r6 = r6.equals(r14)
            if (r6 == 0) goto L_0x01ea
        L_0x01e8:
            r5 = 1
            goto L_0x01ef
        L_0x01ea:
            int r5 = r5 + 1
            r6 = 1
            goto L_0x01db
        L_0x01ee:
            r5 = 0
        L_0x01ef:
            if (r5 != 0) goto L_0x0224
            java.lang.String r5 = r13.getName()
            if (r14 == r5) goto L_0x0224
            java.lang.String r6 = "Annotation does not match %s for '%s' in %s"
            if (r14 == 0) goto L_0x0214
            if (r5 == 0) goto L_0x0214
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto L_0x0204
            goto L_0x0224
        L_0x0204:
            org.simpleframework.xml.core.ConstructorException r1 = new org.simpleframework.xml.core.ConstructorException
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r4] = r13
            r3 = 1
            r2[r3] = r14
            r5 = 2
            r2[r5] = r12
            r1.<init>(r6, r2)
            throw r1
        L_0x0214:
            r3 = 1
            r5 = 2
            org.simpleframework.xml.core.ConstructorException r1 = new org.simpleframework.xml.core.ConstructorException
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r4] = r13
            r2[r3] = r14
            r2[r5] = r12
            r1.<init>(r6, r2)
            throw r1
        L_0x0224:
            java.lang.annotation.Annotation r5 = r13.mo58761a()
            java.lang.annotation.Annotation r6 = r12.mo58740a()
            java.lang.String r9 = r12.getName()
            ij0.n r13 = r7.f62393f
            boolean r13 = r13.mo58823a(r5, r6)
            if (r13 != 0) goto L_0x025c
            java.lang.Class r5 = r5.annotationType()
            java.lang.Class r6 = r6.annotationType()
            boolean r13 = r5.equals(r6)
            if (r13 == 0) goto L_0x0247
            goto L_0x025c
        L_0x0247:
            org.simpleframework.xml.core.ConstructorException r1 = new org.simpleframework.xml.core.ConstructorException
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r6
            r6 = 1
            r2[r6] = r5
            r5 = 2
            r2[r5] = r9
            r2[r8] = r12
            java.lang.String r3 = "Annotation %s does not match %s for '%s' in %s"
            r1.<init>(r3, r2)
            throw r1
        L_0x025c:
            r5 = 2
            r6 = 1
            goto L_0x018f
        L_0x0260:
            org.simpleframework.xml.core.ConstructorException r1 = new org.simpleframework.xml.core.ConstructorException
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r4] = r13
            r2[r6] = r15
            r2[r5] = r12
            java.lang.String r3 = "Type is not compatible with %s for '%s' in %s"
            r1.<init>(r3, r2)
            throw r1
        L_0x0270:
            org.simpleframework.xml.core.ConstructorException r1 = new org.simpleframework.xml.core.ConstructorException
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r14
            r2[r6] = r10
            java.lang.String r3 = "Parameter '%s' does not have a match in %s"
            r1.<init>(r3, r2)
            throw r1
        L_0x027e:
            ij0.j r5 = r7.f62389b
            r5.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List<ij0.r> r5 = r5.f59780a
            r6.<init>(r5)
            ij0.j r5 = r7.f62389b
            java.util.List<ij0.r> r9 = r5.f59780a
            int r9 = r9.size()
            r10 = 1
            if (r9 > r10) goto L_0x029b
            ij0.r r5 = r5.f59781b
            if (r5 == 0) goto L_0x029b
            r5 = 1
            goto L_0x029c
        L_0x029b:
            r5 = 0
        L_0x029c:
            if (r5 == 0) goto L_0x02a8
            org.simpleframework.xml.core.LabelMap r5 = r7.f62391d
            r7.mo61077e(r5)
            org.simpleframework.xml.core.LabelMap r5 = r7.f62390c
            r7.mo61077e(r5)
        L_0x02a8:
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L_0x02b8
            org.simpleframework.xml.core.LabelMap r5 = r7.f62391d
            r7.mo61078f(r5, r6)
            org.simpleframework.xml.core.LabelMap r5 = r7.f62390c
            r7.mo61078f(r5, r6)
        L_0x02b8:
            ij0.j r5 = r7.f62389b
            r3.f62432d = r5
        L_0x02bc:
            org.simpleframework.xml.core.t r3 = r0.f62404a
            org.simpleframework.xml.core.o r5 = r3.f62436h
            gj0.l r5 = r5.getOrder()
            org.simpleframework.xml.core.LabelMap r6 = r3.f62434f
            java.util.Iterator r6 = r6.iterator()
        L_0x02ca:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0328
            java.lang.Object r7 = r6.next()
            ij0.t0 r7 = (ij0.C23673t0) r7
            java.lang.String[] r9 = r7.mo58759H()
            ij0.p r10 = r7.mo58755C()
            int r11 = r9.length
            r12 = 0
        L_0x02e0:
            if (r12 >= r11) goto L_0x02ca
            r13 = r9[r12]
            java.lang.annotation.Annotation r14 = r10.mo58838a()
            org.simpleframework.xml.core.LabelMap r15 = r3.f62434f
            java.lang.Object r13 = r15.get(r13)
            ij0.t0 r13 = (ij0.C23673t0) r13
            boolean r15 = r7.mo58769w()
            boolean r8 = r13.mo58769w()
            if (r15 != r8) goto L_0x0318
            boolean r8 = r7.mo58762c()
            boolean r13 = r13.mo58762c()
            if (r8 != r13) goto L_0x0308
            int r12 = r12 + 1
            r8 = 3
            goto L_0x02e0
        L_0x0308:
            org.simpleframework.xml.core.UnionException r1 = new org.simpleframework.xml.core.UnionException
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r14
            r3 = 1
            r2[r3] = r10
            java.lang.String r3 = "Required must be consistent in %s for %s"
            r1.<init>(r3, r2)
            throw r1
        L_0x0318:
            r2 = 2
            r3 = 1
            org.simpleframework.xml.core.UnionException r1 = new org.simpleframework.xml.core.UnionException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r14
            r2[r3] = r10
            java.lang.String r3 = "Inline must be consistent in %s for %s"
            r1.<init>(r3, r2)
            throw r1
        L_0x0328:
            if (r5 == 0) goto L_0x0388
            java.lang.String[] r6 = r5.elements()
            int r7 = r6.length
            r8 = 0
        L_0x0330:
            if (r8 >= r7) goto L_0x0388
            r9 = r6[r8]
            ij0.m0 r10 = r3.f62430b
            ij0.l0 r10 = r10.mo58822a(r9)
            r11 = 1
            ij0.e1$a r12 = r10.mo58788b2(r4, r11)
            boolean r11 = r10.mo58785A0()
            if (r11 == 0) goto L_0x034c
            org.simpleframework.xml.core.TreeModel r11 = r3.f62439k
            org.simpleframework.xml.core.j r11 = r11.mo61019g1(r12)
            goto L_0x034e
        L_0x034c:
            org.simpleframework.xml.core.TreeModel r11 = r3.f62439k
        L_0x034e:
            if (r11 == 0) goto L_0x0372
            java.lang.String r12 = r10.getLast()
            int r10 = r10.getIndex()
            boolean r13 = r11.mo61013D0(r12)
            if (r13 == 0) goto L_0x035f
            goto L_0x0370
        L_0x035f:
            boolean r13 = r11.mo61012C0(r12)
            if (r13 == 0) goto L_0x0372
            org.simpleframework.xml.core.j r10 = r11.mo61030o(r10, r12)
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0370
            goto L_0x0372
        L_0x0370:
            r10 = 1
            goto L_0x0373
        L_0x0372:
            r10 = 0
        L_0x0373:
            if (r10 == 0) goto L_0x0378
            int r8 = r8 + 1
            goto L_0x0330
        L_0x0378:
            org.simpleframework.xml.core.ElementException r1 = new org.simpleframework.xml.core.ElementException
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r9
            r4 = 1
            r3[r4] = r2
            java.lang.String r2 = "Ordered element '%s' missing for %s"
            r1.<init>(r2, r3)
            throw r1
        L_0x0388:
            if (r5 == 0) goto L_0x03da
            java.lang.String[] r5 = r5.attributes()
            int r6 = r5.length
            r7 = 0
        L_0x0390:
            if (r7 >= r6) goto L_0x03da
            r8 = r5[r7]
            ij0.m0 r9 = r3.f62430b
            ij0.l0 r9 = r9.mo58822a(r8)
            r10 = 1
            ij0.e1$a r11 = r9.mo58788b2(r4, r10)
            boolean r10 = r9.mo58785A0()
            if (r10 == 0) goto L_0x03ac
            org.simpleframework.xml.core.TreeModel r10 = r3.f62439k
            org.simpleframework.xml.core.j r10 = r10.mo61019g1(r11)
            goto L_0x03ae
        L_0x03ac:
            org.simpleframework.xml.core.TreeModel r10 = r3.f62439k
        L_0x03ae:
            if (r10 == 0) goto L_0x03c4
            java.lang.String r11 = r9.getLast()
            boolean r9 = r9.mo58785A0()
            if (r9 != 0) goto L_0x03bf
            boolean r9 = r10.mo61029n1(r8)
            goto L_0x03c5
        L_0x03bf:
            boolean r9 = r10.mo61029n1(r11)
            goto L_0x03c5
        L_0x03c4:
            r9 = 0
        L_0x03c5:
            if (r9 == 0) goto L_0x03ca
            int r7 = r7 + 1
            goto L_0x0390
        L_0x03ca:
            org.simpleframework.xml.core.AttributeException r1 = new org.simpleframework.xml.core.AttributeException
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r8
            r4 = 1
            r3[r4] = r2
            java.lang.String r2 = "Ordered attribute '%s' missing in %s"
            r1.<init>(r2, r3)
            throw r1
        L_0x03da:
            org.simpleframework.xml.core.TreeModel r5 = r3.f62439k
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x03e7
            org.simpleframework.xml.core.TreeModel r5 = r3.f62439k
            r5.mo61014E0(r2)
        L_0x03e7:
            org.simpleframework.xml.core.TreeModel r5 = r3.f62439k
            ij0.t0 r5 = r5.getText()
            java.lang.String r6 = "Paths used with %s in %s"
            java.lang.String r7 = "Elements used with %s in %s"
            if (r5 == 0) goto L_0x0426
            boolean r8 = r5.mo58760I()
            if (r8 != 0) goto L_0x0436
            org.simpleframework.xml.core.LabelMap r8 = r3.f62434f
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0418
            org.simpleframework.xml.core.TreeModel r8 = r3.f62439k
            boolean r8 = r8.mo61016e()
            if (r8 != 0) goto L_0x040a
            goto L_0x0436
        L_0x040a:
            org.simpleframework.xml.core.TextException r1 = new org.simpleframework.xml.core.TextException
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r5
            r8 = 1
            r3[r8] = r2
            r1.<init>(r6, r3)
            throw r1
        L_0x0418:
            r3 = 2
            r8 = 1
            org.simpleframework.xml.core.TextException r1 = new org.simpleframework.xml.core.TextException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r5
            r3[r8] = r2
            r1.<init>(r7, r3)
            throw r1
        L_0x0426:
            org.simpleframework.xml.core.o r5 = r3.f62436h
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0436
            org.simpleframework.xml.core.TreeModel r5 = r3.f62439k
            boolean r5 = r5.isEmpty()
            r3.f62440l = r5
        L_0x0436:
            org.simpleframework.xml.core.TreeModel r5 = r3.f62439k
            ij0.t0 r5 = r5.getText()
            if (r5 == 0) goto L_0x04a9
            boolean r8 = r5.mo58760I()
            if (r8 == 0) goto L_0x04a9
            java.lang.Object r8 = r5.getKey()
            org.simpleframework.xml.core.LabelMap r9 = r3.f62434f
            java.util.Iterator r9 = r9.iterator()
        L_0x044e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0492
            java.lang.Object r10 = r9.next()
            ij0.t0 r10 = (ij0.C23673t0) r10
            java.lang.Object r11 = r10.getKey()
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x0484
            kj0.e r10 = r10.mo58770x()
            java.lang.Class r10 = r10.getType()
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            if (r10 == r11) goto L_0x0471
            goto L_0x044e
        L_0x0471:
            org.simpleframework.xml.core.TextException r1 = new org.simpleframework.xml.core.TextException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r10
            r8 = 1
            r3[r8] = r5
            r9 = 2
            r3[r9] = r2
            java.lang.String r2 = "Illegal entry of %s with text annotations on %s in %s"
            r1.<init>(r2, r3)
            throw r1
        L_0x0484:
            r8 = 1
            r9 = 2
            org.simpleframework.xml.core.TextException r1 = new org.simpleframework.xml.core.TextException
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r3[r4] = r5
            r3[r8] = r2
            r1.<init>(r7, r3)
            throw r1
        L_0x0492:
            r8 = 1
            r9 = 2
            org.simpleframework.xml.core.TreeModel r3 = r3.f62439k
            boolean r3 = r3.mo61016e()
            if (r3 != 0) goto L_0x049d
            goto L_0x04a9
        L_0x049d:
            org.simpleframework.xml.core.TextException r1 = new org.simpleframework.xml.core.TextException
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r3[r4] = r5
            r3[r8] = r2
            r1.<init>(r6, r3)
            throw r1
        L_0x04a9:
            r19.getType()
            ij0.p1 r1 = r0.f62406c
            if (r1 != 0) goto L_0x04c1
            org.simpleframework.xml.core.t r1 = r0.f62404a
            ij0.p1 r2 = new ij0.p1
            ij0.j r3 = r1.f62432d
            org.simpleframework.xml.core.TreeModel r4 = r1.f62439k
            ij0.t0 r5 = r1.f62438j
            boolean r1 = r1.f62440l
            r2.<init>(r3, r4, r5, r1)
            r0.f62406c = r2
        L_0x04c1:
            r1 = 0
            r0.f62404a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.simpleframework.xml.core.C24654l.<init>(ij0.u, org.simpleframework.xml.core.u):void");
    }

    /* renamed from: a */
    public final C24661r mo61041a() {
        return this.f62405b.f59784b.f62373c;
    }

    /* renamed from: b */
    public final boolean mo61042b() {
        return this.f62406c.f59824d;
    }

    /* renamed from: c */
    public final C23663q0 mo61043c() {
        return this.f62405b.f59790h;
    }

    /* renamed from: d */
    public final C23663q0 mo61044d() {
        return this.f62405b.f59789g;
    }

    /* renamed from: e */
    public final C23437p mo61045e() {
        C23673t0 t0Var = this.f62406c.f59822b;
        if (t0Var != null) {
            return (C23437p) t0Var.mo58755C().getAnnotation(C23437p.class);
        }
        return null;
    }

    /* renamed from: f */
    public final C24659p mo61046f() {
        return new C24653k(this.f62406c.f59823c);
    }

    /* renamed from: g */
    public final List<C24661r> mo61047g() {
        C24644b bVar = this.f62405b.f59784b;
        bVar.getClass();
        return new ArrayList(bVar.f62371a);
    }

    public final String getName() {
        return this.f62408e.getName();
    }

    public final C23433l getOrder() {
        this.f62405b.getClass();
        return null;
    }

    public final ParameterMap getParameters() {
        return this.f62405b.f59784b.f62372b;
    }

    public final void getText() {
        this.f62406c.getClass();
    }

    public final Class getType() {
        return this.f62408e.getType();
    }

    public final C23673t0 getVersion() {
        return this.f62406c.f59822b;
    }

    /* renamed from: h */
    public final C23640j mo61054h() {
        return this.f62406c.f59821a;
    }

    /* renamed from: i */
    public final C23663q0 mo61055i() {
        return this.f62405b.f59787e;
    }

    public final boolean isEmpty() {
        this.f62405b.getClass();
        return true;
    }

    /* renamed from: j */
    public final C23663q0 mo61057j() {
        return this.f62405b.f59786d;
    }

    /* renamed from: k */
    public final C23637i mo61058k(C23639i1 i1Var) {
        return new C23637i(this, i1Var);
    }

    /* renamed from: l */
    public final C23663q0 mo61059l() {
        return this.f62405b.f59788f;
    }

    /* renamed from: m */
    public final boolean mo58813m() {
        return this.f62408e.mo58860m();
    }

    /* renamed from: n */
    public final C23663q0 mo61060n() {
        return this.f62405b.f59785c;
    }

    /* renamed from: y */
    public final C6478c mo61061y() {
        return this.f62405b.f59783a;
    }
}
