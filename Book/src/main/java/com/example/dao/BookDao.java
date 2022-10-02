package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entitys.Book;

@Repository
public interface BookDao extends JpaRepository<Book,Integer>{

	
}
