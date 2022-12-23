package com.moovit.micromobility.integration;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import b40.C1476d;
import b40.C1477e;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.commons.utils.UiUtils;
import com.moovit.micromobility.MicroMobilityIntegrationFlow;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.network.model.ServerId;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k00.C17988b;
import l30.C5566a0;
import l30.C5567b;
import l30.C5570c0;
import l30.C5575g;
import l30.C5577i;
import l30.C5596y;
import l30.C5597z;
import p041ca.C1831q;
import p130j2.C5367a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p451du.C16723t;
import p572iw.C17662e;
import p688nu.C18630b;
import r30.C6240a;

public class MicroMobilityIntegrationView extends LinearLayout {

    /* renamed from: g */
    public static final /* synthetic */ int f14885g = 0;

    /* renamed from: b */
    public final C4148a f14886b;

    /* renamed from: c */
    public final Button f14887c;

    /* renamed from: d */
    public final Button f14888d;

    /* renamed from: e */
    public MicroMobilityIntegrationItem f14889e;

    /* renamed from: f */
    public C4150c f14890f;

    /* renamed from: com.moovit.micromobility.integration.MicroMobilityIntegrationView$a */
    public class C4148a extends BroadcastReceiver {
        public C4148a() {
        }

        public final void onReceive(Context context, Intent intent) {
            MicroMobilityIntegrationView microMobilityIntegrationView = MicroMobilityIntegrationView.this;
            MicroMobilityIntegrationItem microMobilityIntegrationItem = microMobilityIntegrationView.f14889e;
            if (microMobilityIntegrationItem != null) {
                microMobilityIntegrationView.mo19486c(microMobilityIntegrationItem);
            }
        }
    }

    /* renamed from: com.moovit.micromobility.integration.MicroMobilityIntegrationView$b */
    public static /* synthetic */ class C4149b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14892a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.micromobility.MicroMobilityIntegrationFlow[] r0 = com.moovit.micromobility.MicroMobilityIntegrationFlow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14892a = r0
                com.moovit.micromobility.MicroMobilityIntegrationFlow r1 = com.moovit.micromobility.MicroMobilityIntegrationFlow.DEEP_LINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14892a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.micromobility.MicroMobilityIntegrationFlow r1 = com.moovit.micromobility.MicroMobilityIntegrationFlow.RESERVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14892a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.micromobility.MicroMobilityIntegrationFlow r1 = com.moovit.micromobility.MicroMobilityIntegrationFlow.UNLOCK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.micromobility.integration.MicroMobilityIntegrationView.C4149b.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.micromobility.integration.MicroMobilityIntegrationView$c */
    public interface C4150c {
        /* renamed from: W0 */
        void mo19494W0(ServerId serverId);

        /* renamed from: m */
        void mo19495m(MicroMobilityIntegrationItem microMobilityIntegrationItem, MicroMobilityIntegrationFlow microMobilityIntegrationFlow);
    }

    public MicroMobilityIntegrationView() {
        throw null;
    }

    public MicroMobilityIntegrationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public static void m11166b(MicroMobilityIntegrationView microMobilityIntegrationView, MicroMobilityIntegrationItem microMobilityIntegrationItem, MicroMobilityRide microMobilityRide) {
        if (microMobilityRide != null) {
            microMobilityIntegrationView.getClass();
            microMobilityIntegrationView.setupViewRideButton(microMobilityRide.f14986d);
            return;
        }
        microMobilityIntegrationView.setupIntegrationButtons(microMobilityIntegrationItem);
    }

