package com.veriff.sdk.internal.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C22700xq;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.R$dimen;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.util.C24469n;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo59060d2 = {"Lcom/veriff/sdk/internal/widgets/DropdownButton;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "textView", "Landroid/widget/TextView;", "veriffResourcesProvider", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class DropdownButton extends LinearLayout {

    /* renamed from: a */
    private final TextView f57289a;

    /* renamed from: b */
    private C22700xq f57290b;

    public DropdownButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DropdownButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final CharSequence getText() {
        CharSequence text = this.f57289a.getText();
        C24362h.m61210e(text, "textView.text");
        return text;
    }

    public final void setText(CharSequence charSequence) {
        C24362h.m61211f(charSequence, "value");
        this.f57289a.setText(charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DropdownButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        Context context2 = getContext();
        C24362h.m61210e(context2, "getContext()");
        this.f57290b = new C22700xq(context2, C24469n.f61931a.mo60713a());
        View.inflate(context, R$layout.vrff_dropdown, this);
        View findViewById = findViewById(R$id.dropdown_label);
        C24362h.m61210e(findViewById, "findViewById(R.id.dropdown_label)");
        TextView textView = (TextView) findViewById;
        this.f57289a = textView;
        textView.setTextColor(this.f57290b.mo57135v().mo57098m());
        setBackground(this.f57290b.mo57126m());
        setOrientation(0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.vrff_margin_l);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }
}
