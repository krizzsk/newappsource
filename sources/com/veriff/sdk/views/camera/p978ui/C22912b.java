package com.veriff.sdk.views.camera.p978ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bf0.C21050d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.veriff.sdk.internal.C21616ex;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C22640vv;
import com.veriff.sdk.internal.C22700xq;
import com.veriff.sdk.views.camera.C22832ag;
import com.veriff.sdk.views.camera.p978ui.C22910a;
import java.util.List;
import jd0.C23707a;
import lf0.C24236l;
import mobi.lab.veriff.R$color;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.data.C24422b;
import mobi.lab.veriff.layouts.CornerFrame;
import mobi.lab.veriff.util.C24469n;
import mobi.lab.veriff.util.C24472p;
import n60.C18531b;
import p090g1.C4732a;
import p501fw.C17102a;
import p644lx.C18284b;
import p739px.C19037a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.views.camera.ui.b */
public class C22912b extends C22910a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C22910a.C22911a f58184a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C22640vv f58185b;

    /* renamed from: c */
    private BottomSheetBehavior f58186c;

    /* renamed from: d */
    private final C21616ex f58187d;

    /* renamed from: e */
    private final C22700xq f58188e;

    /* renamed from: f */
    private final C21789ix f58189f;

    /* renamed from: com.veriff.sdk.views.camera.ui.b$2 */
    public static /* synthetic */ class C229142 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58191a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.veriff.sdk.views.camera.ag[] r0 = com.veriff.sdk.views.camera.C22832ag.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58191a = r0
                com.veriff.sdk.views.camera.ag r1 = com.veriff.sdk.views.camera.C22832ag.LOW_LIGHT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58191a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.views.camera.ag r1 = com.veriff.sdk.views.camera.C22832ag.MULTIPLE_PERSONS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f58191a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.veriff.sdk.views.camera.ag r1 = com.veriff.sdk.views.camera.C22832ag.NO_PERSON     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.p978ui.C22912b.C229142.<clinit>():void");
        }
    }

    public C22912b(Context context, C22700xq xqVar, C21616ex exVar, C21789ix ixVar, C22910a.C22911a aVar) {
        super(context);
        this.f58184a = aVar;
        this.f58187d = exVar;
        this.f58188e = xqVar;
        this.f58189f = ixVar;
        C22640vv a = C22640vv.m55190a(LayoutInflater.from(context), this, true);
        this.f58185b = a;
        a.f57174l.f57065a.setBackground(xqVar.mo57128o());
        m56546h();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m56544c(View view) {
        this.f58184a.mo57757a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m56545d(View view) {
        this.f58184a.mo57762e();
    }

    /* renamed from: h */
    private void m56546h() {
        this.f58185b.f57168e.setOnClickListener(new C18284b(this, 22));
        BottomSheetBehavior e = BottomSheetBehavior.m34710e(this.f58185b.f57174l.mo56975a());
        this.f58186c = e;
        e.setState(5);
        BottomSheetBehavior bottomSheetBehavior = this.f58186c;
        C229131 r1 = new BottomSheetBehavior.C13920c() {
            public void onSlide(View view, float f) {
            }

            public void onStateChanged(View view, int i) {
                if (i == 4 || i == 5) {
                    C22912b.this.f58184a.mo57761d();
                    C22912b.this.f58185b.f57168e.setVisibility(8);
                }
            }
        };
        bottomSheetBehavior.f34369T.clear();
        bottomSheetBehavior.f34369T.add(r1);
        this.f58185b.f57166c.setOnClickListener(new C17102a(this, 28));
        this.f58185b.f57166c.setContentDescription(this.f58187d.mo54719bI());
        this.f58185b.f57167d.setOnClickListener(new C18531b(this, 11));
        this.f58185b.f57167d.setContentDescription(this.f58187d.mo54758bv());
        this.f58185b.f57165b.setOnClickListener(new C19037a(this, 21));
        this.f58185b.f57165b.setContentDescription(this.f58187d.mo54720bJ());
        this.f58185b.f57174l.f57066c.setText(this.f58187d.mo54670aN());
        this.f58185b.f57171h.addView(new CornerFrame(getContext(), C4732a.getColor(getContext(), R$color.vrffBlack)));
        this.f58185b.f57171h.setContentDescription(this.f58187d.mo54759bw());
        C24472p.m61578a((View) this.f58185b.f57170g, (C24236l<? super PointF, C21050d>) new C23707a(this));
        this.f58185b.f57172i.setText(this.f58187d.mo54725bO());
    }

    /* renamed from: e */
    public void mo57797e() {
        this.f58185b.f57171h.setEnabled(true);
    }

    /* renamed from: f */
    public void mo57798f() {
        this.f58185b.f57165b.setEnabled(true);
        this.f58185b.f57165b.setAlpha(1.0f);
    }

    /* renamed from: g */
    public void mo57799g() {
        this.f58185b.f57172i.setVisibility(8);
    }

    public ViewGroup getPreviewContainer() {
        return this.f58185b.f57170g;
    }

    public void setOverlayVisibility(boolean z) {
        this.f58185b.f57168e.setVisibility(z ? 0 : 8);
    }

    public void setTutorialText(C24422b bVar) {
        this.f58185b.f57173j.setText(bVar.mo60569a().mo55488g().mo55567a().invoke(this.f58187d));
        CharSequence invoke = bVar.mo60569a().mo55487f().invoke(this.f58187d);
        if (invoke != null) {
            this.f58185b.f57169f.setText(invoke);
        }
        m56541a(bVar.mo60569a().mo55482a(this.f58187d));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m56540a(View view) {
        this.f58184a.mo57759b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m56543b(View view) {
        this.f58184a.mo57760c();
    }

    /* renamed from: c */
    public void mo57795c() {
        this.f58185b.f57165b.setEnabled(false);
        this.f58185b.f57165b.setAlpha(0.5f);
    }

    /* renamed from: d */
    public void mo57796d() {
        this.f58185b.f57171h.setEnabled(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ C21050d m56538a(PointF pointF) {
        if (pointF != null) {
            this.f58184a.mo57758a(pointF.x, pointF.y);
        } else {
            this.f58184a.mo57758a(((float) this.f58185b.f57170g.getWidth()) * 0.5f, ((float) this.f58185b.f57170g.getHeight()) * 0.5f);
        }
        return C21050d.f52856a;
    }

    /* renamed from: b */
    public void mo57794b() {
        this.f58186c.setState(4);
    }

    /* renamed from: a */
    private void m56541a(List<CharSequence> list) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.info_tag_container);
        linearLayout.removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, (int) Math.ceil((double) (getContext().getResources().getDisplayMetrics().density * 8.0f)), 0, 0);
        for (CharSequence next : list) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
            C24469n.C24470a aVar = C24469n.f61931a;
            aVar.mo60714a(this.f58188e.mo57135v(), this.f58187d, this.f58189f);
            try {
                View inflate = layoutInflater.inflate(R$layout.vrff_info_sheet_item, (ViewGroup) null);
                inflate.setLayoutParams(layoutParams);
                TextView textView = (TextView) inflate.findViewById(R$id.item_text);
                textView.setText(next);
                textView.setTextColor(this.f58188e.mo57135v().mo57084b());
                textView.setBackground(this.f58188e.mo57133t());
                linearLayout.addView(inflate);
                aVar.mo60718d();
            } catch (Throwable th) {
                C24469n.f61931a.mo60718d();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo57792a() {
        this.f58186c.setState(3);
        this.f58185b.f57168e.setVisibility(0);
    }

    /* renamed from: a */
    public void mo57793a(C22832ag agVar) {
        this.f58185b.f57172i.setVisibility(0);
        int i = C229142.f58191a[agVar.ordinal()];
        if (i == 1) {
            this.f58185b.f57172i.setText(this.f58187d.mo54727bQ());
        } else if (i == 2) {
            this.f58185b.f57172i.setText(this.f58187d.mo54726bP());
        } else if (i == 3) {
            this.f58185b.f57172i.setText(this.f58187d.mo54725bO());
        }
    }
}
