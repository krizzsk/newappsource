package com.moovit.view.pickers;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import com.moovit.MoovitActivity;
import ia0.C12768f;
import java.util.ArrayList;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19742t;

public final class StringsPickerActivity extends MoovitActivity {

    /* renamed from: Z */
    public static final /* synthetic */ int f24119Z = 0;

    /* renamed from: U */
    public int f24120U;

    /* renamed from: X */
    public int f24121X;

    /* renamed from: Y */
    public ArrayList<? extends Parcelable> f24122Y;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C19742t.strings_picker_activity);
        Intent intent = getIntent();
        this.f24122Y = intent.getParcelableArrayListExtra("options");
        int i = 0;
        this.f24120U = intent.getIntExtra("actionBarTitle", 0);
        this.f24121X = intent.getIntExtra("headerTitle", 0);
        int i2 = this.f24120U;
        if (i2 != 0) {
            setTitle(i2);
        }
        ActionBar supportActionBar = getSupportActionBar();
        boolean z = true;
        if (supportActionBar != null) {
            supportActionBar.mo791m(true);
            supportActionBar.mo795q(C19739q.ic_close_24_control_normal);
        }
        if (this.f24121X == 0) {
            z = false;
        }
        TextView textView = (TextView) findViewById(C19740r.header);
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (z) {
            textView.setText(this.f24121X);
        }
        ListView listView = (ListView) findViewById(C19740r.list);
        listView.setAdapter(new ArrayAdapter(this, C19742t.strings_picker_row_layout, this.f24122Y));
        listView.setOnItemClickListener(new C12768f(this));
    }
}
