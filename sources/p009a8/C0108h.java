package p009a8;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.activity.result.C0213f;
import androidx.appcompat.widget.C0411h;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.appevents.C2338j;
import com.facebook.common.C2358a;
import com.facebook.common.C2363f;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;
import p090g1.C4732a;
import p259t5.C6593c;
import p262t8.C6606a;

@SuppressLint({"ResourceType"})
/* renamed from: a8.h */
public abstract class C0108h extends Button {

    /* renamed from: j */
    public static final /* synthetic */ int f317j = 0;

    /* renamed from: b */
    public final String f318b;

    /* renamed from: c */
    public final String f319c;

    /* renamed from: d */
    public View.OnClickListener f320d;

    /* renamed from: e */
    public View.OnClickListener f321e;

    /* renamed from: f */
    public boolean f322f;

    /* renamed from: g */
    public int f323g;

    /* renamed from: h */
    public int f324h;

    /* renamed from: i */
    public C0411h f325i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0108h(Context context, AttributeSet attributeSet, int i, String str, String str2) {
        super(context, attributeSet, 0);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        int defaultStyleResource = getDefaultStyleResource();
        mo220a(context, attributeSet, i, defaultStyleResource == 0 ? C2363f.com_facebook_button : defaultStyleResource);
        this.f318b = str;
        this.f319c = str2;
        setClickable(true);
        setFocusable(true);
    }

    /* renamed from: a */
    public void mo220a(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!C6606a.m15601b(this)) {
            try {
                C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
                mo221b(context, attributeSet, i, i2);
                mo222c(context, attributeSet, i, i2);
                mo223d(context, attributeSet, i, i2);
                mo224e(context, attributeSet, i, i2);
                if (!C6606a.m15601b(this)) {
                    super.setOnClickListener(new C6593c(this, 1));
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* renamed from: b */
    public final void mo221b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes;
        if (!C6606a.m15601b(this)) {
            try {
                if (!isInEditMode()) {
                    obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i, i2);
                    C24362h.m61210e(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
                    if (obtainStyledAttributes.hasValue(0)) {
                        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                        if (resourceId != 0) {
                            setBackgroundResource(resourceId);
                        } else {
                            setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                        }
                    } else {
                        setBackgroundColor(C4732a.getColor(context, C2358a.com_facebook_blue));
                    }
                    obtainStyledAttributes.recycle();
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: c */
    public final void mo222c(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes;
        if (!C6606a.m15601b(this)) {
            try {
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i, i2);
                C24362h.m61210e(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
                setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(3, 0));
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
                obtainStyledAttributes.recycle();
                setCompoundDrawablePadding(dimensionPixelSize);
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* renamed from: d */
    public final void mo223d(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes;
        if (!C6606a.m15601b(this)) {
            try {
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i, i2);
                C24362h.m61210e(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
                setPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0));
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* renamed from: e */
    public final void mo224e(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes;
        TypedArray obtainStyledAttributes2;
        TypedArray obtainStyledAttributes3;
        if (!C6606a.m15601b(this)) {
            try {
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i, i2);
                C24362h.m61210e(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, colorResources, defStyleAttr, defStyleRes)");
                setTextColor(obtainStyledAttributes.getColorStateList(0));
                obtainStyledAttributes.recycle();
                obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i, i2);
                C24362h.m61210e(obtainStyledAttributes2, "context.theme.obtainStyledAttributes(attrs, gravityResources, defStyleAttr, defStyleRes)");
                int i3 = obtainStyledAttributes2.getInt(0, 17);
                obtainStyledAttributes2.recycle();
                setGravity(i3);
                obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i, i2);
                C24362h.m61210e(obtainStyledAttributes3, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
                setTextSize(0, (float) obtainStyledAttributes3.getDimensionPixelSize(0, 0));
                setTypeface(Typeface.create(getTypeface(), 1));
                String string = obtainStyledAttributes3.getString(2);
                obtainStyledAttributes3.recycle();
                setText(string);
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    public Activity getActivity() {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new FacebookException("Unable to get Activity.");
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    public final String getAnalyticsButtonCreatedEventName() {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            return this.f318b;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    public final String getAnalyticsButtonTappedEventName() {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            return this.f319c;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    public final C0213f getAndroidxActivityResultRegistryOwner() {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            Activity activity = getActivity();
            if (activity instanceof C0213f) {
                return (C0213f) activity;
            }
            return null;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    public int getCompoundPaddingLeft() {
        if (C6606a.m15601b(this)) {
            return 0;
        }
        try {
            if (this.f322f) {
                return this.f323g;
            }
            return super.getCompoundPaddingLeft();
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return 0;
        }
    }

    public int getCompoundPaddingRight() {
        if (C6606a.m15601b(this)) {
            return 0;
        }
        try {
            if (this.f322f) {
                return this.f324h;
            }
            return super.getCompoundPaddingRight();
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return 0;
        }
    }

    public abstract int getDefaultRequestCode();

    public int getDefaultStyleResource() {
        C6606a.m15601b(this);
        return 0;
    }

    public final Fragment getFragment() {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            C0411h hVar = this.f325i;
            if (hVar == null) {
                return null;
            }
            return (Fragment) hVar.f1512b;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    public final android.app.Fragment getNativeFragment() {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            C0411h hVar = this.f325i;
            if (hVar == null) {
                return null;
            }
            return (android.app.Fragment) hVar.f1513c;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    public int getRequestCode() {
        if (C6606a.m15601b(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return 0;
        }
    }

    public final void onAttachedToWindow() {
        if (!C6606a.m15601b(this)) {
            try {
                super.onAttachedToWindow();
                if (!isInEditMode()) {
                    Context context = getContext();
                    if (!C6606a.m15601b(this)) {
                        C2338j jVar = new C2338j(context, (String) null);
                        String str = this.f318b;
                        C0115o oVar = C0115o.f331a;
                        if (C0098d0.m169b()) {
                            jVar.mo12486f(str, (Bundle) null);
                        }
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    public final void onDraw(Canvas canvas) {
        boolean z;
        int i;
        if (!C6606a.m15601b(this)) {
            try {
                C24362h.m61211f(canvas, "canvas");
                if ((getGravity() & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int compoundPaddingLeft = getCompoundPaddingLeft();
                    int compoundPaddingRight = getCompoundPaddingRight();
                    int width = (getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight;
                    String obj = getText().toString();
                    if (!C6606a.m15601b(this)) {
                        i = (int) Math.ceil((double) getPaint().measureText(obj));
                        int min = Math.min((width - i) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                        this.f323g = compoundPaddingLeft - min;
                        this.f324h = compoundPaddingRight + min;
                        this.f322f = true;
                    }
                    i = 0;
                    int min2 = Math.min((width - i) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                    this.f323g = compoundPaddingLeft - min2;
                    this.f324h = compoundPaddingRight + min2;
                    this.f322f = true;
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
                return;
            }
            super.onDraw(canvas);
            this.f322f = false;
        }
    }

    public final void setFragment(android.app.Fragment fragment) {
        if (!C6606a.m15601b(this)) {
            try {
                C24362h.m61211f(fragment, "fragment");
                this.f325i = new C0411h(fragment);
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        if (!C6606a.m15601b(this)) {
            try {
                this.f321e = onClickListener;
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (!C6606a.m15601b(this)) {
            try {
                this.f320d = onClickListener;
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    public final void setFragment(Fragment fragment) {
        if (!C6606a.m15601b(this)) {
            try {
                C24362h.m61211f(fragment, "fragment");
                this.f325i = new C0411h(fragment);
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
