package com.kyh.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kyh.system.entity.SyainEntity;

@Repository
public interface SyainRepository extends JpaRepository<SyainEntity, Integer> {
}