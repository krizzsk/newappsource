package re0;

import com.google.android.play.core.appupdate.C14226d;
import je0.C23711d;
import me0.C24354d;
import oe0.C24577a;
import p565io.reactivex.subjects.PublishSubject;
import qe0.C24734a;

/* renamed from: re0.b */
public final class C24795b<T> extends C24794a<T, T> {

    /* renamed from: c */
    public final C24354d<? super T> f62717c;

    /* renamed from: re0.b$a */
    public static final class C24796a<T> extends C24734a<T, T> {

        /* renamed from: f */
        public final C24354d<? super T> f62718f;

        public C24796a(C23711d<? super T> dVar, C24354d<? super T> dVar2) {
            super(dVar);
            this.f62718f = dVar2;
        }

        /* renamed from: e */
        public final void mo58911e(T t) {
            try {
                if (this.f62718f.test(t)) {
                    this.f62608b.mo58911e(t);
                }
            } catch (Throwable th) {
                C14226d.m35340G0(th);
                this.f62609c.dispose();
                onError(th);
            }
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public final T poll() throws java.lang.Exception {
            /*
                r2 = this;
            L_0x0000:
                pe0.a<T> r0 = r2.f62610d
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L_0x0010
                me0.d<? super T> r1 = r2.f62718f
                boolean r1 = r1.test(r0)
                if (r1 == 0) goto L_0x0000
            L_0x0010:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: re0.C24795b.C24796a.poll():java.lang.Object");
        }

        public final int requestFusion(int i) {
            return 0;
        }
    }

    public C24795b(PublishSubject publishSubject, C24577a.C24579b bVar) {
        super(publishSubject);
        this.f62717c = bVar;
    }

    /* renamed from: v */
    public final void mo53556v(C23711d<? super T> dVar) {
        this.f62716b.mo53555u(new C24796a(dVar, this.f62717c));
    }
}
