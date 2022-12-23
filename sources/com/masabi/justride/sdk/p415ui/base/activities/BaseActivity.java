package com.masabi.justride.sdk.p415ui.base.activities;

import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.masabi.justride.sdk.exception.MissingArgumentException;
import p605ki.C18047b;

/* renamed from: com.masabi.justride.sdk.ui.base.activities.BaseActivity */
public abstract class BaseActivity extends AppCompatActivity {
    /* renamed from: b1 */
    public final C18047b mo44385b1() {
        String stringExtra = getIntent().getStringExtra("KEY_SDK_INSTANCE_IDENTIFIER");
        if (stringExtra != null) {
            C18047b.f46173p.getClass();
            return C18047b.C18048a.m44717a(stringExtra);
        }
        throw new MissingArgumentException("Cannot load Activity without a Justride SDK instance identifier");
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
