package com.peyman.io;

import com.peyman.data.Person;

import java.io.*;

public class FileUtil {


    public static void writeToFile(String data, File file) throws IOException{
        try(FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);) {

            bufferedWriter.write(data);

        }
    }

    public static void writeToBinFile(Object person, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
            objectOutputStream.writeObject(person);
            os.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Object readFromBinFile(File file) {
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream inputStream = new ObjectInputStream(is);
            Object result =  inputStream.readObject();
            return result;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new Object();
    }
}
