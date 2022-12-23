package p193o4;

import com.appboy.support.AppboyFileUtils;
import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import p271u4.C6693d;

/* renamed from: o4.b */
public final class C5976b extends C6693d {

    /* renamed from: e */
    public URL f19121e;

    /* renamed from: f */
    public ArrayList f19122f = new ArrayList();

    /* renamed from: g */
    public ArrayList f19123g = new ArrayList();

    /* renamed from: m */
    public final void mo21961m(URL url) {
        File file;
        if (AppboyFileUtils.FILE_SCHEME.equals(url.getProtocol())) {
            file = new File(URLDecoder.decode(url.getFile()));
        } else {
            mo22865i("URL [" + url + "] is not of type file");
            file = null;
        }
        if (file != null) {
            this.f19122f.add(file);
            this.f19123g.add(Long.valueOf(file.lastModified()));
        }
    }
}
