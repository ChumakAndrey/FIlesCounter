package model;

/**
 * Created by Администратор on 02.10.2017.
 */
public class FolderInfo {
    private String path;
    private long countedFiles;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getCountedFiles() {
        return countedFiles;
    }

    public void setCountedFiles(long countedFiles) {
        this.countedFiles = countedFiles;
    }

    @Override
    public String toString() {
        return String.format("Path :: %s; Files quantity :: %n",
                getPath(),
                getCountedFiles());
    }
}
