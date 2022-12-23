package com.veriff.sdk.internal.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C22696xo;
import com.veriff.sdk.internal.C22700xq;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.R$dimen;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.R$styleable;
import mobi.lab.veriff.util.C24469n;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001$B'\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002R$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R*\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00138\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006%"}, mo59060d2 = {"Lcom/veriff/sdk/internal/widgets/ProgressItem;", "Landroid/widget/LinearLayout;", "", "stringResId", "Lbf0/d;", "setTextResId", "", "value", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "Landroid/widget/ImageView;", "check", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "label", "Landroid/widget/TextView;", "Lcom/veriff/sdk/internal/widgets/ProgressItem$State;", "progress", "Lcom/veriff/sdk/internal/widgets/ProgressItem$State;", "getProgress", "()Lcom/veriff/sdk/internal/widgets/ProgressItem$State;", "setProgress", "(Lcom/veriff/sdk/internal/widgets/ProgressItem$State;)V", "Landroid/widget/ProgressBar;", "spinner", "Landroid/widget/ProgressBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "State", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class ProgressItem extends LinearLayout {

    /* renamed from: a */
    private final ImageView f57292a;

    /* renamed from: b */
    private final ProgressBar f57293b;

    /* renamed from: c */
    private final TextView f57294c;

    /* renamed from: d */
    private C22655a f57295d;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/sdk/internal/widgets/ProgressItem$State;", "", "attrEnumValue", "", "(Ljava/lang/String;II)V", "NOT_STARTED", "IN_PROGRESS", "DONE", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.widgets.ProgressItem$a */
    public enum C22655a {
        NOT_STARTED(0),
        IN_PROGRESS(1),
        DONE(2);
        

        /* renamed from: d */
        public static final C22656a f57299d = null;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final int f57301f;

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/internal/widgets/ProgressItem$State$Companion;", "", "()V", "fromAttrEnum", "Lcom/veriff/sdk/internal/widgets/ProgressItem$State;", "value", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.widgets.ProgressItem$a$a */
        public static final class C22656a {
            private C22656a() {
            }

            public /* synthetic */ C22656a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C22655a mo57003a(int i) {
                for (C22655a aVar : C22655a.values()) {
                    if (aVar.f57301f == i) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f57299d = new C22656a((DefaultConstructorMarker) null);
        }

        private C22655a(int i) {
            this.f57301f = i;
        }
    }

    public ProgressItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProgressItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final C22655a getProgress() {
        return this.f57295d;
    }

    public final CharSequence getText() {
        CharSequence text = this.f57294c.getText();
        C24362h.m61210e(text, "label.text");
        return text;
    }

    public final void setProgress(C22655a aVar) {
        C24362h.m61211f(aVar, "value");
        int i = C22657a.f57306a[aVar.ordinal()];
        if (i == 1) {
            this.f57292a.setVisibility(4);
            this.f57293b.setVisibility(8);
        } else if (i == 2) {
            this.f57292a.setVisibility(8);
            this.f57293b.setVisibility(0);
        } else if (i == 3) {
            this.f57292a.setVisibility(0);
            this.f57293b.setVisibility(8);
        }
        this.f57295d = aVar;
    }

    public final void setText(CharSequence charSequence) {
        C24362h.m61211f(charSequence, "value");
        this.f57294c.setText(charSequence);
    }

    public final void setTextResId(int i) {
        String string = getContext().getString(i);
        C24362h.m61210e(string, "context.getString(stringResId)");
        setText(string);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        this.f57295d = C22655a.NOT_STARTED;
        View.inflate(context, R$layout.vrff_widget_progress_line, this);
        View findViewById = findViewById(R$id.progress_item_check);
        C24362h.m61210e(findViewById, "findViewById(R.id.progress_item_check)");
        ImageView imageView = (ImageView) findViewById;
        this.f57292a = imageView;
        View findViewById2 = findViewById(R$id.progress_item_spinner);
        C24362h.m61210e(findViewById2, "findViewById(R.id.progress_item_spinner)");
        ProgressBar progressBar = (ProgressBar) findViewById2;
        this.f57293b = progressBar;
        View findViewById3 = findViewById(R$id.progress_item_label);
        C24362h.m61210e(findViewById3, "findViewById(R.id.progress_item_label)");
        this.f57294c = (TextView) findViewById3;
        C22696xo a = C24469n.f61931a.mo60713a();
        C22700xq xqVar = new C22700xq(context, a);
        imageView.setImageDrawable(xqVar.mo57112a(a.mo57103r()));
        progressBar.setIndeterminateDrawable(xqVar.mo57122i());
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.vrff_margin_s);
        setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.vrffProgressItem);
            C24362h.m61210e(obtainStyledAttributes, "context.obtainStyledAttr…yleable.vrffProgressItem)");
            try {
                String string = obtainStyledAttributes.getString(R$styleable.vrffProgressItem_android_text);
                if (string != null) {
                    setText(string);
                }
                C22655a a2 = C22655a.f57299d.mo57003a(obtainStyledAttributes.getInt(R$styleable.vrffProgressItem_vrff_progress_state, -1));
                if (a2 != null) {
                    setProgress(a2);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
