package com.boot.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.boot.web.model.ModelParam;

public interface DaoClass extends JpaRepository<ModelParam, Integer> {

}
