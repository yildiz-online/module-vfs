package be.yildizgames.module.vfs.internal;

import be.yildizgames.module.vfs.VfsArchiveFormat;
import be.yildizgames.module.vfs.VfsContainer;
import be.yildizgames.module.vfs.VfsContainerWrite;
import be.yildizgames.module.vfs.VfsFile;

import java.nio.file.Path;

public class BaseVfsContainer implements VfsContainerWrite {

    private final VfsArchiveFormat format;

    private final VfsContainer container;

    public BaseVfsContainer(VfsContainer container, VfsArchiveFormat format) {
        this.format = format;
        this.container = container;
    }

    @Override
    public final VfsFile addFile(Path file) {
        if(this.format.equals(VfsArchiveFormat.HOG)) {
            new HogFile().addFile(this.container.getPath(), file);
        } else {
            throw new IllegalArgumentException("Format not supported");
        }
        this.container.reinit();
        return this.container.openFile(file.getFileName().toString());
    }
}
