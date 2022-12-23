package com.moovit.app.navigation;

import a00.C13382a;
import a10.C13386a;
import aa0.C7530f;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.C0441n1;
import b00.C13556a;
import c70.C13751d;
import ce0.C21100e;
import ci0.C21211f;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.card.MaterialCardView;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.actions.QuickAction;
import com.moovit.app.ads.AdSource;
import com.moovit.app.itinerary.C15035a;
import com.moovit.app.itinerary.C15043f;
import com.moovit.app.itinerary.ItineraryStepsBaseActivity;
import com.moovit.app.itinerary.view.SingleLegCard;
import com.moovit.app.navigation.checkin.Checkin;
import com.moovit.app.navigation.itinerary.ItineraryNavigable;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.commons.geo.Geofence;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.map.C16286k;
import com.moovit.map.LineStyle;
import com.moovit.map.MapOverlaysLayout;
import com.moovit.navigation.AbstractNavigable;
import com.moovit.navigation.C4228b;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.NavigationPath;
import com.moovit.navigation.NavigationService;
import com.moovit.navigation.NavigationState;
import com.moovit.navigation.event.NavigationDeviationEvent;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.navigation.event.NavigationStartEvent;
import com.moovit.navigation.event.NavigationStopEvent;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.util.ServerIdMap;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import d40.C4346b;
import d40.C4360j;
import e20.C16783l;
import f00.C16919g;
import j00.C17682a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p001a0.C0016g;
import p054d0.C4268a1;
import p241s0.C6302b;
import p304x.C7073m;
import p304x.C7078n;
import p358af.C13437d;
import p431cy.C16525b;
import p435de.C16596f;
import p471eq.C16851b;
import p471eq.C16855d;
import p495fq.C17059d;
import p495fq.C17060e;
import p543hq.C17474b;
import p784rx.C19377c;
import p810sz.C19577c;
import p810sz.C19610m;
import p810sz.C19617r;
import p874vr.C20199a;
import p877vu.C20233c;
import p901wu.C20419a;
import p901wu.C20420b;
import p906wz.C20431c;
import p906wz.C20436g;
import p948yu.C20769b;
import p948yu.C20771c;
import p977zz.C20935e;
import p977zz.C20943i;
import p977zz.C20944i0;
import p977zz.C20961r;
import p977zz.C20964s0;
import q00.C19047a;

public class MultiLegNavActivity extends ItineraryStepsBaseActivity implements C15035a.C15037b {

    /* renamed from: S0 */
    public static final /* synthetic */ int f39101S0 = 0;

    /* renamed from: A0 */
    public ItineraryNavigable f39102A0;

    /* renamed from: B0 */
    public MenuItem f39103B0;

    /* renamed from: C0 */
    public final C15178a f39104C0 = new C15178a();

    /* renamed from: D0 */
    public final C15179b f39105D0 = new C15179b();

    /* renamed from: E0 */
    public final C15180c f39106E0 = new C15180c(this);

    /* renamed from: F0 */
    public final C0441n1 f39107F0 = new C0441n1(this, 12);

    /* renamed from: G0 */
    public final C15181d f39108G0 = new C15181d();

    /* renamed from: H0 */
    public String f39109H0;

    /* renamed from: I0 */
    public int f39110I0 = -1;

    /* renamed from: J0 */
    public boolean f39111J0;

    /* renamed from: K0 */
    public NavigationType f39112K0;

    /* renamed from: L0 */
    public C13556a f39113L0 = null;

    /* renamed from: M0 */
    public C13556a f39114M0;

    /* renamed from: N0 */
    public final Handler f39115N0 = new Handler(Looper.getMainLooper());

    /* renamed from: O0 */
    public ServerId f39116O0;

    /* renamed from: P0 */
    public TransitLine f39117P0;

    /* renamed from: Q0 */
    public View f39118Q0;

    /* renamed from: R0 */
    public long f39119R0;

    /* renamed from: y0 */
    public Runnable f39120y0;

    /* renamed from: z0 */
    public boolean f39121z0;

    public enum NavigationType {
        ITINERARY,
        CHECKIN;
        
        public static final C19577c<NavigationType> CODER = null;

        /* access modifiers changed from: public */
        static {
            NavigationType navigationType;
            NavigationType navigationType2;
            CODER = new C19577c<>(NavigationType.class, navigationType, navigationType2);
        }
    }

