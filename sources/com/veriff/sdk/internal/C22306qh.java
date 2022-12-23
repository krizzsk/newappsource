package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import hd0.C23444d;
import hd0.C23445e;
import hd0.C23446f;
import hd0.C23447g;
import hd0.C23448h;
import java.util.Objects;
import mobi.lab.veriff.R$drawable;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.layouts.VeriffButton;
import mobi.lab.veriff.layouts.VeriffToolbar;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.qh */
public class C22306qh extends RelativeLayout {

    /* renamed from: a */
    private final C21616ex f56279a;

    /* renamed from: b */
    private final C22700xq f56280b;

    /* renamed from: c */
    private final C21789ix f56281c;

    /* renamed from: d */
    private final C21645fu f56282d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C22322a f56283e;

    /* renamed from: g */
    private VeriffButton f56284g;

    /* renamed from: h */
    private VeriffButton f56285h;

    /* renamed from: i */
    private TextView f56286i;

    /* renamed from: j */
    private TextView f56287j;

    /* renamed from: k */
    private ImageView f56288k;

    /* renamed from: com.veriff.sdk.internal.qh$a */
    public interface C22322a {
        /* renamed from: a */
        void mo56327a();

        /* renamed from: a */
        void mo56328a(int i);

        /* renamed from: b */
        void mo56329b();

        /* renamed from: c */
        void mo56330c();

        /* renamed from: d */
        void mo56331d();

        /* renamed from: e */
        void mo56332e();
    }

    public C22306qh(Context context, C21616ex exVar, C22700xq xqVar, C21789ix ixVar, C21645fu fuVar, C22322a aVar) {
        super(context);
        this.f56279a = exVar;
        this.f56283e = aVar;
        this.f56282d = fuVar;
        this.f56280b = xqVar;
        this.f56281c = ixVar;
        m54377a(context);
    }

