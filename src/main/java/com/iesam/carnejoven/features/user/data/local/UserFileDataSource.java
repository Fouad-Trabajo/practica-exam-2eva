package com.iesam.carnejoven.features.user.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.iesam.carnejoven.features.user.domain.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class UserFileDataSource {
    private static UserFileDataSource instance= null;

    public static  UserFileDataSource newInstance(){
        if(instance==null){
            instance=new UserFileDataSource();
        }
        return instance;
    }

    private UserFileDataSource() {

    }

    private String nameFile = "demo.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<User>>() {
    }.getType();

    public void save(User model) {
        List<User> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<User> models) {
        saveToFile(models);
    }

    private void saveToFile(List<User> models) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(models));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    public User findByNif(String nif) {
        List<User> models = findAll();
        for (User model : models) {
            if (Objects.equals(model.nif, nif)) {
                return model;
            }
        }
        return null;
    }

    public List<User> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }

    public void delete(String modelNif) {
        List<User> newList = new ArrayList<>();
        List<User> models = findAll();
        for (User model : models) {
            if (!model.nif.equals(modelNif)) { /** Si el id es distinto*/
                newList.add(model);
            }
        }
        saveList(newList);
    }
}
