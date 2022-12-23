package com.masabi.justride.sdk.p415ui.features.ticket;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import com.masabi.justride.sdk.p415ui.base.activities.BaseContainerActivity;
import p116i1.C5247f;
import p605ki.C18060n;
import p658mo.C18411e;
import p775ro.C19295b;
import p775ro.C19297d;

/* renamed from: com.masabi.justride.sdk.ui.features.ticket.TicketActivity */
public class TicketActivity extends BaseContainerActivity implements C19295b {
    /* renamed from: d1 */
    public final String mo44387d1() {
        return ((C18411e) mo44385b1().f46184n.f47829b).f46947m;
    }

    /* renamed from: e1 */
    public final String mo44388e1() {
        return ((C18411e) mo44385b1().f46184n.f47829b).f46948n;
    }

    /* renamed from: f1 */
    public final Fragment mo44389f1(Bundle bundle) {
        C19297d dVar = new C19297d();
        dVar.setArguments(bundle);
        dVar.f49072M = this;
        return dVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        Resources resources = getResources();
        int i = C18060n.com_masabi_justride_sdk_icon_back_white;
        ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
        Drawable a = C5247f.C5248a.m13264a(resources, i, (Resources.Theme) null);
        if (supportActionBar != null && a != null) {
            int parseColor = Color.parseColor(mo44388e1());
            a.mutate();
            a.setColorFilter(parseColor, PorterDuff.Mode.SRC_ATOP);
            supportActionBar.mo791m(true);
            supportActionBar.mo796r(a);
        }
    }

    /* renamed from: y0 */
    public final void mo44434y0(String str) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo801w(str);
        }
    }
}