    /* renamed from: c */
    private void m54380c() {
        VeriffButton veriffButton = (VeriffButton) findViewById(R$id.error_retry);
        this.f56284g = veriffButton;
        veriffButton.setText(this.f56279a.mo54715bE());
        VeriffButton veriffButton2 = (VeriffButton) findViewById(R$id.error_cancel);
        this.f56285h = veriffButton2;
        veriffButton2.setText(this.f56279a.mo54716bF());
        this.f56286i = (TextView) findViewById(R$id.error_title);
        this.f56287j = (TextView) findViewById(R$id.error_description);
        this.f56288k = (ImageView) findViewById(R$id.error_icon);
        ((VeriffToolbar) findViewById(R$id.error_toolbar)).mo60639a(this.f56281c, (VeriffToolbar.C24439c) new C23444d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m54382d() {
        this.f56282d.mo54921a(C21716gg.m52888a(C21783is.error));
        this.f56283e.mo56329b();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m54383l(int i) {
        this.f56283e.mo56328a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m54384m(int i) {
        this.f56283e.mo56328a(i);
    }

    /* renamed from: b */
    public void mo56317b(final int i) {
        this.f56288k.setImageDrawable(this.f56280b.mo57112a(R$drawable.vrff_ic_error_camera));
        this.f56285h.setVisibility(0);
        this.f56286i.setText(this.f56279a.mo54659aC());
        this.f56284g.setVisibility(8);
        this.f56287j.setVisibility(8);
        this.f56285h.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56328a(i);
            }
        });
    }

    /* renamed from: e */
    public void mo56320e(final int i) {
        this.f56288k.setImageDrawable(this.f56280b.mo57112a(R$drawable.vrff_ic_error_microphone));
        this.f56285h.setVisibility(0);
        this.f56286i.setText(this.f56279a.mo54707ay());
        this.f56287j.setText(this.f56279a.mo54708az());
        this.f56284g.setText(this.f56279a.mo54718bH());
        this.f56284g.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56330c();
            }
        });
        this.f56285h.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56328a(i);
            }
        });
    }

    /* renamed from: f */
    public void mo56321f(final int i) {
        this.f56288k.setImageDrawable(this.f56280b.mo57112a(R$drawable.vrff_ic_error_session));
        this.f56284g.setVisibility(8);
        this.f56285h.setVisibility(0);
        this.f56286i.setText(this.f56279a.mo54662aF());
        this.f56287j.setText(this.f56279a.mo54663aG());
        this.f56285h.setText(this.f56279a.mo54716bF());
        this.f56285h.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56328a(i);
            }
        });
    }

    /* renamed from: g */
    public void mo56322g(final int i) {
        this.f56288k.setImageDrawable(this.f56280b.mo57112a(R$drawable.vrff_ic_error_system));
        this.f56285h.setVisibility(0);
        this.f56286i.setText(this.f56279a.mo54664aH());
        this.f56287j.setText(this.f56279a.mo54665aI());
        this.f56284g.setText(this.f56279a.mo54715bE());
        this.f56285h.setText(this.f56279a.mo54716bF());
        this.f56284g.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56327a();
            }
        });
        this.f56285h.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56328a(i);
            }
        });
    }

    /* renamed from: h */
    public void mo56323h(final int i) {
        this.f56288k.setImageDrawable(this.f56280b.mo57112a(R$drawable.vrff_ic_error_system));
        this.f56285h.setVisibility(0);
        this.f56286i.setText(this.f56279a.mo54666aJ());
        this.f56287j.setText(this.f56279a.mo54667aK());
        this.f56284g.setText(this.f56279a.mo54715bE());
        this.f56285h.setText(this.f56279a.mo54716bF());
        this.f56284g.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56327a();
            }
        });
        this.f56285h.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56328a(i);
            }
        });
    }

    /* renamed from: i */
    public void mo56324i(final int i) {
        this.f56288k.setImageDrawable(this.f56280b.mo57112a(R$drawable.vrff_ic_error_network));
        this.f56285h.setVisibility(0);
        this.f56286i.setText(this.f56279a.mo54660aD());
        this.f56287j.setText(this.f56279a.mo54661aE());
        this.f56284g.setText(this.f56279a.mo54715bE());
        this.f56285h.setText(this.f56279a.mo54716bF());
        this.f56284g.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56327a();
            }
        });
        this.f56285h.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56328a(i);
            }
        });
    }

    /* renamed from: j */
    public void mo56325j(final int i) {
        this.f56288k.setImageDrawable(this.f56280b.mo57112a(R$drawable.vrff_ic_error_nfc));
        this.f56285h.setVisibility(0);
        this.f56286i.setText(this.f56279a.mo54822dD());
        this.f56287j.setText(this.f56279a.mo54823dE());
        this.f56284g.setVisibility(8);
        this.f56285h.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56328a(i);
            }
        });
    }

    /* renamed from: k */
    public void mo56326k(int i) {
        this.f56288k.setImageDrawable(this.f56280b.mo57112a(R$drawable.vrff_ic_error_nfc));
        this.f56285h.setVisibility(0);
        this.f56286i.setText(this.f56279a.mo54824dF());
        this.f56287j.setText(this.f56279a.mo54825dG());
        this.f56284g.setText(this.f56279a.mo54718bH());
        VeriffButton veriffButton = this.f56284g;
        C22322a aVar = this.f56283e;
        Objects.requireNonNull(aVar);
        veriffButton.mo60628a(false, (VeriffButton.C24432a) new C23445e(aVar));
        this.f56285h.setOnClick(new C23446f(this, i));
    }

    /* renamed from: a */
    public void mo56314a() {
        VeriffButton veriffButton = this.f56284g;
        if (veriffButton != null) {
            veriffButton.mo60630b();
        }
    }

    /* renamed from: d */
    public void mo56319d(final int i) {
        this.f56288k.setImageDrawable(this.f56280b.mo57112a(R$drawable.vrff_ic_error_system));
        this.f56285h.setVisibility(0);
        this.f56286i.setText(this.f56279a.mo54668aL());
        this.f56287j.setText(this.f56279a.mo54669aM());
        this.f56284g.setVisibility(8);
        this.f56285h.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56328a(i);
            }
        });
    }

    /* renamed from: a */
    private void m54377a(Context context) {
        View.inflate(context, R$layout.vrff_view_error, this);
        setBackgroundColor(this.f56280b.mo57135v().mo57096k());
        m54380c();
    }

    /* renamed from: a */
    public void mo56315a(final int i) {
        this.f56288k.setImageDrawable(this.f56280b.mo57112a(R$drawable.vrff_ic_error_camera));
        this.f56285h.setVisibility(0);
        this.f56286i.setText(this.f56279a.mo54705aw());
        this.f56287j.setText(this.f56279a.mo54706ax());
        this.f56284g.setText(this.f56279a.mo54718bH());
        this.f56284g.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56330c();
            }
        });
        this.f56285h.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56328a(i);
            }
        });
    }

    /* renamed from: b */
    public void mo56316b() {
        this.f56284g.setText(this.f56279a.mo54715bE());
        this.f56284g.setOnClick(new VeriffButton.C24432a() {
            public void onClick() {
                C22306qh.this.f56283e.mo56332e();
            }
        });
    }

    /* renamed from: c */
    public void mo56318c(int i) {
        this.f56288k.setImageDrawable(this.f56280b.mo57112a(R$drawable.vrff_ic_error_microphone));
        this.f56285h.setVisibility(0);
        this.f56286i.setText(this.f56279a.mo54657aA());
        this.f56287j.setText(this.f56279a.mo54658aB());
        this.f56284g.setText(this.f56279a.mo54715bE());
        VeriffButton veriffButton = this.f56284g;
        C22322a aVar = this.f56283e;
        Objects.requireNonNull(aVar);
        veriffButton.setOnClick(new C23447g(aVar));
        this.f56285h.setOnClick(new C23448h(this, i));
    }
}
