package com.xworkz.snake.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.snake.repo.RepoIMPL;
import com.xworkz.snake.snakeDTO.SnakeDTO;

@org.springframework.stereotype.Service
public class ServiceIMPL implements Service{
	@Autowired
	public RepoIMPL repoIMPL;
	@Override
	public boolean validateAndSave(SnakeDTO dto) {
		System.out.println("Running...validateAndSave");
		boolean saved = this.repoIMPL.save(dto);
		return saved;
	}

}
