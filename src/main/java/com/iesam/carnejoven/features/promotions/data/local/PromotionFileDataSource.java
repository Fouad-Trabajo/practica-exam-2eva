package com.iesam.carnejoven.features.promotions.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.carnejoven.features.promotions.domain.Promotion;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PromotionFileDataSource {
    //Instancia de patrón SingleTon
    private static PromotionFileDataSource instance = null;


    //patrón SingleTon
    public static PromotionFileDataSource newInstance(){
        if(instance==null){
            instance= new PromotionFileDataSource();
        }
        return instance;
    }

    //Constructor privado
    public PromotionFileDataSource() {

    }

    private String nameFile = "demo.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Promotion>>() {
    }.getType();

    public void save(Promotion model) {
        List<Promotion> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Promotion> models) {
        saveToFile(models);
    }

    private void saveToFile(List<Promotion> models) {
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

    public Promotion findById(String id) {
        List<Promotion> models = findAll();
        for (Promotion model : models) {
            if (Objects.equals(model.id, id)) {
                return model;
            }
        }
        return null;
    }

    public List<Promotion> findAll() {
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

    public void delete(String modelId) {
        List<Promotion> newList = new ArrayList<>();
        List<Promotion> models = findAll();
        for (Promotion model : models) {
            if (!model.id.equals(modelId)) {
                newList.add(model);
            }
        }
        saveList(newList);
    }
}
