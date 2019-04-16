package be.yildizgames.module.vfs.internal;

import be.yildizgames.module.vfs.Vfs;
import be.yildizgames.module.vfs.VfsArchiveFormat;
import be.yildizgames.module.vfs.VfsContainer;
import be.yildizgames.module.vfs.VfsWrite;

import java.io.IOException;
import java.nio.file.Path;

public class BaseVfs implements VfsWrite {

    private final Vfs vfs;

    private final HogFile hogFile = new HogFile();

    protected BaseVfs(Vfs vfs) {
        this.vfs = vfs;
    }

    @Override
    public final VfsContainer createContainer(Path path, VfsArchiveFormat format) throws IOException {
        this.hogFile.createContainer(path);
        return this.vfs.registerContainer(path);
    }
}
