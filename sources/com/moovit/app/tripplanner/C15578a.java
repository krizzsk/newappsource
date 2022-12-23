package com.moovit.app.tripplanner;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.BounceInterpolator;
import android.widget.TextView;
import ce0.C21100e;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.C16202a;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerLocations;
import com.tranzmate.R;
import h60.C17327j1;
import j20.C17706c;
import j20.C17707d;
import j20.C17708e;
import p398bv.C13695d;
import p453dw.C16740o;
import p808sx.C19568d;
import p824tp.C19728f;
import p858uz.C20061g;
import p977zz.C20934d0;
import p977zz.C20964s0;

/* renamed from: com.moovit.app.tripplanner.a */
public abstract class C15578a extends C15682c<MoovitActivity> {

    /* renamed from: w */
    public static final /* synthetic */ int f40521w = 0;

    /* renamed from: n */
    public TextView f40522n;

    /* renamed from: o */
    public TextView f40523o;

    /* renamed from: p */
    public View f40524p;

    /* renamed from: q */
    public View f40525q;

    /* renamed from: r */
    public View f40526r;

    /* renamed from: s */
    public View f40527s;

    /* renamed from: t */
    public LocationDescriptor f40528t = null;

    /* renamed from: u */
    public LocationDescriptor f40529u = null;

    /* renamed from: v */
    public boolean f40530v = false;

    /* renamed from: com.moovit.app.tripplanner.a$a */
    public class C15579a implements OnCompleteListener<C17707d> {

        /* renamed from: b */
        public final LocationDescriptor f40531b;

        /* renamed from: c */
        public final boolean f40532c;

        public C15579a(LocationDescriptor locationDescriptor, boolean z) {
            C21100e.m49373x(locationDescriptor, "locationDescriptor");
            this.f40531b = locationDescriptor;
            this.f40532c = z;
        }

        /* renamed from: a */
        public final void mo46540a(LocationDescriptor locationDescriptor) {
            if (this.f40532c) {
                C15578a.this.mo46538y2(locationDescriptor);
            } else {
                C15578a.this.mo46537x2(locationDescriptor);
            }
        }

        public final void onComplete(Task<C17707d> task) {
            if (C15578a.this.getView() != null) {
                if (!task.isSuccessful() || task.getResult() == null) {
                    task.getException();
                    if (this.f40531b.mo24310d() == null) {
                        mo46540a((LocationDescriptor) null);
                    } else if (C20964s0.m49090h(this.f40531b.mo24313f())) {
                        this.f40531b.f23651f = C15578a.this.getString(R.string.map_tapped_location);
                        mo46540a(this.f40531b);
                    }
                } else {
                    C17707d result = task.getResult();
                    int i = result.f45452c;
                    if (i != 1) {
                        if (i == 2) {
                            LocationDescriptor locationDescriptor = result.f45454e;
                            if (locationDescriptor == null) {
                                locationDescriptor = result.f45450a;
                                locationDescriptor.f23651f = C15578a.this.getString(R.string.map_tapped_location);
                            } else {
                                LatLonE6 latLonE6 = result.f45450a.f23653h;
                                if (latLonE6 != null) {
                                    locationDescriptor.mo24317n(latLonE6);
                                }
                            }
                            mo46540a(locationDescriptor);
                        }
                    } else if (result.f45454e != null || result.f45450a.mo24310d() == null) {
                        mo46540a(result.f45454e);
                    }
                }
            }
        }
    }

    /* renamed from: com.moovit.app.tripplanner.a$b */
    public interface C15580b {
        /* renamed from: D1 */
        void mo44858D1(TripPlannerLocations tripPlannerLocations);
    }

    public C15578a() {
        super(MoovitActivity.class);
    }

