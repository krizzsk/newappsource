package p067e1;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: e1.u */
public final class C4515u extends C4471a0 {

    /* renamed from: a */
    public IconCompat f15616a;

    /* renamed from: b */
    public IconCompat f15617b;

    /* renamed from: c */
    public boolean f15618c;

    /* renamed from: e1.u$a */
    public static class C4516a {
        /* renamed from: a */
        public static void m11754a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }

        /* renamed from: b */
        public static void m11755b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setSummaryText(charSequence);
        }
    }

    /* renamed from: e1.u$b */
    public static class C4517b {
        /* renamed from: a */
        public static void m11756a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* renamed from: e1.u$c */
    public static class C4518c {
        /* renamed from: a */
        public static void m11757a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        /* renamed from: b */
        public static void m11758b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        /* renamed from: c */
        public static void m11759c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
            bigPictureStyle.showBigPictureWhenCollapsed(z);
        }
    }

    public final void apply(C4508n nVar) {
        Context context;
        Context context2;
        int i = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(((C4480d0) nVar).f15541b).setBigContentTitle(this.mBigContentTitle);
        IconCompat iconCompat = this.f15616a;
        if (iconCompat != null) {
            if (i >= 31) {
                if (nVar instanceof C4480d0) {
                    context2 = ((C4480d0) nVar).f15540a;
                } else {
                    context2 = null;
                }
                C4518c.m11757a(bigContentTitle, iconCompat.mo3433j(context2));
            } else if (iconCompat.mo3430g() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.f15616a.mo3427c());
            }
        }
        if (this.f15618c) {
            IconCompat iconCompat2 = this.f15617b;
            if (iconCompat2 == null) {
                C4516a.m11754a(bigContentTitle, (Bitmap) null);
            } else if (i >= 23) {
                if (nVar instanceof C4480d0) {
                    context = ((C4480d0) nVar).f15540a;
                } else {
                    context = null;
                }
                C4517b.m11756a(bigContentTitle, iconCompat2.mo3433j(context));
            } else if (iconCompat2.mo3430g() == 1) {
                C4516a.m11754a(bigContentTitle, this.f15617b.mo3427c());
            } else {
                C4516a.m11754a(bigContentTitle, (Bitmap) null);
            }
        }
        if (this.mSummaryTextSet) {
            C4516a.m11755b(bigContentTitle, this.mSummaryText);
        }
        if (i >= 31) {
            C4518c.m11759c(bigContentTitle, false);
            C4518c.m11758b(bigContentTitle, (CharSequence) null);
        }
    }

    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
