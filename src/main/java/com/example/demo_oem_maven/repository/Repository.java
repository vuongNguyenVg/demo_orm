package com.example.demo_oem_maven.repository;

import java.util.List;

public interface Repository <T> {
   List<T> findAll();

   T findById(Long id);

   void save(T model);

   void remove(Long id);
}