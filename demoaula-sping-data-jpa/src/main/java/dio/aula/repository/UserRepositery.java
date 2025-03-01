package dio.aula.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import dio.aula.model.user;

public interface UserRepositery extends JpaRepository <user, Integer> {

}
