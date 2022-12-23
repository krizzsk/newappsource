package p010a9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.internal.C2408j;
import com.facebook.share.model.ShareContent;
import com.facebook.share.widget.ShareDialog;
import java.util.Iterator;
import java.util.List;
import p009a8.C0107g;
import p009a8.C0108h;
import p009a8.C0115o;
import p262t8.C6606a;

/* renamed from: a9.b */
public abstract class C0135b extends C0108h {

    /* renamed from: k */
    public ShareContent f390k;

    /* renamed from: l */
    public int f391l = 0;

    /* renamed from: m */
    public boolean f392m = false;

    /* renamed from: a9.b$a */
    public class C0136a implements View.OnClickListener {
        public C0136a() {
        }

        public final void onClick(View view) {
            C0135b bVar;
            if (!C6606a.m15601b(this)) {
                try {
                    bVar = C0135b.this;
                    bVar.getClass();
                    if (!C6606a.m15601b(bVar)) {
                        View.OnClickListener onClickListener = bVar.f320d;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                    }
                } catch (Throwable th) {
                    C6606a.m15600a(this, th);
                    return;
                }
                C0135b.this.getDialog().mo12564d(C0135b.this.getShareContent(), C2408j.f8652f);
            }
        }
    }

    public C0135b(Context context, AttributeSet attributeSet, int i, String str, String str2) {
        super(context, attributeSet, i, str, str2);
        int i2;
        if (isInEditMode()) {
            i2 = 0;
        } else {
            i2 = getDefaultRequestCode();
        }
        this.f391l = i2;
        setEnabled(false);
        this.f392m = false;
    }

    /* renamed from: a */
    public void mo220a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo220a(context, attributeSet, i, i2);
        setInternalOnClickListener(getShareOnClickListener());
    }

    public C0107g getCallbackManager() {
        return null;
    }

    public abstract ShareDialog getDialog();

    public int getRequestCode() {
        return this.f391l;
    }

    public ShareContent getShareContent() {
        return this.f390k;
    }

    public View.OnClickListener getShareOnClickListener() {
        return new C0136a();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f392m = true;
    }

    public void setRequestCode(int i) {
        boolean z;
        int i2 = C0115o.f340j;
        if (i < i2 || i >= i2 + 100) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            this.f391l = i;
            return;
        }
        throw new IllegalArgumentException(C25541a.m63878h("Request code ", i, " cannot be within the range reserved by the Facebook SDK."));
    }

    public void setShareContent(ShareContent shareContent) {
        this.f390k = shareContent;
        if (!this.f392m) {
            ShareDialog dialog = getDialog();
            ShareContent shareContent2 = getShareContent();
            boolean z = true;
            if (dialog.f8655c == null) {
                dialog.f8655c = dialog.mo295c();
            }
            List<? extends C2408j<CONTENT, RESULT>.C25541a> list = dialog.f8655c;
            if (list != null) {
                Iterator<? extends C2408j<CONTENT, RESULT>.C25541a> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C2408j.C2409a) it.next()).mo297a(shareContent2, false)) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                setEnabled(z);
                this.f392m = false;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
        }
    }
}
