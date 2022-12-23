package p453dw;

import a00.C13382a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import b00.C13556a;
import c70.C13756i;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.ImageProviderFragment;
import com.moovit.image.entity.upload.EntityImageUploadWorker;
import com.moovit.location.C16202a;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.stopDetails.MVStopImageRequest;
import ga0.C12704f;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import k00.C17988b;
import p025b6.C1488c;
import p025b6.C1495h;
import p146k6.C5502h;
import p146k6.C5515t;
import p169m6.C5710d;
import p241s0.C6302b;
import p241s0.C6307g;
import p310x5.C7156a;
import p316y.C7219n;
import p453dw.C16741p;
import p477ew.C16885a;
import p543hq.C17474b;
import p583jk.C17884p;
import p757qu.C19184g;
import p784rx.C19377c;
import p874vr.C20199a;
import p977zz.C20964s0;
import q00.C19047a;
import r10.C19220d;

/* renamed from: dw.n */
public class C16738n extends ImageProviderFragment<MoovitAppActivity> implements C16741p.C16742a, C12704f.C12706b {

    /* renamed from: t */
    public static final /* synthetic */ int f43588t = 0;

    /* renamed from: p */
    public C13756i f43589p;

    /* renamed from: q */
    public C6302b f43590q = new C6302b();

    /* renamed from: r */
    public IdentityHashMap<ImageView, C16739a> f43591r = new IdentityHashMap<>();

    /* renamed from: s */
    public boolean f43592s;

    /* renamed from: dw.n$a */
    public static class C16739a {

        /* renamed from: a */
        public final ServerId f43593a;

        /* renamed from: b */
        public ArrayList f43594b;

        /* renamed from: c */
        public String f43595c;

        /* renamed from: d */
        public C13556a f43596d;

        /* renamed from: e */
        public ArrayList f43597e;

        public C16739a(ServerId serverId) {
            C21100e.m49373x(serverId, "stopId");
            this.f43593a = serverId;
        }
    }

    public C16738n() {
        super(MoovitAppActivity.class);
    }

    /* renamed from: w2 */
    public static C16738n m42285w2(FragmentManager fragmentManager) {
        C16738n nVar = (C16738n) fragmentManager.mo3923A("stop_images_manager");
        if (nVar != null) {
            return nVar;
        }
        C16738n nVar2 = new C16738n();
        C0909a aVar = new C0909a(fragmentManager);
        aVar.mo4041e(0, nVar2, "stop_images_manager", 1);
        aVar.mo4045k();
        return nVar2;
    }

    /* renamed from: K */
    public final void mo39497K() {
        mo46797j2(new C17474b(AnalyticsEventKey.PHOTO_SENT));
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: O0 */
    public final void mo49421O0(ServerId serverId) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("takePhotoStopId", serverId);
        mo48181u2(false, false, bundle);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f43589p = C13756i.m34349a(context.getApplicationContext());
    }

