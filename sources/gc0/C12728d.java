package gc0;

import ac0.C7557a;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import ce0.C21100e;
import com.cubic.umo.p045ad.types.AKUmoVideoAdUIConfig;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.drm.C3915c;
import com.google.android.exoplayer2.p052ui.PlayerControlView;
import com.google.android.exoplayer2.p052ui.PlayerView;
import com.google.android.exoplayer2.upstream.C4076a;
import com.umo.ads.p347l.zze;
import com.umo.ads.p348o.zzc;
import com.umo.ads.p350u.zzk;
import com.umo.ads.p350u.zzq;
import com.usebutton.sdk.internal.api.AppActionRequest;
import h60.C17327j1;
import hc0.C12757d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.C24179b;
import mc0.C12912d;
import mf0.C24362h;
import n60.C18531b;
import nc0.C12952c;
import nc0.C12954d;
import p001a0.C0016g;
import p001a0.C0017h;
import p026b7.C1499d;
import p026b7.C1500e;
import p026b7.C1501f;
import p043ch.qos.logback.classic.Logger;
import p099ga.C4865c1;
import p099ga.C4872d0;
import p099ga.C4883f;
import p099ga.C4887g0;
import p099ga.C4901j0;
import p099ga.C4910k0;
import p099ga.C4924q0;
import p099ga.C4930r0;
import p099ga.C4947w0;
import p100gb.C4987o;
import p100gb.C5007y;
import p125ia.C5322i;
import p173ma.C5733f;
import p265tb.C6663n;
import p277ub.C6809w;
import p501fw.C17102a;
import p572iw.C17662e;
import p583jk.C17875h;
import p584jl.C17885a;
import p644lx.C18284b;
import p739px.C19037a;
import p783rw.C19370b;
import vb0.C13199c;
import wb0.C13233c;

