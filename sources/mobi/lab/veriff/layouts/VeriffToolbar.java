package mobi.lab.veriff.layouts;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.veriff.sdk.internal.C21616ex;
import com.veriff.sdk.internal.C21637fn;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C22696xo;
import java.io.IOException;
import mobi.lab.veriff.C24418a;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.util.C24465j;
import mobi.lab.veriff.util.C24469n;
import p116i1.C5247f;
import p597jy.C17979a;

public class VeriffToolbar extends RelativeLayout {

    /* renamed from: a */
    private final C21616ex f61842a;

    /* renamed from: b */
    private final View f61843b;

    /* renamed from: c */
    private final ImageView f61844c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C24465j f61845d = C24465j.m61538a("VeriffToolbar");

    /* renamed from: mobi.lab.veriff.layouts.VeriffToolbar$a */
    public interface C24437a {
        /* renamed from: a */
        void mo56312a();
    }

    /* renamed from: mobi.lab.veriff.layouts.VeriffToolbar$b */
    public interface C24438b {
        /* renamed from: a */
        void mo55837a();
    }

    /* renamed from: mobi.lab.veriff.layouts.VeriffToolbar$c */
    public interface C24439c {
        void onLanguageClicked();
    }

    public VeriffToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Class<VeriffToolbar> cls = VeriffToolbar.class;
        View.inflate(context, R$layout.vrff_custom_toolbar, this);
        this.f61843b = findViewById(R$id.toolbar_toolbar);
        ImageView imageView = (ImageView) findViewById(R$id.toolbar_brand_icon);
        this.f61844c = imageView;
        C24469n.C24470a aVar = C24469n.f61931a;
        C22696xo a = aVar.mo60713a();
        C21789ix c = aVar.mo60717c();
        this.f61842a = aVar.mo60716b();
        int p = a.mo57101p();
        int i = C24418a.f61782a;
        if (p != i || a.mo57102q() == null) {
            Resources resources = getResources();
            int p2 = a.mo57101p();
            ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
            imageView.setImageDrawable(C5247f.C5248a.m13264a(resources, p2, (Resources.Theme) null));
        } else {
            m61462a(imageView, a);
        }
        if (c == null || (c.mo55457i() && a.mo57101p() == i)) {
            mo60638a();
        }
    }

    public void setBackground(int i) {
        this.f61843b.setBackground(getContext().getDrawable(i));
    }

    /* renamed from: a */
    public void mo60638a() {
        this.f61844c.setVisibility(4);
    }

    /* renamed from: a */
    public void mo60639a(C21789ix ixVar, C24439c cVar) {
        ImageView imageView = (ImageView) findViewById(R$id.toolbar_btn_language);
        if (!ixVar.mo55465q()) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new C17979a(cVar, 16));
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo60640a(final C24437a aVar) {
        findViewById(R$id.toolbar_btn_close).setVisibility(8);
        View findViewById = findViewById(R$id.toolbar_btn_back);
        findViewById.setVisibility(0);
        findViewById.setContentDescription(this.f61842a.mo54717bG());
        findViewById.setOnClickListener(new View.OnClickListener(this) {
            public void onClick(View view) {
                aVar.mo56312a();
            }
        });
    }

    /* renamed from: a */
    public void mo60641a(final C24438b bVar) {
        findViewById(R$id.toolbar_btn_back).setVisibility(8);
        View findViewById = findViewById(R$id.toolbar_btn_close);
        findViewById.setVisibility(0);
        findViewById.setContentDescription(this.f61842a.mo54719bI());
        findViewById.setOnClickListener(new View.OnClickListener(this) {
            public void onClick(View view) {
                bVar.mo55837a();
            }
        });
    }

    /* renamed from: a */
    private void m61462a(final ImageView imageView, final C22696xo xoVar) {
        imageView.setVisibility(4);
        C21637fn.m52522b().mo54894a(new Runnable() {
            public void run() {
                try {
                    final Drawable loadImage = xoVar.mo57102q().loadImage(VeriffToolbar.this.getContext());
                    imageView.post(new Runnable() {
                        public void run() {
                            imageView.setImageDrawable(loadImage);
                            imageView.setVisibility(0);
                        }
                    });
                } catch (IOException e) {
                    VeriffToolbar.this.f61845d.mo60708e("Error loading image from branding.getToolbarIconDrawableProvider()", e);
                }
            }
        });
    }
}
