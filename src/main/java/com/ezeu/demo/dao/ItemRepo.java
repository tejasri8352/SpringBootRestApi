package com.ezeu.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ezeu.demo.mode.Item;

public interface ItemRepo extends JpaRepository<Item,Integer>
{
		

}
