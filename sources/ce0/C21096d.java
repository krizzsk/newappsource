package ce0;

import android.os.AsyncTask;
import java.io.File;

/* renamed from: ce0.d */
public final class C21096d {

    /* renamed from: a */
    public static volatile C21120u f52936a = C21115q.f52977h;

    /* renamed from: ce0.d$a */
    public static class C21097a {

        /* renamed from: a */
        public final C21099c f52937a;

        public C21097a(C21099c cVar) {
            this.f52937a = cVar;
        }
    }

    /* renamed from: ce0.d$b */
    public interface C21098b {
        /* renamed from: a */
        void mo53291a(boolean z);
    }

    /* renamed from: ce0.d$c */
    public static class C21099c extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: c */
        public static final /* synthetic */ int f52938c = 0;

        /* renamed from: a */
        public final File f52939a;

        /* renamed from: b */
        public C21098b f52940b;

        public C21099c(File file, C21098b bVar) {
            this.f52939a = file;
            this.f52940b = bVar;
        }

        public final Object doInBackground(Object[] objArr) {
            boolean z;
            Void[] voidArr = (Void[]) objArr;
            File file = this.f52939a;
            if (file == null || !file.exists()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        public final void onPostExecute(Object obj) {
            Boolean bool = (Boolean) obj;
            super.onPostExecute(bool);
            synchronized (this) {
                C21098b bVar = this.f52940b;
                if (bVar != null) {
                    bVar.mo53291a(bool.booleanValue());
                }
            }
        }
    }

    static {
        new C21115q();
    }
}
