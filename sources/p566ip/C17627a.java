package p566ip;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1044w;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.masabi.justride.sdk.exception.MissingArgumentException;
import com.masabi.justride.sdk.exception.MissingSDKException;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.jobs.barcode.C14654a;
import com.masabi.justride.sdk.p415ui.configuration.screens.ticket.BarcodeFormat;
import com.masabi.justride.sdk.p415ui.features.universalticket.components.C14670b;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;
import p090g1.C4732a;
import p129j1.C5348a;
import p389bl.C13641g;
import p565io.C17624a;
import p583jk.C17875h;
import p605ki.C18047b;
import p605ki.C18058l;
import p605ki.C18061o;
import p605ki.C18066t;
import p611ko.C18110b;
import p701oj.C18767k;
import p730po.C18937a;
import p752qn.C19145c;
import p752qn.C19150h;
import p871vo.C20193i;
import p891wk.C20364s;
import p893wm.C20376c;
import p916xl.C20536b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lip/a;", "Lio/a;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: ip.a */
public final class C17627a extends C17624a {

    /* renamed from: c */
    public C18767k f45313c;

    /* renamed from: d */
    public C17633d f45314d;

    /* renamed from: e */
    public final C17630c f45315e = new C17630c(this);

    /* renamed from: f */
    public C18110b f45316f;

    /* renamed from: g */
    public final C14670b f45317g = new C14670b(2000, new C17629b(this));

    /* renamed from: ip.a$a */
    public static final class C17628a implements Animation.AnimationListener {

        /* renamed from: b */
        public final /* synthetic */ ImageView f45318b;

        public C17628a(ImageView imageView) {
            this.f45318b = imageView;
        }

        public final void onAnimationEnd(Animation animation) {
            C24362h.m61211f(animation, "animation");
            this.f45318b.setVisibility(8);
        }

        public final void onAnimationRepeat(Animation animation) {
            C24362h.m61211f(animation, "animation");
        }

        public final void onAnimationStart(Animation animation) {
            C24362h.m61211f(animation, "animation");
        }
    }

    /* renamed from: ip.a$b */
    public static final class C17629b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C17627a f45319b;

        public C17629b(C17627a aVar) {
            this.f45319b = aVar;
        }

