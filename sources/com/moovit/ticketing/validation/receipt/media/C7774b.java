package com.moovit.ticketing.validation.receipt.media;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.ticketing.validation.TicketValidationActivity;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import m90.C12889a;
import m90.C12890b;
import p480ez.C16910b;
import p786rz.C19387a;
import p950yw.C20777d;
import p977zz.C20930c;

/* renamed from: com.moovit.ticketing.validation.receipt.media.b */
public class C7774b extends C12889a<C7772a> {

    /* renamed from: v */
    public static final /* synthetic */ int f23597v = 0;

    /* renamed from: p */
    public CountDownTimer f23598p = null;

    /* renamed from: q */
    public String f23599q;

    /* renamed from: r */
    public String f23600r;

    /* renamed from: s */
    public TextView f23601s;

    /* renamed from: t */
    public FrameLayout f23602t;

    /* renamed from: u */
    public ViewGroup f23603u;

    /* renamed from: com.moovit.ticketing.validation.receipt.media.b$a */
    public class C7775a extends CountDownTimer {

        /* renamed from: a */
        public final /* synthetic */ Locale f23604a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7775a(long j, Locale locale) {
            super(j, 1000);
            this.f23604a = locale;
        }

        public final void onFinish() {
            C7774b bVar = C7774b.this;
            bVar.f23598p = null;
            bVar.f23601s.setVisibility(8);
        }