    public final void onDestroy() {
        super.onDestroy();
        Iterator it = ((C6307g.C6312e) this.f43590q.values()).iterator();
        while (true) {
            C6307g.C6308a aVar = (C6307g.C6308a) it;
            if (aVar.hasNext()) {
                C16739a aVar2 = (C16739a) aVar.next();
                C13556a aVar3 = aVar2.f43596d;
                if (aVar3 != null) {
                    aVar3.cancel(true);
                    return;
                }
                aVar2.f43597e = null;
            } else {
                this.f43590q.clear();
                this.f43591r.clear();
                return;
            }
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f43592s) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            if (childFragmentManager.mo3923A("stop_image_thank_you_tag") == null) {
                new C16736l().show(childFragmentManager, "stop_image_thank_you_tag");
            }
            this.f43592s = false;
        }
    }

    /* renamed from: s1 */
    public final void mo47928s1(File file, boolean z, Bundle bundle) {
        ServerId serverId = null;
        this.f41702n = null;
        Context context = getContext();
        if (context != null) {
            if (bundle != null) {
                serverId = (ServerId) bundle.getParcelable("takePhotoStopId");
            }
            if (serverId != null) {
                EntityImageUploadWorker.m40807a(context, EntityImageUploadWorker.EntityImageType.STOP, file.getPath(), serverId.mo19751c(), LatLonE6.m40177j(C16202a.get(context).getPermissionAwareHighAccuracyFrequentUpdates().mo50014i()));
                if (isResumed()) {
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    if (childFragmentManager.mo3923A("stop_image_thank_you_tag") == null) {
                        new C16736l().show(childFragmentManager, "stop_image_thank_you_tag");
                        return;
                    }
                    return;
                }
                this.f43592s = true;
            }
        }
    }

    /* renamed from: v2 */
    public final void mo49422v2(ServerId serverId, ImageView imageView) {
        ArrayList arrayList;
        if (this.f43589p != null) {
            C16739a aVar = this.f43591r.get(imageView);
            if (aVar == null) {
                mo49423x2(serverId, imageView);
                imageView.setOnClickListener((View.OnClickListener) null);
            } else if (!serverId.equals(aVar.f43593a)) {
                ArrayList arrayList2 = aVar.f43597e;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (imageView.equals(((WeakReference) it.next()).get())) {
                                it.remove();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (aVar.f43596d == null || ((arrayList = aVar.f43597e) != null && !arrayList.isEmpty())) {
                    imageView.setBackgroundResource(0);
                    imageView.setImageResource(0);
                    C17884p.m44354Y(imageView).mo10872n(imageView);
                } else {
                    aVar.f43596d.cancel(false);
                }
                mo49423x2(serverId, imageView);
            } else if (aVar.f43596d == null) {
                mo49425z2(aVar, imageView);
            }
        }
    }

    /* renamed from: x2 */
    public final void mo49423x2(ServerId serverId, ImageView imageView) {
        C16739a aVar = (C16739a) this.f43590q.getOrDefault(serverId, null);
        if (aVar == null) {
            aVar = new C16739a(serverId);
            this.f43590q.put(serverId, aVar);
            aVar.f43597e = new ArrayList();
        }
        aVar.f43597e.add(new WeakReference(imageView));
        this.f43591r.put(imageView, aVar);
        if (aVar.f43596d == null) {
            C16885a aVar2 = new C16885a(serverId, mo46783R1());
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            aVar.f43596d = this.f43589p.mo40684g(C16885a.class.getSimpleName() + "_" + ((MVStopImageRequest) aVar2.f33922v).stopId, aVar2, L1, new C16737m(this, serverId));
        }
    }

    /* renamed from: y2 */
    public final void mo49424y2(Context context, ServerId serverId) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "add_photo_map_icon_clicked");
        aVar.mo49937e(AnalyticsAttributeKey.STOP_ID, serverId);
        mo46797j2(aVar.mo49933a());
        if (!C19377c.m46656a(context, TrackingEvent.EDIT_STOP_TAKE_PHOTO_POP_UP_DISPLAYED, new C7219n(13, this, serverId))) {
            mo49421O0(serverId);
        }
    }

    /* renamed from: z2 */
    public final void mo49425z2(C16739a aVar, ImageView imageView) {
        imageView.setBackgroundResource(R.drawable.selectable_bg_rounded_corners_transparent);
        imageView.setTag(R.id.stop_id_key, aVar.f43593a);
        if (!C20964s0.m49090h(aVar.f43595c)) {
            imageView.setVisibility(0);
            C13382a.m33674j(imageView, getString(R.string.voice_over_station_img), getString(R.string.voice_over_station_img_hint));
            C19220d<Drawable> w = C17884p.m44354Y(imageView).mo10880p(aVar.f43595c);
            C1495h[] hVarArr = {new C5502h(), new C5515t(imageView.getResources().getDimensionPixelSize(R.dimen.corner_radius))};
            w.getClass();
            ((C19220d) w.mo22717H(new C1488c(hVarArr), true)).mo10866g0(C5710d.m14021g()).mo10864f0(0.1f).mo10850T(imageView);
            imageView.setOnClickListener(new C19184g(2, this, imageView, aVar));
        } else if (((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20199a.f51264Z0)).booleanValue()) {
            imageView.setImageDrawable(C17988b.m44611b(R.drawable.ic_camera_add_44_primary, imageView.getContext()));
            imageView.setVisibility(0);
            C13382a.m33674j(imageView, getString(R.string.voice_over_station_img_unavailable), getString(R.string.voiceover_camera_station_image_hint));
            imageView.setOnClickListener(new C7156a(4, this, imageView));
        } else {
            imageView.setVisibility(4);
        }
    }
}
