package dio.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.user;
import dio.aula.repository.UserRepositery;

@Component


public class StartApp  implements CommandLineRunner
{
    
    @Autowired
    public UserRepositery repository;
    @Override
    public void run(String... args) throws Exception {
       user user = new user();
       user.setName("Jose");
       user.setUsername("Jo");
       user.setPassword("dio123");

       repository.save(user);

       for(user u: repository.findAll()){
        System.out.println(u);
       }
        
    }

}
