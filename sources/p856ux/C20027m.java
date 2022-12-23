package p856ux;

import android.content.Context;
import android.os.AsyncTask;
import c70.C13752e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import x90.C13242b;

/* renamed from: ux.m */
public final class C20027m implements C13242b {

    /* renamed from: ux.m$a */
    public static class C20028a extends AsyncTask<Context, Void, Void> {

        /* renamed from: a */
        public final List<String> f50865a;

        public C20028a(ArrayList arrayList) {
            this.f50865a = arrayList;
        }

        public final Object doInBackground(Object[] objArr) {
            Context context = ((Context[]) objArr)[0];
            for (String deleteFile : this.f50865a) {
                context.deleteFile(deleteFile);
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        Context context = eVar.f33852a;
        String[] fileList = context.fileList();
        ArrayList arrayList = new ArrayList();
        for (String str : fileList) {
            if (str.startsWith("taxi_configuration_")) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            new C20028a(arrayList).execute(new Context[]{context});
        }
    }

    public final String toString() {
        return "Upgrader223To224";
    }
}
