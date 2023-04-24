package spring.backend.springbootbackend.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.backend.springbootbackend.entity.UserEntity;

public interface Userepository extends JpaRepository<UserEntity, Long> {

}
