package zendesk.core;

import hi0.C23522c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ZendeskSessionStorage implements SessionStorage {
    private final BaseStorage additionalSdkStorage;
    private final IdentityStorage identityStorage;
    private final BaseStorage mediaCache;
    private final List<File> registeredFolders;
    private final C23522c responseCache;

    public ZendeskSessionStorage(IdentityStorage identityStorage2, BaseStorage baseStorage, C23522c cVar, BaseStorage baseStorage2, File file, File file2, File file3) {
        this.identityStorage = identityStorage2;
        this.additionalSdkStorage = baseStorage;
        this.responseCache = cVar;
        this.mediaCache = baseStorage2;
        this.registeredFolders = new ArrayList(Arrays.asList(new File[]{file, file2, file3}));
    }

    private static void clearDirectory(File file) {
        boolean z;
        if (file != null && file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && file.isDirectory()) {
                if (listFiles.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    for (File clearDirectory : listFiles) {
                        clearDirectory(clearDirectory);
                    }
                }
            }
            file.delete();
        }
    }

    public void clear() {
        this.identityStorage.clear();
        this.additionalSdkStorage.clear();
        this.mediaCache.clear();
        try {
            this.responseCache.mo58630e();
        } catch (IOException unused) {
        }
        for (File clearDirectory : this.registeredFolders) {
            clearDirectory(clearDirectory);
        }
    }

    public BaseStorage getAdditionalSdkStorage() {
        return this.additionalSdkStorage;
    }
}
