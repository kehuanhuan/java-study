package com.demo.khh;

import java.io.*;

public class Stream {

    public static void fileStream() throws IOException {

        byte bwrite[] = {1, 2};

        OutputStream os = new FileOutputStream("com");

//        for (int x=0;x < bwrite.length;x++) {
        os.write(bwrite);
//        }

        os.close();


//
//        OutputStreamWriter writer = new OutputStreamWriter(os);
//
//        for (int x=0;x < bwrite.length;x++) {
//            writer.append(bwrite[x]);
//        }
//
//        writer.append("\n");
//        writer.append("-------");
//
//        writer.close();


    }

    public static void bRead() throws IOException {
        String c;

        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("输入q退出");

        do {
            c = re.readLine();
            System.out.println(c);
        } while (!c.equals("q"));
    }
}
