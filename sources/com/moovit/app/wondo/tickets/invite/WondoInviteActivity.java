package com.moovit.app.wondo.tickets.invite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import c70.C13753f;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.app.MoovitAppActivity;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p304x.C7029b1;
import p435de.C16596f;
import p583jk.C17884p;
import p761qy.C19201a;
import p833ty.C19793a;
import p881vy.C20249c;
import p881vy.C20250d;
import p906wz.C20436g;
import p977zz.C20927a0;
import p977zz.C20964s0;

public class WondoInviteActivity extends MoovitAppActivity {

    /* renamed from: Y */
    public static final /* synthetic */ int f40691Y = 0;

    /* renamed from: U */
    public C19793a f40692U;

    /* renamed from: X */
    public boolean f40693X;

    /* renamed from: U1 */
    public final void mo44512U1(List<C20436g<?, ?>> list) {
        this.f40692U = ((C20250d) list.get(0)).f51354m;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.wondo_invite_activity);
        Intent intent = getIntent();
        if (intent != null) {
            if (!"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null) {
                this.f40693X = intent.getBooleanExtra("auto_share", false);
            } else {
                Uri data = intent.getData();
                C16596f.m42113a().mo49363b(data.toString());
                this.f40693X = DiskLruCache.VERSION_1.equals(data.getQueryParameter("as"));
            }
        }
        ImageView imageView = (ImageView) findViewById(R.id.image);
        C17884p.m44354Y(imageView).mo51642v(this.f40692U.f50316a).mo51628o0(this.f40692U.f50316a).mo10850T(imageView);
        mo44549x2(R.id.title).setText(this.f40692U.f50317b);
        mo44549x2(R.id.subtitle).setText(this.f40692U.f50318c);
        Button button = (Button) findViewById(R.id.action);
        button.setText(this.f40692U.f50319d);
        button.setOnClickListener(new C19201a(this, 2));
        TextView textView = (TextView) findViewById(R.id.terms_and_conditions);
        String string = getString(R.string.wondo_invite_terms_and_conditions_link);
        textView.setText(string);
        C20964s0.m49105w(textView, string, false, new C7029b1(this, 9));
        if (this.f40693X) {
            C19793a aVar = this.f40692U;
            startActivity(Intent.createChooser(C20927a0.m49012g(aVar.f50322g, aVar.f50321f), getString(R.string.share_with)));
        }
    }

    public final Intent getSupportParentActivityIntent() {
        if (isTaskRoot()) {
            return C14226d.m35335A0(this);
        }
        return super.getSupportParentActivityIntent();
    }

    /* renamed from: i1 */
    public final Collection<C13753f<?>> mo44524i1() {
        C20249c cVar = new C20249c(mo44548x1());
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        return Collections.singleton(new C13753f("wondo_invite", cVar, requestOptions));
    }
}
