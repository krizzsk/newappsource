package com.facebook.share.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0411h;
import androidx.fragment.app.Fragment;
import com.facebook.common.C2359b;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.share.C2489a;
import mf0.C24362h;
import p010a9.C0135b;
import p127j.C5344a;

public final class ShareButton extends C0135b {
    public ShareButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, "fb_share_button_create", "fb_share_button_did_tap");
    }

    /* renamed from: a */
    public final void mo220a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo220a(context, attributeSet, i, i2);
        setCompoundDrawablesWithIntrinsicBounds(C5344a.m13397a(getContext(), C2359b.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public int getDefaultRequestCode() {
        return CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
    }

    public int getDefaultStyleResource() {
        return C2489a.com_facebook_button_share;
    }

    public ShareDialog getDialog() {
        ShareDialog shareDialog;
        if (getFragment() != null) {
            Fragment fragment = getFragment();
            int requestCode = getRequestCode();
            C24362h.m61211f(fragment, "fragment");
            shareDialog = new ShareDialog(new C0411h(fragment), requestCode);
        } else if (getNativeFragment() != null) {
            android.app.Fragment nativeFragment = getNativeFragment();
            int requestCode2 = getRequestCode();
            C24362h.m61211f(nativeFragment, "fragment");
            shareDialog = new ShareDialog(new C0411h(nativeFragment), requestCode2);
        } else {
            shareDialog = new ShareDialog(getActivity(), getRequestCode());
        }
        shareDialog.f8657e = getCallbackManager();
        return shareDialog;
    }

    public ShareButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, "fb_share_button_create", "fb_share_button_did_tap");
    }
}
