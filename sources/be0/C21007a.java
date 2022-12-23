package be0;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.webkit.WebView;
import ce0.C21104i;
import com.vungle.warren.AdActivity;
import com.vungle.warren.p979ui.PresenterAdOpenCallback;
import java.util.concurrent.atomic.AtomicReference;
import xd0.C25242a;
import xd0.C25246d;
import xd0.C25247e;
import yd0.C25286a;
import yd0.C25287b;

/* renamed from: be0.a */
public abstract class C21007a<T extends C25287b> implements C25286a<T> {

    /* renamed from: b */
    public final C25246d f52760b;

    /* renamed from: c */
    public final C25242a f52761c;

    /* renamed from: d */
    public final String f52762d = getClass().getSimpleName();

    /* renamed from: e */
    public final C21012c f52763e;

    /* renamed from: f */
    public final Context f52764f;

    /* renamed from: g */
    public AlertDialog f52765g;

    /* renamed from: be0.a$a */
    public class C21008a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ DialogInterface.OnClickListener f52766b;

        public C21008a(DialogInterface.OnClickListener onClickListener) {
            this.f52766b = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C21007a.this.f52765g = null;
            DialogInterface.OnClickListener onClickListener = this.f52766b;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    /* renamed from: be0.a$b */
    public class C21009b implements DialogInterface.OnDismissListener {
        public C21009b() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C21007a aVar = C21007a.this;
            aVar.f52765g.setOnDismissListener(new C21011b(aVar));
        }
    }

    /* renamed from: be0.a$c */
    public static class C21010c implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* renamed from: b */
        public AtomicReference<DialogInterface.OnClickListener> f52769b = new AtomicReference<>();

        /* renamed from: c */
        public AtomicReference<DialogInterface.OnDismissListener> f52770c = new AtomicReference<>();

        public C21010c(C21008a aVar, C21011b bVar) {
            this.f52769b.set(aVar);
            this.f52770c.set(bVar);
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            DialogInterface.OnClickListener onClickListener = this.f52769b.get();
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            DialogInterface.OnDismissListener onDismissListener = this.f52770c.get();
            if (onDismissListener != null) {
                onDismissListener.onDismiss(dialogInterface);
            }
            this.f52770c.set((Object) null);
            this.f52769b.set((Object) null);
        }
    }

    public C21007a(Context context, C21012c cVar, C25246d dVar, C25242a aVar) {
        new Handler(Looper.getMainLooper());
        this.f52763e = cVar;
        this.f52764f = context;
        this.f52760b = dVar;
        this.f52761c = aVar;
    }

    /* renamed from: a */
    public final boolean mo53087a() {
        return this.f52765g != null;
    }

    /* renamed from: b */
    public final void mo53088b(String str, String str2, C25247e eVar, PresenterAdOpenCallback presenterAdOpenCallback) {
        C21104i.m49395b(str, str2, this.f52764f, eVar, false, presenterAdOpenCallback);
    }

    public void close() {
        this.f52761c.close();
    }

    /* renamed from: d */
    public final void mo53090d() {
        C21012c cVar = this.f52763e;
        WebView webView = cVar.f52776f;
        if (webView != null) {
            webView.onResume();
        }
        cVar.post(cVar.f52789s);
    }

    /* renamed from: f */
    public final void mo53091f(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        Context context = this.f52764f;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, context.getApplicationInfo().theme));
        C21010c cVar = new C21010c(new C21008a(onClickListener), new C21011b(this));
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        builder.setPositiveButton(str3, cVar);
        builder.setNegativeButton(str4, cVar);
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        this.f52765g = create;
        create.setOnDismissListener(cVar);
        this.f52765g.show();
    }

    public final String getWebsiteUrl() {
        return this.f52763e.getUrl();
    }

    /* renamed from: i */
    public final boolean mo53093i() {
        if (this.f52763e.f52776f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final void mo53094l() {
        C21012c cVar = this.f52763e;
        WebView webView = cVar.f52776f;
        if (webView != null) {
            webView.onPause();
        }
        cVar.getViewTreeObserver().removeOnGlobalLayoutListener(cVar.f52791u);
        cVar.removeCallbacks(cVar.f52789s);
    }

    /* renamed from: m */
    public final void mo53095m() {
        this.f52763e.f52779i.setVisibility(0);
    }

    /* renamed from: n */
    public final void mo53096n() {
        this.f52763e.mo53107c(0);
    }

    /* renamed from: o */
    public final void mo53097o() {
        C21012c cVar = this.f52763e;
        cVar.getViewTreeObserver().addOnGlobalLayoutListener(cVar.f52791u);
    }

    /* renamed from: p */
    public final void mo53098p(long j) {
        C21012c cVar = this.f52763e;
        cVar.f52774d.stopPlayback();
        cVar.f52774d.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
        cVar.f52774d.setOnErrorListener((MediaPlayer.OnErrorListener) null);
        cVar.f52774d.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
        cVar.f52774d.suspend();
        cVar.mo53107c(j);
    }

    /* renamed from: q */
    public final void mo53099q() {
        if (mo53087a()) {
            this.f52765g.setOnDismissListener(new C21009b());
            this.f52765g.dismiss();
            this.f52765g.show();
        }
    }

    public final void setOrientation(int i) {
        AdActivity.this.setRequestedOrientation(i);
    }
}
