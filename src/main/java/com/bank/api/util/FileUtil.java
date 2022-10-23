package com.bank.api.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {

    public static String readFromInputStream(String filePath) {
        try{
            Path path = Paths.get(FileUtil.class.getClassLoader()
                    .getResource(filePath).toURI());
            BufferedReader reader = Files.newBufferedReader(path);
            StringBuilder fileContent = new StringBuilder();
            String lineContent;
            while((lineContent =reader.readLine())!=  null){
                fileContent.append(lineContent);
            }
            return fileContent.toString();
        }catch (Exception exp) {

        }
        return null;
    }
}