/* renamed from: gc0.d */
public final /* synthetic */ class C12728d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f31450b;

    /* renamed from: c */
    public final /* synthetic */ zzc f31451c;

    public /* synthetic */ C12728d(zzc zzc, int i) {
        this.f31450b = i;
        this.f31451c = zzc;
    }

    public final void run() {
        String str;
        View view;
        FrameLayout frameLayout;
        String str2;
        C4901j0.C4907f fVar;
        boolean z;
        ImageView imageView;
        ImageView imageView2;
        String playIconUrl;
        PlayerControlView playerControlView;
        ImageView imageView3;
        LinearLayout linearLayout;
        TextView textView;
        TextView textView2;
        TextView textView3;
        AppCompatButton appCompatButton;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Activity activity = null;
        switch (this.f31450b) {
            case 0:
                zzc zzc = this.f31451c;
                C24362h.m61211f(zzc, "this$0");
                if (!zzc.f30869y) {
                    Context context = zzc.f30848d;
                    if (context != null) {
                        View inflate = LayoutInflater.from(context).inflate(C1501f.umoak_layout_video_player_container, (ViewGroup) null);
                        if (inflate != null) {
                            FrameLayout frameLayout2 = (FrameLayout) inflate;
                            zzc.f30870z = frameLayout2;
                            zzc.f30833A = (RelativeLayout) frameLayout2.findViewById(C1500e.layout_video_player);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                        }
                    } else {
                        C24362h.m61217l(AppActionRequest.KEY_CONTEXT);
                        throw null;
                    }
                } else {
                    Context context2 = zzc.f30848d;
                    if (context2 != null) {
                        View inflate2 = LayoutInflater.from(context2).inflate(C1501f.umoak_layout_ad_spec_video_player_container, (ViewGroup) null);
                        if (inflate2 != null) {
                            FrameLayout frameLayout3 = (FrameLayout) inflate2;
                            zzc.f30870z = frameLayout3;
                            zzc.f30833A = (RelativeLayout) frameLayout3.findViewById(C1500e.layout_ad_spec_video_player);
                            FrameLayout frameLayout4 = zzc.f30870z;
                            if (frameLayout4 == null) {
                                imageView3 = null;
                            } else {
                                imageView3 = (ImageView) frameLayout4.findViewById(C1500e.iv_video_thumbnail);
                            }
                            zzc.f30834B = imageView3;
                            FrameLayout frameLayout5 = zzc.f30870z;
                            if (frameLayout5 == null) {
                                linearLayout = null;
                            } else {
                                linearLayout = (LinearLayout) frameLayout5.findViewById(C1500e.layout_video_details);
                            }
                            zzc.f30835C = linearLayout;
                            FrameLayout frameLayout6 = zzc.f30870z;
                            if (frameLayout6 == null) {
                                textView = null;
                            } else {
                                textView = (TextView) frameLayout6.findViewById(C1500e.tv_title);
                            }
                            zzc.f30836D = textView;
                            FrameLayout frameLayout7 = zzc.f30870z;
                            if (frameLayout7 == null) {
                                textView2 = null;
                            } else {
                                textView2 = (TextView) frameLayout7.findViewById(C1500e.tv_desc);
                            }
                            zzc.f30837E = textView2;
                            FrameLayout frameLayout8 = zzc.f30870z;
                            if (frameLayout8 == null) {
                                textView3 = null;
                            } else {
                                textView3 = (TextView) frameLayout8.findViewById(C1500e.tv_display_url);
                            }
                            zzc.f30838F = textView3;
                            FrameLayout frameLayout9 = zzc.f30870z;
                            if (frameLayout9 == null) {
                                appCompatButton = null;
                            } else {
                                appCompatButton = (AppCompatButton) frameLayout9.findViewById(C1500e.btn_cta);
                            }
                            zzc.f30839G = appCompatButton;
                            zzq zzq = zzc.f30846b.f30890g;
                            if (!(zzq == null || (str7 = zzq.f30873b) == null)) {
                                zzc.mo35812m(C24179b.m60585g0(str7).toString(), zzc.f30834B, (Integer) null);
                            }
                            AKUmoVideoAdUIConfig t = C13233c.m33351t();
                            if (t != null) {
                                GradientDrawable d = zzc.mo35807d(t.getAdDetailsBorderColor(), t.getAdDetailsBorderWidth(), t.getAdDetailsBgColor());
                                LinearLayout linearLayout2 = zzc.f30835C;
                                if (linearLayout2 != null) {
                                    linearLayout2.setBackground(d);
                                }
                            }
                            TextView textView4 = zzc.f30836D;
                            if (textView4 != null) {
                                zzq zzq2 = zzc.f30846b.f30890g;
                                if (zzq2 == null) {
                                    str6 = null;
                                } else {
                                    str6 = zzq2.f30874c;
                                }
                                textView4.setText(str6);
                            }
                            AKUmoVideoAdUIConfig t2 = C13233c.m33351t();
                            if (t2 != null) {
                                zzc.mo35810j(zzc.f30836D, t2.getTitleColor());
                                zzc.mo35815q(zzc.f30836D, t2.getTitleFontSize());
                                zzc.m32062t(zzc.f30836D, t2.getTitleFontWeight());
                            }
                            TextView textView5 = zzc.f30837E;
                            if (textView5 != null) {
                                zzq zzq3 = zzc.f30846b.f30890g;
                                if (zzq3 == null) {
                                    str5 = null;
                                } else {
                                    str5 = zzq3.f30875d;
                                }
                                textView5.setText(str5);
                            }
                            AKUmoVideoAdUIConfig t3 = C13233c.m33351t();
                            if (t3 != null) {
                                zzc.mo35810j(zzc.f30837E, t3.getDescColor());
                                zzc.mo35815q(zzc.f30837E, t3.getDescFontSize());
                                zzc.m32062t(zzc.f30837E, t3.getDescFontWeight());
                            }
                            TextView textView6 = zzc.f30838F;
                            if (textView6 != null) {
                                zzq zzq4 = zzc.f30846b.f30890g;
                                if (zzq4 == null) {
                                    str4 = null;
                                } else {
                                    str4 = zzq4.f30877f;
                                }
                                textView6.setText(str4);
                            }
                            AKUmoVideoAdUIConfig t4 = C13233c.m33351t();
                            if (t4 != null) {
                                zzc.mo35810j(zzc.f30838F, t4.getDisplayUrlColor());
                                zzc.mo35815q(zzc.f30838F, t4.getDisplayUrlFontSize());
                                zzc.m32062t(zzc.f30838F, t4.getDisplayUrlFontWeight());
                            }
                            AppCompatButton appCompatButton2 = zzc.f30839G;
                            if (appCompatButton2 != null) {
                                zzq zzq5 = zzc.f30846b.f30890g;
                                if (zzq5 == null) {
                                    str3 = null;
                                } else {
                                    str3 = zzq5.f30876e;
                                }
                                appCompatButton2.setText(str3);
                            }
                            AKUmoVideoAdUIConfig t5 = C13233c.m33351t();
                            if (t5 != null) {
                                zzc.mo35810j(zzc.f30839G, t5.getCtaColor());
                                zzc.mo35815q(zzc.f30839G, t5.getCtaFontSize());
                                zzc.m32062t(zzc.f30839G, t5.getCtaFontWeight());
                                GradientDrawable d2 = zzc.mo35807d(t5.getCtaButtonBorderColor(), t5.getCtaButtonBorderWidth(), t5.getCtaButtonBgColor());
                                AppCompatButton appCompatButton3 = zzc.f30839G;
                                if (appCompatButton3 != null) {
                                    appCompatButton3.setBackground(d2);
                                }
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                        }
                    } else {
                        C24362h.m61217l(AppActionRequest.KEY_CONTEXT);
                        throw null;
                    }
                }
                ViewGroup viewGroup = zzc.f30849e;
                if (viewGroup != null) {
                    viewGroup.addView(zzc.f30870z);
                }
                RelativeLayout relativeLayout = zzc.f30833A;
                Context context3 = zzc.f30848d;
                if (context3 != null) {
                    PlayerView playerView = new PlayerView(context3, (AttributeSet) null);
                    zzc.f30857m = playerView;
                    playerView.setKeepContentOnPlayerReset(true);
                    PlayerView playerView2 = zzc.f30857m;
                    if (playerView2 != null) {
                        playerView2.setBackgroundColor(0);
                    }
                    PlayerView playerView3 = zzc.f30857m;
                    if (playerView3 != null) {
                        playerView3.setShutterBackgroundColor(0);
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13);
                    PlayerView playerView4 = zzc.f30857m;
                    if (playerView4 != null) {
                        playerView4.setLayoutParams(layoutParams);
                    }
                    if (!zzc.f30869y) {
                        zzc.mo35809f(relativeLayout);
                    }
                    Context context4 = zzc.f30848d;
                    if (context4 != null) {
                        C4865c1.C4866a aVar = new C4865c1.C4866a(context4);
                        C17875h.m44304o(!aVar.f16355q);
                        aVar.f16355q = true;
                        C4865c1 c1Var = new C4865c1(aVar);
                        zzc.f30858n = c1Var;
                        PlayerView playerView5 = zzc.f30857m;
                        if (playerView5 != null) {
                            playerView5.setPlayer(c1Var);
                        }
                        PlayerView playerView6 = zzc.f30857m;
                        if (playerView6 != null) {
                            playerView6.setUseController(false);
                        }
                        PlayerView playerView7 = zzc.f30857m;
                        if (!(playerView7 == null || (playerControlView = playerView7.f14268k) == null)) {
                            playerControlView.mo16386c();
                        }
                        if (zzc.mo35795C()) {
                            zzc.mo35800H();
                        }
                        if (zzc.mo35797E()) {
                            Context context5 = C13233c.f32842a;
                            C12912d q = C13233c.m33348q(zzc.f30846b.f30885b);
                            if (q != null) {
                                q.f31973i = zzc.f30870z;
                            }
                            RelativeLayout relativeLayout2 = zzc.f30833A;
                            Context context6 = zzc.f30848d;
                            if (context6 != null) {
                                View inflate3 = LayoutInflater.from(context6).inflate(C1501f.umoak_layout_vast_player_controls, (ViewGroup) null);
                                if (inflate3 != null) {
                                    RelativeLayout relativeLayout3 = (RelativeLayout) inflate3;
                                    zzc.f30862r = relativeLayout3;
                                    ImageView imageView4 = (ImageView) relativeLayout3.findViewById(C1500e.iv_play);
                                    if (imageView4 != null) {
                                        zzc.f30863s = imageView4;
                                        RelativeLayout relativeLayout4 = zzc.f30862r;
                                        if (relativeLayout4 == null) {
                                            imageView = null;
                                        } else {
                                            imageView = (ImageView) relativeLayout4.findViewById(C1500e.iv_maximize);
                                        }
                                        if (imageView != null) {
                                            zzc.f30864t = imageView;
                                            RelativeLayout relativeLayout5 = zzc.f30862r;
                                            if (relativeLayout5 == null) {
                                                imageView2 = null;
                                            } else {
                                                imageView2 = (ImageView) relativeLayout5.findViewById(C1500e.iv_minimize);
                                            }
                                            if (imageView2 != null) {
                                                zzc.f30865u = imageView2;
                                                if (relativeLayout2 != null) {
                                                    relativeLayout2.addView(zzc.f30862r);
                                                }
                                                AKUmoVideoAdUIConfig t6 = C13233c.m33351t();
                                                if (!(t6 == null || (playIconUrl = t6.getPlayIconUrl()) == null)) {
                                                    ImageView imageView5 = zzc.f30863s;
                                                    if (imageView5 != null) {
                                                        imageView5.setImageDrawable((Drawable) null);
                                                    }
                                                    zzc.mo35812m(C24179b.m60585g0(playIconUrl).toString(), zzc.f30863s, Integer.valueOf(C1499d.umoak_ic_play));
                                                }
                                                if (!zzc.mo35796D()) {
                                                    ImageView imageView6 = zzc.f30863s;
                                                    if (imageView6 != null) {
                                                        imageView6.setVisibility(0);
                                                    }
                                                    ImageView imageView7 = zzc.f30863s;
                                                    C24362h.m61208c(imageView7);
                                                    C13233c.f32843b.post(new C5322i(1, imageView7, false));
                                                }
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                            }
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
                                }
                            } else {
                                C24362h.m61217l(AppActionRequest.KEY_CONTEXT);
                                throw null;
                            }
                        }
                        if (zzc.f30869y) {
                            view = zzc.f30833A;
                        } else {
                            view = zzc.f30870z;
                        }
                        if (view == null) {
                            frameLayout = null;
                        } else {
                            frameLayout = (FrameLayout) view.findViewById(C1500e.progress_bar_layout);
                        }
                        zzc.f30861q = frameLayout;
                        if (frameLayout != null) {
                            C12952c.m32795e(frameLayout);
                        }
                        zzc.mo35817v(true);
                        if (!zzc.f30869y) {
                            FrameLayout frameLayout10 = zzc.f30870z;
                            if (frameLayout10 != null) {
                                frameLayout10.setOnClickListener(new C17662e(zzc, 18));
                            }
                        } else {
                            LinearLayout linearLayout3 = zzc.f30835C;
                            if (linearLayout3 != null) {
                                linearLayout3.setOnClickListener(new C19370b(zzc, 21));
                            }
                            AppCompatButton appCompatButton4 = zzc.f30839G;
                            if (appCompatButton4 != null) {
                                appCompatButton4.setOnClickListener(new C18284b(zzc, 21));
                            }
                        }
                        if (zzc.mo35797E()) {
                            ImageView imageView8 = zzc.f30863s;
                            if (imageView8 != null) {
                                imageView8.setOnClickListener(new C17102a(zzc, 27));
                            }
                            ImageView imageView9 = zzc.f30864t;
                            if (imageView9 != null) {
                                imageView9.setVisibility(8);
                            }
                            ImageView imageView10 = zzc.f30864t;
                            if (imageView10 != null) {
                                imageView10.setOnClickListener(new C18531b(zzc, 8));
                            }
                            ImageView imageView11 = zzc.f30865u;
                            if (imageView11 != null) {
                                imageView11.setVisibility(8);
                            }
                            ImageView imageView12 = zzc.f30865u;
                            if (imageView12 != null) {
                                imageView12.setOnClickListener(new C19037a(zzc, 19));
                            }
                        }
                        String str8 = zzc.f30846b.f30886c;
                        if (str8 != null) {
                            Logger logger = C7557a.f23040a;
                            StringBuilder t7 = C0016g.m36t("VIDEO_PLAYER: Playing Ad Video: ", str8);
                            t7.append(zzc.f30845M);
                            t7.append("...");
                            logger.mo6672i(t7.toString());
                            Context context7 = zzc.f30848d;
                            if (context7 != null) {
                                try {
                                    str2 = context7.getPackageManager().getPackageInfo(context7.getPackageName(), 0).versionName;
                                } catch (PackageManager.NameNotFoundException unused) {
                                    str2 = "?";
                                }
                                String str9 = Build.VERSION.RELEASE;
                                C6663n nVar = new C6663n(context7, C13715c.m34245k(C0017h.m58O(C0016g.m25h(str9, C0016g.m25h(str2, 46)), "UMOAdKit", "/", str2, " (Linux;Android "), str9, ") ", "ExoPlayerLib/2.14.2"));
                                Collections.emptyList();
                                Collections.emptyMap();
                                List emptyList = Collections.emptyList();
                                List emptyList2 = Collections.emptyList();
                                Uri parse = Uri.parse(str8);
                                if (parse != null) {
                                    fVar = new C4901j0.C4907f(parse, (String) null, (C4901j0.C4905d) null, (C4901j0.C4902a) null, emptyList, (String) null, emptyList2, (Object) null);
                                } else {
                                    fVar = null;
                                }
                                C4901j0 j0Var = new C4901j0("", new C4901j0.C4904c(0, Long.MIN_VALUE, false, false, false), fVar, new C4901j0.C4906e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C4910k0.f16574q);
                                C17327j1 j1Var = new C17327j1(new C5733f(), 6);
                                C4076a aVar2 = new C4076a();
                                j0Var.f16537b.getClass();
                                C4901j0.C4907f fVar2 = j0Var.f16537b;
                                Object obj = fVar2.f16567f;
                                fVar2.getClass();
                                C5007y yVar = new C5007y(j0Var, nVar, j1Var, C3915c.f13730a, aVar2, 1048576);
                                C4865c1 c1Var2 = zzc.f30858n;
                                if (c1Var2 != null) {
                                    c1Var2.mo20383b0();
                                    C4872d0 d0Var = c1Var2.f16316d;
                                    d0Var.getClass();
                                    List singletonList = Collections.singletonList(yVar);
                                    d0Var.mo20438R();
                                    d0Var.getCurrentPosition();
                                    d0Var.f16394u++;
                                    if (!d0Var.f16385l.isEmpty()) {
                                        int size = d0Var.f16385l.size();
                                        for (int i = size - 1; i >= 0; i--) {
                                            d0Var.f16385l.remove(i);
                                        }
                                        d0Var.f16398y = d0Var.f16398y.mo20666a(size);
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    for (int i2 = 0; i2 < singletonList.size(); i2++) {
                                        C4924q0.C4927c cVar = new C4924q0.C4927c((C4987o) singletonList.get(i2), d0Var.f16386m);
                                        arrayList.add(cVar);
                                        d0Var.f16385l.add(i2 + 0, new C4872d0.C4873a(cVar.f16669a.f16841n, cVar.f16670b));
                                    }
                                    d0Var.f16398y = d0Var.f16398y.mo20672g(arrayList.size());
                                    C4947w0 w0Var = new C4947w0(d0Var.f16385l, d0Var.f16398y);
                                    if (w0Var.mo20464p() || -1 < w0Var.f16725f) {
                                        int a = w0Var.mo20341a(d0Var.f16393t);
                                        C4930r0 V = d0Var.mo20440V(d0Var.f16372B, w0Var, d0Var.mo20439S(w0Var, a, -9223372036854775807L));
                                        int i3 = V.f16679e;
                                        if (!(a == -1 || i3 == 1)) {
                                            i3 = (w0Var.mo20464p() || a >= w0Var.f16725f) ? 4 : 2;
                                        }
                                        C4930r0 g = V.mo20599g(i3);
                                        ((C6809w) d0Var.f16381h.f16468h).mo23021a(17, new C4887g0.C4888a(arrayList, d0Var.f16398y, a, C4883f.m12376a(-9223372036854775807L))).mo23023a();
                                        if (d0Var.f16372B.f16676b.f16857a.equals(g.f16676b.f16857a) || d0Var.f16372B.f16675a.mo20464p()) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        d0Var.mo20444Z(g, 0, 1, false, z, 4, d0Var.mo20437Q(g), -1);
                                    } else {
                                        throw new IllegalSeekPositionException(w0Var, -1, -9223372036854775807L);
                                    }
                                }
                                C4865c1 c1Var3 = zzc.f30858n;
                                if (c1Var3 != null) {
                                    c1Var3.mo20384c();
                                }
                                C4865c1 c1Var4 = zzc.f30858n;
                                if (c1Var4 != null) {
                                    c1Var4.mo20395m(zzc.mo35796D());
                                }
                                C4865c1 c1Var5 = zzc.f30858n;
                                if (c1Var5 != null) {
                                    c1Var5.f16316d.mo20388g(zzc);
                                }
                                if (zzc.mo35797E() && zzc.f30868x == null) {
                                    Context context8 = zzc.f30848d;
                                    if (context8 != null) {
                                        if (context8 instanceof Activity) {
                                            activity = context8;
                                        }
                                        Activity activity2 = activity;
                                        if (activity2 != null) {
                                            Logger logger2 = C7557a.f23040a;
                                            StringBuilder J0 = C21100e.m49315J0("Registering Video Orientation Broadcast Receiver");
                                            J0.append(zzc.f30845M);
                                            J0.append("...");
                                            logger2.mo6666c(J0.toString());
                                            zzc.f30868x = new zze(activity2, zzc);
                                            return;
                                        }
                                        return;
                                    }
                                    C24362h.m61217l(AppActionRequest.KEY_CONTEXT);
                                    throw null;
                                }
                                return;
                            }
                            C24362h.m61217l(AppActionRequest.KEY_CONTEXT);
                            throw null;
                        }
                        return;
                    }
                    C24362h.m61217l(AppActionRequest.KEY_CONTEXT);
                    throw null;
                }
                C24362h.m61217l(AppActionRequest.KEY_CONTEXT);
                throw null;
            default:
                zzc zzc2 = this.f31451c;
                C24362h.m61211f(zzc2, "this$0");
                if (zzc2.mo35798F() || zzc2.f30869y) {
                    C7557a.f23040a.mo6672i(C24362h.m61216k(zzc2.f30845M, "VIDEO_PLAYER: Ad Video Clicked"));
                    zzc.C12093a aVar3 = zzc2.f30847c;
                    if (aVar3 != null) {
                        String str10 = zzc2.f30846b.f30885b;
                        C12757d dVar = (C12757d) aVar3;
                        C24362h.m61211f(str10, "spotId");
                        Logger logger3 = C7557a.f23040a;
                        if (C12954d.m32800c(str10)) {
                            str = C17885a.m44403H0(str10);
                        } else {
                            str = "";
                        }
                        logger3.mo6666c(C24362h.m61216k(str, "VIDEO_PLAYER_CALLBACK: onVideoClicked"));
                        if (dVar.mo39612c()) {
                            C13199c cVar2 = dVar.f31523d;
                            if (cVar2 != null) {
                                cVar2.zzd(str10);
                                return;
                            }
                            return;
                        }
                        dVar.mo39610a(zzk.BROADCAST_ACTION_AD_CLICKED, (String) null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
