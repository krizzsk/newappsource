package com.moovit.app.useraccount.profile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.play.core.assetpacks.C14343z0;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.app.general.userprofile.avatars.Avatar;
import com.moovit.app.general.userprofile.avatars.AvatarsActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.profile.UserCarpoolData;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import p011aa.C0141e;
import p130j2.C5367a;
import p297w5.C6994a;
import p471eq.C16850a;
import p527gy.C17256b;
import p527gy.C17259d;
import p527gy.C17261e;
import p527gy.C17263f;
import p527gy.C17264g;
import p567iq.C17635b;
import p583jk.C17884p;
import p716oy.C18860a;
import p827ts.C19757d;
import p827ts.C19758e;
import p906wz.C20431c;
import p906wz.C20436g;

public class UserAvatarFragment extends C15682c<MoovitActivity> {

    /* renamed from: u */
    public static final /* synthetic */ int f40636u = 0;

    /* renamed from: n */
    public final C15631a f40637n = new C15631a();

    /* renamed from: o */
    public final C15632b f40638o = new C15632b();

    /* renamed from: p */
    public final C15633c f40639p = new C15633c();

    /* renamed from: q */
    public UserAccountManager f40640q = null;

    /* renamed from: r */
    public TextView f40641r;

    /* renamed from: s */
    public TextView f40642s;

    /* renamed from: t */
    public ImageView f40643t;

