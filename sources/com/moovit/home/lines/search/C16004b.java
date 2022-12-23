package com.moovit.home.lines.search;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.paging.C1103a;
import androidx.paging.C1110c;
import androidx.paging.ContiguousPagedList;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.C1208m;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.MoovitExecutors;
import com.moovit.database.DbEntityRef;
import com.moovit.design.view.list.AbstractListItemView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.home.lines.search.C16007c;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitType;
import ja0.C12797f;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import lf0.C24240p;
import mf0.C24362h;
import p178n2.C5818c;
import p178n2.C5840q;
import p178n2.C5841r;
import p358af.C13437d;
import p583jk.C17884p;
import p597jy.C17979a;
import p761qy.C19201a;
import p808sx.C19568d;
import p824tp.C19735m;
import p824tp.C19742t;
import p824tp.C19746x;
import p977zz.C20975x0;
import u00.C19826h;
import wh0.C25181h0;
import wh0.C25208q0;
import x00.C20440a;

/* renamed from: com.moovit.home.lines.search.b */
public class C16004b extends C1110c<C16006b, C12797f> {

    /* renamed from: m */
    public static final C16005a f41657m = new C16005a();

    /* renamed from: i */
    public final C17979a f41658i = new C17979a(this, 2);

    /* renamed from: j */
    public final C19568d f41659j = new C19568d(this, 3);

    /* renamed from: k */
    public final C19201a f41660k = new C19201a(this, 5);

    /* renamed from: l */
    public C16002a f41661l = null;

    /* renamed from: com.moovit.home.lines.search.b$a */
    public class C16005a extends C1208m.C1213e<C16006b> {
    }

    /* renamed from: com.moovit.home.lines.search.b$b */
    public static class C16006b {

        /* renamed from: a */
        public final int f41662a;

        /* renamed from: b */
        public final int f41663b;

        /* renamed from: c */
        public final DbEntityRef<TransitType> f41664c;

        /* renamed from: d */
        public final DbEntityRef<TransitAgency> f41665d;

        /* renamed from: e */
        public final SearchLineItem f41666e;

        /* renamed from: f */
        public final boolean f41667f;

        /* renamed from: g */
        public final LineServiceAlertDigest f41668g;

        /* renamed from: h */
        public final C19826h.C19835i f41669h;

