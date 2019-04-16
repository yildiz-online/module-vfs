package be.yildizgames.module.vfs.internal;

import be.yildizgames.module.vfs.VfsArchiveFormat;
import be.yildizgames.module.vfs.VfsContainer;
import be.yildizgames.module.vfs.VfsFile;

import java.nio.file.Path;

public abstract class BaseVfsContainer implements VfsContainer {

    private final Path path;

    private final VfsArchiveFormat format;

    public BaseVfsContainer(Path path, VfsArchiveFormat format) {
        this.format = format;
        this.path = path;
    }

    @Override
    public final VfsFile addFile(Path file) {
        if(this.format.equals(VfsArchiveFormat.HOG)) {
            new HogFile().addFile(this.path, file);
        } else {
            throw new IllegalArgumentException("Format not supported");
        }
        this.reinit();
        return this.openFile(file.getFileName().toString());
    }

    /**
     * Reinitialize the container to refresh its state once file have been added.
     */
    protected abstract void reinit();
}
