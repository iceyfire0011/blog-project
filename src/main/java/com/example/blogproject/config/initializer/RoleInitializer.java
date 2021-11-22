package com.example.blogproject.config.initializer;

import com.example.blogproject.model.ModulePermission;
import com.example.blogproject.model.Role;
import com.example.blogproject.model.TaskModule;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class RoleInitializer extends CommonInitializer implements Initializer{
//    @Value("classpath:static/roleSetup.json")
//    Resource resourceFile;

    @Override
    public Resource getResourceFile(){
        return new ClassPathResource("static/roleSetup.json");
    }

    public Object jsonToObject(String jsonString){
        try{
            var role = new JSONParser().parse(this.readJsonAsString(this.getResourceFile()));
            return role;
        }catch(ParseException | IOException e){
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void insertToDb(Object object){
        JSONObject jo = (JSONObject) object;
        var roles = (JSONArray) jo.get("roles");
        for(int i = 0; i < roles.size(); i++){
            var roleJsonObj = (JSONObject) roles.get(i);
            var defaultRoleModulesJsonObject = (JSONArray) roleJsonObj.get("defaultRoleModules");
            List<ModulePermission> modulePermissionList = new LinkedList<ModulePermission>();
            for(int j = 0; j < defaultRoleModulesJsonObject.size(); j++){
                var permissionJsonObject = (JSONObject) defaultRoleModulesJsonObject.get(i);
                var taskModuleJsonObject = (JSONObject) permissionJsonObject.get("taskModule");
                var modulePermission = new ModulePermission(){{
                    setViewPermission((boolean) permissionJsonObject.get("viewPermission"));
                    setModifyPermission((boolean) permissionJsonObject.get("modifyPermission"));
                    setViewPermission((boolean) permissionJsonObject.get("deletePermission"));
                    setTaskModule(new TaskModule(){{
                        setModuleName((String)taskModuleJsonObject.get("moduleName"));
                        setUrl((String)taskModuleJsonObject.get("url"));
                        setTaskRef((String)taskModuleJsonObject.get("taskRef"));
                        setParentTaskModule((String) taskModuleJsonObject.get("parentTaskModule"));
                    }});
                }};
                modulePermissionList.add(modulePermission);
            }
            var role = new Role(){
                {
                    setRoleName((String) roleJsonObj.get("roleName"));
                    setDefaultRoleModules(modulePermissionList);
                }
            };
            System.out.println(role);

        }

        System.out.println(roles);
    }
}
