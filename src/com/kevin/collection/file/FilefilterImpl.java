package com.kevin.collection.file;

import java.io.File;
import java.io.FileFilter;

public class FilefilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return true;
    }
}
