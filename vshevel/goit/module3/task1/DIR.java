package vshevel.goit.module3.task1;

import java.util.List;

public class DIR {
    private List<File> files;
    private List<DIR> directories;

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<DIR> getDirectories() {
        return directories;
    }

    public void setDirectories(List<DIR> directories) {
        this.directories = directories;
    }


}
