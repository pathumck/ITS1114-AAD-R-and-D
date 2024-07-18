package src;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        Obj objOne = new Obj(1,"IJSE");
        String fileName = "file.ser";

        //Serialization

        try {
            //Saving Object in a file
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);

            //objectOutputStream object is create with the fileOutputStream object
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //converts the objOne into a byte stream
            objectOutputStream.writeObject(objOne);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Object has been serialized");

        } catch (IOException e) {
            System.out.println("IO Exception is caught");
        }
    }
}
