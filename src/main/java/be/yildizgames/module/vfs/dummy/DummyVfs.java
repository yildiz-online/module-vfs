package be.yildizgames.module.vfs.dummy;

import be.yildizgames.module.vfs.Vfs;
import be.yildizgames.module.vfs.VfsArchiveFormat;
import be.yildizgames.module.vfs.VfsArchiveInfo;
import be.yildizgames.module.vfs.VfsContainer;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Grégory Van den Borre
 */
public class DummyVfs implements Vfs {

    @Override
    public final VfsContainer registerContainer(Path path) {
        return new DummyVfsContainer();
    }

    @Override
    public final List<VfsArchiveInfo> getSupportedArchiveInfo() {
        return new ArrayList<>();
    }
}