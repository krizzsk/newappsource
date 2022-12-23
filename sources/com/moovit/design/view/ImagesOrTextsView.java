package com.moovit.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.textview.MaterialTextView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p273u6.C6718h;
import p285v6.C6869d;
import p583jk.C17884p;
import w00.C20267h;
import x00.C20440a;

public class ImagesOrTextsView extends MaterialTextView {

    /* renamed from: h */
    public final HashMap f41353h;

    /* renamed from: i */
    public final HashMap f41354i;

    /* renamed from: j */
    public final ArrayList<C20440a> f41355j;

    /* renamed from: k */
    public final ArrayList<C20440a> f41356k;

    /* renamed from: l */
    public final HashSet f41357l;

    /* renamed from: m */
    public int f41358m;

    /* renamed from: n */
    public boolean f41359n;

    /* renamed from: com.moovit.design.view.ImagesOrTextsView$a */
    public class C15862a extends C6718h<Drawable> {

        /* renamed from: e */
        public final Image f41360e;

        public C15862a(Image image) {
            this.f41360e = image;
        }

        /* renamed from: d */
        public final void mo22005d(Drawable drawable) {
            ImagesOrTextsView.this.f41354i.remove(this.f41360e);
            if (ImagesOrTextsView.this.f41357l.contains(this.f41360e)) {
                ImagesOrTextsView.this.mo47712f();
            }
        }

        /* renamed from: f */
        public final void mo47717f() {
            ImagesOrTextsView.this.f41353h.remove(this.f41360e);
            if (ImagesOrTextsView.this.f41357l.contains(this.f41360e)) {
                boolean z = true;
                if (!ImagesOrTextsView.this.f41353h.isEmpty()) {
                    Iterator it = ImagesOrTextsView.this.f41357l.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (ImagesOrTextsView.this.f41353h.containsKey((Image) it.next())) {
                            z = false;
                            break;
                        }
                    }
                }
                if (z) {
                    ImagesOrTextsView.this.mo47712f();
                }
            }
        }

        /* renamed from: h */
        public final void mo10887h(Object obj, C6869d dVar) {
            ImagesOrTextsView.this.f41354i.put(this.f41360e, (Drawable) obj);
            mo47717f();
        }

        /* renamed from: i */
        public final void mo10888i(Drawable drawable) {
            ImagesOrTextsView.this.f41354i.remove(this.f41360e);
            mo47717f();
        }
    }

    public ImagesOrTextsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* renamed from: e */
    public final void mo47711e() {
        int size = this.f41355j.size();
        this.f41356k.clear();
        this.f41356k.ensureCapacity(size);
        if (this.f41359n && !this.f41355j.isEmpty()) {
            HashSet hashSet = new HashSet(size);
            for (int i = 0; i < size; i++) {
                C20440a aVar = this.f41355j.get(i);
                if (aVar == null || aVar.mo52636a()) {
                    this.f41356k.add(aVar);
                } else {
                    Image image = aVar.f51781a;
                    if (!hashSet.contains(image)) {
                        this.f41356k.add(aVar);
                        hashSet.add(image);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x001c A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47712f() {
        /*
            r7 = this;
            boolean r0 = r7.f41359n
            if (r0 == 0) goto L_0x0007
            java.util.ArrayList<x00.a> r0 = r7.f41356k
            goto L_0x0009
        L_0x0007:
            java.util.ArrayList<x00.a> r0 = r7.f41355j
        L_0x0009:
            int r1 = r7.f41358m
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x0013
            goto L_0x0055
        L_0x0013:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x004d
            java.lang.Object r4 = r0.next()
            x00.a r4 = (x00.C20440a) r4
            if (r4 != 0) goto L_0x002b
            goto L_0x003e
        L_0x002b:
            com.moovit.image.model.Image r5 = r4.f51781a
            if (r5 == 0) goto L_0x0031
            r6 = 1
            goto L_0x0032
        L_0x0031:
            r6 = 0
        L_0x0032:
            if (r6 == 0) goto L_0x0045
            java.util.HashMap r4 = r7.f41354i
            java.lang.Object r4 = r4.get(r5)
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            if (r4 != 0) goto L_0x0040
        L_0x003e:
            r4 = r3
            goto L_0x0047
        L_0x0040:
            android.text.SpannableString r4 = p977zz.C20964s0.m49086d(r4, r1)
            goto L_0x0047
        L_0x0045:
            java.lang.CharSequence r4 = r4.f51782b
        L_0x0047:
            if (r4 == 0) goto L_0x001c
            r2.append(r4)
            goto L_0x001c
        L_0x004d:
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r3 = r2
        L_0x0055:
            r7.setText(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.design.view.ImagesOrTextsView.mo47712f():void");
    }

    public int getVerticalAlignment() {
        return this.f41358m;
    }

    public void setItems(List<C20440a> list) {
        boolean z;
        this.f41357l.clear();
        this.f41355j.clear();
        this.f41355j.ensureCapacity(list.size());
        for (C20440a next : list) {
            this.f41355j.add(next);
            Image image = next.f51781a;
            if (image != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f41357l.add(image);
                if (this.f41354i.get(image) == null && !this.f41353h.containsKey(image)) {
                    C15862a aVar = new C15862a(image);
                    this.f41353h.put(image, aVar);
                    C17884p.m44354Y(this).mo51642v(image).mo51628o0(image).mo10848R(aVar);
                }
            }
        }
        mo47711e();
        mo47712f();
    }

    public void setUniquifyImages(boolean z) {
        if (this.f41359n != z) {
            this.f41359n = z;
            mo47711e();
            mo47712f();
        }
    }

    public void setVerticalAlignment(int i) {
        if (this.f41358m != i) {
            this.f41358m = i;
            mo47712f();
        }
    }

    public ImagesOrTextsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41353h = new HashMap();
        this.f41354i = new HashMap();
        this.f41355j = new ArrayList<>();
        this.f41356k = new ArrayList<>(0);
        this.f41357l = new HashSet();
        TypedArray o = UiUtils.m40256o(context, attributeSet, C20267h.ImagesOrTextsView, i);
        try {
            this.f41358m = o.getInt(C20267h.ImagesOrTextsView_imageVerticalAlignment, 2);
            this.f41359n = o.getBoolean(C20267h.ImagesOrTextsView_uniquifyImages, false);
        } finally {
            o.recycle();
        }
    }
}
