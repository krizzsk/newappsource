package nd0;

import java.io.File;
import java.util.Comparator;

/* renamed from: nd0.b */
public final class C24483b implements Comparator<File> {
    public final int compare(Object obj, Object obj2) {
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
