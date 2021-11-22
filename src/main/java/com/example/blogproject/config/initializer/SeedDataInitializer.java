package com.example.blogproject.config.initializer;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class SeedDataInitializer{
    RoleInitializer roleInitializer;
    Object object;

    SeedDataInitializer(){
        roleInitializer = new RoleInitializer();
    }

    public static void init() throws IOException{
        SeedDataInitializer seedDataInitializer = new SeedDataInitializer();
        seedDataInitializer.object = seedDataInitializer.roleInitializer.jsonToObject(
                seedDataInitializer.roleInitializer.readJsonAsString(
                        seedDataInitializer.roleInitializer.getResourceFile()));
        seedDataInitializer.roleInitializer.insertToDb(seedDataInitializer.object);

    }

}