    /* renamed from: com.moovit.app.navigation.MultiLegNavActivity$a */
    public class C15178a extends C21211f {
        public C15178a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C20419a aVar = (C20419a) cVar;
            MultiLegNavActivity.this.f39113L0 = null;
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C20419a aVar = (C20419a) cVar;
            MultiLegNavActivity.m38727R2(MultiLegNavActivity.this, serverException);
            return true;
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C20419a aVar = (C20419a) cVar;
            MultiLegNavActivity.m38727R2(MultiLegNavActivity.this, iOException);
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C20419a aVar = (C20419a) cVar;
            MultiLegNavActivity.m38727R2(MultiLegNavActivity.this, iOException);
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            MultiLegNavActivity multiLegNavActivity = MultiLegNavActivity.this;
            int i = MultiLegNavActivity.f39101S0;
            multiLegNavActivity.mo45635S2();
            Checkin checkin = ((C20420b) gVar).f51737m;
            MultiLegNavActivity multiLegNavActivity2 = MultiLegNavActivity.this;
            TransitLine transitLine = checkin.f39132i;
            multiLegNavActivity2.f39117P0 = transitLine;
            ServerId serverId = transitLine.f23687c;
            ServerId serverId2 = checkin.f39137n.f15056d;
            C16919g.C16920a aVar = C20233c.f51336a;
            multiLegNavActivity2.getSharedPreferences("ride_preferences", 0).edit().putInt(serverId.mo19751c(), serverId2.f15142b).apply();
            MultiLegNavActivity.this.f38499X = C20233c.m47800a(checkin, (NavigationProgressEvent) null);
            MultiLegNavActivity.this.mo45642b3(checkin);
            MultiLegNavActivity.this.mo45283I2(0);
            if (((C20419a) cVar).f51736z == null) {
                MultiLegNavActivity multiLegNavActivity3 = MultiLegNavActivity.this;
                Runnable runnable = multiLegNavActivity3.f39120y0;
                if (runnable != null) {
                    multiLegNavActivity3.f39115N0.removeCallbacks(runnable);
                }
                MultiLegNavActivity multiLegNavActivity4 = MultiLegNavActivity.this;
                C7078n nVar = new C7078n(11, this, checkin);
                multiLegNavActivity4.f39120y0 = nVar;
                multiLegNavActivity4.f39115N0.postDelayed(nVar, 2500);
            }
        }
    }

    /* renamed from: com.moovit.app.navigation.MultiLegNavActivity$b */
    public class C15179b extends C21211f {
        public C15179b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C20769b bVar = (C20769b) cVar;
            MultiLegNavActivity.this.f39114M0 = null;
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C20769b bVar = (C20769b) cVar;
            MultiLegNavActivity.m38727R2(MultiLegNavActivity.this, serverException);
            return true;
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C20769b bVar = (C20769b) cVar;
            MultiLegNavActivity.m38727R2(MultiLegNavActivity.this, iOException);
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C20769b bVar = (C20769b) cVar;
            MultiLegNavActivity.m38727R2(MultiLegNavActivity.this, iOException);
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C20769b bVar = (C20769b) cVar;
            C20771c cVar2 = (C20771c) gVar;
            MultiLegNavActivity multiLegNavActivity = MultiLegNavActivity.this;
            if (multiLegNavActivity.f39121z0) {
                C15180c cVar3 = multiLegNavActivity.f39106E0;
                if (((Navigable) cVar3.f15351b.getOrDefault(multiLegNavActivity.f39109H0, null)) != null) {
                    MultiLegNavActivity multiLegNavActivity2 = MultiLegNavActivity.this;
                    multiLegNavActivity2.startService(NavigationService.m11309z(multiLegNavActivity2, multiLegNavActivity2.f39109H0, "user_terminated"));
                    MultiLegNavActivity.this.f39102A0 = cVar2.f52412m;
                    return;
                }
                MultiLegNavActivity.this.mo45635S2();
            }
            MultiLegNavActivity.this.mo45642b3(cVar2.f52412m);
        }
    }

    /* renamed from: com.moovit.app.navigation.MultiLegNavActivity$c */
    public class C15180c extends C4360j {

        /* renamed from: h */
        public C4228b f39124h = null;

        public C15180c(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final boolean mo19876a(Navigable navigable) {
            return navigable.mo19639e0().equals(MultiLegNavActivity.this.f39109H0);
        }

        /* renamed from: b */
        public final void mo19877b(NavigationService navigationService) {
            ServerId serverId;
            ServerId serverId2;
            boolean z;
            MultiLegNavActivity multiLegNavActivity = MultiLegNavActivity.this;
            if (!C20964s0.m49090h(multiLegNavActivity.f39109H0)) {
                Iterator<NavigationState> it = navigationService.mo19690y().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    NavigationState next = it.next();
                    NavigationProgressEvent navigationProgressEvent = next.f15081d;
                    if (next.f15079b.mo19639e0().equals(multiLegNavActivity.f39109H0)) {
                        Navigable navigable = next.f15079b;
                        if (navigable instanceof ItineraryNavigable) {
                            multiLegNavActivity.f39112K0 = NavigationType.ITINERARY;
                            multiLegNavActivity.f38499X = C20233c.m47800a(navigable, navigationProgressEvent);
                            multiLegNavActivity.mo45283I2(next.f15080c.f15362a);
                        } else if (navigable instanceof Checkin) {
                            multiLegNavActivity.f39112K0 = NavigationType.CHECKIN;
                            TransitLine transitLine = ((Checkin) navigable).f39132i;
                            multiLegNavActivity.f39117P0 = transitLine;
                            multiLegNavActivity.f39116O0 = transitLine.f23687c;
                            multiLegNavActivity.f38499X = C20233c.m47800a(navigable, navigationProgressEvent);
                            multiLegNavActivity.mo45283I2(0);
                        }
                        NavigationService.m11305D(multiLegNavActivity, multiLegNavActivity.f39109H0);
                        z = true;
                    }
                }
                if (!z) {
                    if (navigationService.mo19687v(multiLegNavActivity.f39109H0) == null) {
                        if (!multiLegNavActivity.f39121z0) {
                            multiLegNavActivity.finish();
                        } else {
                            ItineraryNavigable itineraryNavigable = multiLegNavActivity.f39102A0;
                            multiLegNavActivity.mo45635S2();
                            if (itineraryNavigable != null) {
                                multiLegNavActivity.mo45642b3(itineraryNavigable);
                            }
                        }
                    } else if (multiLegNavActivity.f38499X == null) {
                        Iterator it2 = navigationService.mo19688w().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Navigable navigable2 = (Navigable) it2.next();
                            if (navigable2.mo19639e0().equals(multiLegNavActivity.f39109H0)) {
                                C4346b x = navigationService.mo19689x(multiLegNavActivity.f39109H0);
                                if (navigable2 instanceof ItineraryNavigable) {
                                    multiLegNavActivity.f39112K0 = NavigationType.ITINERARY;
                                    multiLegNavActivity.f38499X = C20233c.m47800a(navigable2, x.f15315b);
                                    multiLegNavActivity.mo45283I2(x.f15314a);
                                } else if (navigable2 instanceof Checkin) {
                                    multiLegNavActivity.f39112K0 = NavigationType.CHECKIN;
                                    TransitLine transitLine2 = ((Checkin) navigable2).f39132i;
                                    multiLegNavActivity.f39117P0 = transitLine2;
                                    multiLegNavActivity.f39116O0 = transitLine2.f23687c;
                                    multiLegNavActivity.f38499X = C20233c.m47800a(navigable2, x.f15315b);
                                    multiLegNavActivity.mo45283I2(0);
                                }
                            }
                        }
                    }
                }
            } else {
                NavigationType navigationType = multiLegNavActivity.f39112K0;
                if (navigationType == NavigationType.ITINERARY) {
                    multiLegNavActivity.mo45639Y2();
                } else if (navigationType == NavigationType.CHECKIN && (serverId = multiLegNavActivity.f39116O0) != null) {
                    C16919g.C16920a aVar = C20233c.f51336a;
                    int i = multiLegNavActivity.getSharedPreferences("ride_preferences", 0).getInt(serverId.mo19751c(), -1);
                    if (i == -1) {
                        serverId2 = null;
                    } else {
                        serverId2 = new ServerId(i);
                    }
                    multiLegNavActivity.mo45637W2(multiLegNavActivity.f39116O0, serverId2);
                }
            }
            if (this.f39124h == null && ((Boolean) C13386a.f33224d.f43936b).booleanValue()) {
                this.f39124h = new C4228b(MultiLegNavActivity.this.f38503m0.f38550b);
            }
        }

        /* renamed from: c */
        public final void mo19878c() {
        }

        /* renamed from: d */
        public final void mo19879d(Navigable navigable) {
        }

        /* renamed from: e */
        public final void mo19880e(Navigable navigable, NavigationDeviationEvent navigationDeviationEvent) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x0514  */
        /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo19881f(com.moovit.navigation.Navigable r27, com.moovit.navigation.event.NavigationProgressEvent r28) {
            /*
                r26 = this;
                r0 = r26
                r1 = r28
                com.moovit.app.navigation.MultiLegNavActivity r2 = com.moovit.app.navigation.MultiLegNavActivity.this
                int r3 = com.moovit.app.navigation.MultiLegNavActivity.f39101S0
                com.moovit.itinerary.model.Itinerary r3 = r2.f38499X
                java.util.List r3 = r3.mo48295u0()
                int r4 = r3.size()
                int r5 = r1.f15112c
                if (r5 < 0) goto L_0x0507
                if (r5 < r4) goto L_0x001a
                goto L_0x0509
            L_0x001a:
                com.moovit.commons.view.pager.ViewPager r6 = r2.f38502l0
                int r6 = r6.getCurrentLogicalItem()
                int r7 = r2.f39110I0
                int r8 = r2.mo45282H2(r5)
                r9 = -1
                if (r8 != r9) goto L_0x002b
                goto L_0x0509
            L_0x002b:
                int r10 = r2.f39110I0
                r11 = 0
                if (r10 == r9) goto L_0x0051
                if (r10 == r8) goto L_0x0051
                com.moovit.commons.view.pager.ViewPager r9 = r2.f38502l0
                int r10 = r9.mo47354c(r10)
                java.lang.Object r9 = r9.mo47352a(r10)
                com.moovit.app.itinerary.view.SingleLegCard r9 = (com.moovit.app.itinerary.view.SingleLegCard) r9
                if (r9 == 0) goto L_0x0051
                r9.setSelected(r11)
                android.widget.TextView r9 = r2.f38511u0
                com.moovit.app.itinerary.ItineraryStepsBaseActivity$b r10 = r2.f38512v0
                r9.removeCallbacks(r10)
                android.widget.TextView r9 = r2.f38511u0
                r10 = 8
                r9.setVisibility(r10)
            L_0x0051:
                java.lang.Object r9 = r3.get(r5)
                com.moovit.itinerary.model.leg.Leg r9 = (com.moovit.itinerary.model.leg.Leg) r9
                r2.f39110I0 = r8
                com.moovit.commons.view.pager.ViewPager r10 = r2.f38502l0
                int r8 = r10.mo47354c(r8)
                java.lang.Object r8 = r10.mo47352a(r8)
                com.moovit.app.itinerary.view.SingleLegCard r8 = (com.moovit.app.itinerary.view.SingleLegCard) r8
                r10 = 1
                if (r8 == 0) goto L_0x0445
                r8.setSelected(r10)
                android.content.Context r12 = r8.getContext()
                com.moovit.itinerary.model.leg.Leg r13 = r8.f38681Q
                int r13 = r13.getType()
                r14 = 2
                if (r13 == r10) goto L_0x03a4
                if (r13 == r14) goto L_0x01ba
                r14 = 5
                if (r13 == r14) goto L_0x017a
                r14 = 9
                if (r13 == r14) goto L_0x01ba
                r14 = 18
                if (r13 == r14) goto L_0x017a
                r14 = 11
                if (r13 == r14) goto L_0x0107
                r14 = 12
                if (r13 == r14) goto L_0x008f
                goto L_0x0175
            L_0x008f:
                com.moovit.util.time.MinutesSpanFormatter r13 = com.moovit.util.time.C7925b.f23935b
                java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
                int r15 = r1.f15120k
                long r10 = (long) r15
                long r10 = r14.toMinutes(r10)
                android.text.SpannableStringBuilder r10 = r13.mo24602b(r12, r10)
                android.content.res.Resources r11 = r8.getResources()
                r13 = 1
                java.lang.Object[] r14 = new java.lang.Object[r13]
                r15 = 0
                r14[r15] = r10
                r10 = 2131889361(0x7f120cd1, float:1.9413383E38)
                java.lang.String r10 = r11.getString(r10, r14)
                r8.setInstruction(r10)
                android.content.res.Resources r10 = r8.getResources()
                java.lang.Object[] r11 = new java.lang.Object[r13]
                int r13 = r1.f15118i
                float r13 = (float) r13
                float r13 = com.moovit.util.DistanceUtils.m17936c(r12, r13)
                int r13 = (int) r13
                java.lang.String r12 = com.moovit.util.DistanceUtils.m17934a(r13, r12)
                r11[r15] = r12
                r12 = 2131889483(0x7f120d4b, float:1.941363E38)
                java.lang.String r10 = r10.getString(r12, r11)
                android.widget.TextView r11 = r8.f38675K
                r11.setText(r10)
                com.google.android.material.card.MaterialCardView r10 = r8.f38678N
                r11 = 5
                java.lang.CharSequence[] r11 = new java.lang.CharSequence[r11]
                android.widget.TextView r12 = r8.f38665A
                java.lang.CharSequence r12 = r12.getText()
                r11[r15] = r12
                android.widget.TextView r12 = r8.f38668D
                java.lang.CharSequence r12 = r12.getText()
                r13 = 1
                r11[r13] = r12
                com.moovit.design.view.ImagesOrTextsView r12 = r8.f38669E
                java.lang.CharSequence r12 = r12.getText()
                r13 = 2
                r11[r13] = r12
                android.widget.TextView r12 = r8.f38685U
                java.lang.CharSequence r12 = r12.getText()
                r13 = 3
                r11[r13] = r12
                android.widget.TextView r8 = r8.f38675K
                java.lang.CharSequence r8 = r8.getText()
                r12 = 4
                r11[r12] = r8
                a00.C13382a.m33674j(r10, r11)
                goto L_0x0175
            L_0x0107:
                com.moovit.util.time.MinutesSpanFormatter r10 = com.moovit.util.time.C7925b.f23935b
                java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
                int r13 = r1.f15120k
                long r13 = (long) r13
                long r13 = r11.toMinutes(r13)
                android.text.SpannableStringBuilder r10 = r10.mo24602b(r12, r13)
                android.content.res.Resources r11 = r8.getResources()
                r13 = 1
                java.lang.Object[] r14 = new java.lang.Object[r13]
                r15 = 0
                r14[r15] = r10
                r10 = 2131889361(0x7f120cd1, float:1.9413383E38)
                java.lang.String r10 = r11.getString(r10, r14)
                r8.setInstruction(r10)
                android.content.res.Resources r10 = r8.getResources()
                java.lang.Object[] r11 = new java.lang.Object[r13]
                int r13 = r1.f15118i
                float r13 = (float) r13
                float r13 = com.moovit.util.DistanceUtils.m17936c(r12, r13)
                int r13 = (int) r13
                java.lang.String r12 = com.moovit.util.DistanceUtils.m17934a(r13, r12)
                r11[r15] = r12
                r12 = 2131889483(0x7f120d4b, float:1.941363E38)
                java.lang.String r10 = r10.getString(r12, r11)
                android.widget.TextView r11 = r8.f38675K
                r11.setText(r10)
                com.google.android.material.card.MaterialCardView r10 = r8.f38678N
                r11 = 4
                java.lang.CharSequence[] r11 = new java.lang.CharSequence[r11]
                android.widget.TextView r12 = r8.f38665A
                java.lang.CharSequence r12 = r12.getText()
                r11[r15] = r12
                android.widget.TextView r12 = r8.f38668D
                java.lang.CharSequence r12 = r12.getText()
                r13 = 1
                r11[r13] = r12
                com.moovit.design.view.ImagesOrTextsView r12 = r8.f38669E
                java.lang.CharSequence r12 = r12.getText()
                r13 = 2
                r11[r13] = r12
                android.widget.TextView r8 = r8.f38675K
                java.lang.CharSequence r8 = r8.getText()
                r12 = 3
                r11[r12] = r8
                a00.C13382a.m33674j(r10, r11)
            L_0x0175:
                r16 = r6
                r18 = r7
                goto L_0x01b7
            L_0x017a:
                long r10 = java.lang.System.currentTimeMillis()
                com.moovit.util.time.Time r13 = new com.moovit.util.time.Time
                r13.<init>(r10)
                com.moovit.util.time.Time r14 = new com.moovit.util.time.Time
                int r15 = r1.f15120k
                int r15 = r15 * 1000
                r16 = r6
                r18 = r7
                long r6 = (long) r15
                long r10 = r10 + r6
                r14.<init>(r10)
                r8.mo45352J(r13, r14)
                android.content.res.Resources r6 = r8.getResources()
                r7 = 1
                java.lang.Object[] r7 = new java.lang.Object[r7]
                int r10 = r1.f15118i
                float r10 = (float) r10
                float r10 = com.moovit.util.DistanceUtils.m17936c(r12, r10)
                int r10 = (int) r10
                java.lang.String r10 = com.moovit.util.DistanceUtils.m17934a(r10, r12)
                r11 = 0
                r7[r11] = r10
                r10 = 2131889483(0x7f120d4b, float:1.941363E38)
                java.lang.String r6 = r6.getString(r10, r7)
                android.widget.TextView r7 = r8.f38675K
                r7.setText(r6)
            L_0x01b7:
                r14 = r9
                goto L_0x0416
            L_0x01ba:
                r16 = r6
                r18 = r7
                long r6 = java.lang.System.currentTimeMillis()
                com.moovit.util.time.Time r10 = new com.moovit.util.time.Time
                r10.<init>(r6)
                com.moovit.util.time.Time r11 = new com.moovit.util.time.Time
                int r12 = r1.f15120k
                int r12 = r12 * 1000
                long r12 = (long) r12
                long r12 = r12 + r6
                r11.<init>(r12)
                r8.mo45352J(r10, r11)
                int r10 = r1.f15119j
                r11 = 1
                if (r10 != r11) goto L_0x01e6
                android.content.res.Resources r10 = r8.getResources()
                r11 = 2131889363(0x7f120cd3, float:1.9413387E38)
                java.lang.String r10 = r10.getString(r11)
                goto L_0x01fa
            L_0x01e6:
                android.content.res.Resources r12 = r8.getResources()
                r13 = 2131889364(0x7f120cd4, float:1.941339E38)
                java.lang.Object[] r11 = new java.lang.Object[r11]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r14 = 0
                r11[r14] = r10
                java.lang.String r10 = r12.getString(r13, r11)
            L_0x01fa:
                r8.setInstruction(r10)
                java.util.List r10 = r27.mo19644u0()
                int r11 = r1.f15112c
                java.lang.Object r10 = r10.get(r11)
                com.moovit.navigation.NavigationLeg r10 = (com.moovit.navigation.NavigationLeg) r10
                java.util.List<com.moovit.navigation.NavigationPath> r10 = r10.f15055c
                int r11 = r1.f15113d
                java.lang.Object r10 = r10.get(r11)
                com.moovit.navigation.NavigationPath r10 = (com.moovit.navigation.NavigationPath) r10
                java.util.List<com.moovit.navigation.NavigationGeofence> r11 = r10.f15066f
                java.util.List<com.moovit.network.model.ServerId> r12 = r10.f15065e
                int r11 = r11.size()
                r13 = 0
                java.util.List r11 = r12.subList(r13, r11)
                com.moovit.util.ServerIdMap r12 = r27.mo19637P1()
                java.util.Objects.requireNonNull(r12)
                d0.v r14 = new d0.v
                r14.<init>(r12, r13)
                r12 = 0
                java.util.ArrayList r11 = c00.C13720d.m34273c(r11, r12, r14)
                boolean r12 = c00.C13717b.m34258e(r11)
                if (r12 != 0) goto L_0x0354
                java.util.List<com.moovit.navigation.NavigationGeofence> r10 = r10.f15066f
                java.util.ArrayList r12 = new java.util.ArrayList
                int r13 = r10.size()
                r12.<init>(r13)
                r13 = 0
            L_0x0243:
                int r14 = r10.size()
                if (r13 >= r14) goto L_0x026f
                java.lang.Object r14 = r10.get(r13)
                com.moovit.navigation.NavigationGeofence r14 = (com.moovit.navigation.NavigationGeofence) r14
                com.moovit.navigation.GeofenceMetadata r14 = r14.f15051g
                java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.SECONDS
                r17 = r10
                int r10 = r1.f15120k
                int r14 = r14.f15027e
                int r10 = r10 - r14
                r14 = r9
                long r9 = (long) r10
                long r9 = r15.toMillis(r9)
                long r9 = r9 + r6
                com.moovit.util.time.Time r15 = new com.moovit.util.time.Time
                r15.<init>(r9)
                r12.add(r15)
                int r13 = r13 + 1
                r9 = r14
                r10 = r17
                goto L_0x0243
            L_0x026f:
                r14 = r9
                int r6 = r1.f15121l
                int r6 = r6 + -1
                r7 = 0
                int r6 = java.lang.Math.max(r7, r6)
                float r7 = r1.f15123n
                r9 = 1120403456(0x42c80000, float:100.0)
                float r7 = r7 * r9
                int r7 = (int) r7
                android.widget.LinearLayout r9 = r8.f38676L
                java.lang.String r10 = "stops_view"
                android.view.View r9 = r9.findViewWithTag(r10)
                ea0.a r9 = (ea0.C12622a) r9
                r9.getClass()
                int r10 = r11.size()
                ea0.C12622a.m32347e(r6, r10)
                r9.f31194b = r11
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r9.f31202j = r6
                r9.f31203k = r7
                int r6 = r9.getChildCount()
                if (r6 != r10) goto L_0x02e0
                java.util.List<com.moovit.transit.TransitStop> r6 = r9.f31194b
                int r6 = r6.size()
                r7 = 0
            L_0x02ab:
                if (r7 >= r6) goto L_0x0326
                android.view.View r10 = r9.getChildAt(r7)
                r20 = r10
                com.moovit.design.view.list.ListItemView r20 = (com.moovit.design.view.list.ListItemView) r20
                java.util.List<com.moovit.transit.TransitStop> r10 = r9.f31194b
                java.lang.Object r10 = r10.get(r7)
                r21 = r10
                com.moovit.transit.TransitStop r21 = (com.moovit.transit.TransitStop) r21
                java.lang.Object r10 = r12.get(r7)
                r22 = r10
                com.moovit.util.time.Time r22 = (com.moovit.util.time.Time) r22
                boolean r23 = r9.mo39413b(r7)
                int r10 = r6 + -1
                if (r7 != r10) goto L_0x02d3
                r10 = 1
                r24 = 1
                goto L_0x02d6
            L_0x02d3:
                r10 = 0
                r24 = 0
            L_0x02d6:
                r25 = 1
                r19 = r9
                r19.mo39415d(r20, r21, r22, r23, r24, r25)
                int r7 = r7 + 1
                goto L_0x02ab
            L_0x02e0:
                r9.removeAllViews()
                r6 = 0
            L_0x02e4:
                if (r6 >= r10) goto L_0x0326
                com.moovit.design.view.list.ListItemView r7 = new com.moovit.design.view.list.ListItemView
                android.content.Context r13 = r9.getContext()
                r15 = 0
                r0 = 0
                r7.<init>(r13, r0, r15)
                int r0 = r9.f31196d
                r7.setPaddingRelative(r0, r15, r15, r15)
                int r0 = r10 + -1
                if (r6 != r0) goto L_0x02fe
                r0 = 1
                r24 = 1
                goto L_0x0301
            L_0x02fe:
                r0 = 0
                r24 = 0
            L_0x0301:
                java.lang.Object r0 = r11.get(r6)
                r21 = r0
                com.moovit.transit.TransitStop r21 = (com.moovit.transit.TransitStop) r21
                java.lang.Object r0 = r12.get(r6)
                r22 = r0
                com.moovit.util.time.Time r22 = (com.moovit.util.time.Time) r22
                boolean r23 = r9.mo39413b(r6)
                r25 = 0
                r19 = r9
                r20 = r7
                r19.mo39415d(r20, r21, r22, r23, r24, r25)
                r9.addView(r7)
                int r6 = r6 + 1
                r0 = r26
                goto L_0x02e4
            L_0x0326:
                com.google.android.material.card.MaterialCardView r0 = r8.f38678N
                r6 = 4
                java.lang.CharSequence[] r6 = new java.lang.CharSequence[r6]
                android.widget.TextView r7 = r8.f38665A
                java.lang.CharSequence r7 = r7.getText()
                r9 = 0
                r6[r9] = r7
                android.widget.TextView r7 = r8.f38668D
                java.lang.CharSequence r7 = r7.getText()
                r9 = 1
                r6[r9] = r7
                android.widget.TextView r7 = r8.f38666B
                java.lang.CharSequence r7 = r7.getContentDescription()
                r9 = 2
                r6[r9] = r7
                android.widget.TextView r7 = r8.f38675K
                java.lang.CharSequence r7 = r7.getText()
                r8 = 3
                r6[r8] = r7
                a00.C13382a.m33674j(r0, r6)
                goto L_0x0416
            L_0x0354:
                r14 = r9
                de.f r0 = p435de.C16596f.m42113a()
                java.lang.String r6 = "NavigableId: "
                java.lang.StringBuilder r6 = p379.C13555b.m33972k(r6)
                java.lang.String r7 = r27.mo19639e0()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r0.mo49363b(r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "NavigableLeg index: "
                r6.append(r7)
                int r7 = r1.f15112c
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r0.mo49363b(r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "NavigablePath index: "
                r6.append(r7)
                int r7 = r1.f15113d
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r0.mo49363b(r6)
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "Empty line leg stops!"
                r6.<init>(r7)
                r0.mo49364c(r6)
                goto L_0x0416
            L_0x03a4:
                r16 = r6
                r18 = r7
                r14 = r9
                com.moovit.util.time.MinutesSpanFormatter r0 = com.moovit.util.time.C7925b.f23935b
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
                int r7 = r1.f15120k
                long r9 = (long) r7
                long r6 = r6.toMinutes(r9)
                android.text.SpannableStringBuilder r0 = r0.mo24602b(r12, r6)
                android.content.res.Resources r6 = r8.getResources()
                r7 = 2131889415(0x7f120d07, float:1.9413493E38)
                r9 = 1
                java.lang.Object[] r10 = new java.lang.Object[r9]
                r11 = 0
                r10[r11] = r0
                java.lang.String r0 = r6.getString(r7, r10)
                r8.setInstruction(r0)
                android.content.res.Resources r0 = r8.getResources()
                java.lang.Object[] r6 = new java.lang.Object[r9]
                int r7 = r1.f15118i
                float r7 = (float) r7
                float r7 = com.moovit.util.DistanceUtils.m17936c(r12, r7)
                int r7 = (int) r7
                java.lang.String r7 = com.moovit.util.DistanceUtils.m17934a(r7, r12)
                r6[r11] = r7
                r7 = 2131889483(0x7f120d4b, float:1.941363E38)
                java.lang.String r0 = r0.getString(r7, r6)
                android.widget.TextView r6 = r8.f38675K
                r6.setText(r0)
                com.google.android.material.card.MaterialCardView r0 = r8.f38678N
                r6 = 4
                java.lang.CharSequence[] r6 = new java.lang.CharSequence[r6]
                android.widget.TextView r7 = r8.f38665A
                java.lang.CharSequence r7 = r7.getText()
                r6[r11] = r7
                android.widget.TextView r7 = r8.f38668D
                java.lang.CharSequence r7 = r7.getText()
                r6[r9] = r7
                com.moovit.design.view.ImagesOrTextsView r7 = r8.f38669E
                java.lang.CharSequence r7 = r7.getText()
                r9 = 2
                r6[r9] = r7
                android.widget.TextView r7 = r8.f38675K
                java.lang.CharSequence r7 = r7.getText()
                r8 = 3
                r6[r8] = r7
                a00.C13382a.m33674j(r0, r6)
            L_0x0416:
                r0 = 3
                com.moovit.itinerary.model.leg.Leg r6 = e20.C16783l.m42489u(r5, r3)
                if (r6 == 0) goto L_0x044a
                int r7 = r6.getType()
                if (r7 == r0) goto L_0x042b
                int r0 = r6.getType()
                r6 = 10
                if (r0 != r6) goto L_0x044a
            L_0x042b:
                int r0 = r5 + 1
                int r0 = r2.mo45282H2(r0)
                com.moovit.commons.view.pager.ViewPager r6 = r2.f38502l0
                int r0 = r6.mo47354c(r0)
                java.lang.Object r0 = r6.mo47352a(r0)
                com.moovit.app.itinerary.view.SingleLegCard r0 = (com.moovit.app.itinerary.view.SingleLegCard) r0
                com.moovit.transit.Schedule r0 = r0.getLineSchedule()
                r2.mo45287M2(r0)
                goto L_0x044a
            L_0x0445:
                r16 = r6
                r18 = r7
                r14 = r9
            L_0x044a:
                int r0 = r3.size()
                r6 = r5
            L_0x044f:
                if (r6 >= r0) goto L_0x046b
                java.lang.Object r7 = r3.get(r6)
                com.moovit.itinerary.model.leg.Leg r7 = (com.moovit.itinerary.model.leg.Leg) r7
                int r7 = r7.getType()
                r8 = 6
                if (r7 == r8) goto L_0x0469
                r8 = 3
                if (r7 == r8) goto L_0x0469
                r8 = 10
                if (r7 != r8) goto L_0x0466
                goto L_0x0469
            L_0x0466:
                int r6 = r6 + 1
                goto L_0x044f
            L_0x0469:
                r0 = 0
                goto L_0x046c
            L_0x046b:
                r0 = 1
            L_0x046c:
                if (r0 == 0) goto L_0x0486
                com.moovit.app.navigation.MultiLegNavActivity$c r0 = r2.f39106E0
                java.lang.String r3 = r2.f39109H0
                s0.b r0 = r0.f15351b
                r6 = 0
                java.lang.Object r0 = r0.getOrDefault(r3, r6)
                com.moovit.navigation.Navigable r0 = (com.moovit.navigation.Navigable) r0
                long r6 = r0.mo19642k0(r1)
                long r8 = java.lang.System.currentTimeMillis()
                r2.mo45643c3(r6, r8)
            L_0x0486:
                int r0 = r2.f39110I0
                com.moovit.commons.view.pager.ViewPager r3 = r2.f38502l0
                int r3 = r3.getCurrentLogicalItem()
                if (r0 != r3) goto L_0x0495
                r0 = 1
                r2.mo45641a3(r0)
                goto L_0x0496
            L_0x0495:
                r0 = 1
            L_0x0496:
                boolean r3 = r2.f39111J0
                if (r3 == 0) goto L_0x04dc
                com.moovit.commons.view.pager.ViewPager r3 = r2.f38502l0
                int r6 = r2.f39110I0
                r3.mo47356e(r6, r0)
                r0 = -1
                r3 = r18
                if (r3 != r0) goto L_0x04ab
                int r0 = r2.f39110I0
                r2.mo45292y2(r0)
            L_0x04ab:
                int r0 = r2.f39110I0
                r3 = r16
                if (r3 == r0) goto L_0x04dc
                int r0 = r14.getType()
                java.lang.String r0 = p001a0.C0016g.m20c(r0)
                hq.b$a r3 = new hq.b$a
                com.moovit.analytics.AnalyticsEventKey r6 = com.moovit.analytics.AnalyticsEventKey.NAVIGATION_LEG_ADVANCE
                r3.<init>(r6)
                com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_STEP_TYPE
                r3.mo49939g(r6, r0)
                com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_STEP_INDEX
                int r6 = r2.f39110I0
                r3.mo49935c(r0, r6)
                com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_GUID
                com.moovit.itinerary.model.Itinerary r6 = r2.f38499X
                java.lang.String r6 = r6.f41894b
                r3.mo49939g(r0, r6)
                hq.b r0 = r3.mo49933a()
                r2.mo44545v2(r0)
            L_0x04dc:
                com.moovit.navigation.ArrivalState r0 = r1.f15115f
                com.moovit.navigation.ArrivalState r3 = com.moovit.navigation.ArrivalState.ARRIVED
                if (r0 != r3) goto L_0x0507
                int r4 = r4 + -1
                if (r5 != r4) goto L_0x0507
                androidx.fragment.app.FragmentManager r0 = r2.getSupportFragmentManager()
                java.lang.String r3 = "arrive_to_destination_dialog_tag"
                androidx.fragment.app.Fragment r4 = r0.mo3923A(r3)
                if (r4 != 0) goto L_0x0507
                com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.NAVIGATION_ENDED
                com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.REASON
                java.lang.String r6 = "arrive_to_dest"
                java.util.Map r5 = java.util.Collections.singletonMap(r5, r6)
                r2.mo45640Z2(r4, r5)
                vu.b r2 = new vu.b
                r2.<init>()
                r2.show((androidx.fragment.app.FragmentManager) r0, (java.lang.String) r3)
            L_0x0507:
                r0 = r26
            L_0x0509:
                com.moovit.navigation.b r2 = r0.f39124h
                if (r2 == 0) goto L_0x0525
                int r1 = r1.f15112c
                int r3 = r2.f15093h
                if (r1 != r3) goto L_0x0514
                goto L_0x0525
            L_0x0514:
                r2.f15093h = r1
                java.util.List r1 = r27.mo19644u0()
                int r3 = r2.f15093h
                java.lang.Object r1 = r1.get(r3)
                com.moovit.navigation.NavigationLeg r1 = (com.moovit.navigation.NavigationLeg) r1
                r2.mo19703b(r1)
            L_0x0525:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.navigation.MultiLegNavActivity.C15180c.mo19881f(com.moovit.navigation.Navigable, com.moovit.navigation.event.NavigationProgressEvent):void");
        }

        /* renamed from: g */
        public final void mo19882g(Navigable navigable) {
        }

        /* renamed from: h */
        public final void mo19883h(Navigable navigable, NavigationStartEvent navigationStartEvent) {
            MultiLegNavActivity multiLegNavActivity = MultiLegNavActivity.this;
            int i = MultiLegNavActivity.f39101S0;
            if (multiLegNavActivity.findViewById(R.id.progress_bar).getVisibility() == 0) {
                multiLegNavActivity.f39115N0.postDelayed(multiLegNavActivity.f39108G0, 500);
            }
            C4228b bVar = this.f39124h;
            if (bVar != null) {
                bVar.f15093h = 0;
                bVar.mo19702a();
                Color color = bVar.f15089d;
                Color.C15756a aVar = Color.f40999c;
                LineStyle.LineJoin lineJoin = LineStyle.LineJoin.NONE;
                Color color2 = bVar.f15090e;
                C21100e.m49373x(color2, "color");
                C21100e.m49357p(4.0f, "strokeWidth");
                C16286k kVar = new C16286k(color, new LineStyle(color2, 4.0f, lineJoin, (Bitmap) null, (Bitmap) null, BitmapDescriptorFactory.HUE_RED));
                Iterator it = new HashSet(navigable.mo19638X()).iterator();
                while (it.hasNext()) {
                    bVar.f15092g.add(bVar.f15086a.mo48660v2(C7530f.m17269b((Geofence) it.next(), 12), kVar));
                }
                bVar.mo19703b(navigable.mo19644u0().get(bVar.f15093h));
            }
        }

        /* renamed from: i */
        public final void mo19884i(Navigable navigable, NavigationStopEvent navigationStopEvent) {
            MultiLegNavActivity multiLegNavActivity = MultiLegNavActivity.this;
            int i = MultiLegNavActivity.f39101S0;
            if (!multiLegNavActivity.f39121z0) {
                multiLegNavActivity.finish();
            } else {
                ItineraryNavigable itineraryNavigable = multiLegNavActivity.f39102A0;
                multiLegNavActivity.mo45635S2();
                if (itineraryNavigable != null) {
                    multiLegNavActivity.mo45642b3(itineraryNavigable);
                }
            }
            C4228b bVar = this.f39124h;
            if (bVar != null) {
                Iterator it = bVar.f15092g.iterator();
                while (it.hasNext()) {
                    bVar.f15086a.mo48638i3(it.next());
                }
                bVar.f15092g.clear();
                bVar.mo19702a();
            }
        }
    }

    /* renamed from: com.moovit.app.navigation.MultiLegNavActivity$d */
    public class C15181d implements Runnable {

        /* renamed from: com.moovit.app.navigation.MultiLegNavActivity$d$a */
        public class C15182a extends C17682a {
            public C15182a() {
            }

            public final void onAnimationEnd(Animator animator) {
                MultiLegNavActivity.this.findViewById(R.id.dimmer).setVisibility(8);
            }
        }

        /* renamed from: com.moovit.app.navigation.MultiLegNavActivity$d$b */
        public class C15183b extends C17682a {
            public C15183b() {
            }

            public final void onAnimationEnd(Animator animator) {
                MultiLegNavActivity multiLegNavActivity = MultiLegNavActivity.this;
                int i = MultiLegNavActivity.f39101S0;
                ViewPager viewPager = multiLegNavActivity.f38502l0;
                SingleLegCard singleLegCard = (SingleLegCard) viewPager.mo47352a(viewPager.getCurrentLogicalItem());
                if (singleLegCard != null) {
                    MaterialCardView materialCardView = singleLegCard.f38678N;
                    C13382a.C13383a aVar = C13382a.f33219a;
                    if (materialCardView != null) {
                        materialCardView.requestFocus();
                        materialCardView.sendAccessibilityEvent(8);
                    }
                }
            }

            public final void onAnimationStart(Animator animator) {
                int i;
                MultiLegNavActivity multiLegNavActivity = MultiLegNavActivity.this;
                int i2 = MultiLegNavActivity.f39101S0;
                View view = multiLegNavActivity.f38509s0;
                if (multiLegNavActivity.f38502l0.getAdapter().getCount() > 1) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }

        public C15181d() {
        }

        public final void run() {
            boolean z = false;
            UiUtils.m40238F(8, MultiLegNavActivity.this.findViewById(R.id.progress_bar));
            MultiLegNavActivity.this.findViewById(R.id.dimmer).animate().alpha(BitmapDescriptorFactory.HUE_RED).setListener(new C15182a()).start();
            MultiLegNavActivity multiLegNavActivity = MultiLegNavActivity.this;
            int i = MultiLegNavActivity.f39101S0;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(multiLegNavActivity.f38509s0, View.ALPHA, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
            ofFloat.setDuration((long) MultiLegNavActivity.this.getResources().getInteger(17694720));
            float dimension = MultiLegNavActivity.this.getResources().getDimension(R.dimen.card_peek_size);
            MultiLegNavActivity.this.f38502l0.setTranslationY(dimension);
            MultiLegNavActivity.this.f38502l0.setVisibility(0);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(MultiLegNavActivity.this.f38502l0, "translationY", new float[]{dimension, 0.0f});
            ofFloat2.setDuration((long) MultiLegNavActivity.this.getResources().getInteger(17694720));
            AnimatorSet animatorSet = new AnimatorSet();
            if (MultiLegNavActivity.this.f38501Z.size() > 1) {
                MultiLegNavActivity.this.f38509s0.setAlpha(BitmapDescriptorFactory.HUE_RED);
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            } else {
                animatorSet.playTogether(new Animator[]{ofFloat2});
            }
            animatorSet.addListener(new C15183b());
            animatorSet.setStartDelay(500);
            animatorSet.start();
            MultiLegNavActivity multiLegNavActivity2 = MultiLegNavActivity.this;
            MenuItem menuItem = multiLegNavActivity2.f39103B0;
            if (menuItem != null) {
                if (C16783l.m42470b(multiLegNavActivity2.f38499X, 11, 12) && !C16783l.m42470b(multiLegNavActivity2.f38499X, 2, 3, 9, 5, 6, 7, 18)) {
                    z = true;
                }
                menuItem.setVisible(true ^ z);
            }
        }
    }

    /* renamed from: R2 */
    public static void m38727R2(MultiLegNavActivity multiLegNavActivity, Exception exc) {
        C20944i0<Integer, Integer> i0Var;
        if (!multiLegNavActivity.f37313z) {
            multiLegNavActivity.finish();
            return;
        }
        if (multiLegNavActivity.f39121z0 && (i0Var = multiLegNavActivity.f38508r0) != null) {
            int intValue = ((Integer) i0Var.f52692a).intValue();
            int intValue2 = ((Integer) multiLegNavActivity.f38508r0.f52693b).intValue();
            MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) multiLegNavActivity.f38499X.mo48295u0().get(intValue);
            if (multiTransitLinesLeg == null) {
                C16596f.m42113a().mo49364c(new ApplicationBugException(C16759e.m42349e("Previous leg not found in itinerary, leg index: ", intValue)));
                multiLegNavActivity.mo45635S2();
            } else {
                C16783l.m42467D(multiLegNavActivity.f38499X, multiTransitLinesLeg, intValue2);
                multiLegNavActivity.mo45290P2(multiTransitLinesLeg, intValue);
            }
        }
        multiLegNavActivity.mo44530n2(C13751d.m34341b(multiLegNavActivity, "request_navigable_error", exc));
    }

    /* renamed from: T2 */
    public static Intent m38728T2(Context context, Itinerary itinerary, int i, String str) {
        Intent intent = new Intent(context, MultiLegNavActivity.class);
        intent.putExtra("nav_type_key", NavigationType.CODER.mo51917b(NavigationType.ITINERARY));
        intent.putExtra("scheduled_itinerary_key", itinerary);
        intent.putExtra("scheduled_itinerary_leg_index_key", i);
        intent.putExtra("navigable_id_key", str);
        return intent;
    }

    /* renamed from: U2 */
    public static Intent m38729U2(Context context, ServerId serverId) {
        Intent intent = new Intent(context, MultiLegNavActivity.class);
        intent.putExtra("nav_type_key", NavigationType.CODER.mo51917b(NavigationType.CHECKIN));
        intent.putExtra("line_id_key", serverId);
        return intent;
    }

    /* renamed from: A2 */
    public final void mo45275A2() {
        super.mo45275A2();
        MapOverlaysLayout mapOverlaysLayout = this.f38503m0.f38550b.f42386w;
        View findViewById = findViewById(R.id.recenter_button);
        this.f39118Q0 = findViewById;
        findViewById.setOnClickListener(new C4051q(this, 22));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration((long) getResources().getInteger(17694720));
        mapOverlaysLayout.setLayoutTransition(layoutTransition);
    }

    /* renamed from: B2 */
    public final boolean mo45276B2() {
        return true;
    }

    /* renamed from: C2 */
    public final void mo45277C2() {
        if (this.f39112K0 == NavigationType.CHECKIN) {
            Runnable runnable = this.f39120y0;
            if (runnable != null) {
                this.f39115N0.removeCallbacks(runnable);
            }
            mo45286L2("active_ride_change_dest_button_type", (C6302b) null);
            C15180c cVar = this.f39106E0;
            mo45636V2((Checkin) ((Navigable) cVar.f15351b.getOrDefault(this.f39109H0, null)));
        }
    }

    /* renamed from: D2 */
    public final AdSource mo45278D2() {
        return AdSource.NAVIGATION_SCREEN_BANNER;
    }

    /* renamed from: E2 */
    public final int mo45279E2() {
        return R.layout.multi_leg_nav_activity;
    }

    /* renamed from: F2 */
    public final C19047a.C19049b<List<QuickAction>> mo45280F2() {
        NavigationType navigationType = this.f39112K0;
        if (navigationType == NavigationType.CHECKIN) {
            return C20199a.f51255Q0;
        }
        if (navigationType == NavigationType.ITINERARY) {
            return C20199a.f51251M0;
        }
        return null;
    }

    /* renamed from: G2 */
    public final boolean mo45281G2() {
        return true;
    }

    /* renamed from: I2 */
    public final void mo45283I2(int i) {
        super.mo45283I2(i);
        runOnUiThread(new C7073m(this, 11));
        mo45638X2(i);
        mo45643c3(this.f38499X.mo48288K1().mo24631g(), this.f38499X.mo48294o1().mo24631g());
    }

    /* renamed from: K2 */
    public final void mo45285K2(int i) {
        boolean z;
        super.mo45285K2(i);
        int i2 = this.f39110I0;
        if (i2 != -1) {
            if (i2 == this.f38502l0.getCurrentLogicalItem()) {
                z = true;
            } else {
                z = false;
            }
            mo45641a3(z);
        }
    }

    /* renamed from: N2 */
    public final boolean mo45288N2() {
        return this.f39112K0 == NavigationType.ITINERARY;
    }

    /* renamed from: O2 */
    public final boolean mo45289O2() {
        return this.f39112K0 == NavigationType.ITINERARY;
    }

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        mo45286L2("active_ride_minimized_button_type", (C6302b) null);
        finish();
        overridePendingTransition(R.anim.no_change, R.anim.slide_out_down);
        return true;
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        int i;
        getMenuInflater().inflate(R.menu.live_navigation_menu, menu);
        this.f39103B0 = menu.findItem(R.id.alerts_nav_action);
        boolean b = C20233c.m47801b(this);
        MenuItem menuItem = this.f39103B0;
        if (b) {
            i = R.drawable.ic_bell_full_24_control_normal;
        } else {
            i = R.drawable.ic_bell_empty_24_control_normal;
        }
        menuItem.setIcon(i);
        return true;
    }

    /* renamed from: S2 */
    public final void mo45635S2() {
        this.f39102A0 = null;
        this.f39121z0 = false;
        this.f38508r0 = null;
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        if (!"request_navigable_error".equals(str)) {
            return;
        }
        if (this.f39121z0) {
            mo45635S2();
        } else {
            finish();
        }
    }

    /* renamed from: V2 */
    public final void mo45636V2(Checkin checkin) {
        if (checkin != null) {
            int i = C15035a.f38527u;
            ArrayList arrayList = new ArrayList();
            ServerIdMap<TransitStop> serverIdMap = checkin.f39136m;
            for (NavigationPath navigationPath : checkin.f39137n.f15055c) {
                arrayList.add(serverIdMap.mo24576b(navigationPath.f15065e));
            }
            C15035a.m38061V1(this, C7843b.m17880g(arrayList), ((TransitStop) checkin.f39136m.get(checkin.f39137n.f15056d)).f23730b, checkin.f39132i.mo24369b()).show(getSupportFragmentManager(), "SELECTION_STATION_FRAGMENT");
        }
    }

    /* renamed from: W2 */
    public final void mo45637W2(ServerId serverId, ServerId serverId2) {
        C13556a aVar = this.f39113L0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39113L0 = null;
        }
        ServerId serverId3 = serverId;
        C20419a aVar2 = new C20419a(mo44548x1(), serverId3, C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates().mo50014i(), serverId2, this.f39109H0);
        StringBuilder sb = new StringBuilder(C20419a.class.getSimpleName());
        sb.append('_');
        sb.append(aVar2.f51733w);
        sb.append('_');
        sb.append(aVar2.f51734x);
        sb.append('_');
        sb.append(aVar2.f51735y);
        if (aVar2.f51736z != null) {
            sb.append('_');
            sb.append(aVar2.f51736z);
        }
        if (aVar2.f51732A != null) {
            sb.append('_');
            sb.append(aVar2.f51732A);
        }
        sb.append('_');
        sb.append(false);
        this.f39113L0 = mo44528l2(sb.toString(), aVar2, this.f39104C0);
    }

    /* renamed from: X2 */
    public final void mo45638X2(int i) {
        int i2;
        String str;
        if (i < 0) {
            i2 = 0;
        } else {
            i2 = mo45282H2(i);
        }
        if (!mo45288N2() || i2 != 0) {
            str = C0016g.m20c(this.f38499X.mo48295u0().get(i).getType());
        } else {
            str = "start_step";
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.ITINERARY_LOADED);
        aVar.mo49939g(AnalyticsAttributeKey.NAVIGABLE_ID, this.f39109H0);
        aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_STEP_TYPE, str);
        aVar.mo49935c(AnalyticsAttributeKey.ITINERARY_STEP_INDEX, i2);
        aVar.mo49935c(AnalyticsAttributeKey.LEGS_WITH_ALTERNATIVES, C16783l.m42471c(this.f38499X));
        aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_GUID, this.f38499X.f41894b);
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: Y2 */
    public final void mo45639Y2() {
        C20769b bVar = new C20769b(this.f38499X, mo44548x1());
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f39114M0 = mo44527k2(C20769b.class.getSimpleName() + "_" + bVar.f52411w.f41894b, bVar, requestOptions, this.f39105D0);
    }

    /* renamed from: Z2 */
    public final void mo45640Z2(AnalyticsEventKey analyticsEventKey, Map<AnalyticsAttributeKey, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        C17474b.C17475a aVar = new C17474b.C17475a(analyticsEventKey);
        aVar.mo49939g(AnalyticsAttributeKey.NAVIGABLE_ID, this.f39109H0);
        aVar.f44998b.putAll(map);
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: a3 */
    public final void mo45641a3(boolean z) {
        int i;
        this.f39111J0 = z;
        if (z) {
            if (!(this.f39110I0 == -1 || this.f38502l0.getCurrentLogicalItem() == (i = this.f39110I0))) {
                this.f38502l0.mo47356e(i, true);
            }
            this.f39118Q0.setVisibility(8);
            return;
        }
        this.f39118Q0.setVisibility(0);
    }

    /* renamed from: b3 */
    public final void mo45642b3(AbstractNavigable abstractNavigable) {
        C21100e.m49371w(abstractNavigable);
        this.f39109H0 = abstractNavigable.mo19639e0();
        if (NavigationService.f15071s.f49799a.containsKey(abstractNavigable.getClass())) {
            File file = new File(getCacheDir(), C13437d.m33706k("navigable_", abstractNavigable.mo19639e0(), ".tmp"));
            C19617r u = NavigationService.m11308u();
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                new C19610m(bufferedOutputStream).mo51967q(abstractNavigable, u);
                bufferedOutputStream.close();
            } catch (IOException unused) {
                if (file.exists()) {
                    file.delete();
                }
                file = null;
            }
            if (file != null) {
                Intent intent = new Intent(this, NavigationService.class);
                intent.setAction("com.moovit.navigation_service.action.start_navigation");
                intent.putExtra("com.moovit.navigation_service.navigable_temp_filename_extra", file.getAbsolutePath());
                startService(intent);
            }
            mo45640Z2(AnalyticsEventKey.NAVIGATION_STARTED, (Map<AnalyticsAttributeKey, String>) null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(abstractNavigable.getClass().getName());
        sb.append(" is not known to ");
        Class<NavigationService> cls = NavigationService.class;
        sb.append("NavigationService");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        this.f39106E0.mo19886k();
        Runnable runnable = this.f39120y0;
        if (runnable != null) {
            this.f39115N0.removeCallbacks(runnable);
            this.f39120y0 = null;
        }
    }

    /* renamed from: c3 */
    public final void mo45643c3(long j, long j2) {
        if (Math.abs(j - this.f39119R0) / TimeUnit.MINUTES.toMillis(1) > 0) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.ETA_CHANGED);
            aVar.mo49936d(AnalyticsAttributeKey.NEW_ETA, j);
            mo44545v2(aVar.mo49933a());
        }
        this.f39119R0 = j;
        String l = C7925b.m18024l(this, j);
        SpannableStringBuilder e = C7925b.f23935b.mo24605e(this, j2, j);
        if (e == null) {
            if (getSupportActionBar() != null) {
                getSupportActionBar().mo799u(l);
            }
        } else if (getSupportActionBar() != null) {
            getSupportActionBar().mo799u(getResources().getString(R.string.entire_trip_duration_format, new Object[]{e, l}));
        }
    }

    /* renamed from: d1 */
    public final C16855d mo19507d1() {
        C16525b c = new C17059d(this).mo49508c();
        TimeUnit timeUnit = TimeUnit.HOURS;
        c.mo49314a(timeUnit.toMillis(1));
        C16525b c2 = new C17060e(this).mo49508c();
        c2.mo49314a(timeUnit.toMillis(1));
        return new C16855d(this, R.id.alert_conditions, Arrays.asList(new C16851b[]{(C16851b) c.f43144b, (C16851b) c2.f43144b}));
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        Intent intent = getIntent();
        if (intent.hasExtra("nav_type_key")) {
            this.f39112K0 = NavigationType.CODER.mo51916a(intent.getShortExtra("nav_type_key", -1));
        }
        if (bundle != null) {
            this.f39109H0 = bundle.getString("navigable_id_key");
        } else {
            this.f39109H0 = intent.getStringExtra("navigable_id_key");
        }
        super.mo19425e2(bundle);
        if (intent.getIntExtra("scheduled_itinerary_leg_index_key", -1) < 0) {
            mo45641a3(true);
        }
        if (this.f39112K0 == NavigationType.CHECKIN) {
            this.f39116O0 = (ServerId) getIntent().getParcelableExtra("line_id_key");
        }
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        Itinerary itinerary;
        super.mo24881f2();
        if (!C20964s0.m49090h(this.f39109H0) && this.f38502l0.getAdapter() != null) {
            mo45638X2(mo45291Q2(this.f38502l0.getCurrentLogicalItem()));
        }
        this.f39106E0.mo19885j();
        if (this.f39112K0 == NavigationType.ITINERARY && (itinerary = this.f38499X) != null && C16783l.m42470b(itinerary, 2, 9)) {
            C19377c.m46656a(this, TrackingEvent.LIVE_DIRECTION_NOTIFICATION_DIALOG_DISPLAYED, new C4268a1(this, 14));
        }
    }

    /* renamed from: g */
    public final void mo45307g(TransitStop transitStop) {
        if (this.f39116O0 != null) {
            ServerId serverId = transitStop.f23730b;
            C15180c cVar = this.f39106E0;
            Checkin checkin = (Checkin) ((Navigable) cVar.f15351b.getOrDefault(this.f39109H0, null));
            if (checkin == null || !checkin.f39137n.f15056d.equals(serverId)) {
                ServerId serverId2 = this.f39116O0;
                this.f39121z0 = true;
                NavigationService.m11306G(this);
                mo45637W2(serverId2, serverId);
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.ACTIVE_RIDE_CHANGE_DEST);
                aVar.mo49939g(AnalyticsAttributeKey.NAVIGABLE_ID, this.f39109H0);
                aVar.mo49935c(AnalyticsAttributeKey.STOP_ID, serverId.f15142b);
                aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_GUID, this.f38499X.f41894b);
                mo44545v2(aVar.mo49933a());
            }
        }
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        super.mo23894g2(bundle);
        bundle.putString("navigable_id_key", this.f39109H0);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        CharSequence charSequence;
        super.mo19426h2();
        if (C20943i.m49051d(30)) {
            charSequence = getString(R.string.location_rational_start_itinerary_navigation_message_new, new Object[]{getPackageManager().getBackgroundPermissionOptionLabel()});
        } else if (NavigationType.CHECKIN.equals(this.f39112K0)) {
            charSequence = getText(R.string.location_rational_start_line_navigation_message);
        } else {
            charSequence = getText(R.string.location_rational_start_itinerary_navigation_message);
        }
        LocationSettingsFixer.C16198a aVar = new LocationSettingsFixer.C16198a((MoovitActivity) this);
        aVar.f42259f = true;
        aVar.f42258e = Boolean.TRUE;
        aVar.f42256c = getText(R.string.location_rational_start_itinerary_navigation_title);
        aVar.f42257d = charSequence;
        aVar.mo48528a((C20935e<C20961r<Location>>) null);
    }

    /* renamed from: m */
    public final void mo40416m(MultiTransitLinesLeg multiTransitLinesLeg, int i) {
        super.mo40416m(multiTransitLinesLeg, i);
        this.f39121z0 = true;
        C13556a aVar = this.f39114M0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39114M0 = null;
        }
        mo45639Y2();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int i;
        int i2;
        if (menuItem.getItemId() != R.id.alerts_nav_action) {
            return super.onOptionsItemSelected(menuItem);
        }
        boolean b = C20233c.m47801b(this);
        C20233c.f51336a.mo49545d(getSharedPreferences("ride_preferences", 0), Boolean.valueOf(!b));
        if (b) {
            i = R.drawable.ic_bell_empty_24_control_normal;
        } else {
            i = R.drawable.ic_bell_full_24_control_normal;
        }
        menuItem.setIcon(i);
        if (b) {
            i2 = R.string.live_directions_stop_alerts_off;
        } else {
            i2 = R.string.live_directions_stop_alerts_on;
        }
        Toast.makeText(this, i2, 0).show();
        return true;
    }

    /* renamed from: z2 */
    public final void mo45293z2(Leg leg) {
        boolean z;
        SingleLegCard singleLegCard;
        C15043f fVar = this.f38503m0;
        if (this.f39110I0 == -1 || this.f38499X.mo48295u0().indexOf(leg) != mo45291Q2(this.f38502l0.getCurrentLogicalItem()) || (singleLegCard = (SingleLegCard) this.f38502l0.getPrimaryItem()) == null || !singleLegCard.isSelected()) {
            z = false;
        } else {
            z = true;
        }
        fVar.mo45312c(leg, z);
    }
}
