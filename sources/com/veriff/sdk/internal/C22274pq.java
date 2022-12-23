package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C1179g;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.Snackbar;
import hd0.C23442b;
import hd0.C23443c;
import java.util.List;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.data.C24424c;
import mobi.lab.veriff.layouts.VeriffToolbar;
import mobi.lab.veriff.util.C24449c;
import p304x.C7070l;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.pq */
public class C22274pq extends LinearLayout {

    /* renamed from: a */
    private final C21616ex f56176a;

    /* renamed from: b */
    private final C22642vx f56177b;

    /* renamed from: c */
    private final C22633vo f56178c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C22644vz f56179d;

    /* renamed from: e */
    private final C22643vy f56180e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C22280a f56181f;

    /* renamed from: g */
    private final C21789ix f56182g;

    /* renamed from: h */
    private final C22700xq f56183h;

    /* renamed from: i */
    private final C21645fu f56184i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C22271pp f56185j;

    /* renamed from: com.veriff.sdk.internal.pq$a */
    public interface C22280a {
        /* renamed from: a */
        void mo56248a();

        /* renamed from: a */
        void mo56249a(C24424c cVar);

        /* renamed from: b */
        void mo56250b();

        /* renamed from: b */
        void mo56251b(C24424c cVar);

        /* renamed from: c */
        void mo56252c();
    }

    public C22274pq(Context context, C21616ex exVar, C22700xq xqVar, C21789ix ixVar, C21645fu fuVar, C22280a aVar) {
        super(context);
        this.f56176a = exVar;
        this.f56181f = aVar;
        this.f56184i = fuVar;
        this.f56182g = ixVar;
        this.f56183h = xqVar;
        C22642vx a = C22642vx.m55194a(LayoutInflater.from(context), this, true);
        this.f56177b = a;
        this.f56180e = C22643vy.m55197a(a.mo56991a());
        this.f56179d = C22644vz.m55198a(a.mo56991a());
        C22633vo a2 = C22633vo.m55177a(a.f57192e.mo56989a());
        this.f56178c = a2;
        a2.mo56989a().setBackgroundColor(xqVar.mo57135v().mo57096k());
        a2.f57105b.setIndeterminateDrawable(xqVar.mo57124k());
        setBackgroundColor(xqVar.mo57135v().mo57096k());
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m54277h() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m54278i() {
        this.f56184i.mo54921a(C21716gg.m52888a(C21783is.f55100c));
        this.f56181f.mo56250b();
    }

    /* renamed from: e */
    public void mo56263e() {
        this.f56178c.f57104a.setAlpha(1.0f);
    }

    /* renamed from: f */
    public void mo56264f() {
        this.f56178c.f57104a.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(500).start();
        mo56262d();
    }

    /* renamed from: g */
    public void mo56265g() {
        Snackbar.m35158k(0, findViewById(R$id.country_root), this.f56176a.mo54697ao()).mo42259p();
    }

    public void setSelectedCountry(C24424c cVar) {
        if (cVar == null) {
            this.f56180e.f57196c.setText(this.f56176a.mo54696an());
            this.f56180e.f57194a.mo60627a(false);
            return;
        }
        this.f56180e.f57196c.setText(cVar.mo60583b());
        this.f56180e.f57194a.setVisibility(0);
        this.f56180e.f57194a.requestFocus();
        this.f56180e.f57194a.setOnClick(new C23442b(this, cVar));
        this.f56180e.f57194a.mo60627a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m54271b(C24424c cVar) {
        m54277h();
        this.f56181f.mo56251b(cVar);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: a */
    public void mo56259a(List<C24424c> list) {
        this.f56185j = new C22271pp(list, "", new C7070l(this, 23), this.f56183h);
        this.f56177b.f57191d.mo60641a((VeriffToolbar.C24438b) new VeriffToolbar.C24438b() {
            /* renamed from: a */
            public void mo55837a() {
                C22274pq.this.f56181f.mo56248a();
            }
        });
        this.f56177b.f57191d.mo60639a(this.f56182g, (VeriffToolbar.C24439c) new C23443c(this));
        this.f56179d.f57204e.setBackground(this.f56183h.mo57126m());
        this.f56179d.f57202c.setHint(this.f56176a.mo54696an());
        this.f56179d.f57202c.setTextColor(this.f56183h.mo57135v().mo57098m());
        this.f56179d.f57202c.setHintTextColor(this.f56183h.mo57135v().mo57099n());
        this.f56179d.f57203d.setContentDescription(this.f56176a.mo54760bx());
        this.f56179d.f57203d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C22274pq.this.f56179d.f57202c.setText("");
            }
        });
        this.f56179d.f57201b.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f56179d.f57201b.setItemAnimator(new C1179g());
        this.f56179d.f57201b.mo4593g(new C24449c(this.f56183h.mo57125l()), -1);
        this.f56179d.f57201b.setBackground(this.f56183h.mo57126m());
        this.f56179d.f57201b.setAdapter(this.f56185j);
        this.f56180e.f57197d.setBackground(this.f56183h.mo57126m());
        this.f56180e.f57197d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C22274pq.this.f56181f.mo56252c();
            }
        });
        this.f56180e.f57198f.setText(this.f56176a.mo54694al());
        this.f56180e.f57195b.setText(this.f56176a.mo54695am());
        this.f56180e.f57197d.requestFocus();
        this.f56180e.f57196c.setText(this.f56176a.mo54696an());
        this.f56180e.f57194a.setText(this.f56176a.mo54762bz());
        this.f56179d.f57202c.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6 && i != 0) {
                    return false;
                }
                C22274pq.this.m54277h();
                return true;
            }
        });
        this.f56179d.f57202c.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String trim = charSequence.toString().trim();
                C22274pq.this.f56185j.mo56257a(trim);
                if (trim.length() > 0) {
                    C22274pq.this.f56179d.f57203d.setVisibility(0);
                    C22274pq.this.f56179d.f57205f.setVisibility(8);
                    return;
                }
                C22274pq.this.f56179d.f57203d.setVisibility(8);
                C22274pq.this.f56179d.f57205f.setVisibility(0);
            }
        });
    }

    /* renamed from: c */
    public void mo56261c() {
        this.f56179d.f57202c.requestFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this.f56179d.f57202c, 1);
        EditText editText = this.f56179d.f57202c;
        editText.setSelection(editText.getText().length());
    }

    /* renamed from: d */
    public void mo56262d() {
        this.f56177b.f57189a.setVisibility(0);
        this.f56177b.f57190c.setVisibility(8);
    }

    /* renamed from: b */
    public void mo56260b() {
        this.f56177b.f57189a.setVisibility(8);
        this.f56177b.f57190c.setVisibility(0);
        mo56261c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m54269a(C24424c cVar) {
        this.f56181f.mo56249a(cVar);
    }

    /* renamed from: a */
    public void mo56258a() {
        this.f56179d.f57202c.setText("");
    }
}
