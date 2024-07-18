package src;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        Obj objOne = new Obj(1,"IJSE");
        String fileName = "file.ser";

        //Serialization

        try {
            //Saving object in a file
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

        Obj objectTwo = null;

        //Deserialization

        try {
            //Read bytes from a file specified
            FileInputStream fileInputStream = new FileInputStream(fileName);

            //Create objectInputStream object that used to
            // deserialize objects from the byte stream provided by the FileInputStream.
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            //Reads an object from the ObjectInputStream and casts it to the type Obj.
            objectTwo = (Obj) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

            System.out.println("Object has been deserialized");
            System.out.println("a = " + objectTwo.getA());
            System.out.println("b = " + objectTwo.getB());

        } catch (IOException e) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
