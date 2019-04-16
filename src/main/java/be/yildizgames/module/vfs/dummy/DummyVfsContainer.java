package be.yildizgames.module.vfs.dummy;

import be.yildizgames.module.vfs.VfsContainer;
import be.yildizgames.module.vfs.VfsFile;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Grégory Van den Borre
 */
public class DummyVfsContainer implements VfsContainer {

    @Override
    public VfsFile openFile(String name) {
        return new DummyVfsFile();
    }

    @Override
    public void reinit() {

    }

    @Override
    public Path getPath() {
        return Paths.get("");
    }
}