        public final void run() {
            C17627a.m43771J1(this.f45319b);
            this.f45319b.mo50085N1();
        }
    }

    /* renamed from: ip.a$c */
    public static final class C17630c<T> implements C1044w<C20364s> {

        /* renamed from: a */
        public final /* synthetic */ C17627a f45320a;

        public C17630c(C17627a aVar) {
            this.f45320a = aVar;
        }

        public final void onChanged(Object obj) {
            C17633d dVar;
            boolean z;
            C20364s sVar = (C20364s) obj;
            C17627a aVar = this.f45320a;
            C24362h.m61210e(sVar, "it");
            C20536b bVar = this.f45320a.f45307b.f46181k;
            C24362h.m61210e(bVar, "justrideSDK.errorLogger");
            C14654a aVar2 = sVar.f51625c;
            if (aVar2 != null) {
                TicketDisplayConfiguration ticketDisplayConfiguration = sVar.f51631i;
                C24362h.m61210e(ticketDisplayConfiguration, "ticketDisplayBundle.ticketDisplayConfiguration");
                C19150h hVar = sVar.f51623a;
                C24362h.m61210e(hVar, "ticketDisplayBundle.ticketDetails");
                List<C19145c> list = hVar.f48704G;
                C24362h.m61210e(list, "ticketDisplayBundle.ticketDetails.barcodeSummaries");
                C20376c cVar = sVar.f51632j;
                C24362h.m61210e(cVar, "ticketDisplayBundle.selectedForValidationPredicate");
                String str = sVar.f51634l;
                C24362h.m61210e(str, "ticketDisplayBundle.brandName");
                dVar = new C17633d(aVar2, ticketDisplayConfiguration, list, cVar, str, bVar);
            } else {
                dVar = null;
            }
            aVar.f45314d = dVar;
            C17627a aVar3 = this.f45320a;
            if (aVar3.f45314d == null) {
                C18937a aVar4 = (C18937a) aVar3.getChildFragmentManager().mo3983z(C18061o.barcodeFragmentContainer);
                if (aVar4 != null) {
                    aVar4.mo51457M1((String) null, BarcodeFormat.AZTEC, 3);
                    return;
                }
                return;
            }
            C17627a.m43771J1(aVar3);
            this.f45320a.mo50085N1();
            C17627a aVar5 = this.f45320a;
            C17633d dVar2 = aVar5.f45314d;
            if (dVar2 != null) {
                boolean z2 = true;
                if (dVar2.f45326d.size() < 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C18767k kVar = aVar5.f45313c;
                    C24362h.m61208c(kVar);
                    LinearLayout linearLayout = kVar.f47757a;
                    C24362h.m61210e(linearLayout, "binding.barcodeButtonsContainer");
                    linearLayout.setVisibility(8);
                    return;
                }
                C18767k kVar2 = aVar5.f45313c;
                C24362h.m61208c(kVar2);
                LinearLayout linearLayout2 = kVar2.f47757a;
                C24362h.m61210e(linearLayout2, "binding.barcodeButtonsContainer");
                linearLayout2.setVisibility(0);
                C18767k kVar3 = aVar5.f45313c;
                C24362h.m61208c(kVar3);
                LinearLayout linearLayout3 = kVar3.f47757a;
                C24362h.m61210e(linearLayout3, "binding.barcodeButtonsContainer");
                C18110b bVar2 = aVar5.f45316f;
                if (bVar2 != null) {
                    linearLayout3.setBackground(bVar2.mo50548a(5.0f, dVar2.f45325c.f37088e));
                    C18767k kVar4 = aVar5.f45313c;
                    C24362h.m61208c(kVar4);
                    Button button = kVar4.f47759c;
                    C24362h.m61210e(button, "binding.primaryBarcodeButton");
                    button.setText(dVar2.f45328f);
                    C18767k kVar5 = aVar5.f45313c;
                    C24362h.m61208c(kVar5);
                    Button button2 = kVar5.f47759c;
                    C24362h.m61210e(button2, "binding.primaryBarcodeButton");
                    int i = C18066t.f46222x84a2f732;
                    button2.setContentDescription(aVar5.getString(i, dVar2.f45328f));
                    C18767k kVar6 = aVar5.f45313c;
                    C24362h.m61208c(kVar6);
                    Button button3 = kVar6.f47760d;
                    C24362h.m61210e(button3, "binding.secondaryBarcodeButton");
                    button3.setText(dVar2.mo50093a());
                    C18767k kVar7 = aVar5.f45313c;
                    C24362h.m61208c(kVar7);
                    Button button4 = kVar7.f47760d;
                    C24362h.m61210e(button4, "binding.secondaryBarcodeButton");
                    button4.setContentDescription(aVar5.getString(i, dVar2.mo50093a()));
                    if (dVar2.f45323a != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        C18767k kVar8 = aVar5.f45313c;
                        C24362h.m61208c(kVar8);
                        Button button5 = kVar8.f47759c;
                        C24362h.m61210e(button5, "binding.primaryBarcodeButton");
                        aVar5.mo50084M1(button5);
                        C18767k kVar9 = aVar5.f45313c;
                        C24362h.m61208c(kVar9);
                        Button button6 = kVar9.f47760d;
                        C24362h.m61210e(button6, "binding.secondaryBarcodeButton");
                        button6.setSelected(false);
                        aVar5.mo50086O1(button6, -1, -16777216);
                    } else {
                        C18767k kVar10 = aVar5.f45313c;
                        C24362h.m61208c(kVar10);
                        Button button7 = kVar10.f47760d;
                        C24362h.m61210e(button7, "binding.secondaryBarcodeButton");
                        aVar5.mo50084M1(button7);
                        C18767k kVar11 = aVar5.f45313c;
                        C24362h.m61208c(kVar11);
                        Button button8 = kVar11.f47759c;
                        C24362h.m61210e(button8, "binding.primaryBarcodeButton");
                        button8.setSelected(false);
                        aVar5.mo50086O1(button8, -1, -16777216);
                    }
                    C18767k kVar12 = aVar5.f45313c;
                    C24362h.m61208c(kVar12);
                    kVar12.f47759c.setOnClickListener(new C17631b(aVar5));
                    C18767k kVar13 = aVar5.f45313c;
                    C24362h.m61208c(kVar13);
                    kVar13.f47760d.setOnClickListener(new C17632c(aVar5));
                    return;
                }
                C24362h.m61217l("drawableFactory");
                throw null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b5  */
    /* renamed from: J1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m43771J1(p566ip.C17627a r13) {
        /*
            ip.d r0 = r13.f45314d
            if (r0 == 0) goto L_0x00f1
            com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration r1 = r0.f45325c
            wk.p r1 = r1.f37099p
            java.lang.String r2 = "ticketDisplayConfigurati…orValidationConfiguration"
            mf0.C24362h.m61210e(r1, r2)
            int r1 = r1.f51576a
            wm.c r0 = r0.f45327e
            wk.p r2 = r0.f51676b
            long r3 = r2.f51578c
            boolean r2 = r2.f51577b
            r5 = 0
            r7 = 1
            r8 = 0
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0022
            if (r2 != 0) goto L_0x0022
            goto L_0x0060
        L_0x0022:
            if (r2 == 0) goto L_0x002b
            wk.q r2 = r0.f51677c
            boolean r2 = r2.f51592N
            if (r2 == 0) goto L_0x002b
            goto L_0x0061
        L_0x002b:
            wk.q r2 = r0.f51677c
            wk.a r2 = r2.f51608n
            java.lang.Long r9 = r2.f51509d
            boolean r10 = r2.f51508c
            java.lang.Long r2 = r2.f51511f
            r11 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r11
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 > 0) goto L_0x003e
            goto L_0x0060
        L_0x003e:
            if (r10 == 0) goto L_0x0050
            do.b r0 = r0.f51675a
            long r5 = r0.mo49402a()
            long r9 = r2.longValue()
            long r5 = r5 - r9
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0060
            goto L_0x0061
        L_0x0050:
            do.b r0 = r0.f51675a
            long r5 = r0.mo49402a()
            long r9 = r9.longValue()
            long r5 = r5 - r9
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r7 = 0
        L_0x0061:
            java.lang.String r0 = "binding.selectedForValidationImageView2"
            java.lang.String r2 = "binding.selectedForValidationImageView1"
            if (r7 == 0) goto L_0x00b5
            oj.k r3 = r13.f45313c
            mf0.C24362h.m61208c(r3)
            android.widget.ImageView r3 = r3.f47761e
            mf0.C24362h.m61210e(r3, r2)
            r4 = 2
            r3.setImportantForAccessibility(r4)
            oj.k r3 = r13.f45313c
            mf0.C24362h.m61208c(r3)
            android.widget.ImageView r3 = r3.f47762f
            mf0.C24362h.m61210e(r3, r0)
            r3.setImportantForAccessibility(r4)
            oj.k r3 = r13.f45313c
            mf0.C24362h.m61208c(r3)
            android.widget.ImageView r3 = r3.f47761e
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r3.setColorFilter(r1, r4)
            oj.k r3 = r13.f45313c
            mf0.C24362h.m61208c(r3)
            android.widget.ImageView r3 = r3.f47762f
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r3.setColorFilter(r1, r4)
            oj.k r1 = r13.f45313c
            mf0.C24362h.m61208c(r1)
            android.widget.ImageView r1 = r1.f47761e
            mf0.C24362h.m61210e(r1, r2)
            r1.setVisibility(r8)
            oj.k r13 = r13.f45313c
            mf0.C24362h.m61208c(r13)
            android.widget.ImageView r13 = r13.f47762f
            mf0.C24362h.m61210e(r13, r0)
            r13.setVisibility(r8)
            goto L_0x00f1
        L_0x00b5:
            oj.k r1 = r13.f45313c
            mf0.C24362h.m61208c(r1)
            android.widget.ImageView r1 = r1.f47761e
            mf0.C24362h.m61210e(r1, r2)
            int r1 = r1.getVisibility()
            r3 = 8
            if (r1 == r3) goto L_0x00d4
            oj.k r1 = r13.f45313c
            mf0.C24362h.m61208c(r1)
            android.widget.ImageView r1 = r1.f47761e
            mf0.C24362h.m61210e(r1, r2)
            m43772K1(r1)
        L_0x00d4:
            oj.k r1 = r13.f45313c
            mf0.C24362h.m61208c(r1)
            android.widget.ImageView r1 = r1.f47762f
            mf0.C24362h.m61210e(r1, r0)
            int r1 = r1.getVisibility()
            if (r1 == r3) goto L_0x00f1
            oj.k r13 = r13.f45313c
            mf0.C24362h.m61208c(r13)
            android.widget.ImageView r13 = r13.f47762f
            mf0.C24362h.m61210e(r13, r0)
            m43772K1(r13)
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p566ip.C17627a.m43771J1(ip.a):void");
    }

    /* renamed from: K1 */
    public static void m43772K1(ImageView imageView) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(1000);
        alphaAnimation.setAnimationListener(new C17628a(imageView));
        imageView.startAnimation(alphaAnimation);
    }

    /* renamed from: L1 */
    public final C20193i mo50083L1() {
        Bundle arguments = getArguments();
        FragmentActivity requireActivity = requireActivity();
        C24362h.m61210e(requireActivity, "requireActivity()");
        if (arguments != null) {
            String string = arguments.getString("TICKET_ID_KEY");
            if (string != null) {
                C1019k0 b = new C1026n0(requireActivity).mo4314b(C20193i.class, string);
                C24362h.m61210e(b, "ViewModelProvider(owner)…ketViewModel::class.java)");
                return (C20193i) b;
            }
            throw new MissingArgumentException("Cannot load fragment without ticket id.");
        }
        throw new MissingArgumentException("Cannot load fragment with null bundle.");
    }

    /* renamed from: M1 */
    public final void mo50084M1(Button button) {
        button.setSelected(true);
        mo50086O1(button, C5348a.m13417m(-1, 100), -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: N1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50085N1() {
        /*
            r15 = this;
            ip.d r0 = r15.f45314d
            if (r0 == 0) goto L_0x0131
            oj.k r1 = r15.f45313c
            mf0.C24362h.m61208c(r1)
            android.widget.ImageView r1 = r1.f47761e
            java.lang.String r2 = "binding.selectedForValidationImageView1"
            mf0.C24362h.m61210e(r1, r2)
            int r1 = r1.getVisibility()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.util.List<qn.c> r4 = r0.f45326d
            int r4 = r4.size()
            r5 = 2
            if (r4 >= r5) goto L_0x0026
            r4 = 1
            goto L_0x0027
        L_0x0026:
            r4 = 0
        L_0x0027:
            r6 = 0
            if (r4 == 0) goto L_0x0031
            com.masabi.justride.sdk.jobs.barcode.a r4 = r0.f45324b
            dd.c r1 = r4.mo44345c(r1)
            goto L_0x0078
        L_0x0031:
            java.util.List<qn.c> r4 = r0.f45326d
            int r7 = r0.f45323a
            java.lang.Object r4 = r4.get(r7)
            qn.c r4 = (p752qn.C19145c) r4
            java.lang.String r4 = r4.f48685a
            if (r4 == 0) goto L_0x00f7
            com.masabi.justride.sdk.jobs.barcode.a r5 = r0.f45324b
            wk.q r7 = r5.f37118b
            java.util.List<wk.y> r7 = r7.f51615u
            java.util.Iterator r7 = r7.iterator()
        L_0x0049:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0062
            java.lang.Object r8 = r7.next()
            wk.y r8 = (p891wk.C20370y) r8
            java.lang.String r9 = r8.f51653g
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L_0x0049
            dd.c r1 = r5.mo44344b(r8, r1)
            goto L_0x0078
        L_0x0062:
            r1 = 105(0x69, float:1.47E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r5 = "No Barcode found with name: "
            java.lang.String r4 = p379.C25541a.m63881k(r5, r4)
            ek.d r5 = new ek.d
            r5.<init>(r6, r1, r4)
            dd.c r1 = new dd.c
            r1.<init>((java.lang.Object) r6, (java.lang.Object) r5)
        L_0x0078:
            java.lang.Object r4 = r1.f43181b
            r5 = r4
            pj.a r5 = (p725pj.C18926a) r5
            if (r5 == 0) goto L_0x0081
            r5 = 1
            goto L_0x0082
        L_0x0081:
            r5 = 0
        L_0x0082:
            if (r5 == 0) goto L_0x00a1
            pj.a r4 = (p725pj.C18926a) r4
            r1 = 101(0x65, float:1.42E-43)
            java.lang.String r2 = "ticket.validation"
            boolean r1 = r4.mo51438a(r1, r2)
            if (r1 == 0) goto L_0x0092
            r0 = r6
            goto L_0x009b
        L_0x0092:
            xl.b r0 = r0.f45329g
            r0.mo52737a(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x009b:
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r6, r0)
            goto L_0x0100
        L_0x00a1:
            java.lang.Object r0 = r1.f43180a
            qn.b r0 = (p752qn.C19144b) r0
            java.lang.String r1 = "barcode"
            mf0.C24362h.m61210e(r0, r1)
            java.lang.String r1 = r0.f48680c
            java.lang.String r3 = "BINARY"
            boolean r1 = mf0.C24362h.m61206a(r1, r3)
            if (r1 == 0) goto L_0x00d6
            java.lang.String r1 = r0.f48681d
            java.lang.String r3 = "AZTEC"
            boolean r1 = mf0.C24362h.m61206a(r1, r3)
            if (r1 == 0) goto L_0x00d6
            java.lang.String r1 = r0.f48678a
            byte[] r1 = android.util.Base64.decode(r1, r2)
            java.lang.String r2 = "decodedPayloadByteArray"
            mf0.C24362h.m61210e(r1, r2)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1
            java.lang.String r3 = "StandardCharsets.ISO_8859_1"
            mf0.C24362h.m61210e(r2, r3)
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1, r2)
            goto L_0x00dd
        L_0x00d6:
            java.lang.String r3 = r0.f48678a
            java.lang.String r1 = "barcode.payload"
            mf0.C24362h.m61210e(r3, r1)
        L_0x00dd:
            r8 = r3
            qn.b r1 = new qn.b
            java.lang.String r9 = r0.f48679b
            java.lang.String r10 = r0.f48680c
            java.lang.String r11 = r0.f48681d
            java.lang.String r12 = r0.f48682e
            boolean r13 = r0.f48683f
            boolean r14 = r0.f48684g
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r6)
            r1 = r0
            goto L_0x0100
        L_0x00f7:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.<init>(r6, r0)
        L_0x0100:
            java.lang.Object r0 = r1.mo59066a()
            qn.b r0 = (p752qn.C19144b) r0
            java.lang.Object r1 = r1.mo59067b()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r0 == 0) goto L_0x011a
            java.lang.String r2 = r0.f48681d
            java.lang.String r3 = "barcode.symbology"
            mf0.C24362h.m61210e(r2, r3)
            com.masabi.justride.sdk.ui.configuration.screens.ticket.BarcodeFormat r2 = com.masabi.justride.sdk.p415ui.configuration.screens.ticket.BarcodeFormat.valueOf(r2)
            goto L_0x011c
        L_0x011a:
            com.masabi.justride.sdk.ui.configuration.screens.ticket.BarcodeFormat r2 = com.masabi.justride.sdk.p415ui.configuration.screens.ticket.BarcodeFormat.AZTEC
        L_0x011c:
            androidx.fragment.app.FragmentManager r3 = r15.getChildFragmentManager()
            int r4 = p605ki.C18061o.barcodeFragmentContainer
            androidx.fragment.app.Fragment r3 = r3.mo3983z(r4)
            po.a r3 = (p730po.C18937a) r3
            if (r3 == 0) goto L_0x0131
            if (r0 == 0) goto L_0x012e
            java.lang.String r6 = r0.f48678a
        L_0x012e:
            r3.mo51457M1(r6, r2, r1)
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p566ip.C17627a.mo50085N1():void");
    }

    /* renamed from: O1 */
    public final void mo50086O1(Button button, int i, int i2) {
        Button button2 = button;
        Float valueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        List E = C17875h.m44281E(valueOf, valueOf, valueOf, valueOf);
        int id = button.getId();
        int i3 = C18061o.primaryBarcodeButton;
        Float valueOf2 = Float.valueOf(5.0f);
        if (id == i3) {
            E = C17875h.m44281E(valueOf2, valueOf, valueOf, valueOf2);
        }
        if (button.getId() == C18061o.secondaryBarcodeButton) {
            E = C17875h.m44281E(valueOf, valueOf2, valueOf2, valueOf);
        }
        int color = C4732a.getColor(requireContext(), C18058l.com_masabi_justride_sdk_pressed_button_background_colour);
        C18110b bVar = this.f45316f;
        if (bVar != null) {
            GradientDrawable c = C18110b.m44777c(bVar, color, ((Number) E.get(0)).floatValue(), ((Number) E.get(1)).floatValue(), ((Number) E.get(2)).floatValue(), ((Number) E.get(3)).floatValue(), 96);
            C18110b bVar2 = this.f45316f;
            if (bVar2 != null) {
                GradientDrawable c2 = C18110b.m44777c(bVar2, i, ((Number) E.get(0)).floatValue(), ((Number) E.get(1)).floatValue(), ((Number) E.get(2)).floatValue(), ((Number) E.get(3)).floatValue(), 96);
                StateListDrawable stateListDrawable = new StateListDrawable();
                if (!button.isSelected()) {
                    stateListDrawable.addState(new int[]{16842919}, c);
                }
                stateListDrawable.addState(new int[0], c2);
                button2.setTextColor(i2);
                button2.setBackground(stateListDrawable);
                return;
            }
            C24362h.m61217l("drawableFactory");
            throw null;
        }
        C24362h.m61217l("drawableFactory");
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            DisplayMetrics l = C13641g.m34124l(this);
            C24362h.m61210e(l, "displayMetrics");
            this.f45316f = new C18110b(l);
        } catch (MissingSDKException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
        r10 = p605ki.C18061o.barcodeButtonsDivider;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            java.lang.String r11 = "inflater"
            mf0.C24362h.m61211f(r9, r11)
            int r11 = p605ki.C18063q.fragment_universal_ticket_barcode
            r0 = 0
            android.view.View r9 = r9.inflate(r11, r10, r0)
            int r10 = p605ki.C18061o.barcodeButtonsContainer
            android.view.View r11 = r9.findViewById(r10)
            r2 = r11
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto L_0x0061
            int r10 = p605ki.C18061o.barcodeButtonsDivider
            android.view.View r3 = r9.findViewById(r10)
            if (r3 == 0) goto L_0x0061
            int r10 = p605ki.C18061o.barcodeFragmentContainer
            android.view.View r11 = r9.findViewById(r10)
            androidx.fragment.app.FragmentContainerView r11 = (androidx.fragment.app.FragmentContainerView) r11
            if (r11 == 0) goto L_0x0061
            int r10 = p605ki.C18061o.primaryBarcodeButton
            android.view.View r11 = r9.findViewById(r10)
            r4 = r11
            android.widget.Button r4 = (android.widget.Button) r4
            if (r4 == 0) goto L_0x0061
            int r10 = p605ki.C18061o.secondaryBarcodeButton
            android.view.View r11 = r9.findViewById(r10)
            r5 = r11
            android.widget.Button r5 = (android.widget.Button) r5
            if (r5 == 0) goto L_0x0061
            int r10 = p605ki.C18061o.selectedForValidationImageView1
            android.view.View r11 = r9.findViewById(r10)
            r6 = r11
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L_0x0061
            int r10 = p605ki.C18061o.selectedForValidationImageView2
            android.view.View r11 = r9.findViewById(r10)
            r7 = r11
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x0061
            oj.k r10 = new oj.k
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = r10
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f45313c = r10
            return r9
        L_0x0061:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r10)
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "Missing required view with ID: "
            java.lang.String r9 = r11.concat(r9)
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p566ip.C17627a.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f45313c = null;
    }

    public final void onPause() {
        super.onPause();
        mo50083L1().f51229b.removeObserver(this.f45315e);
        C14670b bVar = this.f45317g;
        bVar.f37238b = false;
        ((Handler) bVar.f37237a.getValue()).removeMessages(0);
    }

    public final void onResume() {
        super.onResume();
        mo50083L1().f51229b.observe(this, this.f45315e);
        C14670b bVar = this.f45317g;
        if (!bVar.f37238b) {
            bVar.f37238b = true;
            ((Handler) bVar.f37237a.getValue()).sendEmptyMessage(0);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i = C18061o.barcodeFragmentContainer;
        if (((C18937a) childFragmentManager.mo3983z(i)) == null) {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            C0909a K = C0017h.m54K(childFragmentManager2, childFragmentManager2);
            C18047b bVar = this.f45307b;
            C24362h.m61210e(bVar, "justrideSDK");
            C18937a aVar = new C18937a();
            aVar.setArguments(C17624a.m43768H1(bVar));
            K.mo4111f(i, aVar, (String) null);
            K.mo4040d();
        }
        DisplayMetrics l = C13641g.m34124l(this);
        C24362h.m61210e(l, "displayMetrics");
        this.f45316f = new C18110b(l);
    }
}
