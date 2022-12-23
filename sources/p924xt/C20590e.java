package p924xt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c20.C13744a;
import com.moovit.app.ads.MoovitNativeAdView;
import com.moovit.app.tod.view.TodTripPlanBannerView;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImagePack;
import com.moovit.itinerary.TripPlanFlexTimeBanner;
import com.moovit.itinerary.TripPlanTodBanner;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.ItinerarySectionBranding;
import com.moovit.tripplanner.TripPlannerLocations;
import com.tranzmate.R;
import e20.C16769e;
import ja0.C12797f;
import java.util.Arrays;
import java.util.HashSet;
import o00.C18676l;
import p216q1.C6133b;
import p242s1.C6354e;
import p297w5.C6994a;
import p977zz.C20964s0;

/* renamed from: xt.e */
public abstract class C20590e extends C18676l<C20595f, C20596g, C20592b> {

    /* renamed from: l */
    public static final HashSet f52076l = new HashSet(Arrays.asList(new Integer[]{11, 9, 13, 12}));

    /* renamed from: j */
    public final C6994a f52077j = new C6994a(this, 14);

    /* renamed from: k */
    public C16769e.C16772c f52078k = null;

    /* renamed from: xt.e$a */
    public static class C20591a {

        /* renamed from: a */
        public View f52079a;

        /* renamed from: b */
        public ImageView f52080b;

        /* renamed from: c */
        public TextView f52081c;

        /* renamed from: d */
        public TextView f52082d;

        /* renamed from: e */
        public TextView f52083e;

        public C20591a(View view) {
            this.f52079a = view;
            this.f52080b = (ImageView) view.findViewById(R.id.image_view);
            this.f52081c = (TextView) view.findViewById(R.id.type);
            this.f52082d = (TextView) view.findViewById(R.id.distance);
            this.f52083e = (TextView) view.findViewById(R.id.duration);
        }
    }

    /* renamed from: xt.e$b */
    public static class C20592b extends C12797f {

        /* renamed from: e */
        public final C6354e f52084e;

        /* renamed from: xt.e$b$a */
        public class C20593a extends RecyclerView.C1148v {
            public C20593a() {
            }

            /* renamed from: b */
            public final boolean mo4910b(RecyclerView recyclerView, MotionEvent motionEvent) {
                return C20592b.this.f52084e.mo22474a(motionEvent);
            }
        }

        /* renamed from: xt.e$b$b */
        public class C20594b extends GestureDetector.SimpleOnGestureListener {
            public C20594b() {
            }

            public final boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C20592b.this.itemView.performClick();
                return true;
            }
        }

