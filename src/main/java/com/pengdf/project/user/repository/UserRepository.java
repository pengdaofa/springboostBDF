package com.pengdf.project.user.repository;

import com.pengdf.project.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<UserEntity, String> {
}
