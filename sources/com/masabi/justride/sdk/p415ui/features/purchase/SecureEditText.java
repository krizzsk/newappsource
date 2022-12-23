package com.masabi.justride.sdk.p415ui.features.purchase;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import p413co.C13869o;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010O\u001a\u00020N\u0012\b\u0010Q\u001a\u0004\u0018\u00010P\u0012\b\b\u0002\u0010R\u001a\u00020\u0006¢\u0006\u0004\bS\u0010TJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0017J\b\u0010\u0007\u001a\u00020\u0006H\u0017J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006J\u0010\u0010\u0015\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R$\u0010)\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R(\u0010-\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8F@FX\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00103\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001028F@FX\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00109\u001a\u0002082\u0006\u00109\u001a\u0002088F@FX\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0013\u0010@\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010B\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bA\u0010?R$\u0010E\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\bC\u0010#\"\u0004\bD\u0010%R0\u0010M\u001a\b\u0012\u0004\u0012\u00020G0F2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0F8F@FX\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006U"}, mo59060d2 = {"Lcom/masabi/justride/sdk/ui/features/purchase/SecureEditText;", "Landroid/widget/FrameLayout;", "", "focusable", "Lbf0/d;", "setFocusable", "", "getFocusable", "enabled", "setEnabled", "Landroid/graphics/drawable/Drawable;", "drawable", "setBackground", "color", "setBackgroundColor", "getBackground", "Landroid/view/View$OnFocusChangeListener;", "focusChangeListener", "setOnFocusChangeListener", "lines", "setLines", "setHintTextColor", "Landroid/content/res/ColorStateList;", "colorStateList", "setTextColor", "Lco/o;", "b", "Lco/o;", "getEncryptedMemoryStorage$Android_release", "()Lco/o;", "setEncryptedMemoryStorage$Android_release", "(Lco/o;)V", "encryptedMemoryStorage", "maxLines", "getMaxLines", "()I", "setMaxLines", "(I)V", "minLines", "getMinLines", "setMinLines", "inputType", "getInputType", "setInputType", "", "hint", "getHint", "()Ljava/lang/CharSequence;", "setHint", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/Typeface;", "typeface", "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "", "textSize", "getTextSize", "()F", "setTextSize", "(F)V", "getHintTextColors", "()Landroid/content/res/ColorStateList;", "hintTextColors", "getTextColors", "textColors", "getHighlightColor", "setHighlightColor", "highlightColor", "", "Landroid/text/InputFilter;", "inputFilters", "getFilters", "()[Landroid/text/InputFilter;", "setFilters", "([Landroid/text/InputFilter;)V", "filters", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.purchase.SecureEditText */
public final class SecureEditText extends FrameLayout {

    /* renamed from: d */
    public static final /* synthetic */ int f37193d = 0;

    /* renamed from: b */
    public C13869o f37194b;

    /* renamed from: c */
    public final EditText f37195c;

    /* renamed from: com.masabi.justride.sdk.ui.features.purchase.SecureEditText$a */
    public static final class C14663a implements TextWatcher {

        /* renamed from: b */
        public final /* synthetic */ SecureEditText f37196b;

        public C14663a(SecureEditText secureEditText) {
            this.f37196b = secureEditText;
        }

        public final void afterTextChanged(Editable editable) {
            C24362h.m61211f(editable, "editable");
            SecureEditText secureEditText = this.f37196b;
            editable.toString();
            int i = SecureEditText.f37193d;
            secureEditText.getClass();
            throw new RuntimeException("Cannot save card details.");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C24362h.m61211f(charSequence, "charSequence");
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C24362h.m61211f(charSequence, "charSequence");
        }
    }

    /* renamed from: com.masabi.justride.sdk.ui.features.purchase.SecureEditText$b */
    public static final class C14664b implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final /* synthetic */ SecureEditText f37197b;

        /* renamed from: c */
        public final /* synthetic */ View.OnFocusChangeListener f37198c;

        public C14664b(SecureEditText secureEditText, View.OnFocusChangeListener onFocusChangeListener) {
            this.f37197b = secureEditText;
            this.f37198c = onFocusChangeListener;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f37198c.onFocusChange(this.f37197b, z);
        }
    }

    public SecureEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Drawable getBackground() {
        Drawable background = this.f37195c.getBackground();
        C24362h.m61210e(background, "editText.background");
        return background;
    }

    public final C13869o getEncryptedMemoryStorage$Android_release() {
        return this.f37194b;
    }

    public final InputFilter[] getFilters() {
        InputFilter[] filters = this.f37195c.getFilters();
        C24362h.m61210e(filters, "editText.filters");
        return filters;
    }

    public int getFocusable() {
        return this.f37195c.getFocusable();
    }

    public final int getHighlightColor() {
        return this.f37195c.getHighlightColor();
    }

    public final CharSequence getHint() {
        return this.f37195c.getHint();
    }

    public final ColorStateList getHintTextColors() {
        return this.f37195c.getHintTextColors();
    }

    public final int getInputType() {
        return this.f37195c.getInputType();
    }

    public final int getMaxLines() {
        return this.f37195c.getMaxLines();
    }

    public final int getMinLines() {
        return this.f37195c.getMinLines();
    }

    public final ColorStateList getTextColors() {
        ColorStateList textColors = this.f37195c.getTextColors();
        C24362h.m61210e(textColors, "editText.textColors");
        return textColors;
    }

    public final float getTextSize() {
        return this.f37195c.getTextSize();
    }

    public final Typeface getTypeface() {
        return this.f37195c.getTypeface();
    }

    public final boolean isDirty() {
        return this.f37195c.isDirty();
    }

    public final boolean isEnabled() {
        return this.f37195c.isEnabled();
    }

    public final boolean isFocused() {
        return this.f37195c.isFocused();
    }

    public void setBackground(Drawable drawable) {
        C24362h.m61211f(drawable, "drawable");
        this.f37195c.setBackground(drawable);
    }

    public void setBackgroundColor(int i) {
        this.f37195c.setBackgroundColor(i);
    }

    public void setEnabled(boolean z) {
        this.f37195c.setEnabled(z);
    }

    public final void setEncryptedMemoryStorage$Android_release(C13869o oVar) {
        this.f37194b = oVar;
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        C24362h.m61211f(inputFilterArr, "inputFilters");
        this.f37195c.setFilters(inputFilterArr);
    }

    public void setFocusable(boolean z) {
        this.f37195c.setFocusable(z);
    }

    public final void setHighlightColor(int i) {
        this.f37195c.setHighlightColor(i);
    }

    public final void setHint(CharSequence charSequence) {
        this.f37195c.setHint(charSequence);
    }

    public final void setHintTextColor(int i) {
        this.f37195c.setHintTextColor(i);
    }

    public final void setInputType(int i) {
        this.f37195c.setInputType(i);
    }

    public final void setLines(int i) {
        this.f37195c.setLines(i);
    }

    public final void setMaxLines(int i) {
        this.f37195c.setMaxLines(i);
    }

    public final void setMinLines(int i) {
        this.f37195c.setMinLines(i);
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        C24362h.m61211f(onFocusChangeListener, "focusChangeListener");
        super.setOnFocusChangeListener(onFocusChangeListener);
        this.f37195c.setOnFocusChangeListener(new C14664b(this, onFocusChangeListener));
    }

    public final void setTextColor(int i) {
        this.f37195c.setTextColor(i);
    }

    public final void setTextSize(float f) {
        this.f37195c.setTextSize(f);
    }

    public final void setTypeface(Typeface typeface) {
        this.f37195c.setTypeface(typeface);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecureEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        EditText editText = new EditText(context, attributeSet);
        this.f37195c = editText;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        editText.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setInputType(2);
        setMinLines(1);
        setMaxLines(1);
        editText.addTextChangedListener(new C14663a(this));
        addView(editText);
    }

    public void setFocusable(int i) {
        this.f37195c.setFocusable(i);
    }

    public final void setHintTextColor(ColorStateList colorStateList) {
        this.f37195c.setHintTextColor(colorStateList);
    }

    public final void setTextColor(ColorStateList colorStateList) {
        C24362h.m61211f(colorStateList, "colorStateList");
        this.f37195c.setTextColor(colorStateList);
    }
}