    /* renamed from: com.moovit.app.useraccount.profile.UserAvatarFragment$a */
    public class C15631a extends BroadcastReceiver {
        public C15631a() {
        }

        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("com.moovit.useraccount.manager.user_profile_update_success".equals(action)) {
                UserAvatarFragment userAvatarFragment = UserAvatarFragment.this;
                int i = UserAvatarFragment.f40636u;
                userAvatarFragment.mo46641m2();
            } else if ("com.moovit.useraccount.manager.user_profile_update_failure".equals(action)) {
                UserAvatarFragment userAvatarFragment2 = UserAvatarFragment.this;
                int i2 = UserAvatarFragment.f40636u;
                userAvatarFragment2.mo46642n2((Image) null);
            }
        }
    }

    /* renamed from: com.moovit.app.useraccount.profile.UserAvatarFragment$b */
    public class C15632b extends BroadcastReceiver {
        public C15632b() {
        }

        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("com.moovit.useraccount.user_connect_success".equals(action) || "com.moovit.useraccount.user_disconnect_success".equals(action)) {
                UserAvatarFragment userAvatarFragment = UserAvatarFragment.this;
                if (userAvatarFragment.f40640q != null) {
                    userAvatarFragment.mo46641m2();
                }
            }
        }
    }

    /* renamed from: com.moovit.app.useraccount.profile.UserAvatarFragment$c */
    public class C15633c extends C0141e {
        public C15633c() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19757d dVar = (C19757d) cVar;
            Image image = ((C19758e) gVar).f50237m;
            UserAvatarFragment userAvatarFragment = UserAvatarFragment.this;
            int i = UserAvatarFragment.f40636u;
            userAvatarFragment.mo46642n2(image);
        }
    }

    public UserAvatarFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("USER_ACCOUNT");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        this.f40640q = (UserAccountManager) mo46776J1("USER_ACCOUNT");
        mo46641m2();
    }

    /* renamed from: m2 */
    public final void mo46641m2() {
        UserAccountManager userAccountManager = this.f40640q;
        if (userAccountManager != null) {
            C17259d e = userAccountManager.mo46575f().mo49805e();
            int i = e.f44608g;
            this.f40641r.setText(getString(R.string.current_points, Integer.valueOf(i)));
            int i2 = e.f44609h;
            this.f40642s.setText(getString(R.string.points_to_next_level, Integer.valueOf(i2)));
            Image image = e.f44610i;
            if (image != null) {
                mo46642n2(image);
                return;
            }
            ServerId serverId = e.f44611j;
            if (serverId == null) {
                mo46642n2((Image) null);
                return;
            }
            C19757d dVar = new C19757d(serverId, mo46783R1());
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            mo46793f2("getUserAvatarRequest", dVar, L1, this.f40639p);
        }
    }

    /* renamed from: n2 */
    public final void mo46642n2(Image image) {
        if (image == null) {
            this.f40643t.setVisibility(4);
            return;
        }
        this.f40643t.setVisibility(0);
        C17884p.m44354Y(this.f40643t).mo51642v(image).mo51628o0(image).mo10850T(this.f40643t);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Avatar avatar;
        C17261e eVar;
        C17259d dVar;
        Intent intent2 = intent;
        if (i != 2547) {
            int i3 = i2;
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent2 != null) {
            int i4 = AvatarsActivity.f38098X;
            Avatar avatar2 = (Avatar) intent2.getParcelableExtra("result_avatar");
            if (avatar2 != null) {
                UserAccountManager userAccountManager = this.f40640q;
                if (userAccountManager != null) {
                    C17261e f = userAccountManager.mo46575f();
                    C17264g gVar = f.f44622e;
                    synchronized (gVar) {
                        C17259d dVar2 = gVar.f44629b;
                        String str = dVar2.f44602a;
                        String str2 = dVar2.f44603b;
                        String str3 = dVar2.f44604c;
                        Uri uri = dVar2.f44605d;
                        String str4 = dVar2.f44606e;
                        String str5 = dVar2.f44607f;
                        int i5 = dVar2.f44608g;
                        int i6 = dVar2.f44609h;
                        Image image = avatar2.f38097d;
                        ServerId serverId = avatar2.f38095b;
                        C17256b bVar = dVar2.f44612k;
                        avatar = avatar2;
                        UserCarpoolData userCarpoolData = dVar2.f44613l;
                        eVar = f;
                        C17259d dVar3 = r4;
                        C17256b bVar2 = bVar;
                        UserCarpoolData userCarpoolData2 = userCarpoolData;
                        C17259d dVar4 = new C17259d(str, str2, str3, uri, str4, str5, i5, i6, image, serverId, bVar2, userCarpoolData2, dVar2.f44614m, dVar2.f44615n, dVar2.f44616o, dVar2.f44617p);
                        gVar.mo49807b(dVar3);
                    }
                    C17261e eVar2 = eVar;
                    C14343z0 z0Var = C17635b.m43779f(eVar2.f44619b).f50172b;
                    C17264g gVar2 = eVar2.f44622e;
                    synchronized (gVar2) {
                        try {
                            dVar = gVar2.f44629b;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    z0Var.mo42913b(new C17263f(eVar2.f44619b, dVar.f44611j), true);
                    avatar2 = avatar;
                }
                mo46642n2(avatar2.f38097d);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.user_avatar_layout, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.points_container);
        this.f40641r = (TextView) findViewById.findViewById(R.id.current_points);
        this.f40642s = (TextView) findViewById.findViewById(R.id.points_to_next_level);
        this.f40643t = (ImageView) findViewById.findViewById(R.id.user_avatar_image);
        if (C18860a.m45884a().f48018f) {
            findViewById.setOnClickListener(new C6994a(this, 29));
            this.f40643t.setOnClickListener(new C16850a(this, 27));
        }
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f40640q = null;
    }

    public final void onStart() {
        super.onStart();
        Context requireContext = requireContext();
        C17261e.m43266g(requireContext, this.f40637n);
        UserAccountManager.m39860h(requireContext, this.f40638o, Arrays.asList(new String[]{"com.moovit.useraccount.user_connect_success", "com.moovit.useraccount.user_connect_failure"}));
        UserAccountManager.m39860h(requireContext, this.f40638o, Arrays.asList(new String[]{"com.moovit.useraccount.user_disconnect_success", "com.moovit.useraccount.user_disconnect_failure"}));
    }

    public final void onStop() {
        super.onStop();
        Context requireContext = requireContext();
        C17261e.m43267h(requireContext, this.f40637n);
        C5367a.m13473a(requireContext).mo21148d(this.f40638o);
    }
}
