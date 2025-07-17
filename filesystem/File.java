package filesystem;

import java.time.LocalDateTime;

/**
 * Represents a simple file in the custom OS file system.
 */
public class File {
    private String name;
    private String content;
    private LocalDateTime created;
    private LocalDateTime modified;

    public File(String name) {
        this.name = name;
        this.content = "";
        this.created = LocalDateTime.now();
        this.modified = this.created;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.modified = LocalDateTime.now();
    }

    public void appendContent(String moreContent) {
        this.content += moreContent;
        this.modified = LocalDateTime.now();
    }

    public LocalDateTime getCreatedTime() {
        return created;
    }

    public LocalDateTime getModifiedTime() {
        return modified;
    }

    @Override
    public String toString() {
        return "File: " + name + "\nCreated: " + created + "\nModified: " + modified +
                "\nContent:\n" + content + "\n";
    }
}