package com.example.practice;

import com.aspose.words.Document;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

@Configuration
public class Test  {
    static ClassLoader loader;

    Test() {
        loader = Thread.currentThread().getContextClassLoader();

        String licenseXml ="license/license-word.xml";
        InputStream license = loader.getResourceAsStream(licenseXml);
        com.aspose.words.License word = new com.aspose.words.License();
        String sourceFilePath ="C:\\Users\\123\\Desktop\\测试专用\\2021【KJ-047】【杨浦区公安局】平板项目22套生产单-2021.4.26 - 副本.doc";
        String outputFile="C:\\Users\\123\\Desktop\\测试专用";

        try {
            word.setLicense(license);

            //InputStream sourceInputStream = new ByteArrayInputStream(SM4Utils.decryptFileReadOnly(sourceFilePath));
            InputStream sourceInputStream = new FileInputStream(sourceFilePath);

            Document document;
            document = new Document(sourceInputStream);

            document.updateWordCount();
            // 注释掉修改表格布局代码 L → D
//                document.updateTableLayout();
            FileOutputStream convertPdfFileOut = new FileOutputStream(outputFile);
            document.save(convertPdfFileOut, com.aspose.words.SaveFormat.PDF);
            convertPdfFileOut.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