        public C16006b(int i, int i2, DbEntityRef<TransitType> dbEntityRef, DbEntityRef<TransitAgency> dbEntityRef2, SearchLineItem searchLineItem, boolean z, LineServiceAlertDigest lineServiceAlertDigest, C19826h.C19835i iVar) {
            this.f41662a = i;
            this.f41663b = i2;
            this.f41664c = dbEntityRef;
            this.f41665d = dbEntityRef2;
            this.f41666e = searchLineItem;
            this.f41667f = z;
            this.f41668g = lineServiceAlertDigest;
            this.f41669h = iVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C16006b)) {
                return false;
            }
            C16006b bVar = (C16006b) obj;
            if (this.f41662a != bVar.f41662a || this.f41663b != bVar.f41663b || !C20975x0.m49118e(this.f41664c, bVar.f41664c) || !C20975x0.m49118e(this.f41665d, bVar.f41665d) || !C20975x0.m49118e(this.f41666e, bVar.f41666e) || this.f41667f != bVar.f41667f || !C20975x0.m49118e(this.f41668g, bVar.f41668g) || !C20975x0.m49118e(this.f41669h, bVar.f41669h)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C17884p.m44333D(this.f41662a, this.f41663b, C17884p.m44335F(this.f41664c), C17884p.m44335F(this.f41665d), C17884p.m44335F(this.f41666e), this.f41667f, C17884p.m44335F(this.f41668g), C17884p.m44335F(this.f41669h));
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("Item[viewType=");
            k.append(this.f41662a);
            k.append(", pos=");
            return C13437d.m33707l(k, this.f41663b, "]");
        }
    }

    public final int getItemViewType(int i) {
        C16006b bVar = (C16006b) mo4436j(i);
        if (bVar != null) {
            return bVar.f41662a;
        }
        return 3;
    }

    /* renamed from: k */
    public final void mo48164k(C16007c.C16008a aVar) {
        ContiguousPagedList contiguousPagedList;
        PagedList<T> pagedList;
        PagedList pagedList2;
        int i;
        C16002a aVar2 = this.f41661l;
        if (aVar2 != null) {
            aVar2.f4103a.mo21690a();
            this.f41661l = null;
        }
        if (aVar == null || aVar.f41681d <= 0) {
            contiguousPagedList = null;
        } else {
            this.f41661l = new C16002a(aVar);
            PagedList.C1091c.C1092a aVar3 = new PagedList.C1091c.C1092a();
            aVar3.f4138a = 50;
            aVar3.f4139b = 10;
            int i2 = aVar3.f4140c;
            if (i2 == Integer.MAX_VALUE || i2 >= (10 * 2) + 50) {
                PagedList.C1089a aVar4 = new PagedList.C1089a(this.f41661l, new PagedList.C1091c(50, 10, 50, i2, false));
                aVar4.f4132f = 0;
                Executor executor = MoovitExecutors.MAIN_THREAD;
                C24362h.m61211f(executor, "notifyExecutor");
                if (executor instanceof C25181h0) {
                    C25181h0 h0Var = (C25181h0) executor;
                }
                aVar4.f4130d = new C25208q0(executor);
                ExecutorService executorService = MoovitExecutors.f37327IO;
                C24362h.m61211f(executorService, "fetchExecutor");
                if (executorService instanceof C25181h0) {
                    C25181h0 h0Var2 = (C25181h0) executorService;
                }
                aVar4.f4131e = new C25208q0(executorService);
                contiguousPagedList = aVar4.mo4414a();
            } else {
                StringBuilder k = C13555b.m33972k("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=");
                k.append(aVar3.f4138a);
                k.append(", prefetchDist=");
                k.append(aVar3.f4139b);
                k.append(", maxSize=");
                k.append(aVar3.f4140c);
                throw new IllegalArgumentException(k.toString());
            }
        }
        C1103a<T> aVar5 = this.f4182g;
        int i3 = aVar5.f4167g + 1;
        aVar5.f4167g = i3;
        PagedList<T> pagedList3 = aVar5.f4165e;
        if (contiguousPagedList != pagedList3) {
            PagedList<T> pagedList4 = aVar5.f4166f;
            if (pagedList4 == null) {
                pagedList = pagedList3;
            } else {
                pagedList = pagedList4;
            }
            if (contiguousPagedList == null) {
                if (pagedList4 == null) {
                    pagedList4 = pagedList3;
                }
                if (pagedList4 == null) {
                    i = 0;
                } else {
                    i = pagedList4.size();
                }
                if (pagedList3 != null) {
                    pagedList3.mo4404C(aVar5.f4170j);
                    pagedList3.mo4405D((C24240p) aVar5.f4168h);
                    aVar5.f4165e = null;
                } else if (aVar5.f4166f != null) {
                    aVar5.f4166f = null;
                }
                aVar5.mo4427a().mo5012b(0, i);
                aVar5.mo4428b(pagedList, (PagedList<T>) null, (Runnable) null);
                return;
            }
            if (pagedList4 == null) {
                pagedList4 = pagedList3;
            }
            if (pagedList4 == null) {
                aVar5.f4165e = contiguousPagedList;
                contiguousPagedList.mo4408i((C24240p) aVar5.f4168h);
                contiguousPagedList.mo4406e(aVar5.f4170j);
                aVar5.mo4427a().mo5011a(0, contiguousPagedList.size());
                aVar5.mo4428b((PagedList<T>) null, contiguousPagedList, (Runnable) null);
                return;
            }
            if (pagedList3 != null) {
                pagedList3.mo4404C(aVar5.f4170j);
                pagedList3.mo4405D((C24240p) aVar5.f4168h);
                if (!pagedList3.mo4410s()) {
                    pagedList3 = new C5841r<>(pagedList3);
                }
                aVar5.f4166f = pagedList3;
                aVar5.f4165e = null;
            }
            PagedList<T> pagedList5 = aVar5.f4166f;
            if (pagedList5 == null || aVar5.f4165e != null) {
                throw new IllegalStateException("must be in snapshot state to diff");
            }
            if (contiguousPagedList.mo4410s()) {
                pagedList2 = contiguousPagedList;
            } else {
                pagedList2 = new C5841r(contiguousPagedList);
            }
            C5840q qVar = new C5840q();
            contiguousPagedList.mo4406e(qVar);
            aVar5.f4162b.f4437a.execute(new C5818c(pagedList5, pagedList2, aVar5, i3, contiguousPagedList, qVar));
        }
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C1119a0 r12, int r13) {
        /*
            r11 = this;
            ja0.f r12 = (ja0.C12797f) r12
            int r0 = r12.getItemViewType()
            r1 = 1
            r2 = 0
            r3 = 0
            switch(r0) {
                case 0: goto L_0x027b;
                case 1: goto L_0x0288;
                case 2: goto L_0x021d;
                case 3: goto L_0x0026;
                case 4: goto L_0x0026;
                case 5: goto L_0x0026;
                case 6: goto L_0x0026;
                case 7: goto L_0x0018;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Unknown view type: "
            java.lang.String r13 = p379.C16759e.m42349e(r13, r0)
            r12.<init>(r13)
            throw r12
        L_0x0018:
            android.view.View r13 = r12.itemView
            r13.setTag(r12)
            android.view.View r12 = r12.itemView
            jy.a r13 = r11.f41658i
            r12.setOnClickListener(r13)
            goto L_0x0288
        L_0x0026:
            java.lang.Object r13 = r11.mo4436j(r13)
            com.moovit.home.lines.search.b$b r13 = (com.moovit.home.lines.search.C16004b.C16006b) r13
            android.view.View r0 = r12.itemView
            com.moovit.home.lines.search.SearchLineListItemView r0 = (com.moovit.home.lines.search.SearchLineListItemView) r0
            android.view.View r4 = r0.getAccessoryView()
            r0.setTag(r12)
            jy.a r5 = r11.f41658i
            r0.setOnClickListener(r5)
            r4.setTag(r12)
            sx.d r5 = r11.f41659j
            r4.setOnClickListener(r5)
            if (r13 == 0) goto L_0x020d
            com.moovit.home.lines.search.SearchLineItem r4 = r13.f41666e
            if (r4 == 0) goto L_0x020d
            u00.h$i r5 = r13.f41669h
            if (r5 != 0) goto L_0x0050
            goto L_0x020d
        L_0x0050:
            com.moovit.image.model.Image r4 = r4.f41641f
            r0.setIcon((com.moovit.image.model.Image) r4)
            com.moovit.home.lines.search.SearchLineItem r4 = r13.f41666e
            java.lang.String r4 = r4.f41642g
            android.text.Spanned r6 = r5.f50409a
            if (r6 == 0) goto L_0x0082
            if (r4 != 0) goto L_0x0060
            goto L_0x0082
        L_0x0060:
            int r6 = r6.length()
            int r7 = r4.length()
            if (r6 != r7) goto L_0x006d
            android.text.Spanned r4 = r5.f50409a
            goto L_0x0082
        L_0x006d:
            java.util.Set<java.lang.String> r6 = r5.f50415g
            if (r6 != 0) goto L_0x0079
            android.text.Spanned r6 = r5.f50409a
            java.util.Set r6 = u00.C19826h.C19835i.m47303b(r6)
            r5.f50415g = r6
        L_0x0079:
            java.util.Set<java.lang.String> r6 = r5.f50415g
            android.text.SpannableString r6 = u00.C19826h.C19835i.m47302a(r4, r6)
            if (r6 == 0) goto L_0x0082
            r4 = r6
        L_0x0082:
            boolean r6 = p977zz.C20964s0.m49090h(r4)
            if (r6 == 0) goto L_0x0089
            r4 = r3
        L_0x0089:
            r0.setTitle((java.lang.CharSequence) r4)
            com.moovit.home.lines.search.SearchLineItem r4 = r13.f41666e
            java.util.List<x00.a> r4 = r4.f41643h
            android.text.Spanned r6 = r5.f50410b
            if (r6 == 0) goto L_0x0130
            boolean r6 = c00.C13717b.m34258e(r4)
            if (r6 == 0) goto L_0x009c
            goto L_0x0130
        L_0x009c:
            android.text.Spanned r6 = r5.f50410b
            int r6 = r6.length()
            java.util.Iterator r7 = r4.iterator()
            r8 = 0
        L_0x00a7:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00c3
            java.lang.Object r9 = r7.next()
            x00.a r9 = (x00.C20440a) r9
            boolean r10 = r9.mo52636a()
            if (r10 != 0) goto L_0x00bb
            r8 = -1
            goto L_0x00c3
        L_0x00bb:
            java.lang.CharSequence r9 = r9.f51782b
            int r9 = r9.length()
            int r8 = r8 + r9
            goto L_0x00a7
        L_0x00c3:
            if (r6 != r8) goto L_0x00d1
            x00.a r4 = new x00.a
            android.text.Spanned r6 = r5.f50410b
            r4.<init>((java.lang.CharSequence) r6, (java.lang.String) r3)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            goto L_0x0130
        L_0x00d1:
            u00.h$d r6 = u00.C19826h.f50378e
            java.lang.Object r6 = r6.get()
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.clear()
            int r7 = r4.size()
            r6.ensureCapacity(r7)
            java.util.Set<java.lang.String> r7 = r5.f50416h
            if (r7 != 0) goto L_0x00ef
            android.text.Spanned r7 = r5.f50410b
            java.util.Set r7 = u00.C19826h.C19835i.m47303b(r7)
            r5.f50416h = r7
        L_0x00ef:
            java.util.Set<java.lang.String> r7 = r5.f50416h
            java.util.Iterator r8 = r4.iterator()
        L_0x00f5:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0124
            java.lang.Object r9 = r8.next()
            x00.a r9 = (x00.C20440a) r9
            boolean r10 = r9.mo52636a()
            if (r10 == 0) goto L_0x0120
            java.lang.CharSequence r10 = r9.f51782b
            java.lang.String r10 = r10.toString()
            android.text.SpannableString r10 = u00.C19826h.C19835i.m47302a(r10, r7)
            if (r10 == 0) goto L_0x011c
            x00.a r9 = new x00.a
            r9.<init>((java.lang.CharSequence) r10, (java.lang.String) r3)
            r6.add(r9)
            goto L_0x00f5
        L_0x011c:
            r6.add(r9)
            goto L_0x00f5
        L_0x0120:
            r6.add(r9)
            goto L_0x00f5
        L_0x0124:
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x012b
            goto L_0x0130
        L_0x012b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r6)
        L_0x0130:
            r0.setSubtitleItems(r4)
            int r4 = r12.getItemViewType()
            r6 = 5
            if (r4 == r6) goto L_0x013f
            r6 = 6
            if (r4 == r6) goto L_0x013f
            r4 = 0
            goto L_0x0140
        L_0x013f:
            r4 = 1
        L_0x0140:
            if (r4 == 0) goto L_0x01c1
            com.moovit.home.lines.search.SearchLineItem r4 = r13.f41666e
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitAgency> r4 = r4.f41640e
            if (r4 == 0) goto L_0x014f
            j40.a r4 = r4.get()
            com.moovit.transit.TransitAgency r4 = (com.moovit.transit.TransitAgency) r4
            goto L_0x0150
        L_0x014f:
            r4 = r3
        L_0x0150:
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            com.moovit.home.lines.search.a r7 = r11.f41661l
            if (r7 == 0) goto L_0x0162
            com.moovit.home.lines.search.c$a r7 = r7.f41654b
            com.moovit.transit.TransitType r7 = r7.f41679b
            if (r7 != 0) goto L_0x0160
            goto L_0x0162
        L_0x0160:
            r7 = 0
            goto L_0x0163
        L_0x0162:
            r7 = 1
        L_0x0163:
            if (r7 == 0) goto L_0x016c
            java.lang.CharSequence r7 = r5.f50411c
            if (r7 == 0) goto L_0x016c
            r6.append(r7)
        L_0x016c:
            java.lang.CharSequence r7 = r5.f50412d
            java.lang.String r8 = " • "
            if (r7 == 0) goto L_0x0181
            int r4 = r6.length()
            if (r4 <= 0) goto L_0x017b
            r6.append(r8)
        L_0x017b:
            java.lang.CharSequence r4 = r5.f50412d
            r6.append(r4)
            goto L_0x0191
        L_0x0181:
            if (r4 == 0) goto L_0x0191
            int r7 = r6.length()
            if (r7 <= 0) goto L_0x018c
            r6.append(r8)
        L_0x018c:
            java.lang.String r4 = r4.f23673c
            r6.append(r4)
        L_0x0191:
            java.lang.CharSequence r4 = r5.f50413e
            if (r4 == 0) goto L_0x01a3
            int r4 = r6.length()
            if (r4 <= 0) goto L_0x019e
            r6.append(r8)
        L_0x019e:
            java.lang.CharSequence r4 = r5.f50413e
            r6.append(r4)
        L_0x01a3:
            java.lang.CharSequence r4 = r5.f50414f
            if (r4 == 0) goto L_0x01b5
            int r4 = r6.length()
            if (r4 <= 0) goto L_0x01b0
            r6.append(r8)
        L_0x01b0:
            java.lang.CharSequence r4 = r5.f50414f
            r6.append(r4)
        L_0x01b5:
            int r4 = r6.length()
            if (r4 <= 0) goto L_0x01bc
            goto L_0x01bd
        L_0x01bc:
            r6 = r3
        L_0x01bd:
            r0.setAttributes(r6)
            goto L_0x01c4
        L_0x01c1:
            r0.setAttributes(r3)
        L_0x01c4:
            com.moovit.servicealerts.LineServiceAlertDigest r4 = r13.f41668g
            r0.setServiceAlert(r4)
            android.content.Context r12 = r12.mo39638e()
            boolean r4 = a00.C13382a.m33671g(r12)
            if (r4 != 0) goto L_0x0288
            int r4 = p824tp.C19746x.voice_over_line
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.moovit.home.lines.search.SearchLineItem r6 = r13.f41666e
            int r7 = p872vp.C20195b.f51234b
            if (r6 == 0) goto L_0x01e0
            java.lang.String r6 = r6.f41638c
            goto L_0x01e2
        L_0x01e0:
            java.lang.String r6 = ""
        L_0x01e2:
            r5[r2] = r6
            java.lang.String r4 = r12.getString(r4, r5)
            com.moovit.home.lines.search.SearchLineItem r13 = r13.f41666e
            java.util.List<x00.a> r13 = r13.f41643h
            java.lang.String r13 = p872vp.C20195b.m47767k(r13)
            r5 = 2
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r5]
            r5[r2] = r4
            boolean r4 = r4.equalsIgnoreCase(r13)
            if (r4 == 0) goto L_0x01fc
            goto L_0x0206
        L_0x01fc:
            int r3 = p824tp.C19746x.voice_over_towards
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r2] = r13
            java.lang.String r3 = r12.getString(r3, r4)
        L_0x0206:
            r5[r1] = r3
            a00.C13382a.m33674j(r0, r5)
            goto L_0x0288
        L_0x020d:
            r0.setIcon((android.graphics.drawable.Drawable) r3)
            r0.setTitle((java.lang.CharSequence) r3)
            r0.setSubtitleItems(r3)
            r0.setAttributes(r3)
            r0.setServiceAlert(r3)
            goto L_0x0288
        L_0x021d:
            java.lang.Object r13 = r11.mo4436j(r13)
            com.moovit.home.lines.search.b$b r13 = (com.moovit.home.lines.search.C16004b.C16006b) r13
            android.view.View r0 = r12.itemView
            com.moovit.design.view.list.ListItemView r0 = (com.moovit.design.view.list.ListItemView) r0
            if (r13 == 0) goto L_0x0274
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitType> r2 = r13.f41664c
            if (r2 != 0) goto L_0x022e
            goto L_0x0274
        L_0x022e:
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitAgency> r4 = r13.f41665d
            if (r4 != 0) goto L_0x0247
            j40.a r13 = r2.get()
            com.moovit.transit.TransitType r13 = (com.moovit.transit.TransitType) r13
            android.content.Context r12 = r12.mo39638e()
            java.lang.String r12 = r13.mo24433b(r12)
            r0.setTitle((java.lang.CharSequence) r12)
            r0.setAccessoryText((java.lang.CharSequence) r3)
            goto L_0x0288
        L_0x0247:
            j40.a r2 = r4.get()
            com.moovit.transit.TransitAgency r2 = (com.moovit.transit.TransitAgency) r2
            java.lang.String r2 = r2.f23673c
            r0.setTitle((java.lang.CharSequence) r2)
            com.moovit.home.lines.search.a r2 = r11.f41661l
            if (r2 == 0) goto L_0x025e
            com.moovit.home.lines.search.c$a r2 = r2.f41654b
            com.moovit.transit.TransitType r2 = r2.f41679b
            if (r2 != 0) goto L_0x025d
            goto L_0x025e
        L_0x025d:
            r1 = 0
        L_0x025e:
            if (r1 == 0) goto L_0x0270
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitType> r13 = r13.f41664c
            j40.a r13 = r13.get()
            com.moovit.transit.TransitType r13 = (com.moovit.transit.TransitType) r13
            android.content.Context r12 = r12.mo39638e()
            java.lang.String r3 = r13.mo24433b(r12)
        L_0x0270:
            r0.setAccessoryText((java.lang.CharSequence) r3)
            goto L_0x0288
        L_0x0274:
            r0.setTitle((java.lang.CharSequence) r3)
            r0.setAccessoryView((android.view.View) r3)
            goto L_0x0288
        L_0x027b:
            android.view.View r12 = r12.itemView
            com.moovit.design.view.list.ListItemView r12 = (com.moovit.design.view.list.ListItemView) r12
            android.view.View r12 = r12.getAccessoryView()
            qy.a r13 = r11.f41660k
            r12.setOnClickListener(r13)
        L_0x0288:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.home.lines.search.C16004b.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$a0, int):void");
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        AbstractListItemView abstractListItemView;
        switch (i) {
            case 0:
                abstractListItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, C19735m.listItemSectionHeaderStyle);
                abstractListItemView.setTitle(C19746x.search_recent_section_title);
                abstractListItemView.setAccessoryIgnoreHorizontalPadding(true);
                abstractListItemView.setAccessoryView(C19742t.section_header_accessory_overflow_button);
                break;
            case 1:
                abstractListItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, C19735m.listItemSectionHeaderStyle);
                abstractListItemView.setTitle(C19746x.all);
                break;
            case 2:
                abstractListItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, C19735m.listItemSectionHeaderStyle);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                abstractListItemView = new SearchLineListItemView(viewGroup.getContext(), (AttributeSet) null);
                break;
            case 7:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C19742t.search_line_twitter_list_item, viewGroup, false);
                break;
            default:
                throw new IllegalStateException(C16759e.m42349e("Unknown view type: ", i));
        }
        view = abstractListItemView;
        view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new C12797f(view);
    }
}
