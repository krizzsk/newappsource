package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0411h;
import androidx.fragment.app.Fragment;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.share.C2489a;
import p010a9.C0132a;
import p010a9.C0135b;

public final class SendButton extends C0135b {
    public SendButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    public int getDefaultRequestCode() {
        return CallbackManagerImpl.RequestCodeOffset.Message.toRequestCode();
    }

    public int getDefaultStyleResource() {
        return C2489a.com_facebook_button_send;
    }

    public ShareDialog getDialog() {
        C0132a aVar;
        if (getFragment() != null) {
            Fragment fragment = getFragment();
            aVar = new C0132a(new C0411h(fragment), getRequestCode());
        } else if (getNativeFragment() != null) {
            android.app.Fragment nativeFragment = getNativeFragment();
            aVar = new C0132a(new C0411h(nativeFragment), getRequestCode());
        } else {
            aVar = new C0132a(getActivity(), getRequestCode());
        }
        aVar.f8657e = getCallbackManager();
        return aVar;
    }

    public SendButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, "fb_send_button_create", "fb_send_button_did_tap");
    }
}
