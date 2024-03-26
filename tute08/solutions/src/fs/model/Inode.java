package fs.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 'entity' in the file system, could be a folder or a file
 * 
 * TreeItem's aren't nodes they are the model representation of a TreeCell
 */
public abstract class Inode {
    private String path;
    private long fileSize;

    public Inode(Path path) {
        this.path = path.toString();
        try {
            this.fileSize = Files.size(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPath() {
        return this.path;
    }

    public long getFileSize() {
        return fileSize;
    }

    public abstract String getName();

    public abstract String getIcon(boolean isExpanded);
}