    /* access modifiers changed from: private */
    public void setupIntegrationButtons(MicroMobilityIntegrationItem microMobilityIntegrationItem) {
        MicroMobilityIntegrationFlow microMobilityIntegrationFlow;
        int i;
        if (microMobilityIntegrationItem == null) {
            setVisibility(8);
            return;
        }
        List<MicroMobilityIntegrationFlow> list = microMobilityIntegrationItem.f14814d;
        int size = list.size();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Button button = (Button) getChildAt(i2);
            if (i2 < size) {
                microMobilityIntegrationFlow = list.get(i2);
            } else {
                microMobilityIntegrationFlow = null;
            }
            if (microMobilityIntegrationFlow == null) {
                button.setVisibility(8);
            } else {
                button.setTag(C5597z.view_tag_param1, microMobilityIntegrationItem);
                button.setTag(C5597z.view_tag_param2, microMobilityIntegrationFlow);
                button.setOnClickListener(new C17662e(this, 6));
                int i3 = C4149b.f14892a[microMobilityIntegrationFlow.ordinal()];
                if (i3 == 1) {
                    AppDeepLink appDeepLink = microMobilityIntegrationItem.f14815e;
                    if (appDeepLink != null) {
                        if (getContext().getPackageName().equals(appDeepLink.f40997b)) {
                            i = C5570c0.popup_dockless_app_link_button;
                        } else {
                            i = C5570c0.popup_dockless_open_app_button;
                        }
                        button.setText(i);
                        button.setVisibility(0);
                    } else {
                        button.setVisibility(8);
                    }
                } else if (i3 == 2) {
                    button.setText(C5570c0.action_reserve);
                    button.setVisibility(0);
                } else if (i3 == 3) {
                    button.setText(C5570c0.action_unlock);
                    button.setVisibility(0);
                }
            }
        }
        UiUtils.m40263v(this);
    }

    private void setupViewRideButton(ServerId serverId) {
        this.f14887c.setText(C5570c0.micro_mobility_view_ride_button);
        this.f14887c.setOnClickListener(new C16723t(5, this, serverId));
        this.f14887c.setVisibility(0);
        this.f14888d.setVisibility(8);
        setVisibility(0);
    }

    /* renamed from: c */
    public final void mo19486c(MicroMobilityIntegrationItem microMobilityIntegrationItem) {
        C5577i a = C5577i.m13786a();
        String str = microMobilityIntegrationItem.f14812b;
        String str2 = microMobilityIntegrationItem.f14813c;
        Set<MicroMobilityRide.Status> set = C1476d.f5360c;
        Task call = Tasks.call(C5577i.f18276e, new C1477e(a.f18277a, a.f18278b));
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Task continueWithTask = call.addOnFailureListener((Executor) executorService, (OnFailureListener) new C5575g(0)).onSuccessTask(executorService, new C1831q(1, str, str2, set)).continueWithTask(executorService, new C5567b(a, str, str2, set));
        Executor executor = MoovitExecutors.MAIN_THREAD;
        continueWithTask.addOnSuccessListener(executor, new C18630b(2, this, microMobilityIntegrationItem)).addOnFailureListener(executor, (OnFailureListener) new C6240a(this, microMobilityIntegrationItem));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        C4148a aVar = this.f14886b;
        C5577i iVar = C5577i.f18275d;
        C5367a.m13473a(context).mo21146b(aVar, new IntentFilter("com.moovit.micromobility.action.updated"));
        MicroMobilityIntegrationItem microMobilityIntegrationItem = this.f14889e;
        if (microMobilityIntegrationItem != null) {
            mo19486c(microMobilityIntegrationItem);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Context context = getContext();
        C4148a aVar = this.f14886b;
        C5577i iVar = C5577i.f18275d;
        C5367a.m13473a(context).mo21148d(aVar);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superState"));
        MicroMobilityIntegrationItem microMobilityIntegrationItem = (MicroMobilityIntegrationItem) bundle.getParcelable("integrationItem");
        if (microMobilityIntegrationItem != null) {
            setIntegrationItem(microMobilityIntegrationItem);
        }
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putParcelable("integrationItem", this.f14889e);
        return bundle;
    }

    public void setIntegrationItem(MicroMobilityIntegrationItem microMobilityIntegrationItem) {
        C21100e.m49369v(1);
        this.f14889e = microMobilityIntegrationItem;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6340g.m15075b(this)) {
            mo19486c(microMobilityIntegrationItem);
        }
    }

    public void setListener(C4150c cVar) {
        this.f14890f = cVar;
    }

    public MicroMobilityIntegrationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14886b = new C4148a();
        this.f14889e = null;
        this.f14890f = null;
        setOrientation(0);
        setDividerDrawable(C17988b.m44611b(C5596y.divider_vertical_full_8_transparent, context));
        setShowDividers(2);
        LayoutInflater.from(context).inflate(C5566a0.micro_mobility_integration_view, this);
        this.f14887c = (Button) findViewById(C5597z.action_one);
        this.f14888d = (Button) findViewById(C5597z.action_two);
    }
}