        public C20592b(View view) {
            super(view);
            C20593a aVar = new C20593a();
            this.f52084e = new C6354e(view.getContext(), new C20594b());
            RecyclerView recyclerView = (RecyclerView) mo39639f(R.id.legs_preview);
            if (recyclerView != null) {
                recyclerView.f4279r.add(aVar);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [t6.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m48380z(android.widget.ImageView r1, p924xt.C20618y r2, int r3) {
        /*
            java.util.List<com.moovit.image.model.Image> r0 = r2.f52122b
            if (r0 == 0) goto L_0x0015
            if (r3 < 0) goto L_0x0015
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x0015
            java.util.List<com.moovit.image.model.Image> r0 = r2.f52122b
            java.lang.Object r3 = r0.get(r3)
            com.moovit.image.model.Image r3 = (com.moovit.image.model.Image) r3
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 == 0) goto L_0x0038
            r0 = 0
            r1.setVisibility(r0)
            r10.e r0 = p583jk.C17884p.m44354Y(r1)
            r10.d r0 = r0.mo51642v(r3)
            r10.d r3 = r0.mo51628o0(r3)
            b6.h<android.graphics.Bitmap> r2 = r2.f52123c
            if (r2 == 0) goto L_0x0034
            r0 = 1
            t6.a r2 = r3.mo22717H(r2, r0)
            r3 = r2
            r10.d r3 = (r10.C19220d) r3
        L_0x0034:
            r3.mo10850T(r1)
            goto L_0x003d
        L_0x0038:
            r2 = 8
            r1.setVisibility(r2)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p924xt.C20590e.m48380z(android.widget.ImageView, xt.y, int):void");
    }

    /* renamed from: A */
    public abstract TripPlannerLocations mo52792A();

    /* renamed from: B */
    public void mo52793B(TripPlanFlexTimeBanner tripPlanFlexTimeBanner) {
    }

    /* renamed from: C */
    public abstract void mo52794C(C20589d dVar, Itinerary itinerary);

    /* renamed from: D */
    public void mo52795D(C20596g gVar) {
    }

    /* renamed from: E */
    public void mo52796E(TripPlanTodBanner tripPlanTodBanner) {
    }

    /* renamed from: m */
    public final int mo40090m(int i, int i2) {
        int i3;
        C18676l.C18679c n = mo51052n(i);
        C20595f fVar = (C20595f) n.getItem(i2);
        boolean z = true;
        if (fVar.f52088b != null) {
            i3 = 1;
        } else if (fVar.f52090d != null) {
            i3 = 2;
        } else if (fVar.f52091e != null) {
            i3 = 3;
        } else if (fVar.f52089c != null) {
            i3 = 4;
        } else if (fVar.f52092f != null) {
            i3 = 5;
        } else {
            Itinerary itinerary = fVar.f52087a;
            if (itinerary != null) {
                i3 = C20589d.m48370l(itinerary).f52075a;
            } else {
                throw new IllegalStateException("Unknown adapter item: " + fVar);
            }
        }
        if (!(i2 == n.mo40089e() - 1 || (mo40090m(i, i2 + 1) & -32769) == 1)) {
            z = false;
        }
        if (z) {
            return i3 | 32768;
        }
        return i3;
    }

    /* renamed from: p */
    public final int mo23815p(int i) {
        C20596g gVar = (C20596g) mo51052n(i);
        if (gVar.f52093d.f41920i != null) {
            return 6;
        }
        if (C20964s0.m49090h(gVar.f47556c)) {
            return 7;
        }
        return 0;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: r */
    public final boolean mo40091r(int i) {
        int i2 = i & -32769;
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || C20604l.f52118c.get(i2) != null;
    }

    /* renamed from: s */
    public final boolean mo23816s(int i) {
        return i == 0 || i == 6 || i == 7;
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r12v8, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23817t(androidx.recyclerview.widget.RecyclerView.C1119a0 r12, int r13, int r14) {
        /*
            r11 = this;
            xt.e$b r12 = (p924xt.C20590e.C20592b) r12
            o00.l$c r0 = r11.mo51052n(r13)
            xt.g r0 = (p924xt.C20596g) r0
            xt.f r1 = r0.f52094e
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x000f
            goto L_0x001b
        L_0x000f:
            int r1 = r0.mo52801s()
            com.moovit.itinerary.model.ItinerarySection r4 = r0.f52093d
            int r4 = r4.f41917f
            if (r1 <= r4) goto L_0x001b
            r1 = 1
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            if (r1 == 0) goto L_0x0029
            int r1 = r0.mo40089e()
            int r1 = r1 + -1
            if (r14 != r1) goto L_0x0029
            xt.f r1 = r0.f52094e
            goto L_0x002f
        L_0x0029:
            java.lang.Object r1 = r0.get(r14)
            xt.f r1 = (p924xt.C20595f) r1
        L_0x002f:
            android.view.View r4 = r12.itemView
            r5 = 2131364674(0x7f0a0b42, float:1.8349192E38)
            r4.setTag(r5, r0)
            android.view.View r0 = r12.itemView
            r4 = 2131364675(0x7f0a0b43, float:1.8349194E38)
            r0.setTag(r4, r1)
            xt.y r0 = r1.f52088b
            r6 = 3
            r7 = 2
            if (r0 == 0) goto L_0x00a6
            o00.l$c r13 = r11.mo51052n(r13)
            xt.g r13 = (p924xt.C20596g) r13
            android.view.View r14 = r12.itemView
            r14.setTag(r13)
            android.view.View r14 = r12.itemView
            r1 = 2131364347(0x7f0a09fb, float:1.8348528E38)
            android.view.View r14 = r14.findViewById(r1)
            android.widget.TextView r14 = (android.widget.TextView) r14
            android.content.res.Resources r1 = r14.getResources()
            int r4 = r0.f52121a
            java.lang.Object[] r5 = new java.lang.Object[r3]
            int r13 = r13.mo52801s()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r5[r2] = r13
            java.lang.String r13 = r1.getString(r4, r5)
            r14.setText(r13)
            r13 = 2131363140(0x7f0a0544, float:1.834608E38)
            android.view.View r13 = r12.mo39639f(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            m48380z(r13, r0, r2)
            r13 = 2131363141(0x7f0a0545, float:1.8346082E38)
            android.view.View r13 = r12.mo39639f(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            m48380z(r13, r0, r3)
            r13 = 2131363142(0x7f0a0546, float:1.8346084E38)
            android.view.View r13 = r12.mo39639f(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            m48380z(r13, r0, r7)
            r13 = 2131363143(0x7f0a0547, float:1.8346086E38)
            android.view.View r12 = r12.mo39639f(r13)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            m48380z(r12, r0, r6)
            goto L_0x0219
        L_0x00a6:
            com.moovit.itinerary.TripPlanTodBanner r13 = r1.f52090d
            if (r13 == 0) goto L_0x00b3
            android.view.View r12 = r12.itemView
            com.moovit.app.tod.view.TodTripPlanBannerView r12 = (com.moovit.app.tod.view.TodTripPlanBannerView) r12
            r12.set(r13)
            goto L_0x0219
        L_0x00b3:
            com.moovit.itinerary.TripPlanFlexTimeBanner r13 = r1.f52091e
            if (r13 == 0) goto L_0x0112
            android.content.Context r14 = r12.mo39638e()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            int r1 = r13.f41847d
            long r4 = (long) r1
            long r0 = r0.toMillis(r4)
            android.text.SpannableString r4 = new android.text.SpannableString
            java.lang.String r0 = com.moovit.util.time.C7925b.m18019g(r14, r0)
            r4.<init>(r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r1 = 2130968994(0x7f0401a2, float:1.7546657E38)
            int r1 = p977zz.C20941h.m49043f(r1, r14)
            r0.<init>(r1)
            int r1 = r4.length()
            r5 = 33
            r4.setSpan(r0, r2, r1, r5)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r3)
            int r1 = r4.length()
            r4.setSpan(r0, r2, r1, r5)
            com.moovit.tripplanner.TripPlannerTime r13 = r13.f41848e
            long r0 = r13.mo24487b()
            java.lang.String r13 = com.moovit.util.time.C7925b.m18018f(r14, r0, r2)
            android.view.View r12 = r12.itemView
            com.moovit.design.view.list.ListItemView r12 = (com.moovit.design.view.list.ListItemView) r12
            r0 = 2131887427(0x7f120543, float:1.940946E38)
            java.lang.String r14 = r14.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r2] = r4
            r0[r3] = r13
            android.text.SpannedString r13 = p977zz.C20958p0.m49077a(r14, r0)
            r12.setSubtitle((java.lang.CharSequence) r13)
            goto L_0x0219
        L_0x0112:
            com.moovit.itinerary.model.Itinerary r13 = r1.f52087a
            r0 = 2131364676(0x7f0a0b44, float:1.8349196E38)
            if (r13 == 0) goto L_0x0154
            int r1 = r12.getItemViewType()
            r2 = -32769(0xffffffffffff7fff, float:NaN)
            r1 = r1 & r2
            xt.d r1 = p924xt.C20589d.m48369i(r1)
            android.view.View r2 = r12.itemView
            r2.setTag(r0, r1)
            com.moovit.tripplanner.TripPlannerLocations r0 = r11.mo52792A()
            r1.mo52782a(r12, r13, r0)
            e20.e$c r0 = r11.f52078k
            if (r0 == 0) goto L_0x0138
            r1.mo52783c(r12, r13, r0)
        L_0x0138:
            java.util.HashSet r0 = f52076l
            int r2 = r1.f52075a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0219
            java.lang.StringBuilder r14 = r1.mo52790g(r12, r14)
            r1.mo52784m(r12, r13, r14)
            android.view.View r12 = r12.itemView
            r12.setContentDescription(r14)
            goto L_0x0219
        L_0x0154:
            xt.g r13 = r1.f52089c
            r14 = 0
            if (r13 == 0) goto L_0x01ca
            android.view.View r12 = r12.itemView
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            int r1 = r12.getChildCount()
            r11.mo52792A()
            java.util.Iterator r3 = r13.iterator()
        L_0x0168:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x01b3
            java.lang.Object r6 = r3.next()
            xt.f r6 = (p924xt.C20595f) r6
            com.moovit.itinerary.model.Itinerary r7 = r6.f52087a
            if (r7 != 0) goto L_0x0179
            goto L_0x0168
        L_0x0179:
            android.view.View r7 = r12.getChildAt(r2)
            java.lang.Object r8 = r7.getTag()
            xt.e$a r8 = (p924xt.C20590e.C20591a) r8
            if (r8 != 0) goto L_0x018d
            xt.e$a r8 = new xt.e$a
            r8.<init>(r7)
            r7.setTag(r8)
        L_0x018d:
            com.moovit.itinerary.model.Itinerary r9 = r6.f52087a
            xt.d r9 = p924xt.C20589d.m48370l(r9)
            com.moovit.itinerary.model.Itinerary r10 = r6.f52087a
            r9.mo52789b(r8, r10)
            android.view.View r8 = r8.f52079a
            int r8 = r8.getVisibility()
            if (r8 == 0) goto L_0x01a1
            goto L_0x0168
        L_0x01a1:
            r7.setTag(r5, r13)
            r7.setTag(r4, r6)
            r7.setTag(r0, r9)
            w5.a r6 = r11.f52077j
            r7.setOnClickListener(r6)
            int r2 = r2 + 1
            if (r2 < r1) goto L_0x0168
        L_0x01b3:
            r13 = r2
        L_0x01b4:
            if (r13 >= r1) goto L_0x01c5
            android.view.View r0 = r12.getChildAt(r13)
            r0.setOnClickListener(r14)
            r3 = 8
            r0.setVisibility(r3)
            int r13 = r13 + 1
            goto L_0x01b4
        L_0x01c5:
            float r13 = (float) r2
            r12.setWeightSum(r13)
            goto L_0x0219
        L_0x01ca:
            com.moovit.app.ads.AdSource r13 = r1.f52092f
            if (r13 == 0) goto L_0x021a
            android.view.View r0 = r12.itemView
            com.moovit.app.ads.MoovitNativeAdView r0 = (com.moovit.app.ads.MoovitNativeAdView) r0
            android.content.Context r12 = r12.mo39638e()
            boolean r1 = r12 instanceof com.moovit.MoovitActivity
            if (r1 == 0) goto L_0x01de
            r14 = r12
            com.moovit.MoovitActivity r14 = (com.moovit.MoovitActivity) r14
            goto L_0x01ef
        L_0x01de:
            boolean r1 = r12 instanceof p175n.C5768c
            if (r1 == 0) goto L_0x01ef
            n.c r12 = (p175n.C5768c) r12
            android.content.Context r12 = r12.getBaseContext()
            boolean r1 = r12 instanceof com.moovit.MoovitActivity
            if (r1 == 0) goto L_0x01ef
            r14 = r12
            com.moovit.MoovitActivity r14 = (com.moovit.MoovitActivity) r14
        L_0x01ef:
            if (r14 == 0) goto L_0x0219
            com.moovit.app.ads.AdSource r12 = r0.f37489h
            if (r12 != r13) goto L_0x01f6
            goto L_0x0219
        L_0x01f6:
            r0.f37489h = r13
            com.moovit.app.ads.MobileAdsManager r12 = com.moovit.app.ads.MobileAdsManager.m37073h()
            java.util.Set r1 = java.util.Collections.singleton(r13)
            java.lang.String r4 = "get_ad_ref"
            com.google.android.gms.tasks.Task r1 = r12.mo44717r(r4, r1, r2)
            java.util.concurrent.ExecutorService r2 = com.moovit.MoovitExecutors.COMPUTATION
            c0.d r4 = new c0.d
            r4.<init>(r6, r12, r13)
            com.google.android.gms.tasks.Task r12 = r1.onSuccessTask(r2, r4)
            com.moovit.app.ads.r r13 = new com.moovit.app.ads.r
            r13.<init>(r3, r0, r14)
            r12.addOnCompleteListener((android.app.Activity) r14, r13)
        L_0x0219:
            return
        L_0x021a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Unknown adapter item: "
            r13.append(r14)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p924xt.C20590e.mo23817t(androidx.recyclerview.widget.RecyclerView$a0, int, int):void");
    }

    /* renamed from: v */
    public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
        Image image;
        C20592b bVar = (C20592b) a0Var;
        int p = mo23815p(i);
        C20596g gVar = (C20596g) mo51052n(i);
        if (p != 7) {
            if (p == 6) {
                ItinerarySectionBranding itinerarySectionBranding = gVar.f52093d.f41920i;
                if (itinerarySectionBranding != null) {
                    Context e = bVar.mo39638e();
                    bVar.itemView.setBackgroundColor(itinerarySectionBranding.f41922b.f41007b);
                    ImagePack imagePack = itinerarySectionBranding.f41924d;
                    ImageView imageView = (ImageView) bVar.mo39639f(R.id.backdropImage);
                    Spanned spanned = null;
                    if (imagePack == null) {
                        image = null;
                    } else if (!C15780a.m40268a(e)) {
                        image = imagePack.f41809c;
                    } else {
                        image = imagePack.f41808b;
                    }
                    C13744a.m34300b(imageView, image);
                    C13744a.m34300b((ImageView) bVar.mo39639f(R.id.logo), itinerarySectionBranding.f41925e);
                    Color color = itinerarySectionBranding.f41923c;
                    if (!C20964s0.m49090h(gVar.f47556c)) {
                        spanned = C6133b.m14694a(gVar.f47556c.toString());
                    }
                    TextView textView = (TextView) bVar.mo39639f(R.id.name);
                    textView.setTextColor(color.f41007b);
                    textView.setText(spanned);
                    return;
                }
                return;
            }
            ListItemView listItemView = (ListItemView) bVar.itemView;
            listItemView.setTitle(gVar.f47556c);
            listItemView.setContentDescription(gVar.f47556c);
        }
    }

    /* renamed from: w */
    public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        int i2 = i & -32769;
        if (i2 != 1) {
            if (i2 == 2) {
                view2 = new TodTripPlanBannerView(viewGroup.getContext(), (AttributeSet) null);
                view2.setLayoutParams(UiUtils.m40254m());
                view2.setOnClickListener(this.f52077j);
            } else if (i2 == 3) {
                view = C13715c.m34239e(viewGroup, R.layout.suggested_routes_flex_time_banner_view, viewGroup, false);
                view.setOnClickListener(this.f52077j);
            } else if (i2 == 4) {
                view = C13715c.m34239e(viewGroup, R.layout.suggested_routes_horizontal_section_view, viewGroup, false);
            } else if (i2 != 5) {
                view = C20589d.m48369i(i2).mo52786h(viewGroup);
                view.setOnClickListener(this.f52077j);
            } else {
                view2 = new MoovitNativeAdView(viewGroup.getContext(), (AttributeSet) null);
                view2.setLayoutParams(UiUtils.m40254m());
            }
            view = view2;
        } else {
            view = C13715c.m34239e(viewGroup, R.layout.suggested_routes_show_more_view, viewGroup, false);
            view.setOnClickListener(this.f52077j);
        }
        return new C20592b(view);
    }

    /* renamed from: x */
    public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
        View view;
        if (i == 0) {
            view = C13715c.m34239e(viewGroup, R.layout.suggested_routes_section_header, viewGroup, false);
        } else if (i == 6) {
            view = C13715c.m34239e(viewGroup, R.layout.suggested_routes_section_header_branded, viewGroup, false);
        } else if (i == 7) {
            view = new Space(viewGroup.getContext());
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown section view type: ", i));
        }
        return new C20592b(view);
    }
}