    /* renamed from: A2 */
    public final void mo46530A2() {
        TextView textView = this.f40522n;
        if (textView != null) {
            LocationDescriptor locationDescriptor = this.f40528t;
            if (locationDescriptor != null) {
                textView.setText(locationDescriptor.mo24313f());
            } else {
                textView.setText(mo40562q2());
            }
            TextView textView2 = this.f40522n;
            textView2.setContentDescription(getString(R.string.voice_over_tripplan_from, textView2.getText()));
        }
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(getActivity()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: a2 */
    public final void mo45459a2() {
    }

    /* renamed from: m2 */
    public final void mo46531m2() {
        boolean z;
        AnimatorSet animatorSet = new AnimatorSet();
        boolean z2 = true;
        if (this.f40528t == null) {
            animatorSet.play(ObjectAnimator.ofFloat(this.f40522n, View.TRANSLATION_X, new float[]{BitmapDescriptorFactory.HUE_RED, 100.0f, BitmapDescriptorFactory.HUE_RED}));
            z = true;
        } else {
            z = false;
        }
        if (this.f40529u == null) {
            animatorSet.play(ObjectAnimator.ofFloat(this.f40523o, View.TRANSLATION_X, new float[]{BitmapDescriptorFactory.HUE_RED, 100.0f, BitmapDescriptorFactory.HUE_RED}));
        } else {
            z2 = z;
        }
        if (z2) {
            animatorSet.setInterpolator(new BounceInterpolator());
            animatorSet.start();
        }
    }

    /* renamed from: n2 */
    public abstract Intent mo40559n2(Context context);

    /* renamed from: o2 */
    public abstract Intent mo40560o2(Context context);

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 7788) {
            if (i2 == -1 && intent != null) {
                mo46538y2(mo40563r2(intent));
                this.f40530v = true;
            }
        } else if (i != 1122) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            mo46537x2(mo40563r2(intent));
            this.f40530v = true;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.trip_planner_locations_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.origin_container);
        this.f40524p = findViewById;
        this.f40522n = (TextView) findViewById.findViewById(R.id.origin);
        this.f40524p.setOnClickListener(new C16740o(this, 4));
        View findViewById2 = inflate.findViewById(R.id.destination_container);
        this.f40525q = findViewById2;
        this.f40523o = (TextView) findViewById2.findViewById(R.id.destination);
        this.f40525q.setOnClickListener(new C4052r(this, 29));
        View findViewById3 = inflate.findViewById(R.id.switch_directions);
        this.f40527s = findViewById3;
        findViewById3.setOnClickListener(new C19568d(this, 0));
        this.f40526r = inflate.findViewById(R.id.spacer);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        if (this.f40530v) {
            this.f40530v = false;
            mo46535v2();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("extra_location_origin_params_request", this.f40528t);
        bundle.putParcelable("extra_location_destination_param_request", this.f40529u);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r2, android.os.Bundle r3) {
        /*
            r1 = this;
            super.onViewCreated(r2, r3)
            com.moovit.transit.LocationDescriptor r2 = r1.f40528t
            com.moovit.transit.LocationDescriptor r0 = r1.f40529u
            if (r3 == 0) goto L_0x000a
            goto L_0x000e
        L_0x000a:
            android.os.Bundle r3 = r1.getArguments()
        L_0x000e:
            if (r3 == 0) goto L_0x0025
            if (r2 != 0) goto L_0x001a
            java.lang.String r2 = "extra_location_origin_params_request"
            android.os.Parcelable r2 = r3.getParcelable(r2)
            com.moovit.transit.LocationDescriptor r2 = (com.moovit.transit.LocationDescriptor) r2
        L_0x001a:
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "extra_location_destination_param_request"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r0 = r3
            com.moovit.transit.LocationDescriptor r0 = (com.moovit.transit.LocationDescriptor) r0
        L_0x0025:
            if (r2 != 0) goto L_0x002f
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            com.moovit.transit.LocationDescriptor r2 = com.moovit.transit.LocationDescriptor.m17772m(r2)
        L_0x002f:
            r1.mo46538y2(r2)
            r1.mo46537x2(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tripplanner.C15578a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* renamed from: p2 */
    public abstract int mo40561p2();

    /* renamed from: q2 */
    public abstract int mo40562q2();

    /* renamed from: r2 */
    public abstract LocationDescriptor mo40563r2(Intent intent);

    /* renamed from: s2 */
    public final TripPlannerLocations mo46532s2() {
        if (mo46534u2()) {
            this.f40528t.mo24317n(LatLonE6.m40177j(mo46780O1()));
        }
        if (mo46533t2()) {
            this.f40529u.mo24317n(LatLonE6.m40177j(mo46780O1()));
        }
        return new TripPlannerLocations(this.f40528t, this.f40529u);
    }

    /* renamed from: t2 */
    public final boolean mo46533t2() {
        LocationDescriptor locationDescriptor = this.f40529u;
        if (locationDescriptor == null || !LocationDescriptor.LocationType.CURRENT.equals(locationDescriptor.f23647b)) {
            return false;
        }
        return true;
    }

    /* renamed from: u2 */
    public final boolean mo46534u2() {
        LocationDescriptor locationDescriptor = this.f40528t;
        if (locationDescriptor == null || !LocationDescriptor.LocationType.CURRENT.equals(locationDescriptor.f23647b)) {
            return false;
        }
        return true;
    }

    /* renamed from: v2 */
    public final void mo46535v2() {
        if (this.f40824e) {
            mo46786U1(C15580b.class, new C17327j1(this, 18));
        }
    }

    /* renamed from: w2 */
    public final void mo46536w2(LocationDescriptor locationDescriptor, boolean z) {
        if (locationDescriptor != null) {
            Tasks.call(MoovitExecutors.f37327IO, new C17708e(getContext(), C19728f.m47195a(getContext()), locationDescriptor, true)).continueWith(MoovitExecutors.COMPUTATION, new C17706c()).addOnCompleteListener((Activity) getActivity(), new C15579a(locationDescriptor, z));
        }
    }

    /* renamed from: x2 */
    public final void mo46537x2(LocationDescriptor locationDescriptor) {
        this.f40529u = locationDescriptor;
        if (mo46533t2()) {
            boolean z = true;
            if (!(!(this instanceof C13695d)) || !C20934d0.m49032c(this.f40822c) || mo46780O1() == null) {
                z = false;
            }
            if (!z) {
                this.f40529u = null;
            }
        }
        mo46539z2();
        mo46536w2(locationDescriptor, false);
        mo46535v2();
    }

    /* renamed from: y2 */
    public final void mo46538y2(LocationDescriptor locationDescriptor) {
        boolean z;
        this.f40528t = locationDescriptor;
        if (mo46534u2()) {
            if (!(!(this instanceof C13695d)) || !C20934d0.m49032c(this.f40822c) || mo46780O1() == null) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                this.f40528t = null;
            }
        }
        mo46530A2();
        mo46536w2(locationDescriptor, true);
        mo46535v2();
    }

    /* renamed from: z2 */
    public final void mo46539z2() {
        TextView textView = this.f40523o;
        if (textView != null) {
            LocationDescriptor locationDescriptor = this.f40529u;
            if (locationDescriptor != null) {
                textView.setText(locationDescriptor.mo24313f());
            } else {
                textView.setText(mo40561p2());
            }
            TextView textView2 = this.f40523o;
            textView2.setContentDescription(getString(R.string.voice_over_tripplan_to, textView2.getText()));
        }
    }
}
