package mobi.lab.veriff.layouts;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.veriff.sdk.internal.C22700xq;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.R$style;
import mobi.lab.veriff.R$styleable;
import mobi.lab.veriff.util.C24469n;

public class VeriffButton extends FrameLayout {

    /* renamed from: a */
    private int f61831a;

    /* renamed from: b */
    private int f61832b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f61833c;

    /* renamed from: d */
    private TextView f61834d;

    /* renamed from: e */
    private ImageView f61835e;

    /* renamed from: f */
    private View f61836f;

    /* renamed from: g */
    private ProgressBar f61837g;

    /* renamed from: h */
    private C22700xq f61838h;

    /* renamed from: mobi.lab.veriff.layouts.VeriffButton$a */
    public interface C24432a {
        void onClick();
    }

    public VeriffButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m61456c() {
        int i = this.f61831a;
        if (i == 10) {
            this.f61836f.setBackground(this.f61838h.mo57115b());
            this.f61837g.setIndeterminateDrawable(this.f61838h.mo57121h());
        } else if (i == 12) {
            this.f61836f.setBackground(this.f61838h.mo57117d());
            this.f61837g.setIndeterminateDrawable(this.f61838h.mo57122i());
        } else if (i == 13) {
            this.f61836f.setBackground(this.f61838h.mo57116c());
            this.f61837g.setIndeterminateDrawable(this.f61838h.mo57123j());
        }
        this.f61835e.setVisibility(8);
        this.f61834d.setVisibility(8);
        this.f61837g.setVisibility(0);
    }

    public void setContentDescription(CharSequence charSequence) {
        this.f61835e.setContentDescription(charSequence);
    }

    public void setImageDrawable(Drawable drawable) {
        this.f61835e.setImageDrawable(drawable);
        this.f61835e.setVisibility(0);
        this.f61834d.setVisibility(8);
        this.f61837g.setVisibility(8);
    }

    public void setOnClick(final C24432a aVar) {
        this.f61833c = false;
        this.f61836f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (VeriffButton.this.isEnabled() && !VeriffButton.this.f61833c) {
                    aVar.onClick();
                    VeriffButton.this.m61456c();
                    boolean unused = VeriffButton.this.f61833c = true;
                }
            }
        });
    }

    public void setText(int i) {
        this.f61834d.setText(i);
    }

    public VeriffButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.vrffButtonDefaultStyle);
    }

    /* renamed from: b */
    public void mo60630b() {
        int i = this.f61831a;
        if (i == 10) {
            this.f61836f.setBackground(this.f61838h.mo57118e());
        } else if (i == 12) {
            this.f61836f.setBackground(this.f61838h.mo57120g());
        } else if (i == 13) {
            this.f61836f.setBackground(this.f61838h.mo57119f());
        }
        this.f61837g.setVisibility(8);
        if (this.f61832b == 21) {
            this.f61835e.setVisibility(0);
        } else {
            this.f61834d.setVisibility(0);
        }
        this.f61833c = false;
    }

    public void setText(CharSequence charSequence) {
        this.f61834d.setText(charSequence);
    }

    public VeriffButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, 0, i2);
        this.f61833c = false;
        View.inflate(context, R$layout.vrff_button, this);
        m61451a(attributeSet);
    }

    /* renamed from: a */
    private void m61451a(AttributeSet attributeSet) {
        this.f61838h = new C22700xq(getContext(), C24469n.f61931a.mo60713a());
        this.f61836f = findViewById(R$id.button_frame);
        this.f61834d = (TextView) findViewById(R$id.button_text);
        this.f61835e = (ImageView) findViewById(R$id.button_image);
        this.f61837g = (ProgressBar) findViewById(R$id.button_loader);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.vrffButton);
            this.f61831a = obtainStyledAttributes.getInt(R$styleable.vrffButton_vrff_button_ui, 10);
            this.f61832b = obtainStyledAttributes.getInt(R$styleable.vrffButton_vrff_button_type, 20);
            String string = obtainStyledAttributes.getString(R$styleable.vrffButton_vrff_button_text);
            int resourceId = obtainStyledAttributes.getResourceId(R$styleable.vrffButton_vrff_button_img, 0);
            String string2 = obtainStyledAttributes.getString(R$styleable.vrffButton_vrff_button_contentDescription);
            mo60627a(obtainStyledAttributes.getBoolean(R$styleable.vrffButton_android_enabled, true));
            obtainStyledAttributes.recycle();
            int i = this.f61831a;
            if (i == 10) {
                this.f61836f.setBackground(this.f61838h.mo57118e());
            } else if (i == 12) {
                this.f61836f.setBackground(this.f61838h.mo57120g());
            } else if (i == 13) {
                this.f61836f.setBackground(this.f61838h.mo57119f());
            }
            if (this.f61832b == 21) {
                m61450a(resourceId, string2);
            } else {
                m61452a(string, resourceId);
            }
        }
    }

    /* renamed from: a */
    public void mo60628a(boolean z, final C24432a aVar) {
        if (z) {
            setOnClick(aVar);
        } else {
            this.f61836f.setOnClickListener(new View.OnClickListener(this) {
                public void onClick(View view) {
                    aVar.onClick();
                }
            });
        }
    }

    /* renamed from: a */
    public boolean mo60629a() {
        return this.f61833c;
    }

    /* renamed from: a */
    private void m61450a(int i, String str) {
        if (this.f61831a == 13) {
            ImageView imageView = this.f61835e;
            C22700xq xqVar = this.f61838h;
            imageView.setImageDrawable(xqVar.mo57113a(i, xqVar.mo57135v().mo57084b()));
        } else {
            this.f61835e.setImageResource(i);
        }
        if (str != null) {
            this.f61835e.setContentDescription(str);
        }
        this.f61835e.setVisibility(0);
        this.f61834d.setVisibility(8);
        this.f61837g.setVisibility(8);
    }

    /* renamed from: a */
    private void m61452a(String str, int i) {
        this.f61834d.setText(str);
        int i2 = this.f61831a;
        if (i2 == 13 || i2 == 12) {
            this.f61834d.setTextColor(this.f61838h.mo57135v().mo57084b());
        }
        if (this.f61831a == 10) {
            this.f61834d.setTextColor(this.f61838h.mo57135v().mo57096k());
        }
        if (i != 0) {
            this.f61835e.setVisibility(0);
            this.f61835e.setImageResource(i);
        } else {
            this.f61835e.setVisibility(8);
        }
        this.f61834d.setVisibility(0);
        this.f61837g.setVisibility(8);
    }

    /* renamed from: a */
    public void mo60627a(boolean z) {
        setEnabled(z);
        this.f61836f.setEnabled(z);
    }
}