        public final void onTick(long j) {
            String formatElapsedTime = DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j));
            C7774b.this.f23601s.setText(String.format(this.f23604a, C7774b.this.f23599q, new Object[]{formatElapsedTime}));
            C7774b.this.f23601s.setContentDescription(String.format(this.f23604a, C7774b.this.f23600r, new Object[]{formatElapsedTime}));
        }
    }

    /* renamed from: com.moovit.ticketing.validation.receipt.media.b$b */
    public static class C7776b implements Callable<Uri> {

        /* renamed from: b */
        public final Context f23606b;

        /* renamed from: c */
        public final String f23607c;

        /* renamed from: d */
        public final byte[] f23608d;

        public C7776b(String str, Context context, byte[] bArr) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f23606b = context;
            C21100e.m49373x(str, "url");
            this.f23607c = str;
            this.f23608d = bArr;
        }

        public final Object call() throws Exception {
            BufferedOutputStream bufferedOutputStream;
            if (this.f23608d == null) {
                return Uri.parse(this.f23607c);
            }
            StringBuilder k = C13555b.m33972k("media.");
            k.append(MimeTypeMap.getFileExtensionFromUrl(this.f23607c));
            File file = new File(this.f23606b.getCacheDir(), k.toString());
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f23608d);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                C19387a.m46671c(byteArrayInputStream, bufferedOutputStream);
                bufferedOutputStream.close();
                byteArrayInputStream.close();
                return Uri.fromFile(file);
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            throw th;
        }
    }

    public C7774b() {
        super(C7772a.class);
    }

    /* renamed from: o2 */
    public static /* synthetic */ Task m17735o2(ViewGroup viewGroup, Context context, Uri uri) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.receipt_media_video_view, viewGroup, false);
        TextureView textureView = (TextureView) inflate.findViewById(C12869e.video);
        MediaTicketReceiptFragment$2 mediaTicketReceiptFragment$2 = new MediaTicketReceiptFragment$2(context, uri, textureView);
        mediaTicketReceiptFragment$2.mo47172a();
        textureView.setSurfaceTextureListener(mediaTicketReceiptFragment$2);
        return Tasks.forResult(inflate);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [byte[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.tasks.Task m17736p2(android.widget.FrameLayout r3, java.lang.String r4, byte[] r5) {
        /*
            java.lang.String r0 = p172m9.C5720b.m14063n(r4)
            java.lang.String r1 = "image"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0040
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = m80.C12870f.receipt_media_image_view
            r2 = 0
            android.view.View r3 = r0.inflate(r1, r3, r2)
            int r0 = m80.C12869e.image
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r10.e r1 = p583jk.C17884p.m44354Y(r0)
            if (r5 == 0) goto L_0x002a
            r4 = r5
        L_0x002a:
            r10.d r4 = r1.mo51642v(r4)
            d6.f$b r5 = p060d6.C4385f.f15421b
            r10.d r4 = r4.mo22726i(r5)
            r10.d r4 = r4.mo51636w0()
            r4.mo10850T(r0)
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forResult(r3)
            goto L_0x005c
        L_0x0040:
            android.content.Context r0 = r3.getContext()
            java.util.concurrent.ExecutorService r1 = com.moovit.MoovitExecutors.COMPUTATION
            com.moovit.ticketing.validation.receipt.media.b$b r2 = new com.moovit.ticketing.validation.receipt.media.b$b
            r2.<init>(r4, r0, r5)
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.call(r1, r2)
            java.util.concurrent.Executor r5 = com.moovit.MoovitExecutors.MAIN_THREAD
            d0.c0 r1 = new d0.c0
            r2 = 9
            r1.<init>(r2, r3, r0)
            com.google.android.gms.tasks.Task r3 = r4.onSuccessTask(r5, r1)
        L_0x005c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.ticketing.validation.receipt.media.C7774b.m17736p2(android.widget.FrameLayout, java.lang.String, byte[]):com.google.android.gms.tasks.Task");
    }

    /* renamed from: n2 */
    public final void mo24271n2(View view, C12890b bVar) {
        boolean z;
        MediaTicketReceiptContent mediaTicketReceiptContent;
        Task task;
        C7772a aVar = (C7772a) bVar;
        aVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (Long.valueOf(currentTimeMillis).compareTo(aVar.f23592d.f52695a) < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mediaTicketReceiptContent = aVar.f23593e;
        } else if (aVar.f23592d.mo53021b(Long.valueOf(currentTimeMillis))) {
            mediaTicketReceiptContent = aVar.f23594f;
        } else {
            mediaTicketReceiptContent = aVar.f23595g;
        }
        Task p2 = m17736p2(this.f23602t, mediaTicketReceiptContent.f23586b, mediaTicketReceiptContent.f23587c);
        String str = mediaTicketReceiptContent.f23588d;
        byte[] bArr = mediaTicketReceiptContent.f23589e;
        if (str != null) {
            task = m17736p2(this.f23602t, str, bArr);
        } else {
            task = Tasks.forResult(null);
        }
        Tasks.whenAllSuccess(p2, task).addOnSuccessListener((Activity) requireActivity(), new C20777d(4, this, aVar));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context requireContext = requireContext();
        this.f23599q = requireContext.getString(C12873i.payments_counter_expires_in);
        this.f23600r = requireContext.getString(C12873i.voiceover_payments_counter_expires_in);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12870f.ticket_receipt_media_content, viewGroup, false);
        this.f23601s = (TextView) inflate.findViewById(C12869e.timer_view);
        this.f23602t = (FrameLayout) inflate.findViewById(C12869e.media_container);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C12869e.flip_container);
        this.f23603u = viewGroup2;
        ((Button) viewGroup2.findViewById(C12869e.flip_button)).setOnClickListener(new C16910b(this, 10));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        ((TicketValidationActivity) this.f40822c).setTitle(C12873i.ticket_details);
        mo24272q2();
    }

    public final void onStop() {
        super.onStop();
        CountDownTimer countDownTimer = this.f23598p;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: q2 */
    public final void mo24272q2() {
        boolean z;
        if (this.f40824e) {
            C7772a aVar = (C7772a) this.f23601s.getTag(C12869e.view_tag_param1);
            if (aVar != null) {
                if (!aVar.f23596h || !aVar.f23592d.mo53021b(Long.valueOf(System.currentTimeMillis()))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    CountDownTimer countDownTimer = this.f23598p;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    C7775a aVar2 = new C7775a(((Long) aVar.f23592d.f52696b).longValue() - System.currentTimeMillis(), C20930c.m49020b(this.f23601s.getContext()));
                    this.f23598p = aVar2;
                    aVar2.start();
                    this.f23601s.setVisibility(0);
                    return;
                }
            }
            this.f23601s.setVisibility(8);
        }
    }
}
