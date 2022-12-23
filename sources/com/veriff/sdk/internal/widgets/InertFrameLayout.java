package com.veriff.sdk.internal.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo59060d2 = {"Lcom/veriff/sdk/internal/widgets/InertFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "inert", "getInert", "()Z", "setInert", "(Z)V", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class InertFrameLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f57291a;

    public InertFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InertFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return !this.f57291a && super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getInert() {
        return this.f57291a;
    }

    public final void setInert(boolean z) {
        if (z) {
            clearFocus();
            setDescendantFocusability(393216);
            setImportantForAccessibility(4);
        } else {
            setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
            setImportantForAccessibility(0);
        }
        this.f57291a = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InertFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }
}
