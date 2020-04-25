package com.kevin.collection.file;

import java.io.File;
import java.io.FileFilter;

public class FilefilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        //System.out.println(pathname.getName());
        if (pathname.isDirectory()) {
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".doc");
    }
}
